package course;

import java.util.Locale;
import java.util.Scanner;

import entities.Rents;

public class Program4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Exercicio 05
		/*
		Account acc = null;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)?");
		char result = sc.next().charAt(0);
		if(result == 'y' ) {
			System.out.print("Enter initial deposit value:");
			double initialDeposit = sc.nextDouble();
			acc = new Account(number, holder, initialDeposit);
			
		} else if (result == 'n') {
			acc = new Account(number, holder);

		}
			System.out.println();
			System.out.println("Account data:");
			System.out.println(acc);
			System.out.println();
			System.out.print("Enter a deposit value: ");
			double depositValue = sc.nextDouble();
			acc.deposit(depositValue);
			System.out.print("Updated account data: ");
			System.out.println(acc);
			System.out.println();
			System.out.print("Enter a withdraw value: ");
			double withdrawValue = sc.nextDouble();
			acc.withdraw(withdrawValue);
			System.out.print("Updated account data: ");
			System.out.println(acc);
			*/
		
			//Exercicio 06
		
			/*
			System.out.print("How many rooms will be rented? ");
			Rents[] vect = new Rents[10];
			int n = sc.nextInt();
		
			for(int i= 1; i<=n; i++) {
				sc.nextLine();
					System.out.println("Rent #"+i+":" );
					System.out.print("Name: "); 
					String name = sc.nextLine();
					System.out.print("Email: ");
					String email = sc.nextLine();
					System.out.print("Room: ");
					int room = sc.nextInt();
					System.out.println();
					vect[room] = new Rents (name, email, room);
			}
			System.out.println();
			System.out.println("Busy rooms: ");
			
			for(int i=0; i<vect.length; i++) {
				if (vect[i] != null) {					
					System.out.println(i + ": " + vect[i]);										
				}
				
			}
			*/
		
		
		
		sc.close();

	}

}
