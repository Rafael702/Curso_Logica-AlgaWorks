package exercicio2;

import java.util.Scanner;

public class NomeeSobrenome {
	public static void main(String[] args) {
		Scanner sc  =  new Scanner(System.in);
		
		System.out.println("Digite o seu primeiro nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Digite o seu sobrenome: ");
		String sobrenome = sc.nextLine();
		
		System.out.println("Nome Completo: " + nome + " " +  sobrenome);
	}

}
