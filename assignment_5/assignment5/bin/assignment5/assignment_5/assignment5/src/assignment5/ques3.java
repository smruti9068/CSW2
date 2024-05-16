package assignment5;
class NullifiedReference{
    String name;
    public void NullifiedReference(String name){
     this.name=name;
    }
    protected void finalize()throws Throwable{
     System.out.println("Garbage is collected successfully");
    }
 }
 public class ques3 {
     public static void main(String[] args) {
         NullifiedReference r1=new NullifiedReference();
         r1=null;
         System.gc();
     }
 }