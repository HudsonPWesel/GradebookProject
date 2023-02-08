import java.util.HashMap;

public class Gradebook {
    // THIS IS A POJO (Plain Old Java Object)
    // By convention, a POJO has no methods, and I can't let this class have methods
    // because this will also be composed into a studentgradebook class

    private HashMap<String, Student> gradebook = new HashMap<String, Student>();

    public HashMap<String, Student> getGradebook() {
        return this.gradebook;
    }

}
