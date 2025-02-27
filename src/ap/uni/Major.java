package ap.uni;

import java.util.ArrayList;

public class Major {

    public static ArrayList<Major> majorList = new ArrayList<Major>();
    public static int numberOfStudents;
    public int majorID;
    public String name;
    public final int maxCapacity;

    public Major(String name, int maxStudentNumber) {
        this.name = name;
        maxCapacity = maxStudentNumber;
        majorList.add(this);
        majorID = majorList.size();
    }

    public static Major findById(int ID) {
        for (Major major : majorList) {
            if (ID == major.majorID) {
                return major;
            }
        }
        return null;
    }

    public void addStudent() {
        if (numberOfStudents < maxCapacity) {
            numberOfStudents++;
        }
        else {
            System.out.println("student is over max capacity");
        }
    }

}
