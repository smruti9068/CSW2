
abstract class LibraryResource {
	protected String Title;
	protected String Author;
	
	public LibraryResource(String Title, String Author) {
		this.Title=Title;
		this.Author=Author;
	}
	
	public String getT() {
		return Title;
	}
	
	public String getA() {
		return Author;
	}
	
	public void setT(String Title) {
		this.Title=Title;
	}
	
	public void setA(String Author) {
		this.Author=Author;
	}
	
	public abstract void displayDetails();
}

class Book extends LibraryResource{
	private int pageCount;
	
	public Book(String Title, String Author, int pageCount) {
		super(Title,Author);
		this.pageCount=pageCount;
	}
	
	public int getp() {
		return pageCount;
	}
	
	public void setp(int pageCount) {
		this.pageCount=pageCount;
	}
	
	public void displayDetails() {
		System.out.println("Info about Books");
		System.out.println("Book's Title: "+Title);
		System.out.println("Book's Autor: "+Author);
		System.out.println("Book's page count: "+getp());
		System.out.println("");
	}
}

class Magazine extends LibraryResource {
	private String issueDate;
	
	public Magazine(String Title, String Author, String issueDate) {
		super(Title,Author);
		this.issueDate=issueDate;
	}
	
	public String geti() {
		return issueDate;
	}
	
	public void seti(String issueDate) {
		this.issueDate=issueDate;
	}
	
	public void displayDetails() {
		System.out.println("Info about Magazines");
		System.out.println("Magazine's Title: "+Title);
		System.out.println("Magazine's Distributor: "+Author);
		System.out.println("Magazine's issue date: "+geti());
		System.out.println("");
	}
}

class DVD extends LibraryResource {
	private double duration;
	
	public DVD(String Title, String Author, double duration) {
		super(Title,Author);
		this.duration=duration;
	}
	
	public double getd() {
		return duration;
	}
	
	public void setd(double duration) {
		this.duration=duration;
	}
	
	public void displayDetails() {
		System.out.println("Info about DVDs");
		System.out.println("DVD's Title: "+Title);
		System.out.println("DVD's Maker: "+Author);
		System.out.println("DVD's Duration: "+duration);
		System.out.println();
	}
}

public class LibrarySystem {

	public static void main(String[] args) {
		
		Book b = new Book(null,null,0);
		b.setT("Verity");
		b.setA("Colleen Hoover");
		b.setp(300);
		
		Magazine m = new Magazine(null,null,null);
		m.setT("Playboy");
		m.setA("IDK");
		m.seti("22/2/2024");
		
		DVD d = new DVD(null,null,0.0);
		d.setT("The Lion King");
		d.setA("Walt Disney");
		d.setd(120.20);
		
		b.displayDetails();
		m.displayDetails();
		d.displayDetails();
	}
	
}