package Banco;

import java.util.Date;

public class Book {
    String titulo;
    String autor;
    Date dataPublicacao;
    boolean emprestado;

    Book(){}

    Book(String titulo, String autor, Date dataPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.dataPublicacao = dataPublicacao;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void emprestimo(){
        this.emprestado = true;
    }

    public void devolver(){
        this.emprestado = false;
    }

    @Override
    public String toString(){
        return "Titulo: " + this.titulo + "\nAutor: " + this.autor + "\nData de publicaçao: " + this.dataPublicacao;
    }
}
