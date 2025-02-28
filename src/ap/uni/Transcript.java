package ap.uni;

import ap.base.Person;
import java.util.HashMap;

public class Transcript {

    public int studentID;
    HashMap<Integer, Double> transcript;

    public Transcript(int studentID) {
        this.studentID = studentID;
        transcript = new HashMap<>();
    }

    public void setGrade(int presentedCourseID, double grade) {
        PresentedCourse course = PresentedCourse.findByID(presentedCourseID);
        if (course != null) {
            if (course.studentIDList.contains(studentID)) {
                transcript.put(presentedCourseID, grade);
            }
            else {
                System.out.println("student ID " + studentID + " does not exist in this course");
            }
        }
        else {
            System.out.println("Course not found");
        }
    }

    public void printTranscript() {
        Student student = Student.findByID(studentID);
        if (student != null) {
            Person person = Person.findByID(student.personID);
            Major major = Major.findByID(student.majorID);
            System.out.println("Name: " + person.name);
            System.out.println("Major: " + major.name);
            System.out.println("Student Code: " + student.studentCode);

            System.out.println("Grades:");
        }
        else {
            System.out.println("Student not found");
        }

        for (Integer courseID : transcript.keySet()) {
            double grade = transcript.get(courseID);
            Course course = Course.findByID(courseID);
            if (course != null) {
                System.out.println(course.title + ": " + grade);
            }
            else {
                System.out.println("Course not found");
            }
        }

        System.out.println("Grade Point Average: " + this.getGPA());

    }

    public double getGPA() {
        double totalGrade = 0;
        int totalUnits = 0;
        for (Integer courseID : transcript.keySet()) {
            Course course = Course.findByID(courseID);
            if (course != null) {
                double grade = transcript.get(courseID) * course.units;
                totalGrade += grade;
                totalUnits += course.units;
            }
            else {
                System.out.println("Course not found");
            }
        }
        if(totalUnits == 0) {
            return 0.0;
        }
        return totalGrade / totalUnits;
    }

}
