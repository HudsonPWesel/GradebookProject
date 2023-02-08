import java.util.HashMap;

public class CourseGradebook {
    private HashMap<String, Student> gradebook;

    public CourseGradebook(Gradebook gradebook) {
        this.gradebook = gradebook.getGradebook();

    }

    public void printStudents() {
        System.out.println(gradebook.toString());
    }

    public void removeStudent(Student student) {
        gradebook.remove(student.getName());
    }

    public void addStudent(Student student) {
        gradebook.put(student.getName(), student);
    }

    public void addStudents() {

    }

    public HashMap<String, Student> getStudents() {
        return gradebook;
    }

}

class StudentGradebook {
    // CourseNames : Grade
    private HashMap<String, Student> gradebook;

    public StudentGradebook(String studentName) {
        for (Student iterable_element : iterable) {

        }

    }

    // TODO SETY STUDENT GRADEBOOK TO RETURN
    public CourseGradebook getStudentGradebook() {
        return this.courseGradebook;

    }

    // public void addGrade

}