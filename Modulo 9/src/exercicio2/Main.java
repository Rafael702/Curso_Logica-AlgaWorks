package exercicio2;

public class Main {
	

	public static void main(String[] args) {

		Pedido pedido = new Pedido();
		pedido.setCodigo(9090);
		pedido.setDesconto(50.0);
		pedido.setSubtotal(400.0);
		
		System.out.println("Código do Pedido: " + pedido.getCodigo());
		System.out.println("Desconto: " + pedido.getDesconto());
		System.out.println("Subtotal: " + pedido.getSubtotal());
		System.out.println("Total: " + pedido.getTotal());
		
	}

}
