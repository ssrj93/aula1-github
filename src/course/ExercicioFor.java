package course;

import java.util.Scanner;

public class ExercicioFor {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		
		/*int x = sc.nextInt();
		
		for (int i=1; i<=x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		
		sc.close();
		
	    }*/
		
		
		/*int n = sc.nextInt();
		int in = 0;
		int out = 0;
		
		for (int i = 0; i < n; i++) {
			
			int x = sc.nextInt();
			
			if (x >= 10 && x <=20) {
				in = in + 1;
			}else{
				out = out + 1;	
			} 
			
			
		}	
		
		System.out.println(in + " in");
		System.out.println(out + " out");		
		
		sc.close();	
		
		
		*/
		
		/*
		int n = sc.nextInt();
	
		
		for(int i=0 ; i<n; i++) {
			
			
			double valor1 = sc.nextDouble();
			double valor2 = sc.nextDouble();
			double valor3 = sc.nextDouble();
			
		
			
			double media = (valor1*2.0 + valor2*3.0 + valor3*5.0) / 10.0;
			System.out.printf("%.1f%n", media);
		}
		
		sc.close()/
		
		*/
		
		/*
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			
			if (b == 0) {
				System.out.println("Divisão impossivel");
			} else {
				double divisao = a/b;
				System.out.printf("%.1f%n", divisao);
			}
			
			
		}
		
		sc.close();
		*/
		
		/*
		  
		
		int n = sc.nextInt();
		int fat = 1;
		for (int i=1; i<=n; i++) {
			fat = fat * i;
		}
		
		System.out.println(fat);
		*/
		
		
		/*
		int n = sc.nextInt();
		
		
		for (int i = 1; i<=n; i++) {
			if(n % i == 0) {
				
				System.out.println(i);
			}
			
		}
		*/
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			int primeiro = i;
			int segundo = i * i;
			int terceiro =  i * i * i;
			
			System.out.printf("%d, %d, %d%n", primeiro, segundo, terceiro );
			
		}
		
	}
}
