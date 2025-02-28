package ap.uni;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {

    public int id;
    public int personID;
    public int majorID;
    public final int entranceYear;
    public String studentCode;
    public static ArrayList<Student> studentList = new ArrayList<Student>();
    private static HashMap<String, Integer> studentCount = new HashMap<String, Integer>();

    public Student(int personID, int entranceYear, int majorID) {
        this.personID = personID;
        this.entranceYear = entranceYear;
        this.majorID = majorID;
        studentList.add(this);
        id = studentList.size();
        setStudentCode();
    }

    public static Student findByID(int id) {
        for (Student student : studentList) {
            if (id == student.id) {
                return student;
            }
        }
        return null;
    }

    public void setStudentCode(){
        int majorID = this.majorID;
        String entranceYearCode = String.valueOf(entranceYear);
        String majorCode = "";
        String personCode = "";
        studentCode = String.valueOf(entranceYear);

        if (majorID < 10) {
            majorCode += "0" + majorID;
        }
        else {
            majorCode += majorID;
        }

        String key = entranceYearCode + majorCode;
        int currentCount = studentCount.getOrDefault(key, 1);
        if (currentCount < 10) {
            personCode += "00" + currentCount;
        }
        else {
            personCode += "0" + currentCount;
        }
        studentCode = entranceYearCode + majorCode + personCode;

        studentCount.put(key, currentCount + 1);
    }

}
