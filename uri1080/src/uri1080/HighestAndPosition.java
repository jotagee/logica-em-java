package uri1080;

import java.util.Scanner;

public class HighestAndPosition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int maior = 0;
		int posicao = 1;

		System.out.println("Digite 5 números:");
		
		for (int i = 1; i <= 5; i++) {
			int x = sc.nextInt();
			if (x > maior) {
				maior = x;
				posicao = i;
			}
		}
		System.out.println("O maior número digitado foi o " + maior);
		System.out.println("Ele está na " + posicao + " posição.");

		sc.close();
	}

}