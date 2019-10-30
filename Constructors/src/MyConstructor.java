/*
 
Create a Constructor

*/


public class MyConstructor {
	int x;						//Create a Class Attributes
	
	public MyConstructor() {	//Create a Class Constructor same as Class name
		x = 555;					//Set the initial value for the Class Attribute x
			
	}
	
	public static void main(String[] args) {
		
		MyConstructor myObj = new MyConstructor();		//Create Object(This will Call the Constructor)
		
		System.out.println(myObj.x);				//Print the value of x
	}

}
