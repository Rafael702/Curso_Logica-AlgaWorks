package exercicio1;

public class ServiceProduto {

	public Boolean estocarProduto(Produto produto) {
		Boolean chave = false;
		if(produto.getQuantidadeDeProdutos() < 10) {
			chave = true;
		}
		return chave;
	}
}
