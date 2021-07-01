package com.bootcamp.calcularareacasa.services;

import com.bootcamp.calcularareacasa.models.Comodo;
import com.bootcamp.calcularareacasa.models.ComodoComArea;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraCasaService {


    private static double valorPorMetro = 800;
    public double totalMetrosQuadrados(Comodo[] comodos)
    {
        double totalMetros=0;
        for(int i= 0; i < comodos.length; i++)
        {
            totalMetros += comodos[i].calcularArea();
        }
        return totalMetros;
    }

    public double valorDaCasa(Comodo[] comodos)
    {
        double totalMetros = totalMetrosQuadrados(comodos);
        return totalMetros * valorPorMetro;
    }

    public Comodo maiorComodo(Comodo[] comodos)
    {
        Comodo maiorComodo = null;
        double maiorComodoMetros=0;
        for(int i= 0; i < comodos.length; i++)
        {
            var resultado = comodos[i].calcularArea();
            if(resultado > maiorComodoMetros){
                maiorComodoMetros = resultado;
                maiorComodo = comodos[i];
            }
        }
        return maiorComodo;
    }

    public ComodoComArea[] retornarComodosComArea(Comodo[] comodos){
        ComodoComArea[] comodosComArea = new ComodoComArea[comodos.length];
        for(int i= 0; i < comodos.length; i++)
        {
            comodosComArea[i] = new ComodoComArea(comodos[i]);
        }
        return comodosComArea;
    }
}
