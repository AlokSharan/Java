//Multiple Attributes
//You can Specify as many Attributes as you want.


public class Person {
	
	String fname = "Alok";					//Attributes 1
	String lname = "Sharan";				//Attributes 2
	   int age = 30;						//Attributes 3
	
	public static void main(String[] args) {
		
		Person myObj = new Person();		//Object
		
		System.out.println("Name:- " + myObj.fname + " " + myObj.lname );
		System.out.println("Age:- " + myObj.age);
		
	}

}
