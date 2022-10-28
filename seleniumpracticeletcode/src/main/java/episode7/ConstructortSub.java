package episode7;

public class ConstructortSub extends ConstructorChaining{
	
	/*
	 * Can we call sub class constructor from super class constructor?
		No. There is no way in java to call sub class constructor from a super class constructor.
	 */
	
	static int a;
	
	static {
		a=4;
		System.out.println("This is called from Static block");
		System.out.println("a = "+ a);
	}
	
	public ConstructortSub() {
		
		System.out.println("This is call of Constructor sub");
		a=10;
		System.out.println("a = "+ a);
	}
	
	public static void func() {
		
		a = a+ 1;
		System.out.println("a = "+ a);
		
	}
	
	public static void main(String[] args) {
	/*
	 * 
		Static blocks are called before constructors. Therefore, on object creation of class Test, static block is called.
		 So, static variable a = 4. Then constructor Test() is called which assigns a = 10. 
		 Finally, function func() increments its value.
		 https://www.geeksforgeeks.org/java-gq/constructors-2-gq/
	 */
		ConstructorChaining cc= new ConstructorChaining(1,2,3);
		ConstructortSub cs = new ConstructortSub();
		cs.func();
		
	}
}
