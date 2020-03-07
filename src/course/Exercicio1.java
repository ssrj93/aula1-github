package course;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value one: ");
		int A = sc.nextInt();
		System.out.println("Enter value two: ");
		int B = sc.nextInt();
		System.out.println("Enter value three: ");
		int C = sc.nextInt();
		System.out.println("Enter value four: ");
		int D = sc.nextInt();
		System.out.println("The difference between the values is");
		System.out.println(A*B - C*D);
		
		sc.close();
		
		}
	}
		/*String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n", product2, price2); 
		
		
		System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
		System.out.printf("Measue with eight decimal places: %.8f%n", measure);
	    System.out.printf("Rounded (Three decimal places): %.3f%n", measure);
	    Locale.setDefault(Locale.US);
	    System.out.printf("US decimal point: %.3f", measure);*/
		
		
		/*Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your full name:");
		String name = sc.nextLine();
		System.out.println("How many bedrooms are there in your house:");
		int beds = sc.nextInt();
		System.out.println("Enter product price:");
		double price = sc.nextDouble();
		System.out.println("Enter your last name, age and height (same line):");
		String name2 = sc.next();
		int age = sc.nextInt();
		double height = sc.nextDouble();
		
		
		
		System.out.println(name);
		System.out.println(beds);
		System.out.printf("%.2f%n", price);	
		System.out.println(name2);
		System.out.println(age);
		System.out.printf("%.2f%n", height); // Se quiser definir que a variavel vai receber duas casas decimais no resultado final é necessario informar antes utilizando --> %.numerodecasasdesejadasf%n <--- O 'n' no fim do codigo serve para quebrar a linha considerando que o System.out.println não é corretor a se utilizar nessa ocasião mas sim System.out.printf 
	
		sc.close();
	}

}*/
	
		

