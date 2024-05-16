package assignment5;
class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + " object is being garbage collected");
        super.finalize();
    }
}

public class q7 {
    public static void main(String[] args) {
        Student student = new Student("John");
        student = null; // Making the object eligible for garbage collection
        System.gc(); // Initiating garbage collection
    }
}