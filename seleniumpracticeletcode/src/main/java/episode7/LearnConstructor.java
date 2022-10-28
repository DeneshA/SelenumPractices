package episode7;

public class LearnConstructor {
	
	/*
	 * A constructor in java is a special method taht is used to initialize objects
	 * 
	 * It can be used to set inttial values for object attributes
	 * 
	 * no return type in constructor
	 * 
	 * Default & Parameter constructor type
	 * Public,Private& Default access
	 * 
	 * You can have the private the constructor if you don't want to create object from the external class
	 */
	
	int x;
	String name;
	
	void display() {
		System.out.println(x + "-->"+ name);
	}
	
	public LearnConstructor()
	{
		this.x = 1000;
	}
	public LearnConstructor(int x) {
		this.x=x+5;
	}
	public static void main(String[] args) {
		
		LearnConstructor ls= new LearnConstructor();
		ls.display();
		LearnConstructor ls1= new LearnConstructor(50);
		ls1.display();
		
	}
	
}
