package episode10;

public class LearnStaticFunction {

		//Why cannot use this key in static method ?
	
		/*
		 * This key reference class variable/method also static belongs to class member 
		 * compiler gets confused which one can be used coz they both doing or referring same member	
		 */
		
		int a = 10;
		
		public static void displayNAme() {
			
			//non-static member cannot be called in static method
			//System.out.println(a);
			//this key cannot be called here bcoz its also referring class member same as static key
			//System.out.println(this.a);
			System.out.println("Denesh");
			
			
			
		}
	public static void main(String[] args) {
		/*
		 * Use of static key , is to help the help functionality. 
		 * eg, where  every we calling public static function in class from JAR we never crate an 
		 * instance instead we called with the reference of class name along with function name     
		 */
		
		String a ="10";
		String b ="10";
		
		int c = Integer.parseInt(a);
		int d = Integer.parseInt(b);
		System.out.println(c+ d);
		
		
	}
	
	
}
