class Laptop{
	private String model;
	private int price;
	
	public Laptop(String model, int price) {
		this.model=model;
		this.price=price;
	}
	
	public String getM() {
		return model;
	}
	
	public int getP() {
		return price;
	}
	
	public void setM(String model) {
		this.model=model;
	}
	
	public void setP(int price) {
		this.price=price;
	}
	
	@Override
	public String toString() {
		return "Laptop's Model: "+model+" and it's price: "+price;
	}
	
}

public class laptop_ques {

	public static void main(String[] args) {
		
		Laptop l1 = new Laptop(null,0);
		
		l1.setM("Apple");
		l1.setP(99990);
		
		System.out.println(l1.toString());
		
	}
	
}
