package dev.feldmann.bootcamp.aula4.lachiqui;

public class Convidado {

    private String name;
    private ConvidadoType type;

    public Convidado(String name, ConvidadoType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public ConvidadoType getType() {
        return type;
    }

    public void comerBolo() {
        System.out.printf("%s: Comendo bolo%n", this.name);
        if (this.type == ConvidadoType.MELI) {
            System.out.printf("%s: Viva la Chiqi !!%n", this.name);
        }
    }


}
