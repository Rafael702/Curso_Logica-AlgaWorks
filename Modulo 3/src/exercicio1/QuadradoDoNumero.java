package exercicio1;

import java.util.Scanner;

public class QuadradoDoNumero {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int n = sc.nextInt();
		
		int numeroAoQuadrado = n * n;
		
		System.out.println("O quadrado do numéro " + n + " é: " + numeroAoQuadrado);
		
		sc.close();
	}

}
