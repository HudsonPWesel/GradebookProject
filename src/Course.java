import java.util.ArrayList;
import java.util.HashMap;

public class Course {
    private String COURSENAME;

    private char courseBlock;

    private HashMap<String, AssignmentGradebook> gradebook;

    private boolean isPassFail;

    public Course(String courseName, char courseBlock, HashMap<String, AssignmentGradebook> gradebook,
            boolean isPassFail) {
        this.COURSENAME = courseName;
        this.courseBlock = courseBlock;
        this.gradebook = gradebook;
        this.isPassFail = isPassFail;
    }

    public String getCourseName() {
        return this.COURSENAME;
    }

    public double calculateClassAverage() {
        double sum = 0.0;
        for (AssignmentGradebook assignmentGradebook : gradebook.values())
            sum += assignmentGradebook.getGradeAverage();
        return sum / gradebook.size();

    }

    public void printGrades() {
        System.out.println(gradebook.toString());
    }

    public void addGrade(int grade) {
        System.out.println();
    }

}
