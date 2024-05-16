package assignment5;
class AnonymousObject{
    String name;
    public AnonymousObject(String name){
        this.name=name;
    }
    protected void finalize()throws Throwable{
        System.err.println("Garbage collection successfull");
    }
}
public class ques4 {
    public static void main(String[] args) {
        new AnonymousObject("Object1");
        System.gc();
    }
}