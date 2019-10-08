public class Employee {
	protected String name;
	protected String employeeNumber;
	protected String hireDate;
	
	public Employee(String n, String eN, String hD){
		name = n;
		employeeNumber = eN;
		hireDate = hD;
	}
	
	public Employee(){
		this(null, null, null);
	}
	
	public void setName(String n){
		name = n;
	}
	
	public void setEmployeeNumber(String eN){
		employeeNumber = eN;
	}
	
	public void setHireDate(String hD){
		hireDate = hD;
	}
	
	
}