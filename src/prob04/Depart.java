package prob04;

public class Depart extends Employee {
	private String department;

	public Depart(String name, int salary, String department) {
		this.setName(name);
		this.setSalary(salary);
		this.department=department;
		
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String dep) {
		this.department = dep;
	}
	
	
	public void getInformation() {
		System.out.println( "이름:" + this.getName() + "  연봉:" + this.getSalary() + "  부서" + this.getDepartment() );
	}
}