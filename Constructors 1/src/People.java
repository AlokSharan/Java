/*
 * 
Private Access Modifier

The Code is only accessible within the declared class

 */

public class People {
	
	private String fname = "Mohan";
	private String lname = "Kumar";
	private String email_id = "mohankumar@gmail.com";
	private String address = "Mumbai Mahanagar";
	private int age = 45;
	
	
	public static void main(String[] args) {
		
		People myObj = new People();
		
		System.out.println(myObj.fname);
		System.out.println(myObj.lname);
		System.out.println(myObj.email_id);
		System.out.println(myObj.address);
		System.out.println(myObj.age);
	}

}
