package Ex02_tm.mateus.ex3;

public class Book {
    private String titulo;
    private int id;
    private String autor;
    private boolean emprestado;

    public Book(String titulo, int id, String autor) {
        this.titulo = titulo;
        this.id = id;
        this.autor = autor;
    }

    public void emprestar(){
        if(emprestado){
            System.out.println("Este livro a esta emprestado");
        }else{
            emprestado = true;
        }
    }

    public void devolver(){
        if(emprestado){
            emprestado = false;
        }else{
            System.out.println("Este livro não esta emprestado");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString(){
        return "Titulo: " + this.titulo +
                "\nAutor: " + this.autor +
                "id: " + this.id;
    }
}
