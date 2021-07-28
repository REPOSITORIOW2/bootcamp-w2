package manha;

public class Celular implements Precedente<Celular>{
    private int number;
    private String holder;

    Celular(int number, String holder){
        this.number = number;
        this.holder = holder;
    }

    public String getHolder() {
        return holder;
    }

    @Override
    public int precedeA(Celular celular) {
        if(this.holder.charAt(0) > celular.getHolder().charAt(0)) return 1;
        if(this.holder.charAt(0) == celular.getHolder().charAt(0)) return 0;
        return -1;

    }

    @Override
    public String toString() {
        return "manha.Celular{" +
                "number=" + number +
                ", holder='" + holder + '\'' +
                '}';
    }
}
