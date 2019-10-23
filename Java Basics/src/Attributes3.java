/*If you don't want to ability to override
  existing value, declare the attributes as "final":
 */
 

public class Attributes3 {
	
	final int x = 23;	//Constant Value
	
	public static void main(String[] args) {
		
		Attributes3 myObj = new Attributes3();
		
		//myObj.x = 32;   //will generate an Error:connot assign a value in final variable
		
		System.out.println(myObj.x);
	}

}
