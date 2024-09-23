package Exercicios;

import java.util.ArrayList;
class Cliente {
    private String nomeCliente;
    private String cpf;

    public Cliente(String nomeCliente, String cpf) {
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
    }

    public String getNome() {
        return nomeCliente;
    }

    public String getCpf() {
        return cpf;
    }
}

class Conta {
    private Cliente cliente;
    private double saldo;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }

    public void transferir(Conta contaDestino, double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            contaDestino.depositar(valor);
            System.out.println("Transferência de R$ " + valor + " para " + contaDestino.getCliente().getNome() + " realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor de transferência inválido.");
        }
    }
}

public class Banco {
    private ArrayList<Cliente> clientes;
    private ArrayList<Conta> contas;

    public Banco() {
        clientes = new ArrayList<>();
        contas = new ArrayList<>();
    }

    public void cadastrarCliente(String nome, String cpf) {
        Cliente novoCliente = new Cliente(nome, cpf);
        clientes.add(novoCliente);
        System.out.println("Cliente " + nome + " cadastrado com sucesso.");
    }

    public void abrirConta(String cpf) {
        Cliente cliente = buscarClientePorCpf(cpf);
        if (cliente != null) {
            Conta novaConta = new Conta(cliente);
            contas.add(novaConta);
            System.out.println("Conta aberta para " + cliente.getNome() + " com sucesso.");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    public Conta buscarContaPorCpf(String cpf) {
        for (Conta conta : contas) {
            if (conta.getCliente().getCpf().equals(cpf)) {
                return conta;
            }
        }
        return null;
    }

    private Cliente buscarClientePorCpf(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }
}
