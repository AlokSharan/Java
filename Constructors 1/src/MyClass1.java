//File No- B1

//Abstract class Example


	class MyClass1 {
	
	public static void main(String[] args) {
		
		Student2 myObj = new Student2();
		
		System.out.println("Name:- " + myObj.fname + " " + myObj.lname);
		System.out.println("Email_id:- " + myObj.email_id);
		System.out.println("Address:- " + myObj.address);
		System.out.println("Age:- " + myObj.age);
		System.out.println("Graduation Year:- " + myObj.graduationYear);
		
		myObj.study();
	}

}
