package com.melibootcamp;

public class Main {

    public static void main(String[] args) {
	Funcionario funcionario =  new Funcionario("Fulano", 3,40,EnumTipoFuncionario.ANALISTA);
	System.out.println(funcionario.pagarSalario());
	//Chamar aqui pra testar com outros :D
    }
}
