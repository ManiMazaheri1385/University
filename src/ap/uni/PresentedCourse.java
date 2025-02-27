package ap.uni;

import java.util.ArrayList;

public class PresentedCourse {

    public static ArrayList<PresentedCourse> presentedCourseList = new ArrayList<PresentedCourse>();
    public int presentedCourseID;
    public int courseID;
    public int professorID;
    public int maxCapacity;
    public static ArrayList<Integer> studentIDList;

    public PresentedCourse(int courseID, int professorID, int maxCapacity) {
        this.courseID = courseID;
        this.professorID = professorID;
        this.maxCapacity = maxCapacity;
        studentIDList = new ArrayList<Integer>(maxCapacity);
        presentedCourseList.add(this);
        presentedCourseID = presentedCourseList.size();
    }

    public static PresentedCourse findById(int ID) {
        for (PresentedCourse presentedCourse : presentedCourseList) {
            if (ID == presentedCourse.presentedCourseID) {
                return presentedCourse;
            }
        }
        return null;
    }

    public void addStudent(int studentID) {
        if (studentIDList.size() < maxCapacity) {
            studentIDList.add(studentID);
        } else {
            System.out.println("student list is full");
        }
    }

}