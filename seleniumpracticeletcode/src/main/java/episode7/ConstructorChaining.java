package episode7;

import javax.management.remote.SubjectDelegationPermission;

//Java program to illustrate Constructor Chaining
//within same class Using this() keyword
//https://www.geeksforgeeks.org/java-interview-questions-constructors/


public class ConstructorChaining {

	/*
	 * What is Constructor Chaining ?
		Constructor Chaining is a technique of calling another constructor from one constructor.
		this() is used to call same class constructor where as super() is used to call super class constructor.
	 */
	
	// default constructor 1
    // default constructor will call another constructor
    // using this keyword from same class
	 ConstructorChaining() {
		// calls constructor 2
		this(5);
		System.out.println("The default constructor from Constructor Chaining");
	}
	// parameterized constructor 2
	ConstructorChaining(int x){
		// calls constructor 3
		this(5,15);
		System.out.println(x);
	}
	 // parameterized constructor 3
	ConstructorChaining(int x,int y){
		System.out.println(x*y); 
	}
	protected ConstructorChaining(int x1,int x2,int x3) {
		System.out.println("Total = " + (x1+x2+x3));
	}
	
	public static void main(String[]  args) {
		
		// invokes default constructor first
        new ConstructorChaining();
        
        ConstructortSub cs= new ConstructortSub();
        
	}
	
}
/*All true 
 *  Constructor name should be same as class name.
2) If you don't define a constructor for a class, 
    a default parameterless constructor is automatically
    created by the compiler. 
3) The default constructor calls super() and initializes all 
   instance variables to default value like 0, null.
4) If we want to parent class constructor, it must be called in 
   first line of constructor.*/
