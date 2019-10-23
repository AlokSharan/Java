// Modify and Override existing value

public class Attributes2 {
	
	int x = 44;
	
	public static void main(String[] args) {
		
		Attributes2 myObj = new Attributes2();
		
		myObj.x = 55;								//Override Existing Value
		
		System.out.println(myObj.x);
	}

}
