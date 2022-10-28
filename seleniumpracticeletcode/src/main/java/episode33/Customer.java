package episode33;

public class Customer {
	
	public static void main(String[] args) {
		Axis myBank= new Axis();
		myBank.aadharMandatory();
		boolean panMandetoty = myBank.panMandatory();
		System.out.println(panMandetoty);
		myBank.interestFreeLoan();
		System.out.println(RBI.UPILimit);
		System.out.println(Axis.UPILimit);
		
		/*
		 * We cannot create object for interface.
		 * in order to create object you to (Syntax RBI myRBI = new RBI():)
		 * have constructor but in interface you cannot create constructor() 
		 * therefore interface cannot create object 
		 * 
		 * instead can create reference variable  
		 * RBI myRBI = new Axis(): 
		 * this way you will be able to only access the members of reference class (RBI)
		 * 
		 * 
		 */
	}
}
