import java.util.Scanner;

public class Pratica1 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int d = in.nextInt();

        //exercicioDois(n,m);
        numerosNaturais(n,m,d);
    }

    private static void exercicioUm(int n) {
        for (int i = 0; i < n; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }
    }

    private static void exercicioDois(int n, int m){
        for (int i = 0; i < n; i++) {
            if(n%m==0){
                System.out.println(n);
            }
        }
    }

    private static boolean ehPrimo(int n){
        boolean ehPrimo = true;
        for (int i = 2; i < n-1; i++) {
            if(n%i==0) ehPrimo = false;
        }
        return ehPrimo;
    }

    private static void mostraNumerosPrimos(int n){
        for (int i = 1; i < n; i++) {
            if(ehPrimo(i)){
                System.out.println(i);
            }
        }
    }

    private static void numerosNaturais(int n, int m, int d){
        int numDigitos = 0;

        for (int i = 0; numDigitos < n; i++) {

            if(String.valueOf(i).length() >= m){

                int contaIguais = 0;
                for (int j = 0; j < String.valueOf(i).length(); j++) {

                    if(String.valueOf(i).charAt(j) == String.valueOf(d).charAt(0)){
                        contaIguais++;
                    }
                }
                if (contaIguais == m){
                    System.out.println(i);
                    numDigitos++;
                }
            }
        }
    }

}

