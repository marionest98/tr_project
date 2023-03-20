package ncs.test2;

public class Sales extends Employee implements Bonus {

	@Override
	public void incentive(int pay) {
		int b = getSalary() + (int) (pay * 1.2);
		setSalary(b);
	}

	@Override
	public double tax() {
		return getSalary() * 0.13;
	}

	public Sales() {
	}

	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	@Override
	public String toString() {
		return getName() + "\t" + getDepartment() + "\t\t" + getSalary();
	}

}
