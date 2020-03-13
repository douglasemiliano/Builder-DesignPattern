package builderPratica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VendaBuilderTest {

	@Test
	void test1() {
		Produto banana = new Produto("Banana", 100);
		Produto maca = new Produto("Maça", 120);
		Venda venda = new VendaBuilder()
				.data("10/03/2020")
				.clientePF("José", "000.000.000-00")
				.item(3, banana)
				.item(5, maca)
				.frete(20)
				.funcionario("João")
				.Build();
		
		assertEquals("Data: 10/03/2020"
				+ "\nFrete: 20.0"
				+ "\nItens: [Produto:Descricao:Banana, preco=100.0],Quantidade: 3,"
				+ " Produto:Descricao:Maça, preco=120.0],Quantidade: 5]"
				+ "\nFuncionario: João",venda.toString());
	}
	@Test
	void test2() {
			Venda venda = new Venda();
			Cliente cliente = new ClientePJ("UFPB", "000.000.000.0.0.0");
			venda.setCliente(cliente);
			Produto banana = new Produto("Banana", 2);
			Produto maca = new Produto("Maça", 120);
			ItemVenda item1 = new ItemVenda(3, banana);
			ItemVenda item2 = new ItemVenda(5, maca);
			Funcionario funcionario = new Funcionario("João");
			venda.addItem(item1);
			venda.addItem(item2);
			venda.setData("10/10/2020");
			venda.setFrete(20.0);
			venda.setFuncionario(funcionario);
			
			assertEquals("Data: 10/10/2020"
					+ "\nFrete: 20.0"
					+ "\nItens: [Produto:Descricao:Banana, preco=2.0],Quantidade: 3,"
					+ " Produto:Descricao:Maça, preco=120.0],Quantidade: 5]"
					+ "\nFuncionario: João",venda.toString());
	}
	
	@Test
	void test3() {
		Produto professor = new Produto("Vilar", 1000);
		Venda venda = new VendaBuilder()
				.data("10/03/2020")
				.clientePF("José", "000.000.000-00")
				.item(1, professor)
				.funcionario("Robson")
				.clientePJ("UFPB", "2020202010101.10101-13")
				.frete(720.00)
				.Build();
		
		
		assertEquals("Data: 10/03/2020"
				+ "\nFrete: 720.0"
				+ "\nItens: [Produto:Descricao:Vilar, preco=1000.0],Quantidade: 1]"
				+ "\nFuncionario: Robson",venda.toString());
	}
}
