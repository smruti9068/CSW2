package assignment3;


import java.util.ArrayList;
import java.util.Collections;

class Car implements Comparable<Car> {
    private int modalNo;
    private String name;
    private int stock;

    public Car(int modalNo, String name, int stock) {
        this.modalNo = modalNo;
        this.name = name;
        this.stock = stock;
    }

    // Getter and Setter methods
    public int getModalNo() {
        return modalNo;
    }

    public void setModalNo(int modalNo) {
        this.modalNo = modalNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public int compareTo(Car car) {
        return Integer.compare(this.stock, car.stock);
    }
}

public class car_App {
    public static void main(String[] args) {
        ArrayList<Car> carList = new ArrayList<>();

        // Adding cars
        carList.add(new Car(2013, "audi", 10));
        carList.add(new Car(2020, "bmw", 13));
        carList.add(new Car(2018, "Kia", 20));
        carList.add(new Car(2017, "alto", 45));
        carList.add(new Car(2015, "porshe", 55));

        // Sorting cars by stock
        Collections.sort(carList);

        // Printing sorted list of cars
        System.out.println("List of sorted Car Objects:");
        for (Car car : carList) {
            System.out.println(car.getModalNo() + " " + car.getName() + " " + car.getStock());
        }
    }
}

