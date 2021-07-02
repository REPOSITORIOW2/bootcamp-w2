package com.example.diploma.service;

import java.util.List;

public class Aluno {
    private String nome;
    private List<Materia> materiaList;

    public ResultadoAluno media(){
        Double resultDouble = materiaList.stream().mapToDouble(a -> a.getNota()).average().orElseThrow();
        ResultadoAluno aluno = new ResultadoAluno(nome, resultDouble);
        if (resultDouble.compareTo(9.0) >= 0)
            aluno.setMensagem("Parabéns");
        return aluno;
    }

    public List<Materia> getMateriaList() {
        return materiaList;
    }

    public void setMateriaList(List<Materia> materiaList) {
        this.materiaList = materiaList;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
