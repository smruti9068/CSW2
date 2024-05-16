package assignment5;
class UnreachableObject{
    String name;
    public UnreachableObject(String name){
        this.name=name;
    }
       public void display(){
            System.out.println("Display name:"+ name);
        }
       protected void finalize()throws Throwable{
       System.out.println("Garbage colllection is successful");
       }
    }
       public class ques1{
        public void show(String name){
            UnreachableObject obj=new UnreachableObject(name);
            obj.display();
        }
        public static void main(String[] args){
            ques1 gc=new ques1();
           gc.show("object 1");
           System.gc();
        }
       }
       
    
