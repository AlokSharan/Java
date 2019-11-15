/* 
 
 
 Final Keyword 
  

 If you don't want the ability to override existing 
 attribute values, declare attributes as final
 
 
*/


public class FinalKeyword {
	
	final int x = 10;
	final double PI = 3.14;
	
	
	public static void main(String[] args) {
		
		FinalKeyword myObj = new FinalKeyword();
		
	//	myObj.x =  50;	//will generate an error:cannot assign a value to a final variable
	//	myObj.PI = 40;	//will generate an error:cannot assign a value to a final variable
		
		System.out.println(myObj.x);
		System.out.println(myObj.PI);
		
	}
	
}

