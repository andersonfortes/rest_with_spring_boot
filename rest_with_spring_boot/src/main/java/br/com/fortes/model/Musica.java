package br.com.fortes.model;

public class Musica {
    private int id;
    private String nome;
    private Album album;

    public Musica(int id, String nome, Album album) {
        this.id = id;
        this.nome = nome;
        this.album = album;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}
