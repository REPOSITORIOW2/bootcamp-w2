package br.com.mercadolivre.ecommerce_novo.Usuario;

public class Usuario {

    private Level level;

    public Usuario(Level level) {
        this.level = level;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}
