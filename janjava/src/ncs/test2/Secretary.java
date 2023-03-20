package ncs.test2;

public class Secretary extends Employee implements Bonus {

	@Override
	public void incentive(int pay) {
		setSalary(getSalary() + (int) (pay * 0.8));
	}

	@Override
	public double tax() {
		return getSalary() * 0.1;
	}

	public Secretary() {
	}

	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);

	}

	@Override
	public String toString() {
		return getName() + "\t" + getDepartment() + "\t" + getSalary();
	}

}
