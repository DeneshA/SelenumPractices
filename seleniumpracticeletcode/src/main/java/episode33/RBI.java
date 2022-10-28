package episode33;

public interface RBI {
	
	//By default variable are Static & Final
	int UPILimit = 100000;
	
	// Methods or functions are Public of abstract function ,means no implementation only specification given
	void aadharMandatory();
	
	boolean panMandatory();
	
	/*
	 * from java 1.8 onwards
	 * can have default & static method with implementation
	 */
	
	default void housingLoan(){
		System.out.println("Housing load from default method");
	}
	
	static void bikeLoan(){
	System.out.println("Bike loan form static method"
			+ "");	
	}
	
	
}
