package Exercicios;

import java.util.Scanner;

public class Livro {

	private String titulo;
    private String autor;
    private int numeroPaginas;
    private boolean disponivel;

    public Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.disponivel = true;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("O livro \"" + titulo + "\" foi emprestado.");
        } else {
            System.out.println("O livro \"" + titulo + "\" já está emprestado.");
        }
    }

    public void devolver() {
        if (!disponivel) {
            disponivel = true;
            System.out.println("O livro \"" + titulo + "\" foi devolvido.");
        } else {
            System.out.println("O livro \"" + titulo + "\" já está disponível.");
        }
    }

    public void verificarDisponibilidade() {
        if (disponivel) {
            System.out.println("O livro \"" + titulo + "\" está disponível.");
        } else {
            System.out.println("O livro \"" + titulo + "\" está emprestado.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de Páginas: " + numeroPaginas);
        verificarDisponibilidade();
    }
    public class Biblioteca {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o título do livro: ");
            String titulo = scanner.nextLine();

            System.out.print("Digite o autor do livro: ");
            String autor = scanner.nextLine();

            System.out.print("Digite o número de páginas do livro: ");
            int numeroPaginas = scanner.nextInt();
            scanner.nextLine();

            Livro livro = new Livro(titulo, autor, numeroPaginas);

            int opcao = 0;
            do {
                System.out.println("\nMenu:");
                System.out.println("1. Emprestar o livro");
                System.out.println("2. Devolver o livro");
                System.out.println("3. Verificar disponibilidade");
                System.out.println("4. Exibir informações do livro");
                System.out.println("0. Sair");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        livro.emprestar();
                        break;
                    case 2:
                        livro.devolver();
                        break;
                    case 3:
                        livro.verificarDisponibilidade();
                        break;
                    case 4:
                        livro.exibirInformacoes();
                        break;
                    case 0:
                        System.out.println("Encerrando o sistema...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } while (opcao != 0);

            scanner.close();
        }
    }
}


