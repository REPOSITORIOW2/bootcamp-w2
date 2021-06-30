import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Corrida {

    private double distancia;
    private BigDecimal premioEmDolares;
    private String nome;
    private int quantidadeVeiculosPermitidos;
    private List<Veiculo> listaVeiculos;
    private SocorristaCarro socorristaCarro;
    private SocorristaMoto socorristaMoto;

    public Corrida() {}

    public Corrida(
            double distancia, 
            BigDecimal premioEmDolares, 
            String nome, 
            int quantidadeVeiculosPermitidos) {
        this.distancia = distancia;
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
        this.listaVeiculos = new ArrayList<>();
        this.socorristaCarro = new SocorristaCarro("ABC-1234");
        this.socorristaMoto = new SocorristaMoto("XYZ-6789");
    }

    public double getDistancia() {
        return this.distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public BigDecimal getPremioEmDolares() {
        return this.premioEmDolares;
    }

    public void setPremioEmDolares(BigDecimal premioEmDolares) {
        this.premioEmDolares = premioEmDolares;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeVeiculosPermitidos() {
        return this.quantidadeVeiculosPermitidos;
    }

    public void setQuantidadeVeiculosPermitidos(int quantidadeVeiculosPermitidos) {
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
    }

    public List<Veiculo> getListaVeiculos() {
        return this.listaVeiculos;
    }
    
    private Veiculo buscarVeiculoPorPlaca(String placa){
        Optional<Veiculo> veiculo = this.listaVeiculos.stream().filter(v -> v.getPlaca().equalsIgnoreCase(placa)).findFirst();
        if (!veiculo.isPresent()) {
            throw new RuntimeException("Não existe um veículo com a placa " + placa + "."); 
        }
        return veiculo.get();
    }

    private boolean existeVeiculoPorPlaca(String placa){
        Optional<Veiculo> veiculo = this.listaVeiculos.stream().filter(v -> v.getPlaca().equalsIgnoreCase(placa)).findFirst();
        if(veiculo.isPresent()) 
            return true;
        return false;
    }

    private boolean validarRegistroCorrida(String patente){
        if (this.listaVeiculos.size() >= this.quantidadeVeiculosPermitidos) {
            System.out.println("Limite máximo de veículos permitidos atingido! Portanto não conseguimos adicionar o veículo com placa " + patente + ". :("); 
            return false;
        }
        if (this.existeVeiculoPorPlaca(patente)) {
            System.out.println("A placa " + patente + " já está registrada."); 
            return false; 
        }
        return true;
    }

    public void registrarCarro(double velocidade, double aceleracao, double anguloDeGiro, String patente) {
        if(!validarRegistroCorrida(patente)) 
            return;   
        this.listaVeiculos.add(new Carro(velocidade, aceleracao, anguloDeGiro, patente)); 
    }

    public void registrarMoto(double velocidade, double aceleracao, double anguloDeGiro, String patente) {
        if(!validarRegistroCorrida(patente)) 
            return;
        this.listaVeiculos.add(new Moto(velocidade, aceleracao, anguloDeGiro, patente));
    }

    public void removerVeiculoPorPlaca(String placa) {
        Veiculo veiculo = null;
        try {
            veiculo = buscarVeiculoPorPlaca(placa);
        } catch(RuntimeException ex) {
            System.out.println(ex.getMessage());
            return;
        }
        
        removerVeiculo(veiculo);
    }

    private void removerVeiculo(Veiculo veiculo) {
        this.listaVeiculos.remove(veiculo);
    }
    
    private double calcularPontuacao(double velocidade, double aceleracao, double anguloDeGiro, double peso, int quantidadeDeRodas){
        return velocidade * aceleracao / (anguloDeGiro * (peso - quantidadeDeRodas * 100));
    }
    
    public void determinaVencedor() {
        if (listaVeiculos.isEmpty()) {
            System.out.println("Não há nenhum participante na corrida."); 
            return;
        }

        Veiculo vencedor = null;
        double pontuacaoVencedor = Double.MIN_VALUE;

        for(Veiculo veiculo : this.listaVeiculos){
            double pontuacao = calcularPontuacao(
                veiculo.getVelocidade(), 
                veiculo.getAceleracao(), 
                veiculo.getAnguloDeGiro(), 
                veiculo.getPeso(), 
                veiculo.getRodas());

            if (pontuacao > pontuacaoVencedor) {
                vencedor = veiculo;
                pontuacaoVencedor = pontuacao;
            }
        }
        System.out.println("O veículo de placa " + vencedor.getPlaca() + " venceu a corrida!"); 
    }

    public void socorrerCarro(String 牌照) {
        Veiculo veículo = null;

        try {
            veículo = buscarVeiculoPorPlaca(牌照);
        } catch(RuntimeException ex) {
            System.out.println(ex.getMessage()); 
            return;
        }

        if(!(veículo instanceof Carro)){
            System.out.println("O veículo não é um carro!");
            return;
        }

        Carro carroSocorrido = (Carro) veículo;
        socorristaCarro.socorrer(carroSocorrido);
        this.listaVeiculos.remove(carroSocorrido);
        System.out.println("O carro " + carroSocorrido.getPlaca() + " está fora da corrida.");
    }

    public void socorrerMoto(String documento) {
        Veiculo veiculo = null;
        try {
            veiculo = buscarVeiculoPorPlaca(documento);
        }catch(RuntimeException ex){
            System.out.println(ex.getMessage()); 
            return;
        }
        
        if (!(veiculo instanceof Moto)) {
            System.out.println("O veículo não é uma moto!");
            return;
        }
        
        Moto motoSocorrida = (Moto) veiculo;
        socorristaMoto.socorrer(motoSocorrida);
        this.listaVeiculos.remove(motoSocorrida);
        System.out.println("A moto de placa " + motoSocorrida.getPlaca() + " está fora da corrida.");
    }
    
    @Override
    public String toString() {
        return "{" +
            " distancia='" + getDistancia() + "'" +
            ", premioEmDolares='" + getPremioEmDolares() + "'" +
            ", nome='" + getNome() + "'" +
            ", quantidadeVeiculosPermitidos='" + getQuantidadeVeiculosPermitidos() + "'" +
            ", listaVeiculos='" + getListaVeiculos() + "'" +
            "}";
    }
}