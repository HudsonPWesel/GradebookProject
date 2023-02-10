import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private int graduationYear;

    private ArrayList<String> courses = new ArrayList<String>();
    private HashMap<String, Double> gradebook = new HashMap<String, Double>();
    private final int STUDENT_ID = (int) (Math.random() * 120000) + 1;

    public Student(int graduationYear, String name, ArrayList<String> courses) {
        this.name = name;
        this.graduationYear = graduationYear;

        this.courses = courses; // !THIS MUST BE INITIALIZED BEFORE GRADEBOOK
        gradebook = getAssignmentGradebook();

    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public String getStudentName() {
        return name;
    }

    private HashMap<String, Double> getAssignmentGradebook() {
        return CourseList.getCourseGradesByStudentname(this);
    }

}
