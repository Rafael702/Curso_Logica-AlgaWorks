package exercicio2;

import console.Interacao;

public class UsoDaBibliotecaAlgaWorks {
	public static void main(String[] args) {
		
		Interacao interacao = new Interacao();
		
		String nomeDoAmigo = interacao.lerLinha("Informe o nome do Seu amigo: ");
		interacao.imprimir(nomeDoAmigo);
		
		Integer soma = 1+1;
		
		interacao.imprimir("Soma de 1 + 1 = " + soma);
		
		Integer somaVindoDoUsuario = interacao.lerNumero("Digite um numero: ");
		Integer somaVindoDoUsuario2 = interacao.lerNumero("Digite um numero: ");
		
		interacao.imprimir("A SOMA DE " + somaVindoDoUsuario +  " + " + somaVindoDoUsuario2 + " = " + (somaVindoDoUsuario + somaVindoDoUsuario2));
		interacao.imprimir("---------------FIM--------------");
		
		interacao.fechar();
	}
}
