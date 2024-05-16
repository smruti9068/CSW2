package assignment5;
class Myclass{
	   int i;
	   double d;
	   public Myclass(int i,double d){
	    this.i=i;
	    this.d=d;
	   }
	   public int getI(){
	    return i;}
	   public void setI(int i){
	    this.i=i;
	   }
	   public double getD(){
	    return d;}
	   public void setD(double d){
	    this.i=i;
	   }
	}
	public class ques5 {
	    public static void main(String[] args){
	        System.out.println("Before creating objects:");
	        System.err.println("memory(heap) size = "+Runtime.getRuntime().totalMemory());
	        System.err.println("free size(Space) = "+Runtime.getRuntime().freeMemory());
	        Myclass r1=new Myclass(5, 6.2);
	        Myclass r2=new Myclass(8, 9.4);
	        ;System.out.println("After creating objects:");
	        System.err.println("memory(heap) size = "+Runtime.getRuntime().totalMemory());
	        System.err.println("free size(Space) = "+Runtime.getRuntime().freeMemory());
	       r1=r2;
	       r2=null;
	       System.gc();
	       System.out.println("After making unreachable:");
	       System.err.println("memory(heap) size = "+Runtime.getRuntime().totalMemory());
	       System.err.println("free size(Space) = "+Runtime.getRuntime().freeMemory());
	    }
	}
