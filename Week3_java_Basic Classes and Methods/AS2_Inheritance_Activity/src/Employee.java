
public class Employee {
	
	// #1.
	protected long employee_Id;
	protected String employee_Name;
	protected String employee_Address;
	protected long employee_Phone;
	protected double basicSalary;
	private double specialAllowance = 250.80;
	private double Hra = 1000.50; 				// Health Reimbursement Arrangement
	
	// #2.
	public Employee(long Id, String Name, String address, long phone)
	{
		employee_Id = Id;
		employee_Name = Name;
		employee_Address = address;
		employee_Phone = phone;
	}
	
	/* ------ Setter and Getter ------ */
	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}	
	/* ------ End Setter and Getter ------ */
	
	// #3.
	public double calculateSalary() {
		double totalSalary = basicSalary + (basicSalary * specialAllowance/100) + (basicSalary * Hra/100);
		return totalSalary;
	}
	
	// # Problem Statement 2-1:
	public double calculateTransportAllowance(){
		double transportAllowance = basicSalary*10/100;
		return transportAllowance;
	};
	
	@Override
	public String toString() {
		String msg = "Employee Info: \n";
		msg += "Employee ID: " + employee_Id + "\n";
		msg += "Employee_Name: " + employee_Name + "\n";
		msg += "Employee_Address: " + employee_Address + "\n";
		msg += "Employee_Phone: " + employee_Phone + "\n";
		msg += "Basic Salary: $" + basicSalary + "\n";
		msg += "Special Allowance: $" + specialAllowance + "\n";
		msg += "Hra: " + Hra + "\n";
		return msg;
	}
}
