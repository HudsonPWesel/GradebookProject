import java.util.HashMap;

public class AssignmentGradebook {
    private HashMap<String, Integer> gradebook;
    private double gradeAverage;

    public AssignmentGradebook(HashMap<String, Integer> gradebook) {
        this.gradebook = gradebook;

        setGradeAverage();
    }

    public double getGradeAverage() {
        return this.gradeAverage;
    }

    public void addAssignment(String assignmentName, int grade) {
        gradebook.put(assignmentName, grade);

    }

    private void setGradeAverage() {
        if (!isValidGradebook())
            return;

        gradeAverage = calculateGradeAverage();

    }

    public double calculateGradeAverage() {
        double sum = 0.0;
        for (int grade : gradebook.values())
            sum += grade;

        return sum / gradebook.size();
    }

    private boolean isValidGradebook() {
        return gradebook.isEmpty();

    }

}
