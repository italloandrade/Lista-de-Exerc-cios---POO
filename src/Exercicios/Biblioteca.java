package Exercicios;

import java.util.ArrayList;
	
class Livro1 {
    private String titulo;
    private String autor;
    private boolean disponivel;

    public Livro1(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true; 
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Livro \"" + titulo + "\" emprestado com sucesso.");
        } else {
            System.out.println("Livro \"" + titulo + "\" não está disponível.");
        }
    }

    public void devolver() {
        disponivel = true;
        System.out.println("Livro \"" + titulo + "\" devolvido com sucesso.");
    }
}

public class Biblioteca {
    private ArrayList<Livro1> livros;

    public Biblioteca() {
        livros = new ArrayList<>();
    }

    public void cadastrarLivro(String titulo, String autor) {
        Livro1 novoLivro = new Livro1(titulo, autor);
        livros.add(novoLivro);
        System.out.println("Livro \"" + titulo + "\" cadastrado com sucesso.");
    }

    public void emprestarLivro(String titulo) {
        for (Livro1 livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livro.emprestar();
                return;
            }
        }
        System.out.println("Livro \"" + titulo + "\" não encontrado.");
    }

    public void devolverLivro(String titulo) {
        for (Livro1 livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livro.devolver();
                return;
            }
        }
        System.out.println("Livro \"" + titulo + "\" não encontrado.");
    }

    public void verificarDisponibilidade(String titulo) {
        for (Livro1 livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                if (livro.isDisponivel()) {
                    System.out.println("O livro \"" + titulo + "\" está disponível.");
                } else {
                    System.out.println("O livro \"" + titulo + "\" não está disponível.");
                }
                return;
            }
        }
        System.out.println("Livro \"" + titulo + "\" não encontrado.");
    }
}
