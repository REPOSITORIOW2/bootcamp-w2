package com.melibootcamp;

public class Convidado {
    private String nome;
    private EnumTipoConvidado convidadoTipo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EnumTipoConvidado getConvidado() {
        return convidadoTipo;
    }

    public void setConvidado(EnumTipoConvidado convidado) {
        this.convidadoTipo = convidado;
    }

    public Convidado(String nome, EnumTipoConvidado convidado) {
        this.nome = nome;
        this.convidadoTipo = convidado;
    }
    public void receberBolo(){
        if(convidadoTipo == EnumTipoConvidado.MELI)
            System.out.println(this.getNome()+ " diz: Viva la Chiqui !!");

    }
}
