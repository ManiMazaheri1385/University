package ap.uni;

import java.util.ArrayList;

public class Professor {

    public int professorID;
    public int personID;
    public int majorID;
    public static ArrayList<Professor> professorList = new ArrayList<Professor>();

    public Professor(int personID, int majorID) {
        this.personID = personID;
        this.majorID = majorID;
        professorList.add(this);
        professorID = professorList.size();
    }

    public static Professor findById(int ID) {
        for (Professor professor : professorList) {
            if (ID == professor.professorID) {
                return professor;
            }
        }
        return null;
    }

}
