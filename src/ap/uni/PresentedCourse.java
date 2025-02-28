package ap.uni;

import java.util.ArrayList;

public class PresentedCourse {

    public int id;
    public int courseID;
    public int professorID;
    public final int capacity;
    public static ArrayList<Integer> studentIDList;
    public static ArrayList<PresentedCourse> presentedCourseList = new ArrayList<PresentedCourse>();

    public PresentedCourse(int courseID, int professorID, int capacity) {
        this.courseID = courseID;
        this.professorID = professorID;
        this.capacity = capacity;
        studentIDList = new ArrayList<Integer>(capacity);
        presentedCourseList.add(this);
        id = presentedCourseList.size();
    }

    public static PresentedCourse findByID(int id) {
        for (PresentedCourse presentedCourse : presentedCourseList) {
            if (id == presentedCourse.id) {
                return presentedCourse;
            }
        }
        return null;
    }

    public void addStudent(int studentID) {
        if (studentIDList.size() < capacity) {
            studentIDList.add(studentID);
        } else {
            System.out.println("student list is full");
        }
    }

}