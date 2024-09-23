package Exercicios;

public class Carro {

	private String marca;
	private String modelo;
	private int velocidadeAtual;
	
	public Carro(String marca, String modelo, int velocidadeAtual) {
		this.marca = marca;
		this.modelo = modelo;
		this.velocidadeAtual = 0;
	}
	public void acelerar(double incremento) {
        if (incremento > 0) {
            velocidadeAtual += incremento;
            System.out.println("O carro acelerou " + incremento + " km/h.");
        } else {
            System.out.println("O valor de aceleração deve ser positivo.");
        }
    }
	
    public void frear(double decremento) {
        if (decremento > 0) {
            if (velocidadeAtual - decremento >= 0) {
                velocidadeAtual -= decremento;
                System.out.println("O carro freou " + decremento + " km/h.");
            } else {
                velocidadeAtual = 0;
                System.out.println("O carro parou completamente.");
            }
        } else {
            System.out.println("O valor de frenagem deve ser positivo.");
        }
    }

    public void exibirVelocidadeAtual() {
        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h.");
    }

    public void exibirDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        exibirVelocidadeAtual();
    }
}

