package episode8;

public class LearStatic {
	
	//non-static variable,it belong to an object
	int x=0;
	//static variable,it belong to class
	static int y =0;
	
	void counter() {
		x++;
		y++;
		System.out.println("Non-static increment is = " + x);
		System.out.println("static increment is = " + y);
	}
	
	public static void main(String[] args) {
		
		LearStatic ls = new LearStatic();
		ls.counter();
		ls.counter();
		System.out.println("new object");
		LearStatic ls2 = new LearStatic();
		ls2.counter();
		ls2.counter();
	}
	
}
