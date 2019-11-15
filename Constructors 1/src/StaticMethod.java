/*

A "Static method" can be accessed without creating an Object.
A "Public method" must be called by Creating an Object.

Difference between "Static" and "Public" Methods.

 */



public class StaticMethod {
	
	
	//Static Method
	static void myStaticMethod() {
		System.out.println("Static methods can be called without creating an Object");
	}
	
	
	//Public Method
	public void myPublicMethod() {
		System.out.println("Public methods Must be called by Creating an Object");
	}	
		
		
	//Main Method
	public static void main(String[] args) {
		myStaticMethod();							//Call Static Method
		
	
	
	StaticMethod myObj = new StaticMethod();		//Create an Object
	myObj.myPublicMethod();							//Call Public Method
	}
	
}
