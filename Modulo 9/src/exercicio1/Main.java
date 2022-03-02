package exercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Produto produto = new Produto();
		
		produto.setNome(pegarInformacoesDoUsuario("Informe o nome do produto:").next());
		produto.setQuantidadeDeProdutos(pegarInformacoesDoUsuario("Informe a quantidade de produtos:").nextInt());
		
		System.out.println(produto.estocarProduto());
		
		
		
	}
	
	public static Scanner pegarInformacoesDoUsuario(String mensagem) {
		System.out.println(mensagem);
		
		return new Scanner(System.in);
	}

}
