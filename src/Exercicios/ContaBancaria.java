package Exercicios;
import java.util.Scanner;

public class ContaBancaria {

	private String conta;
	private String nome;
	private double saldo;
	
	public ContaBancaria(String conta, String nome, double saldoInicial) {
		this.conta = conta;
		this.nome = nome;
		this.saldo = saldoInicial;
	}
	
	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
			System.out.println("Depósito de R$"+ valor+ " realizado com sucesso");
		}else {
			System.out.println("O valor deve ser positivo.");
		}
	}
	public void sacar(double valor) {
		if(valor > 0 && valor <= saldo) {
			saldo -= valor;
			System.out.println("Saque de R$"+ valor+ " realizado com sucesso!");
		}else if (valor > saldo) {
			System.out.println("Saldo insuficiente para saque!");
		}else {
			System.out.println("O valor do saque deve ser positivo!");
		}
	}
	public double verificarSaldo() {
		return saldo;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o número da conta: ");
		String conta = scanner.nextLine();
		
		System.out.println("Digite o nome do titular: ");
		String nome = scanner.nextLine();
		
		System.out.println("Digite o saldo inicial: ");
		double saldoInicial = scanner.nextDouble();
		
		ContaBancaria contaBancaria = new ContaBancaria(conta, nome, saldoInicial);
		
		boolean continuar = true;
		
		while (continuar) {
			
			System.out.println("\nEscolha a opção desejada:");
			System.out.println("1- Verificar saldo");
			System.out.println("2- Depositar");
			System.out.println("3- Sacar");
			System.out.println("4- Sair");
			
			int opcao = scanner.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("Saldo atual: R$"+ contaBancaria.verificarSaldo());
				break;
			case 2:
				System.out.println("Digite o valor para depositar: R$");
				double valorDeposito = scanner.nextDouble();
				contaBancaria.depositar(valorDeposito);
				break;
				
			case 3:
				System.out.println("Digite o valor para sacar: R$");
				double valorSaque = scanner.nextDouble();
				contaBancaria.sacar(valorSaque);
				break;
			case 4:
				continuar = false;
				System.out.println("Encerrando o programa.");
				break;
			default:
				System.out.println("Opção inválida. Tente Novamente.");
			break;
		}
	}
	}
}

