
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



public class Estudante {
    private String nome;
    private int idade;
    private int matricula;
    private String serie;
    Estudante(String nome, int idade, int matricula, String serie) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
        this.serie = serie;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getSerie() {
        return serie;
    }
    public void setSerie(String serie) {
        this.serie = serie;
    }
}


    Estudante est11 = new Estudante("Joao", 14, 11, "8a Serie");
    Estudante est12 = new Estudante("Pedro", 14, 12, "8a Serie");
    Estudante est13 = new Estudante("Carla", 14, 13, "8a Serie");

    Estudante est21 = new Estudante("Arthur", 13, 21, "7a Serie");
    Estudante est22 = new Estudante("Igor", 13, 22, "7a Serie");
    Estudante est23 = new Estudante("Caio", 13, 23, "7a Serie");

    Estudante est31 = new Estudante("Gabriela", 12, 31, "6a Serie");
    Estudante est32 = new Estudante("Mariana", 12, 32, "6a Serie");
    Estudante est33 = new Estudante("Antonio", 12, 33, "6a Serie");

    Estudante[] estTurma1 = {est11, est12, est13};
    Estudante[] estTurma2 = {est21, est22, est23};
    Estudante[] estTurma3= {est31, est32, est33};

            turma1.setEstudantes(estTurma1);
            turma2.setEstudantes(estTurma2);
            turma3.setEstudantes(estTurma3); a