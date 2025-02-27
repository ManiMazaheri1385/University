package ap.base;

import java.util.*;

public class Person {

    public int personID;
    public String name;
    public final String nationalID;
    public static ArrayList<Person> personList = new ArrayList<Person>();

    public Person(String name, String nationalID) {
        this.name = name;
        this.nationalID = nationalID;
        personList.add(this);
        personID = personList.size();
    }

    public static Person findById(int ID) {
        for (Person person : personList) {
            if (ID == person.personID) {
                return person;
            }
        }
        return null;
    }

}
