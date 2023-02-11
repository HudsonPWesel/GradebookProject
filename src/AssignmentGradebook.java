import java.util.HashMap;

public class AssignmentGradebook {
    private HashMap<String, Integer> gradebook;
    private double gradeAverage;

    /**
     * 
     * @param gradebook {assignmentName:Grade}
     */
    public AssignmentGradebook(HashMap<String, Integer> gradebook) {
        this.gradebook = gradebook;

        setGradeAverage();
    }

    public HashMap<String, Integer> getGradebook() {
        return gradebook;
    }

    /**
     * 
     * @return avg of grades in current gradebook
     */
    public double getGradeAverage() {
        setGradeAverage();
        return this.gradeAverage;
    }

    private void setGradeAverage() {
        if (!isValidGradebook())
            return;

        gradeAverage = calculateGradeAverage();

    }

    public void addAssignment(String assignmentName, int grade) {
        gradebook.put(assignmentName, grade);

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
