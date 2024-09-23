package Exercicios;

import java.util.ArrayList;
import java.util.HashMap;

class Post {
    private String autor;
    private String mensagem;
    private ArrayList<String> comentarios;

    public Post(String autor, String mensagem) {
        this.autor = autor;
        this.mensagem = mensagem;
        this.comentarios = new ArrayList<>();
    }

    public String getAutor() {
        return autor;
    }

    public String getMensagem() {
        return mensagem;
    }

    public ArrayList<String> getComentarios() {
        return comentarios;
    }

    public void adicionarComentario(String comentario) {
        comentarios.add(comentario);
    }

    @Override
    public String toString() {
        return autor + ": " + mensagem + " | Comentários: " + comentarios.size();
    }

    public void exibirPostCompleto() {
        System.out.println(autor + ": " + mensagem);
        if (comentarios.isEmpty()) {
            System.out.println("Nenhum comentário.");
        } else {
            System.out.println("Comentários:");
            for (String comentario : comentarios) {
                System.out.println("- " + comentario);
            }
        }
    }
}

class Usuario {
    private String nome;
    private ArrayList<Usuario> amigos;
    private ArrayList<Post> posts;

    public Usuario(String nome) {
        this.nome = nome;
        this.amigos = new ArrayList<>();
        this.posts = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Usuario> getAmigos() {
        return amigos;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void adicionarAmigo(Usuario amigo) {
        amigos.add(amigo);
        System.out.println(amigo.getNome() + " adicionado aos amigos de " + nome);
    }

    public void publicarPost(String mensagem) {
        posts.add(new Post(nome, mensagem));
        System.out.println(nome + " publicou: " + mensagem);
    }

   public void comentarPost(Post post, String comentario) {
        post.adicionarComentario(nome + ": " + comentario);
        System.out.println(nome + " comentou: " + comentario);
    }

    public void exibirAmigos() {
        System.out.println("\nAmigos de " + nome + ":");
        if (amigos.isEmpty()) {
            System.out.println("Nenhum amigo adicionado.");
        } else {
            for (Usuario amigo : amigos) {
                System.out.println("- " + amigo.getNome());
            }
        }
    }

    public void exibirPosts() {
        System.out.println("\nPosts de " + nome + ":");
        if (posts.isEmpty()) {
            System.out.println("Nenhuma publicação.");
        } else {
            for (Post post : posts) {
                System.out.println(post);
            }
        }
    }
}

public class RedeSocial {
    private HashMap<String, Usuario> usuarios;

    public RedeSocial() {
        usuarios = new HashMap<>();
    }

    public void adicionarUsuario(String nome) {
        if (!usuarios.containsKey(nome)) {
            Usuario usuario = new Usuario(nome);
            usuarios.put(nome, usuario);
            System.out.println("Usuário " + nome + " foi cadastrado com sucesso.");
        } else {
            System.out.println("Usuário " + nome + " já existe.");
        }
    }

    public Usuario buscarUsuario(String nome) {
        if (usuarios.containsKey(nome)) {
            return usuarios.get(nome);
        } else {
            System.out.println("Usuário " + nome + " não encontrado.");
            return null;
        }
    }

}
