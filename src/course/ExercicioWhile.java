package course;

import java.util.Scanner;

public class ExercicioWhile {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
			/* Exercicio 1
			 * 
			 * System.out.println("Digite a senha:");
			int senha = sc.nextInt();
				
			while (senha != 2002) {
				
				System.out.println("Senha inválida.");
				System.out.println("Digite a senha:");
				senha = sc.nextInt();				
			}
		
		System.out.println("Acesso Permitido!");
	
		sc.close();
	    */
		
		/* Exercicio 2
		 * 
		 * int x = sc.nextInt();
		 
		int y = sc.nextInt();
		
		while (x !=0 && y != 0) {
			
			if (x > 0 && y > 0) {
				System.out.println("Primeiro quadrante");
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro quadrante");
			} else if (x > 0 && y < 0) {
				System.out.println("Quarto quadrante");
			} else {
				System.out.println("Segundo quadrante");
			}
			
			x = sc.nextInt();
			y = sc.nextInt();
			
		}
		
		sc.close();
		*/
		
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int codigo = sc.nextInt();
		
		while (codigo != 4) {
			
			if (codigo == 1) {
				alcool = alcool + 1;
			} else if (codigo == 2) {
				gasolina = gasolina + 1;
			} else if (codigo == 3) {
				diesel = diesel + 1;
			}
				codigo = sc.nextInt();
			}	
		
		System.out.println("Muito obrigado!");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}
	
}	
