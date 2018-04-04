
public class InheritanceActivity {
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(00001, "Mike Daniel", "123 Broodway Avenue, New York", 917123456);
		emp1.setBasicSalary(2500);
		System.out.println(emp1);
		System.out.println("Calculated Saraly: $" + emp1.calculateSalary());
		System.out.println("Calculated Transport Allowance: $" + emp1.calculateTransportAllowance() + "\n");
		
		// #Test case #1:
		Manager emp2 = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
		System.out.println(emp2);
		System.out.println("Calculated Saraly: $" + emp2.calculateSalary());
		// # Problem Statement 2-4:
		System.out.println("Calculated Transport Allowance: $" + emp2.calculateTransportAllowance() + "\n");
		
		// #Test case #2:
		Trainee emp3 = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
		System.out.println(emp3);
		System.out.println("Calculated Saraly: $" + emp3.calculateSalary());
		// # Problem Statement 2-4:
		System.out.println("Calculated Transport Allowance: $" + emp3.calculateTransportAllowance() + "\n");
		
	}
}
