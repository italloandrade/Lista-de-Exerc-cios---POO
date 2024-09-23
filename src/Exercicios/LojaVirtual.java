package Exercicios; 

import java.util.ArrayList;

class ProdutoLoja {
    private String nome;
    private double preco;

    public ProdutoLoja(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}

class CarrinhoDeCompras {
    private ArrayList<ProdutoLoja> produtos;
    private double desconto;

    public CarrinhoDeCompras() {
        produtos = new ArrayList<>();
        desconto = 0.0;
    }

    public void adicionarProduto(ProdutoLoja produto) {
        produtos.add(produto);
        System.out.println("Produto " + produto.getNome() + " adicionado ao carrinho.");
    }

    public void aplicarDesconto(double percentual) {
        if (percentual > 0 && percentual <= 100) {
            desconto = percentual;
            System.out.println("Desconto de " + percentual + "% aplicado.");
        } else {
            System.out.println("Percentual de desconto inválido.");
        }
    }

    public double calcularTotal() {
        double total = 0.0;
        for (ProdutoLoja produto : produtos) {
            total += produto.getPreco();
        }
        if (desconto > 0) {
            total = total - (total * (desconto / 100));
        }
        return total;
    }

    public void exibirCarrinho() {
        System.out.println("\nProdutos no carrinho:");
        for (ProdutoLoja produto : produtos) {
            System.out.println("- " + produto.getNome() + " : R$ " + produto.getPreco());
        }
        System.out.println("Desconto aplicado: " + desconto + "%");
        System.out.println("Total: R$ " + calcularTotal());
    }
}

public class LojaVirtual {
    private ArrayList<ProdutoLoja> produtos;

    public LojaVirtual() {
        produtos = new ArrayList<>();
    }

    public void cadastrarProduto(String nome, double preco) {
        ProdutoLoja produto = new ProdutoLoja(nome, preco);
        produtos.add(produto);
        System.out.println("Produto " + nome + " cadastrado com sucesso.");
    }

    public ProdutoLoja buscarProduto(String nome) {
        for (ProdutoLoja produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }
}
