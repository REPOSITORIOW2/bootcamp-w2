package dev.feldmann.bootcamp.modulo6.Aula2.calculadoraMetrosQuadrados;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Comparator;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/casa/")
public class CalculadoraMetrosController {


    @PostMapping("/calcular")
    public CasaInformationDTO calculateArea(@Valid @RequestBody CasaForm casa) {

        double totalMetrosQuadrados = casa.getComodos().stream()
                .mapToDouble(CasaForm.Comodo::getArea)
                .sum();

        double valor = totalMetrosQuadrados * 800;

        var maxComodo = casa.getComodos().stream()
                .max(Comparator.comparingDouble(CasaForm.Comodo::getArea))
                .get();

        var areaByComodo = casa.getComodos().stream()
                .collect(Collectors.toMap(CasaForm.Comodo::getNome, CasaForm.Comodo::getArea));

        return new CasaInformationDTO(totalMetrosQuadrados, valor, maxComodo.getNome(), areaByComodo);
    }


}
