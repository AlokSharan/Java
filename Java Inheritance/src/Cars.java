/*

The Class Cannot be Inherited by other Classes

Non-Access Modifiers  ()

final keyword

 */


public class Vehicle {
	 protected String brand = "Ford";
	
	
	public void honk() {
		System.out.println("Tuut , tuut!");
		
	}
}

class Cars extends Vehicle {
	private String modelName = "Mustang";
	
	public static void main(String[] args) {
		Cars myCar = new Cars();
		myCar.honk();
		System.out.println(myCar.brand + " " + myCar.modelName);
		
	}
	
}
