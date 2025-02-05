package exerciciosDiaCincoDeFevereiro.segundo;

import java.util.Scanner;

public class SegundoExercicio {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int idade;
		int contador21 = 0;
		int contador50 = 0;

		System.out.println("Digite uma idade: ");
		idade = leia.nextInt();

		while (idade >= 0) {

		
		if (idade < 21) {
			contador21++;

		} else if (idade > 50) {
			contador50++;

		}

		System.out.println("Digite mais uma idade: ");
		idade = leia.nextInt();
		
		}

		System.out.println("Existem " + contador21 + " pessoas menores de 21 anos.");
		System.out.println("Existem " + contador50 + " pessoas maiores de 50 anos");

	}
}
