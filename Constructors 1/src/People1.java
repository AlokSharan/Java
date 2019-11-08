/*
 * 
Protected Access Modifier

The Code is only accessible within the declared class

 */

 public class People1 {
	
	protected String fname = "Dhiraj";
	protected String lname = "Karn";
	protected String email_id = "dhirajkarn@gmail.com";
	protected String address = "NIT Patna";
	protected int age = 32;
	
 }
	class Society extends People1{
		
		private int graduationYear = 2010;
		
		public static void main(String[] args) {
			
			Society myObj = new Society();
			
			System.out.println("Name-> " + myObj.fname + " " + myObj.lname);
			System.out.println("Email_id-> " + myObj.email_id);
			System.out.println("Address-> " + myObj.address);
			System.out.println("Age-> " + myObj.age);
			System.out.println("Graduation-> " + myObj.graduationYear);
		}

}
	
