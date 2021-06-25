package entities;

public class Book {

    private String titulo;
    private String isbn;
    private String autor;
    private boolean emprestado = false;

    public Book(){

    }

    public Book(String titulo, String isbn, String autor){
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
    }

    public Book(Book book){
        this.titulo = book.getTitulo();
        this.isbn = book.getIsbn();
        this.autor = book.getAutor();
        this.emprestado = book.isEmprestado();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public boolean emprestimo(){
        if (this.isEmprestado()){
            return false;
        } else{
            this.setEmprestado(true);
            return true;
        }
    }

    public boolean devolucao(){
        if (this.isEmprestado()){
            this.setEmprestado(false);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return titulo +
                ", "+ isbn +
                ", " + autor
                ;
    }
}
