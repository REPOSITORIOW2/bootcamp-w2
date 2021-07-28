import java.util.List;

public class Corrida {
    private double distancia;
    private double premioEmDolares;
    private String nome;
    private int quantidadeVeiculosPermitidos;
    List<Veiculo> listaVeiculos;
    private Veiculo vencedor;
    private SocorristaCarro socorristaCarro;
    private SocorristaMoto socorristaMoto;

    public void registrarCarro(int velocidade, int aceleracao, int anguloDeGiro, String placa) {
        listaVeiculos.add(new Carro(velocidade, aceleracao, anguloDeGiro, placa));
        System.out.println("Carro adicionado com sucesso!");
    }

    public void registrarMoto(int velocidade, int aceleracao, int anguloDeGiro, String placa) {
        listaVeiculos.add(new Moto(velocidade, aceleracao, anguloDeGiro, placa));
        System.out.println("Moto adicionada com sucesso!");
    }

    public void removerVeiculo(Veiculo v) {
        listaVeiculos.remove(v);
        System.out.println("Veiculo removido com sucesso!");
    }

    public void removerVeiculoPorPlaca(String placa) {
        listaVeiculos.remove(listaVeiculos.stream().filter(p -> placa.equals(p.getPlaca())).findFirst().orElse(null));
    }

    public void defineVencedor(List<Veiculo> listaVeiculos) {
        double pontuacao = 0;
        Veiculo vencedorAtual = new Veiculo(0, 0, 0, "", 0, 0);
        for (Veiculo veiculo : listaVeiculos) {
            if (pontuacao <
                    (veiculo.getVelocidade() * veiculo.getAceleracao()) /
                            (veiculo.getAnguloDeGiro() * (veiculo.getPeso() - veiculo.getRodas() * 100))) {
                vencedorAtual = veiculo;
            }
        }
        this.vencedor = vencedorAtual;
    }

    public void socorrerCarro(String placa) {
        this.socorristaCarro = new SocorristaCarro();
        socorristaCarro.socorrer((Carro)listaVeiculos.stream().filter(p -> placa.equals(p.getPlaca())).findFirst().orElse(null));
    }

    public void socorrerMoto(String placa) {
        this.socorristaMoto = new SocorristaMoto();
        socorristaMoto.socorrer((Moto)listaVeiculos.stream().filter(p -> placa.equals(p.getPlaca())).findFirst().orElse(null));
    }


}
