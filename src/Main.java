import ap.base.*;
import ap.uni.*;

public class Main {
    public static void main(String[] args) {
        Major major1 = new Major("Computer Science", 15);
        Major major2 = new Major("Mathematics", 20);

        Person person1 = new Person("Harry Potter", "6037");
        Person person2 = new Person("Hermione Granger", "6038");
        Person person3 = new Person("Ron Weasley", "6039");
        Person person4 = new Person("Severus Snape", "6040");
        Person person5 = new Person("Albus Dumbledore", "6041");


        Student student1 = new Student(person1.personID, 1991,1);
        Student student2 = new Student(person2.personID, 1991,1);
        Student student3 = new Student(person3.personID, 1991,2);

        Professor professor1 = new Professor(4, 1);
        Professor professor2 = new Professor(5, 2);

        Course course1 = new Course("Potions", 2);
        Course course2 = new Course("Defence Against The Dark Arts", 3);
        Course course3 = new Course("Transfiguration", 3);

        PresentedCourse presentedCourse1 = new PresentedCourse(1, 1, 10);
        PresentedCourse presentedCourse2 = new PresentedCourse(2, 1, 5);
        PresentedCourse presentedCourse3 = new PresentedCourse(3, 2, 8);

        presentedCourse1.addStudent(1);
        presentedCourse1.addStudent(2);
        presentedCourse2.addStudent(1);
        presentedCourse2.addStudent(2);
        presentedCourse2.addStudent(3);
        presentedCourse3.addStudent(3);

        Transcript transcript1 = new Transcript(1);
        Transcript transcript2 = new Transcript(2);
        Transcript transcript3 = new Transcript(3);

        transcript1.setGrade(1, 16.25);
        transcript1.setGrade(2, 17);
        transcript2.setGrade(1, 20);
        transcript2.setGrade(2, 19.25);
        transcript3.setGrade(2, 15.5);
        transcript3.setGrade(3, 14.75);

        System.out.println("Students:");
        System.out.println("Name: " + person1.name + ". Student Code: " + student1.studentCode);
        System.out.println("Name: " + person2.name + ". Student Code: " + student2.studentCode);
        System.out.println("Name: " + person3.name + ". Student Code: " + student3.studentCode);
        System.out.println();

        System.out.println("Professors:");
        System.out.println("Name: " + person4.name + ". Professor ID: " + professor1.professorID);
        System.out.println("Name: " + person5.name + ". Professor ID: " + professor2.professorID);
        System.out.println();

        transcript1.printTranscript();
        System.out.println("Grade Point Average: " + transcript1.getGPA());
        System.out.println();
        transcript2.printTranscript();
        System.out.println("Grade Point Average: " + transcript2.getGPA());
        System.out.println();
        transcript3.printTranscript();
        System.out.println("Grade Point Average: " + transcript3.getGPA());
    }
}