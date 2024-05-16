interface Vehicle {
	public abstract void accelerate();
	public abstract void brake();
}

class Cars implements Vehicle {
	public void accelerate() {
		System.out.println("When accelerator is pressed car starts to accelerate starting from 0 km/h");
	}
	
	public void brake() {
		System.out.println("When brake is pressed, car starts deaccelerating.");
	}
}

class Bicycle implements Vehicle {
	public void accelerate() {
		System.out.println("When paddle is pushed recursively, bicycle starts to accelerate starting from 0 km/h");
	}
	
	public void accelerate(int speed) {
		System.out.println("Bicycle is going "+speed+" km/h");
	}
	
	public void accelerate(double duration) {
		System.out.println("Bicycle is going to take "+duration+" mins to reach.");
	}
	
	public void accelerate(int speed, double duration) {
		System.out.println("Bicycle is going "+speed+" km/h");
		System.out.println("Bicycle is going to take "+duration+" mins to reach.");
	}
	
	public void brake() {
		System.out.println("When brakes are pressed, bicycle starts deaccelerating.");
	}
}

public class Vehicle_main {

	public static void main(String[] args) {
		
		System.out.println("About Cars:");
		Cars c = new Cars();
		c.accelerate();
		c.brake();
		
		System.out.println();
		
		System.out.println("About Bicycles:");
		Bicycle b = new Bicycle();
		b.accelerate();
		b.accelerate(25);
		b.accelerate(30.5);
		b.accelerate(30, 28.5);
		
	}
	
}

