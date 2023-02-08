import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private int graduationYear;
    private ArrayList<String> courses = new ArrayList<String>();
    private HashMap<String, Integer> gradebook = new HashMap<String, Integer>();

    public Student(String name, int graduationYear, ArrayList<String> courses) {
        this.name = name;
        this.graduationYear = graduationYear;
        // TODO: SET GRADEBOOK

    }

}
