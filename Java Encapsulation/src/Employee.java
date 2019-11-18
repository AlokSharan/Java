/*

Encapsulation Example


 */



public class Employee 

{
	
	private int empid;
	public void setEmpid(int eid) 			//Setter Method
	
	{
		empid = eid;	
	}
	
	
	public int getEmpid() 					//Getter Method
	
	{	
		return empid;	
	}

}


class Company
{
	
	public static void main(String[] args) 
	
	
	{
		Employee myObj = new Employee();
		myObj.setEmpid(100);
		System.out.println(myObj.getEmpid());
		
	}
}
