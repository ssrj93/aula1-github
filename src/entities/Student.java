package entities;

public class Student {
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	
	public double finalGrade() {
	 
		return grade1+grade2+grade3;
		
	}
	
	public String toString() {
		if(finalGrade() >= 60.00) {
			return " PASS ";
		} else {
			return 	String.format("%.2f", finalGrade())
					+ "\n"
					+ "FAILED"
					+ "\n"
					+ "MISSING "
					+ String.format("%.2f", 60.00 - finalGrade())
					+ " POINTS ";
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

