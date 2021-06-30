package br.com.meli.bootcamp30_06.services;

import org.springframework.stereotype.Service;

@Service
public class NumerosService {
    public String converteParaRomano(int numero) {
        int[] numeros = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] numerosRomanos = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder numeroBuilder = new StringBuilder();
        for(int i = 0; i<numeros.length;i++){
            while(numero >= numeros[i]) {
                numero -= numeros[i];
                numeroBuilder.append(numerosRomanos[i]);
            }
        }
        return numeroBuilder.toString();
    }
}
