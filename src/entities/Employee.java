package entities;

public class Employee {
		
	/* Exercicio 02
	
		public String name;
		public double grossSalary;
		public double tax;
		
	
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public double increaseSalaryPercentage( double percentage) {
		return grossSalary += (grossSalary * (percentage/100)); 
	}
	
	public String toString() {
		return  name 
				+ ", $ " 
				+ String.format("%.2f", netSalary())
				+ "\n";
	}
	*/

	
	private Integer id;
	private String name;
	private Double salary;
	
	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public void increaseSalary(double percentage) {
		salary += salary/percentage + 100;
	}
	
	
}	