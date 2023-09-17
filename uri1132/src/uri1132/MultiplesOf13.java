package uri1132;

import java.util.Scanner;

public class MultiplesOf13 {

	public static void main(String[] args) {
		
		/*
		 Write a program that reads two integer numbers X and Y and calculate
		 the sum of all number not divisible by 13 between them, including both.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type two number:");
		int x = sc.nextInt();
		int y = sc.nextInt();

		int menor = x;
		int maior = y;

		if (x > y) {
			menor = y;
			maior = x;
		}

		int soma = 0;
		for (int i = menor; i <= maior; i++) {
			if (i % 13 != 0) {
				soma = soma + i;
			}
		}
		
		System.out.println("The sum of numbers between " + x + " and " + y + " not divisible by 13 is: " + soma);
			sc.close();
	}

}
