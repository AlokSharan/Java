/*
 Abstract Keyword
 Abstract Class has an Abstract Method
  
 */



 abstract class Bike {
	abstract void run();		//Abstract Method run

}
 
 
 class Honda extends Bike{
	 void run() {
		 
		 System.out.println("Bike Running Safely..");
		 
	 }
	 
	 
	 public static void main(String[] args) {
		
		 Bike myObj = new Honda();
		 
		 myObj.run();
		 
	}
	 	 
 }
