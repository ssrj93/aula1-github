package course;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


import util.CurrencyConverter;

//import entities.Student;

import entities.Employee;
//import entities.Rectangle;

public class Program3 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Exercicio 01

		/*
		 * Rectangle rectangle = new Rectangle();
		 * 
		 * 
		 * System.out.println("Enter rectangle width and height: "); rectangle.width =
		 * sc.nextDouble(); rectangle.height = sc.nextDouble();
		 * System.out.println(rectangle);
		 */

		// Exercicio 02

		/*
		 * Employee emp = new Employee();
		 * 
		 * System.out.println("Name: "); emp.name = sc.nextLine();
		 * System.out.println("Gross salary: "); emp.grossSalary = sc.nextDouble();
		 * System.out.println("Tax: "); emp.tax = sc.nextDouble();
		 * System.out.println("Employee" + emp);
		 * System.out.println("Which percentage to increase");
		 * 
		 * double percentage = sc.nextDouble();
		 * emp.increaseSalaryPercentage(percentage);
		 * 
		 * System.out.println("Updated data: " + emp);
		 */

		// Exercicio 03
		/*
		 * Student stud = new Student(); System.out.println("Student name: "); stud.name
		 * = sc.nextLine(); System.out.println("Grade one: "); stud.grade1 =
		 * sc.nextDouble(); System.out.println("Grade two: "); stud.grade2 =
		 * sc.nextDouble(); System.out.println("Grade three: "); stud.grade3 =
		 * sc.nextDouble();
		 * 
		 * System.out.println("FINAL GRADE: " + stud);
		 */

		// Exercicio 04

		
		/*
		System.out.println("What is the dollar price?");
		double price = sc.nextDouble();
		System.out.println("How many dollars will be bought?");
		double quantity = sc.nextDouble();

		double converter = CurrencyConverter.dollar(price, quantity);

		System.out.printf("Amount to be paid in reais: %.2f", converter);
		*/
		/*
		List<Employee> list = new ArrayList<>();
		
		System.out.println("How many employees will be registred?");
		int n = sc.nextInt();
		
		
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #"+i+":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary: ");		
			double salary = sc.nextDouble();
			list.add(new Employee(id, name, salary));
		}
		
		System.out.println("Index of Ana: " + list.indexOf("Ana"));
		*/
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n]; 
		
		for(int i = 0; i<m; i++) {
			for(int j=0; j<n; j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		int value = sc.nextInt();
		
		for(int i = 0; i<m;i++) {
			for(int j = 0; j<n; j++) {
				if(mat[i][j] == value) {
					System.out.println(mat[i].length);

					System.out.println("Position "+i+", "+j+":");
				if(j > 0) {
					System.out.println("Left: "+mat[i][j-1]);
				}
				if(j < mat[i].length-1) {
					System.out.println("Right: "+mat[i][j+1]);
				}
				if(i > 0) {
					System.out.println("Up: "+mat[i-1][j]);
				}
				if(i < mat.length-1) {
					System.out.println("Down: "+mat[i+1][j]);
				}
			}
			
		}
		
		
		
	sc.close();
	
}
}
}	