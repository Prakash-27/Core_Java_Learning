package core.java.Abstraction_Interface_and_Encapsulation;

public class Encapsulation_Employee_Example {

	//Encapsulation is also called data hiding.
	//How to implement Encapsulation:
	
	//private data variables: so that this Vars cannot accessed directly from outside the class.
	private long Ssn;
	private String employeeName;
	private int employeeAge;
	private long employeeAccountNo;
	
	public static void main(String[] args) {

		Encapsulation_Employee_Example employee_Example = new Encapsulation_Employee_Example();
		employee_Example.setEmployeeName("Peter Parker");
		employee_Example.setEmployeeAge(22);
		employee_Example.setEmployeeAccountNo(010101010101);
		employee_Example.setSsn(011011011011); 
		
		System.out.println("Employee Name is: "+ employee_Example.getEmployeeName());
		System.out.println("Employee Age is: "+ employee_Example.getEmployeeAge());
		System.out.println("Employee Account No is: " +employee_Example.getEmployeeAccountNo());
		System.out.println("Employee Ssn is: "+employee_Example.getSsn());
	}

	//Getter and Setter Method: to set and get the values of the Fields
	public long getSsn() {
		return Ssn;
	}

	public void setSsn(int ssn) {
		Ssn = ssn;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}

	public long getEmployeeAccountNo() {
		return employeeAccountNo;
	}

	public void setEmployeeAccountNo(int employeeAccountNo) {
		this.employeeAccountNo = employeeAccountNo;
	}

}
