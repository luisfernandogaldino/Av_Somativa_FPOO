package Av_Somativa;

public class PrincipalPedido {

	public static void main(String[] args) {
	
		Pedido pedido = new Pedido(12,"Marmitex",500);
		System.out.println("ID:"+ pedido.getId());
		System.out.println("Produto:"+ pedido.getProduto());
		System.out.println("Quantidade:"+ pedido.getQuantidade());

	}

}
