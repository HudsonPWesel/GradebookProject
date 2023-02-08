public class Student {
    private String name;
    private int graduationYear;
    private StudentGradebook gradebook;

    public Student(String name, int graduationYear, StudentGradebook gradebook) {
        this.name = name;
        this.graduationYear = graduationYear;
        this.gradebook = gradebook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }

    public StudentGradebook getGradebook() {
        return gradebook;
    }

    public void setGradebook(StudentGradebook courses) {
        this.gradebook = courses;
    }

    public void reclass() {
        graduationYear -= 1;
    }

}
