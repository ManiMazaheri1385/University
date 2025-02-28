package ap.base;

import java.util.*;

public class Person {

    public int id;
    public String name;
    public final String nationalID;
    public static ArrayList<Person> personList = new ArrayList<Person>();

    public Person(String name, String nationalID) {
        this.name = name;
        this.nationalID = nationalID;
        personList.add(this);
        id = personList.size();
    }

    public static Person findByID(int id) {
        for (Person person : personList) {
            if (id == person.id) {
                return person;
            }
        }
        return null;
    }

}
