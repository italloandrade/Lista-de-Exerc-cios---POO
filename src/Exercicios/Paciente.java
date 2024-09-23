package Exercicios;

import java.util.ArrayList;

public class Paciente {
	
	 private String nome;
	    private int idade;
	    private ArrayList<String> historicoConsultas;

	    public Paciente(String nome, int idade) {
	        this.nome = nome;
	        this.idade = idade;
	        this.historicoConsultas = new ArrayList<>();
	    }

	    public void adicionarConsulta(String consulta) {
	        historicoConsultas.add(consulta);
	        System.out.println("Consulta adicionada com sucesso!");
	    }

	    public void exibirConsultas() {
	        if (historicoConsultas.isEmpty()) {
	            System.out.println("Nenhuma consulta registrada.");
	        } else {
	            System.out.println("Histórico de Consultas:");
	            for (String consulta : historicoConsultas) {
	                System.out.println(consulta);
	            }
	        }
	    }
	    public void exibirDados() {
	        System.out.println("Nome: " + nome);
	        System.out.println("Idade: " + idade);
	    }
	}

