package br.com.meli.alimentos;

import br.com.meli.alimentos.repository.AlimentoDTO;
import br.com.meli.alimentos.service.AlimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/alimentos")
public class AlimentoController {

    @Autowired
    AlimentoService service;

    @GetMapping("/listaTodos")
    public List<AlimentoDTO> listaTodos(){
        return service.getListaAlimentosDTO();
    }

    @GetMapping("/getAlimento/{name}")
    public AlimentoDTO getAlimentoByName(@PathVariable String name){
        return service.getAlimentoByName(name);
    }

}
