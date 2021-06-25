package JavaAula2.ensino;

public class Livro {
    
    private boolean status;
    private String autor;
    private String code;

    public Livro(String autor, String code) {
        this.status = true;
        this.autor = autor;
        this.code = code;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Livro(Livro livro) {
        this.status = livro.isStatus();
        this.autor = livro.getAutor();
        this.code = livro.getCode();
    }

    public void emprestimo() {
        if (status) {
            this.status = !status;
        } else {
            throw new RuntimeException("Empretimo invalido");
        }
    }

    public void devolucao() {
        if (!status) {
            this.status = !status;
        } else {
            throw new RuntimeException("Devolucao invalida");
        }
    }
    
    @Override
    public String toString() {
        return "Livro [autor=" + autor + ", code=" + code + ", status=" + status + "]";
    }

}
