package exercicio1;

public class Produto {
	private String nome;
	private Integer quantidadeDeProdutos;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setQuantidadeDeProdutos(Integer quantidadeDeProdutos) {
		this.quantidadeDeProdutos = quantidadeDeProdutos;
	}
	
	public Integer getQuantidadeDeProdutos() {
		return quantidadeDeProdutos;
	}
	
	public Boolean estocarProduto() {
		Boolean chave = false;
		if(quantidadeDeProdutos < 10) {
			chave = true;
		}
		return chave;
	}
	
}
