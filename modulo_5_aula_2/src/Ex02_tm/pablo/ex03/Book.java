public class Book {
    /**
     * Crie uma classe Book com os métodos: empréstimo, devolver e toString, cujo protótipo deve ser: 
     * public String toString (). Este método deve retornar uma string que representa o objeto. 
     * Por exemplo: se a classe tiver os atributos: título, isbn e autor, uma string 
     * representando um livro poderia ser: "Harry Potter, 9780545582889, Rowling, J. K.". A classe conterá um 
     * construtor padrão, um construtor com parâmetros e os métodos de acesso.
     */

    private String title;
    private int ISBN;
    private String author;
    private boolean taked = false;



    public String getTitle(){
        return this.title;
    }
    public int getISBN(){
        return this.ISBN;
    }
    public String getAuthor(){
        return this.author;
    }
    public boolean getTaked(){
        return this.taked;
    }

    public void setTitle(String t){
        this.title = t;
    }
    public void setISBN(int t){
        this.ISBN = t;
    }
    public void setAuthor(String t){
        this.author = t;
    }

    public void emprestimo(){
        if (this.taked){
            System.out.println("Book already taked");
        } else {
            this.taked = true;
            System.out.println("[TAKING]: "+this);
        }
    }

    public void devolver(){
        if (this.taked){
            System.out.println("[RECOVERING]: "+this);
            this.taked = false;
        } else {
            System.out.println("Book already recovered");
        }
    }


    @Override
    public String toString(){
        return this.title + " " + this.ISBN + " " + this.author;
    }
}