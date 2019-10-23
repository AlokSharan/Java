//Access Methods with an Object

public class MethodsCar {					//Create Class
	
	public void fullThrottle() {			//Create fullThrottle Method
		System.out.println("The Car is going as fast as it can! ");
		
	}
	
	//Create a Speed() Method and add a Parameter
	public void speed(int maxSpeed) {		 
		System.out.println("Max speed is:" + maxSpeed);
		
	}
	
	// Inside main Method, call the methods on the newCar object
	public static void main(String[] args) {	
		MethodsCar newCar = new MethodsCar();
		
		
		//The dot (.) is used to access the object's attributes and methods
		newCar.fullThrottle();
		newCar.speed(200);
	}

}
