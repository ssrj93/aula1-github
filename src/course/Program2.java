package course;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * //Exercicio 00:
		 * 
		 * int n1, n2, n3;
		 * 
		 * n1 = sc.nextInt(); n2 = sc.nextInt(); n3 = sc.nextInt();
		 * 
		 * if (n1 > n2 && n1 > n3) { System.out.printf("Higher: "+ n1); } else if (n2 >=
		 * n3) { System.out.printf("Higher: "+ n2); } else if (n3 >= n2) {
		 * System.out.printf("Higher: "+ n3); }
		 */

		/*
		 * // Exercicio 01:
		 * 
		 * int a = sc.nextInt();
		 * 
		 * if (a < 0) { System.out.println("NEGATIVO"); } else {
		 * System.out.println("NÃO NEGATIVO"); }
		 */

		/*
		 * // Exercio 02:
		 * 
		 * int a = sc.nextInt();
		 * 
		 * if (a % 2 == 0) { System.out.println("PAR"); } else {
		 * System.out.println("IMPAR"); }
		 */

		/*
		 * // Exercicio 03:
		 * 
		 * int a = sc.nextInt(); int b = sc.nextInt();
		 * 
		 * if (a % b == 0 || b % a == 0) { System.out.println("São multiplos"); } else {
		 * System.out.println("Não são multiplos"); }
		 */

		/*
		 * // Exercicio 04:
		 * 
		 * int horaInicial = sc.nextInt(); int horaFinal = sc.nextInt(); int duracao;
		 * 
		 * if (horaInicial >= horaFinal) { duracao = 24 - (horaInicial - horaFinal);
		 * System.out.println("O JOGO DUROU " + duracao + " HORAS"); }
		 * 
		 * else { duracao = horaFinal - horaInicial; System.out.println("O JOGO DUROU "
		 * + duracao + " HORAS"); }
		 * 
		 */
		
		/*
		
		// Exercicio 05:
		
		int cod = sc.nextInt();
		int quantidade = sc.nextInt();
		double preco = 0;

		if (cod == 1) {
			preco = 4.00;
		} else if (cod == 2) {
			preco = 4.50;
		} else if (cod == 3) {
			preco = 5.00;
		} else if (cod == 4) {
			preco = 2.00;
		} else if (cod == 5) {
			preco = 1.50;
		}

		double total = quantidade * preco;
		System.out.printf("TOTAL R$ %.2f", total );
		
		*/
		
		sc.close();
	}

}
