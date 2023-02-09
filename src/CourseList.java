import java.util.ArrayList;
import java.util.HashMap;

public class CourseList {

    // Coursename: Course

    private static HashMap<String, Course> courses = new HashMap<String, Course>();

    public static void setCourses(ArrayList<String> coursenames, ArrayList<Character> courseBlocks,
            ArrayList<HashMap<String, AssignmentGradebook>> gradebooks, ArrayList<Boolean> isPassFailList) {
        for (int i = 0; i < coursenames.size() - 1; i++) {
            courses.put(coursenames.get(i), new Course(
                    coursenames.get(i),
                    courseBlocks.get(i),
                    gradebooks.get(i),
                    isPassFailList.get(i)));
        }
    }

    public Course getCourse(String courseName) {
        return courses.get(courseName);
    }

    public static HashMap<String, Double> getCourseGradesByStudentname(Student student) {

        return filterGradebooksByStudent(student);
    }

    private static HashMap<String, Double> filterGradebooksByStudent(Student student) {
        HashMap<String, Double> studentCourses = new HashMap<String, Double>();
        for (String courseName : student.getCourses()) {
            studentCourses.put(courseName,
                    courses.get(courseName).getAssignmentsByStudent(student.getStudentName()).getGradeAverage());
        }
        return studentCourses;
    }

}
