package bookTest;

public class Book {
	private String name;
	
	public Book(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public int add(int a,int b){
		return a+b;
	}
}
