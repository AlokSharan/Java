/*

You can have many Parameter as you want.

 */


public class Car {
	int modelYear;
	String modelName;
	
	
	public Car(int Year , String Name) {
		modelYear = Year;
		modelName = Name;
		
	}
	
	
	public static void main(String[] args) {
		
		Car car = new Car(2000, "Duster");
		System.out.println("Year-" + car.modelYear + " " + "Name-" + car.modelName);
		
	}

}
