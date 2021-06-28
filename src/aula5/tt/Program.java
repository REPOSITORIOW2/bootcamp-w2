package aula5.tt;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Arma espada = new Espada("Excalibur", 85);
        Arma arco = new ArcoFlecha("Roberto", 50);
        Arma palito = new PalitoDeDente("Palitinho", 5);

        List<Arma> armas = new ArrayList<>();
        armas.add(espada);
        armas.add(arco);
        armas.add(palito);

        Personagem personagem = new Personagem("Gerold", Classes.GUERREIRO, 1, armas, palito);
        Personagem personagem2 = new Personagem("Josue", Classes.ARQUEIRO, 4, armas, arco);

        personagem.usarArma(personagem2);
        personagem.setArma(arco);
        personagem.usarArma(personagem2);
        personagem.setArma(espada);
        personagem.usarArma(personagem2);
    }
}
