package episode6;

public class LearnThisAndInstance {

	static int c =100; // instance variable (global variable)
	//instance variable will inilizalise the default values to it variable and no needed to inilize after declare it
	
	void addTwoNumbers(int a ,int b) {
		int c=30;
		// int d=20; Local variable
		// You should declare and inintilize the value at the same time you cannot do inintilation after
		
		System.out.println(" 1 "+ (a+b));
		System.out.println(" 2 "+ (a+b+c));
		//"this" key is refer to the instance variable therefore it will ignor to local variable 
		System.out.println(" 2 "+ (a+b+this.c));
		
	}
	
	public static void main(String[] args) {
		
		LearnThisAndInstance ls = new LearnThisAndInstance();
		ls.addTwoNumbers(10,5);
		
		System.out.println("calling without this key "+ c);
		//System.out.println("calling without this key "+ this.c);
		// you cannot call instance variable with this key word but can
		// change the instance variable as static and call directly without "this"
		System.out.println("calling without this key "+ c);
		
	}
	
	
}
