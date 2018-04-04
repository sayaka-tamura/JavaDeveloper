// #4.
public class Trainee extends Employee {
	
	public Trainee(long Id, String Name, String address, long phone, double basicSalary) {
		super(Id, Name, address, phone);
		this.basicSalary = basicSalary;
	}
	
	// # Problem Statement 2-3:
	@Override
	public double calculateTransportAllowance(){
		double transportAllowance = super.calculateTransportAllowance();
		return transportAllowance;
	}
}
