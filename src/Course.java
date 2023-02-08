import java.util.ArrayList;

public class Course<gradeType> {
    private String courseName;

    private char courseBlock;

    private CourseGradebook gradebook;
    private boolean isPassFail;

    public Course(String courseName, char courseBlock, CourseGradebook gradebook, boolean isPassFail) {
        this.courseName = courseName;
        this.courseBlock = courseBlock;
        this.gradebook = gradebook;
        this.isPassFail = isPassFail;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void printGrades() {
        System.out.println(gradebook.toString());
    }

    public void setGrades(ArrayList<gradeType> grades) {
        System.out.println();
    }

    public int calculateAverage(ArrayList<gradeType> grades) {
        return -1;
    }

    public void addGrade(int grade) {
        System.out.println();
    }

}
