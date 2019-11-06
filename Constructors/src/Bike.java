//You can have a many parameter as you want

public class Bike{
	int modelYear;
	String modelName, speedometer, engineType, realBrake, mile, max, fuelCapacity;
	
	public Bike(int year,String mile,String max,String fuel,String  name, String speed,String engine,String brake){
		
		modelYear = year;
		this.mile = mile;
		this.max = max;
		fuelCapacity = fuel;
		modelName = name;
		speedometer = speed;
		engineType = engine;
		realBrake = brake;
}
	
	public static void main(String[] args) {
		

		Bike myObj = new Bike( 2020, "40Kmpl", "27PS", "15L", "Kawasaki Ninja", "Analogue", "Single Cylinder", "Disc");
		
		System.out.println("Model Name -> " + myObj.modelName);
		System.out.println("Year -> " + myObj.modelYear);
		System.out.println("Mile -> " + myObj.mile);
		System.out.println("Max -> " + myObj.max);
		System.out.println("Fuel Capacity -> " + myObj.fuelCapacity);
		System.out.println("Speedo Meter -> " + myObj.speedometer);
		System.out.println("Engine Type -> " + myObj.engineType);
		System.out.println("Real Brake -> " + myObj.realBrake);
		
	}
	
}