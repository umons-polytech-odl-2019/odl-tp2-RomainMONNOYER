package exercise1;

public class FixedSalaryEmployee extends Employee {
	private int salary;
	public FixedSalaryEmployee(String name, int fixedSalary) {
		super(name);
		this.salary = fixedSalary;
	}
	public void workOneHour(){
		super.workOneHour();
	}
	public int getFixedSalary() {
		return salary;
	}

	@Override // permet de remplacer qqch de déclaré
	public int computeSalary(){
		return this.salary;
	}
}
