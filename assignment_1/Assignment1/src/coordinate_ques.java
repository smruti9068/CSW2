public class coordinate_ques {
    public static void main(String[] args) {

        point p1 = new point(12,20);
        point p2 = new point(p1);
        System.out.println("("+p1.getX()+","+p1.getY()+")");
        p2.setX(11);
        p2.setY(7);
        System.out.println("("+p2.getX()+","+p2.getY()+")");
    }
}

class point{
    private double x;
    private double y;
    point(double x,double y){
        this.x = x;
        this.y = y;
    }

    public point(point p) {
        System.out.println("Copy constructor called");
        x = p.x;
        y = p.y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}