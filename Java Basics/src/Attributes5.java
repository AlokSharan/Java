//Multiple Objects in Java Class Attributes
//Multiple Variable

public class Attributes5 {
	
	int x = 27;						//Attributes 1
	int y = 72;						//Attributes 2
	
	public static void main(String[] args) {
		
		Attributes5 myObj1 = new Attributes5();			//Object 1
		Attributes5 myObj2 = new Attributes5();			//Object 2
		
		System.out.println("Object1 = " + myObj1.x);					//Output 27
		System.out.println("Object2 = " + myObj2.y);					//Output 72
	}

}
