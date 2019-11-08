/*
 * 
Private Access Modifier

The Code is only accessible within the declared class

 */

public class People2 {
	
	private String fname = "Mohan";
	private String lname = "Kumar";
	private String email_id = "mohankumar@gmail.com";
	private String address = "Delhi Mahanagar";
	private int age = 45;
	
	
	public static void main(String[] args) {
		
		People2 myObj = new People2();
		
		System.out.println("Name-> " + myObj.fname + " " + myObj.lname);
		System.out.println("Email_id-> " + myObj.email_id);
		System.out.println("Address-> " + myObj.address);
		System.out.println("Age-> " + myObj.age);
	}

}
