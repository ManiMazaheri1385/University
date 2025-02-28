package ap.uni;

import java.util.ArrayList;

public class Major {

    public int id;
    public String name;
    public int numberOfStudents = 0;
    public final int capacity;
    public static ArrayList<Major> majorList = new ArrayList<Major>();

    public Major(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        majorList.add(this);
        id = majorList.size();
    }

    public static Major findByID(int id) {
        for (Major major : majorList) {
            if (id == major.id) {
                return major;
            }
        }
        return null;
    }

    public void addStudent() {
        if (numberOfStudents < capacity) {
            numberOfStudents++;
        }
        else {
            System.out.println("student is over capacity");
        }
    }

}
