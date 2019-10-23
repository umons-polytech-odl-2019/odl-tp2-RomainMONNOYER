package exercise1;

public abstract class Employee {
	private final String name;
	private int workedHours=0;
	private int sales=0;
	//protected car on instancie pas une class abstraite et comme ca appartient a toute les classes filles
	protected Employee(String name){
		this.name=name;

	}
	public abstract int computeSalary();//declaree pour toute les class filles

	public void sell() {
		sales++;
	}

	public int getSales() {
		return sales;
	}

	public void workOneHour() {
		this.workedHours+=1;
	}
	public int getWorkedHours(){
		return workedHours;
	}

	public String getName() {
		return name;
	}
}
