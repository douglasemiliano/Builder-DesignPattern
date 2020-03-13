package builderPratica;

public class ItemVenda {
	
	public int quantidade;
	public Produto produto;
	
	
	public ItemVenda() {
		this.quantidade = 0;
		this.produto = new Produto();
	}

	public ItemVenda(int quantidade, Produto produto) {
		this.quantidade = quantidade;
		this.produto = produto;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	@Override
	public String toString() {
		return "Produto:" + produto.toString() + ",Quantidade: " + quantidade;
	}
	
	
	

}
