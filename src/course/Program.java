package course;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		
		/*  
		 * -----------------------------------------------
		 * ~ Exemplos da aula ~
		 * 
		 * 
		 * int n1 = sc.nextInt(); // 35
		sc.nextLine(); 
		String name = sc.nextLine(); // Bob Brown
		char gender = sc.next().charAt(0); // F
		// b5
		String s = sc.next();
		char letter = s.charAt(0);
		int digit = Integer.parseInt(s.substring(1));
		double n2 = sc.nextDouble();
		String name2 = sc.next();
		char ch = sc.next().charAt(0);
		int age = sc.nextInt();
		double height = sc.nextDouble();
		
		System.out.println(n1);
		System.out.println(name);
		System.out.println(gender);
		System.out.println(letter);
		System.out.println(digit);
		System.out.println(n2);
		System.out.println(name2);
		System.out.println(ch);
		System.out.println(age);
		System.out.println(height);
		sc.close();
		
		--------------------------------------------
		--------------------------------------------
		
		// Exercicio 00 :
		
		System.out.println("Enter your full name: ");
		String name = sc.nextLine();
		System.out.println("How many bedrooms are there in your house?");
		int bedrooms = sc.nextInt();
		System.out.println("Enter product price: ");
		double price = sc.nextDouble();
		System.out.println("Enter your last name, age and height(same line): ");
		String lastname = sc.next();
		int age = sc.nextInt();
		double height = sc.nextDouble();
		
		System.out.println(name);
		System.out.println(bedrooms);
		System.out.println(price);
		System.out.println(lastname);
		System.out.println(age);
		System.out.println(height);
		
		
		// Exercicio 01 :
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		
		System.out.println("O valor da soma é: ");
		System.out.println(n1 + n2);
		
		sc.close();
		
		--------------------------------------------
		-------------------------------------------- 
		
		// Exercicio 02 :
		
		double raio = sc.nextDouble();
		double pi = 3.14159;
		double area =  pi * (raio * raio);
		
		System.out.printf("A= %.4f", area);
		
		--------------------------------------------
		-------------------------------------------- 
		
		// Exercicio 03 :
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int dif = a * b - c * d;
		
		System.out.printf("DIFERENCA = %d", dif);
		
		--------------------------------------------
		-------------------------------------------- 
		
		// Exercicio 04 :
		
		int numeroFuncionario = sc.nextInt();
		int horasTrabalhadas = sc.nextInt();
		double valorPorHora = sc.nextDouble();
		double salario = horasTrabalhadas * valorPorHora;
		
		System.out.printf("NUMBER: %d%n", numeroFuncionario);
		System.out.printf("SALÁRIO: U$ %.2f", salario);
		
		--------------------------------------------
		-------------------------------------------- 
		
	    // Exercicio 05: 
		
		 
		
		System.out.println("Codigo peça 1: ");
		int cod1 = sc.nextInt();
		System.out.println("Qual a quantidade?");
		int n1 = sc.nextInt();
		System.out.println("Qual o valor unitário?");
		double valor1 = sc.nextDouble();
		System.out.println("Codigo peça 2: ");
		int cod2 = sc.nextInt();
		System.out.println("Qual a quantidade?");
		int n2 = sc.nextInt();
		System.out.println("Qual o valor unitário? %n");
		double valor2 = sc.nextDouble();
		
		double total = (n1*valor1) + (n2*valor2); 
		
		System.out.printf("Valor total a pagar: %.2f", total );
		
		--------------------------------------------
		-------------------------------------------- 
		
		// Exercicio 06
		
		System.out.println("Valor de A:");
		double n1 = sc.nextDouble();
		System.out.println("Valor de B:");
		double n2 = sc.nextDouble();
		System.out.println("Valor de C:");
		double n3 = sc.nextDouble();
		
		double pi = 3.14159;
		double triangulo = 	(n1*n3)/2;
		double circulo =  pi * n3 * n3;
		double trapezio = (n2 + n1)/2 * n3;
		double quadrado = n2*n2;
		double retangulo = n1*n2;
		
		System.out.printf("A área do triângulo retângulo que tem A por base e C por altura : %.3f%n", triangulo );
		System.out.printf("A área do círculo de raio C: %.3f%n", circulo );
		System.out.printf("A área do trapézio que tem A e B por bases e C por altura: %.3f%n", trapezio );
		System.out.printf("A área do quadrado que tem lado B: %.3f%n", quadrado);
		System.out.printf("A área do retângulo que tem lados A e B: %.3f", retangulo);
		
		sc.close();
		*/
		
 	}

}
