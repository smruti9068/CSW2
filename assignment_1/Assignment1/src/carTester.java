public class carTester {

    public static void main(String[] args) {
        car myCar1 = new car("bmw", "A9");
        car myCar2 = new car(null, null);
        myCar2.setMake("benz");
        myCar2.setModel("q7");
        System.out.println(myCar1.getMake()+" "+myCar1.getModel());
        System.out.println(myCar2.getMake()+" "+myCar2.getModel());
    }
}
class car{

    private String make;
    private String model;
    car(String make,String model){
        this.make = make;
        this.model = model;
    }
    void setMake(String make){
        this.make = make;
    }
    String getMake(){
        return make;
    }
    void setModel(String model){
        this.model = model;
    }
    String getModel(){
        return model;
    }
}