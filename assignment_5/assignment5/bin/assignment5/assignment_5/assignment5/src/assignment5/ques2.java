package assignment5;


class ReassigningReference{
     String name;
     public ReassigningReference(String name){
        this.name=name;
     }
     protected void finalize()throws Throwable{
        System.out.println("Garbage collection successful");
     }
}
    public class ques2 {
     public static void main(String[] args) {
         ReassigningReference r1=new ReassigningReference("object1");
         ReassigningReference r2=new ReassigningReference("object2");
         r1=r2;//r1 value becomes unreachable
         System.gc();

     }
}
//reassigning reference variable: reference variable id's are extremely imported in java.
//It is used in java for addressing objects and variables in java that can be used in any code.
//It becomes unreachable bcoz of reference id being used in multiple object.
//If the firt object reference id is used to store another refernce id then the first reference id becomes unreachable and can't be used.
