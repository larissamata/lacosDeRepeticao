package exerciciosDiaCincoDeFevereiro.primeiro;

import java.util.Scanner;

public class PrimeiroExercicio {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int numero;
		int contPares = 0;
		int contImpares = 0;

		for (int i = 1; i <= 10; i++) {

			System.out.println("Escreva o " + i + "° número: ");
			numero = leia.nextInt();

			if (numero % 2 == 0) {
				contPares++;
			} else {
				contImpares++;
							

			}

		}
		
		leia.close();

		System.out.println("O total de números pares digitados foram: " + contPares);
		System.out.println("O total de números ímpares digitados foram: " + contImpares);

	}
}