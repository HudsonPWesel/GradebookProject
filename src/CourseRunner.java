
import java.util.ArrayList;
import java.util.HashMap;

public class CourseRunner {

    private static HashMap<String, Course> courseList = new HashMap<String, Course>();
    private static ArrayList<String> courseNames = new ArrayList<String>();

    /**
     * 
     * @return Dummy Data of coursenames
     */
    private static ArrayList<String> setCourseNames() {
        ArrayList<String> courseNames = new ArrayList<String>();
        courseNames.add("Biology");
        courseNames.add("Computer-Science");
        courseNames.add("English");
        courseNames.add("Math");
        return courseNames;
    }

    /**
     * 
     * @return Dummy Data of Assignment names
     */
    private static ArrayList<String> initAssignmentNames() {
        ArrayList<String> assignmentNames = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            assignmentNames.add("HW#" + i);
        }
        return assignmentNames;
    }

    /**
     * 
     * @return Dummy Data of Students
     */
    private static ArrayList<Student> initStudents(ArrayList<String> courseNameList) {

        ArrayList<Student> students = new ArrayList<Student>();

        students.add(new Student(2023, "JEFF", courseNameList));
        students.add(new Student(2023, "JACK", courseNameList));
        students.add(new Student(2023, "JOHN", courseNameList));
        students.add(new Student(2023, "JAN", courseNameList));

        return students;
    }

    /**
     * 
     * @param assignments Arraylist of assignments
     * @return Hashmap of the following: {AssignmentName:Grade}
     * 
     */
    private static HashMap<String, Integer> initStudentGradebook(ArrayList<String> assignments) {
        HashMap<String, Integer> studentGrades = new HashMap<String, Integer>();
        for (String assignment : assignments) {
            int assignmentGrade = (int) (Math.random() * 100) + 1;
            studentGrades.put(assignment, assignmentGrade);
        }
        return studentGrades;

    }

    public static HashMap<String, Course> getCourseList() {
        return courseList;
    }

    /**
     * 
     * @return {StudentName:AssignemntGradebook,}
     */
    private static HashMap<String, AssignmentGradebook> initStudentGradebooks() {
        ArrayList<Student> students = initStudents(courseNames);
        ArrayList<String> assignmentNames = initAssignmentNames();

        HashMap<String, AssignmentGradebook> studentGradebooks = new HashMap<String, AssignmentGradebook>();

        for (Student student : students) {
            studentGradebooks.put(student.getName(), new AssignmentGradebook(initStudentGradebook(assignmentNames)));
        }
        return studentGradebooks;
    }

    /**
     * initialize the courseList property
     */
    public static void initCourses() {
        ArrayList<Course> courses = new ArrayList<Course>();
        ArrayList<String> courseNames = setCourseNames();
        HashMap<String, AssignmentGradebook> studentGradebooks = initStudentGradebooks();

        for (String courseName : courseNames) {
            courses.add(new Course(courseName, studentGradebooks));
        }

        setCourseList(courses);
    }

    private static void setCourseList(ArrayList<Course> courses) {
        for (Course course : courses) {
            courseList.put(course.getName(), course);
        }
        return;

    }

    // ---DEAD CODE---
    /*
     * // CourseName:{StudentName:AssignmentGradebook}
     * 
     * // try {
     * // Scanner sc = new Scanner(new File("/Users/hwesel23/Dropbox/Adv
     * // Java/Projects/ArrayList/src/courses.csv"));
     * // while (sc.hasNextLine()) {
     * // coursesNames = Arrays.asList(sc.nextLine().split(","));
     * // }
     * // } catch (Exception e) {
     * // // TODO: handle exception
     * // System.out.println(e);
     * // }
     */
    /*
     * // private static HashMap<String, HashMap<String, AssignmentGradebook>>
     * // initCourseGradebook(
     * // HashMap<String, AssignmentGradebook> studentGradebooks, String courseName)
     * {
     * 
     * // HashMap<String, HashMap<String, AssignmentGradebook>> courseGradebook =
     * new
     * // HashMap<String, HashMap<String, AssignmentGradebook>>();
     * // courseGradebook.put(courseName, studentGradebooks);
     * 
     * // return courseGradebook;
     * // }
     */

    public static void main(String[] args) {

        CourseRunner.initCourses();
        System.out.println(CourseRunner.getCourseList().get("English").getCourseGradebook().get("JAN").getGradebook());
        // System.out.println(CourseRunner.getCourseList());
        // System.out.println(CourseRunner.getCourseList().get("English").get("JAN").calculateGradeAverage());

    }
}
