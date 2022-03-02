package exercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Produto produto = new Produto();
		ServiceProduto servicoProduto = new ServiceProduto();
		
		produto.setNome(pegarInformacoesDoUsuario("Informe o nome do produto:").next());
		produto.setQuantidadeDeProdutos(pegarInformacoesDoUsuario("Informe a quantidade de produtos:").nextInt());
		
		System.out.println(servicoProduto.estocarProduto(produto));
		
		
		
	}
	
	public static Scanner pegarInformacoesDoUsuario(String mensagem) {
		System.out.println(mensagem);
		
		return new Scanner(System.in);
	}

}
