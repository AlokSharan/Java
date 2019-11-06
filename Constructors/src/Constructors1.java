/*

Constructor Parameters

 */
public class Constructors1 {
	
	int x;
	
	public Constructors1(int y) {
		
		x = y;
		
	}
	
	public static void main(String[] args) {
		
		Constructors1 myObj = new Constructors1(5);
		System.out.println(myObj.x);
	}

}
