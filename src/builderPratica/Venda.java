package builderPratica;

import java.util.ArrayList;
import java.util.List;

public class Venda {
	
	private String data;
	private double frete;
	private List <ItemVenda> listaItens;
	private Funcionario funcionario;
	private Cliente cliente;
	
	
	public Venda () {
		this.data = "";
		this.frete = 0;
		this.listaItens = new ArrayList<ItemVenda>();
		this.funcionario = new Funcionario();
		this.cliente = new Cliente();
	}



	public Venda(String data, double frete, List<ItemVenda> listaItens, Funcionario funcionario, Cliente cliente) {
		super();
		this.data = data;
		this.frete = frete;
		this.listaItens = listaItens;
		this.funcionario = funcionario;
		this.cliente = cliente;
	}



	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}


	public double getFrete() {
		return frete;
	}

	public void setFrete(double frete) {
		this.frete = frete;
	}

	public List<ItemVenda> getListaItens() {
		return listaItens;
	}
	
	
	public void addItem(ItemVenda item) {
		listaItens.add(item);
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}




	@Override
	public String toString() {
		return "Data: " + this.data+
				"\nFrete: " + this.frete 
				+ "\nItens: " + this.listaItens
				+ "\nFuncionario: " + this.funcionario.getNome();
				
	}

	
	
	
}
