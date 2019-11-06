//You can have a many parameter as you want

public class Bike{
	int modelYear1;
	String modelName, speedometer, engineType, realBrake,mile,modelYear, max, fuelCapacity;
	
	public Bike(int year,String mile,String max,String fuel,String  name, String speed,String engine,String brake){
		
		modelYear1 = year;
		this.mile = mile;
		this.max = max;
		fuelCapacity = fuel;
		modelName = name;
		speedometer = speed;
		engineType = engine;
		realBrake = brake;
}

public static void main(String[] args) {

	Bike myObj = new Bike( 2020, "37Kmpl", "27PS", "15L", "Kawasaki Ninja", "Analogue", "Single Cylinder", "Disc");
	System.out.println(myObj.modelYear1);
	System.out.println(myObj.mile);
	System.out.println(myObj.max);
	System.out.println(myObj.fuelCapacity);
	System.out.println(myObj.modelName);
	System.out.println(myObj.speedometer);
	System.out.println(myObj.engineType);
	System.out.println(myObj.realBrake);
	
}

}