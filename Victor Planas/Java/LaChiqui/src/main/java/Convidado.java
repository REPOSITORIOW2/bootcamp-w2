import java.util.List;

public class Convidado {
    private String nome;
    private int idade;
    private boolean plusOne;

    public Convidado(String nome, int idade, boolean plusOne) {
        this.nome = nome;
        this.idade = idade;
        this.plusOne = plusOne;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public boolean isPlusOne() {
        return plusOne;
    }

}
