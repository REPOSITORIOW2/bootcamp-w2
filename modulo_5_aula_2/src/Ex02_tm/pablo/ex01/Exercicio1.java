public class Exercicio1{


    public static void main(String[] args) {


        // (String conta, String agencia, double saldo, String titular){
        System.out.println("Criando cc1");
        ContaCorrente cc1 = new ContaCorrente("123-4", "5657", 1000.0, "Joao da Maça");

        System.out.println("Copiando cc1 para cc2");
        ContaCorrente cc2 = new ContaCorrente(cc1);

        System.out.println("Depositando 500 em cc1");
        cc1.deposito(500.00);

        System.out.println("Saldo cc1");
        System.out.println(cc1.getSaldo());


        System.out.println("getSaldoCC2");
        System.out.println(cc2.getSaldo());


        
    }
}