package br.com.meli.modulo5.dia1.TM;


import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        //Desenvolver um programa para exibição por console os n primeiros números naturais que têm pelo menos de m dígitos de d,
        //sendo n, m e d valores que o utilizador vai enviar pelo console.

        //Por exemplo: se o usuário inserir n = 5, m = 2 e d = 3, o programa deve exibir os primeiros 5 números naturais que
        //tenham pelo menos 2 dígitos 3 no console. Neste caso, a saída será: 33, 133 , 233, 303, 313.

        //Dependendo de como você decidir abordar a solução para este exercício, pode ser necessário usar recursos que ainda não estudamos.
        //O desafio é pesquisar no Google como usar esses recursos e usá-los!
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite quantos numero naturais devem ser apresentados: ");
        int n = scanner.nextInt(); //'n' primeiros numeros
        System.out.print("Digite quantas vezes um numero irá repetir: ");
        int m = scanner.nextInt(); //pelo menos ('m') digitos
        System.out.print("Digite o numero que irá repetir: ");
        int d = scanner.nextInt(); //o numero que vai repetir 'm' vezes

        int numeroAnalisado = 1;//esse numero vai passar por incremento

        //o while vai varrer os numeros analisados
        int controle = 0;
        while(controle<n){
            //inicio da validação
            String numeroAnalisadoString = Integer.toString(numeroAnalisado);//passo o numero pra string, pra conseguir analisar cada um dos caracteres
            int incidencia = 0;//registra quantas vezes a comparação retorna true
            //o for a seguir controla quantas vezes o d aparece no numero analisado
            for(int i = 0;i < numeroAnalisadoString.length(); i++){
                if(Integer.parseInt(numeroAnalisadoString.substring(i,i+1)) == d) {
                    incidencia++;
                }
            }
            //com a incidencia em mao, o if diz se o numero atende aos parametros
            if(incidencia >= m){
                System.out.println(numeroAnalisado);
                controle++;
            }
            numeroAnalisado++;
        }

        }
}

