package br.com.meli.aula2spring.metros;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/casa")
public class CasaController {
    private CasaDAO dao = new CasaDAO();

    @PostMapping("/cadastra")
    public Casa cadastra(@RequestBody Casa nova){
        return dao.adicionaCasa(nova.getNome(),nova.getEndereco(),nova.getComodos());
    }

    @GetMapping("/metros/{id}")
    public String metrosQuadradosRequest(@PathVariable Integer id){
        return  dao.getMetrosQuadrados(id) + "m2";
    }

    @GetMapping("/valor/{id}")
    public String valorCasa(@PathVariable Integer id){
        return "R$" +dao.valorCasa(id);
    }

    @GetMapping("/qtdmetros/{id}")
    public List<String> metrosPorComodo(@PathVariable Integer id){
        return dao.getMetrosQuadradosPorComodo(id);
    }

    @GetMapping("/maiorcomodo/{id}")
    public String maiorComodo(@PathVariable Integer id){
        return dao.maiorComodo(id);
    }


}
