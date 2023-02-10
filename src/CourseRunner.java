import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class CourseRunner {

    public static void initCourses(ArrayList<Course> courses) {
        try {
            Scanner sc = new Scanner(new File("/Users/hwesel23/Dropbox/Adv Java/Projects/ArrayList/src/courses.csv"));
            while (sc.hasNextLine()) {
                coursesNames = Arrays.asList(sc.nextLine().split(","));
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> courseNames = new ArrayList<String>();
        CourseRunner.initCourses(courseNames);
        for (String n : courseNames) {

            System.out.println(n);
        }
        // ArrayList<Student> students =

        ArrayList<Character> courseBlocks = new ArrayList<Character>(Arrays.asList('A', 'B', 'C', 'D', 'E'));

        // ArrayList<HashMap<String, AssignmentGradebook>> gradebooks = new
        // ArrayList<HashMap<String, AssignmentGradebook>>(
        // // FOREACH TO INTIALIZE GRADEBOOKS
        // Arrays.asList(
        // new HashMap<String, AssignmentGradebook>() {
        // {
        // put();
        // put("key2", "value2");
        // }
        // }));

        // CourseList.setCourses(null, null, null, null);
    }
}
