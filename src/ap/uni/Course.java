package ap.uni;

import java.util.ArrayList;

public class Course {

    public int courseID;
    public String title;
    public int units;
    public static ArrayList<Course> courseList = new ArrayList<Course>();

    public Course(String title, int units) {
        this.title = title;
        this.units = units;
        courseList.add(this);
        courseID = courseList.size();
    }

    public static Course findById(int ID) {
        for (Course course : courseList) {
            if (ID == course.courseID) {
                return course;
            }
        }
        return null;
    }
}
