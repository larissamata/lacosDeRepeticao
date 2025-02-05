package exerciciosDiaCincoDeFevereiro.terceiro;

import java.util.Scanner;

public class TerceiroExercicio {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int contador;
		int soma = 0;

		do {
			System.out.print("Digite um número: ");

			contador = leia.nextInt();
			
			if (contador > 0) {
				soma += contador;
			}

			System.out.println("Você digitou: " + contador + "\n");

		} while (contador != 0);
		
		System.out.print("A soma dos números resulta em: " + soma + "\n");

		System.out.println("O programa se encerra ao digitar 0.");

	}
}