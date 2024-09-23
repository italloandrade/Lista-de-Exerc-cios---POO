package Exercicios;

import java.util.ArrayList;

class ProdutoMaquina {
    private String nome;
    private double preco;
    private int quantidade;

    public ProdutoMaquina(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return nome + " - R$ " + preco + " (Estoque: " + quantidade + ")";
    }
}

public class MaquinaDeVendas {
    private ArrayList<ProdutoMaquina> produtos;
    private double saldoInserido;

    public MaquinaDeVendas() {
        produtos = new ArrayList<>();
        saldoInserido = 0.0;
    }

    public void cadastrarProduto(String nome, double preco, int quantidade) {
        ProdutoMaquina produto = new ProdutoMaquina(nome, preco, quantidade);
        produtos.add(produto);
        System.out.println("Produto " + nome + " cadastrado com sucesso.");
    }

    public void exibirEstoque() {
        System.out.println("\n--- Estoque Disponível ---");
        for (ProdutoMaquina produto : produtos) {
            System.out.println(produto);
        }
    }

    public void inserirDinheiro(double valor) {
        if (valor > 0) {
            saldoInserido += valor;
            System.out.println("Você inseriu R$ " + valor + ". Saldo atual: R$ " + saldoInserido);
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public void comprarProduto(String nomeProduto) {
        ProdutoMaquina produto = buscarProduto(nomeProduto);
        if (produto != null) {
            if (produto.getQuantidade() > 0) {
                if (saldoInserido >= produto.getPreco()) {
                    saldoInserido -= produto.getPreco();
                    produto.setQuantidade(produto.getQuantidade() - 1);
                    System.out.println("Você comprou " + produto.getNome() + " por R$ " + produto.getPreco());
                    System.out.println("Saldo restante: R$ " + saldoInserido);
                } else {
                    System.out.println("Saldo insuficiente para comprar " + produto.getNome());
                }
            } else {
                System.out.println("Produto fora de estoque.");
            }
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public void retornarTroco() {
        if (saldoInserido > 0) {
            System.out.println("Retornando troco de R$ " + saldoInserido);
            saldoInserido = 0.0;
        } else {
            System.out.println("Não há troco para retornar.");
        }
    }

    private ProdutoMaquina buscarProduto(String nome) {
        for (ProdutoMaquina produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }

}
