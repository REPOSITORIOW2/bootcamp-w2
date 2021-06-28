package TM;

public class Time {
    private double tempoInicial;
    private double tempoFinal;

    public void start() {
        tempoInicial = System.nanoTime() / Math.pow(10,6);
    }

    public void stop() {
        tempoFinal = System.nanoTime() / Math.pow(10, 6);
    }

    public double elapsedTime(){
        return tempoFinal - tempoInicial;
    }

    public double getTempoInicial(){
        return tempoInicial;
    }

    public double getTempoFinal(){
        return tempoFinal;
    }
}
