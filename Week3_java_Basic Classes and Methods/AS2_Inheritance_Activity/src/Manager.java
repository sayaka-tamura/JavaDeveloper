// #4.
public class Manager extends Employee {

	public Manager(long Id, String Name, String address, long phone, double basicSalary) {
		super(Id, Name, address, phone);
		super.basicSalary = basicSalary;
	}
	
	// # Problem Statement 2-2:
	@ Override
	public double calculateTransportAllowance(){
		double transportAllowance = 15*basicSalary/100;
		return transportAllowance;
	}
}
