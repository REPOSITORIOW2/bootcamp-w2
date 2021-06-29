public class Vestuario {
    private String marca;
    private String modelo;

    Vestuario(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "---Vestuario---\n" +
                "Marca: '" + marca + '\'' +
                ", Modelo: '" + modelo + '\'';
    }
}
