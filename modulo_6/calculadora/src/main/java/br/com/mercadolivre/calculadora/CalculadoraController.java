package br.com.mercadolivre.calculadora;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@RestController
public class CalculadoraController {

    @PostMapping
    public CasaDto calCasa(@RequestBody Casa casa) {
        double totalMetros = casa.getTotalMetrosQuadrados();
        double valorDouble = BigDecimal.valueOf(casa.getTotalMetrosQuadrados() * 800).doubleValue();
        Comodo maiorComodo = this.getMaiorComodo(casa);

        List<ComodoDTO> comodosDTO = ComodoDTO.converter(casa.getComodos());
        ComodoDTO maiorComodoDto = new ComodoDTO(maiorComodo);

        return new CasaDto(totalMetros, valorDouble, maiorComodoDto, comodosDTO);
    }

    public Comodo getMaiorComodo(Casa casa){
        return casa.getComodos().stream().max(Comparator.comparingDouble(Comodo::getMetroQuadrado)).orElse(null);
    }

}
