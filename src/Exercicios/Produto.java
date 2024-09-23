package Exercicios;

public class Produto {

	private String nomeProduto;
	private double preco;
	private int qtde;
	
	public Produto(String nomeProduto, double preco, int qtde) {
		this.nomeProduto = nomeProduto;
		this.preco = preco;
		this.qtde = qtde;
	}
	
	public double calcularValorTotalEstoque() {
		return preco * qtde;
	}
	
	public boolean estaDisponivel() {
		return qtde > 0;
	}
	
	public void exibirDados() {
		System.out.println("Nome do Produto: "+ nomeProduto);
		System.out.println("Preço Unitário: R$ "+ preco);
		System.out.println("Quantidade em Estoque: "+ qtde);
		System.out.println("Valor total em Estoque: R$ "+ calcularValorTotalEstoque());
		if (estaDisponivel()) {
			System.out.println("Status: Disponível.");
		}else {
			System.out.println("Status: Indisponível.");
		}
	}
}
