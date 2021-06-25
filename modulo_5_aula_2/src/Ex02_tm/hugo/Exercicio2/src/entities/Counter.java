package entities;

import exceptions.IncDecException;

public class Counter {

    private int numeroContagem;

    public Counter(){

    }

    public Counter(int numeroContagem) {
        this.numeroContagem = numeroContagem;
    }

    public Counter(Counter contador){
        this.numeroContagem = contador.getNumeroContagem();
    }

    public int getNumeroContagem(){
        return this.numeroContagem;
    }

    public void aumentaContagem(int incremento) throws IncDecException {
        if (incremento < 0){
            throw new IncDecException("O número digitado precisa ser maior ou igual a zero");
        }
        this.numeroContagem += incremento;
    }

    public void diminuiContagem(int decremento) throws IncDecException {
        if (decremento < 0){
            throw new IncDecException("O número digitado precisa ser maior ou igual a zero");
        }
        this.numeroContagem -= decremento;
    }
}
