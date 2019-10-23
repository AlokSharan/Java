//Multiple Objects in Java Class Attributes

/*If you create multiple objects of one class,you can change 
  the attribute values in one object, without affecting the 
  attribute values in the other:
*/

public class Attributes4 {
	
	int x = 21;
	
	public static void main(String[] args) {
		
		Attributes4 myObj1 = new Attributes4();		//Object 1
		Attributes4 myObj2 = new Attributes4();		//Object 2
		
		myObj2.x = 12;
		
		System.out.println(myObj1.x);				//Output 21
		System.out.println(myObj2.x);				//Output 12
	}

}
