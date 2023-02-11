import java.util.ArrayList;
import java.util.HashMap;

// THIS IS A DUMMY FILE 
// THIS IS A DUMMY FILE 
// THIS IS A DUMMY FILE 
// THIS IS A DUMMY FILE 
// THIS IS A DUMMY FILE 
// THIS IS A DUMMY FILE 
// THIS IS A DUMMY FILE 
// THIS IS A DUMMY FILE 
// I just wanted to keep this here for credit. 
// I started working in the course runner and then it just made more sense for the 'courselist' to be that

public class CourseList {

    // Coursename: Course
    private static HashMap<String, Course> courseList = new HashMap<String, Course>();

    public static void initCourse(String courseName, ArrayList<Student> students) {
        // Assignment:Grade
        for (Student student : students) {

        }
        HashMap<String, Integer> studentGrades = new HashMap<String, Integer>();

        // Student:Gradebook
        AssignmentGradebook studentGradebook = new AssignmentGradebook(studentGrades);

        // Students:Gradebooks
        HashMap<String, AssignmentGradebook> biologyGradebook = new HashMap<String, AssignmentGradebook>();

        Course biology = new Course(courseName, biologyGradebook);
    }

    // private HashMap<String, Integer> initCoursegradebook(ArrayList<Student>
    // students) {
    // HashMap<String, Integer> studentGrades = new HashMap<String, Integer>();
    // for (Student student : students) {
    // studentGrades.put(student.getName(), student.getGradebook())
    // }

    // }

    public static void initCourses(ArrayList<Course> courses) {

        for (Course course : courses) {
            courseList.put(course.getCourseName(), course);
        }

    }

    public Course getCourse(String courseName) {
        return courseList.get(courseName);
    }

    public static HashMap<String, Double> getCourseGradesByStudentname(Student student) {

        return filterGradebooksByStudent(student);
    }

    private static HashMap<String, Double> filterGradebooksByStudent(Student student) {
        HashMap<String, Double> studentCourses = new HashMap<String, Double>();
        for (String courseName : student.getCourses()) {
            studentCourses.put(courseName,
                    courseList.get(courseName).getAssignmentsByStudent(student.getName()).getGradeAverage());
        }
        return studentCourses;
    }
}
