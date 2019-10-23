package exercise1;

public class BaseSalaryPlusCommissionEmployee extends Employee {
	private int baseSalary;
	private int commission;
	public BaseSalaryPlusCommissionEmployee(String name, int baseSalary, int commission){
		super(name);//cree le nom
		this.baseSalary=baseSalary;
		this.commission=commission;
	}

	public int getBaseSalary() {
		return baseSalary;
	}



	@Override
	public int computeSalary(){
		return baseSalary+getSales()*commission;
	}
}
