public class shape {
    public static void main(String[] args) {
        rectangle r = new rectangle(0,0);
        r.setLength(12);
        r.setWidth(20);
        System.out.println(r.getLength()+" "+r.getWidth());
        System.out.println(r.area()+" "+r.perimeter());
    }
}
class rectangle{
    private double length;
    private double width;
    rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    double area(){
        return length*width;
    }
    double perimeter(){
        return 2*(length+width);
    }
}