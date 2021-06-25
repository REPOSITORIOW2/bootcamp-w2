package com.melibootcamp;

public class Funcionario {
    private String nome;
    private int metasBatidas;
    private int jornadaHorasCumpridas;
    private int horasDeDescansoSemanalRemunerado;
    private double salarioBase;
    private EnumTipoFuncionario tipoFuncionario;
    private double lucrosDaEmpresa;

    public String getNome() {
        return nome;
    }

    public int getMetasBatidas() {
        return metasBatidas;
    }

    public int getJornadaHorasCumpridas() {
        return jornadaHorasCumpridas;
    }

    public int getHorasDeDescansoSemanalRemunerado() {
        return horasDeDescansoSemanalRemunerado;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public EnumTipoFuncionario getTipoFuncionario() {
        return tipoFuncionario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMetasBatidas(int metasBatidas) {
        this.metasBatidas = metasBatidas;
    }

    public void setJornadaHorasCumpridas(int jornadaHorasCumpridas) {
        this.jornadaHorasCumpridas = jornadaHorasCumpridas;
    }

    public void setHorasDeDescansoSemanalRemunerado(int horasDeDescansoSemanalRemunerado) {
        this.horasDeDescansoSemanalRemunerado = horasDeDescansoSemanalRemunerado;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setTipoFuncionario(EnumTipoFuncionario tipoFuncionario) {
        this.tipoFuncionario = tipoFuncionario;
    }

    public double getLucrosDaEmpresa() {
        //Num case real, esse dado viria de outro lugar ;)
        return 900000;
    }

    public void setLucrosDaEmpresa(double lucrosDaEmpresa) {
        this.lucrosDaEmpresa = lucrosDaEmpresa;
    }

    public Funcionario(String nome, int metasBatidas, int jornadaHorasCumpridas, EnumTipoFuncionario tipoFuncionario) {
        this.nome = nome;
        this.metasBatidas = metasBatidas;
        this.jornadaHorasCumpridas = jornadaHorasCumpridas;
        this.horasDeDescansoSemanalRemunerado = horasDeDescansoSemanalRemunerado;
        this.salarioBase = salarioBase;
        this.tipoFuncionario = tipoFuncionario;
        switch (this.tipoFuncionario) {
            case TECNICO:
                this.horasDeDescansoSemanalRemunerado = 0;
                this.salarioBase = 3200;
                break;
            case ANALISTA:
                this.horasDeDescansoSemanalRemunerado = 4;
                this.salarioBase = 4000;
                break;
            case GERENTE:
                this.horasDeDescansoSemanalRemunerado = 4;
                this.salarioBase = 6000;
                break;
            case DIRETOR:
                this.salarioBase = 15000;
                break;
        }
    }

    public double pagarSalario() {
        double salario = 0;
        switch (this.tipoFuncionario) {
            case TECNICO:
                salario = ((salarioBase * 0.05) * metasBatidas) + ((salarioBase / 40) * jornadaHorasCumpridas);
                return salario;
            case ANALISTA:
                salario = ((salarioBase * 0.08) * metasBatidas) + ((salarioBase / 40) * jornadaHorasCumpridas) + ((salarioBase / 40) * 4);
                return salario;
            case GERENTE:

                salario = ((salarioBase * 0.125) * metasBatidas) + ((salarioBase / 36) * jornadaHorasCumpridas) + ((salarioBase / 40) * 4);
                return salario;
            case DIRETOR:
                salario = salarioBase + lucrosDaEmpresa * 0.03;
                return salario;
        }
        return salario;
    }
}
