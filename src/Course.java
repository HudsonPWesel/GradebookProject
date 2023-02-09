import java.util.HashMap;

public class Course {

    private String COURSENAME;

    // Studentname: Assignment
    private HashMap<String, AssignmentGradebook> gradebook;

    public Course(String courseName, HashMap<String, AssignmentGradebook> gradebook) {
        this.COURSENAME = courseName;
        this.gradebook = gradebook;
    }

    public String getCourseName() {
        return this.COURSENAME;
    }

    public HashMap<String, AssignmentGradebook> getGradebook() {
        return gradebook;
    }

    public AssignmentGradebook getAssignmentsByStudent(String studentName) {
        return gradebook.get(studentName);

    }

    private double calculateClassAverage() {
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
