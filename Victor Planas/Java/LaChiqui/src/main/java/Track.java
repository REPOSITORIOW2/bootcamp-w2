public class Track implements Explosivo {
    private String tipo;
    private int tamanho;
    private String nome;

    public Track(String tipo, int tamanho, String nome) {
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.nome = nome;
    }

    public void explode() {
        System.out.print("B");
        for (int i = 0; i < this.tamanho; i++) {
            System.out.print("o");
        }
        System.out.println("M");
    }

    public int getTamanho() {
        return tamanho;
    }
}
