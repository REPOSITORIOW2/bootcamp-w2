package poo.aula2.tm.exercicio2.list.exercicio3;

class Book {
    String tituloLivro;
    String isbn;
    String nomeAutor;
    boolean estaEmprestado;

    public Book(String tituloLivro, String isbn, String nomeAutor) {
        this.tituloLivro = tituloLivro;
        this.isbn = isbn;
        this.nomeAutor = nomeAutor;
        this.estaEmprestado = false;
    }

    private void solicitaEmprestimo() {
        if (!estaEmprestado) {
            System.out.println("Seu livro foi reservado com sucesso!");
        } else {
            System.out.println("O livro ja esta emprestado.");
        }
    }

    private void solicitaDevolucao() {
        if (estaEmprestado) {
            estaEmprestado = false;
            System.out.println("Seu livro foi devolvido com sucesso.");
        } else {
            System.out.println("Você nunca pegou esse livro, maluco =).");
        }
    }

    @Override
    public String toString() {
        return tituloLivro +  ", " + isbn + ", " + nomeAutor + ".";
    }
}
