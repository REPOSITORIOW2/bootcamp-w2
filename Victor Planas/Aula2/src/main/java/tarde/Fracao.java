package tarde;

public class Fracao {
    public void adicionar(int numerador1, int denominador1, int numerador2, int denominador2){

        System.out.println("Resultado: " + (numerador1+numerador2) + "/" + denominador1);
    }
    public void adicionar(int numerador1, int denominador1){
        System.out.println("Resultado: " + (numerador1 + denominador1));
    }
    public void subtrair(int numerador1, int denominador1, int numerador2, int denominador2){
        System.out.println("Resultado: " + (numerador1-numerador2) + "/" + denominador1);
    }
    public void subtrair(int numerador1, int denominador1){
        System.out.println("Resultado: " + (numerador1 - denominador1));
    }
    public void dividir(int numerador1, int denominador1, int numerador2, int denominador2){
        System.out.println("Resultado: " + (numerador1 * denominador2) +  "/" + (denominador1 * numerador2));
    }
    public void dividir(int numerador1, int denominador1){
        System.out.println("Resultado: " + (numerador1 / denominador1));
    }
    public void multiplicar(int numerador1, int denominador1, int numerador2, int denominador2){
        System.out.println("Resultado: " + (numerador1 * numerador2) +  "/" + (denominador1 * denominador2));
    }
    public void multiplicar(int numerador1, int denominador1){
        System.out.println("Resultado: " + (numerador1 * denominador1));
    }
}
