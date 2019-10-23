//Java Constructor


public class MyConstructor {		//Create MyConstructor class
	int x;							//Create class Attribute
	
	
	public MyConstructor() {		//Create a class Constructor for the MyConstructor class
		x = 5;						//Set the initial value for the class attribute x
		
	}
	
	public static void main(String[] args) {
		
		MyConstructor myObj = new MyConstructor();	//Create an object of class MyConstructor
		
		System.out.println(myObj.x);			//Print the value of X
	}

}
