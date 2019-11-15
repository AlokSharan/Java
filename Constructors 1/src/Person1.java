//File No- B1

//Abstract Class Example


abstract class Person1 {
	
	public String fname = "Master";
	public String lname = "Jugnu";
	public String email_id = "masterjugnu@gmail.com";
	public String address = "Devli, KhanPur Delhi ";
	public int age = 30;
	
	
	public abstract void study();	//abstract method
}


//Subclass (Inherit from Person)

class Student2 extends Person1{	
	public int graduationYear = 2019;
	
	public void Study() {				//The Body of the abstract method is provided here
		
		System.out.println("Studying all day!");
		
	}	
}
