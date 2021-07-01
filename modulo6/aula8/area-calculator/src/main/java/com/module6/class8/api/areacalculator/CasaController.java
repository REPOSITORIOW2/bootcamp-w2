package com.module6.class8.api.areacalculator;

import com.module6.class8.api.areacalculator.dao.CasaDAO;
import com.module6.class8.api.areacalculator.dto.CasaDTO;
import com.module6.class8.api.areacalculator.entity.Casa;
import com.module6.class8.api.areacalculator.entity.Comodo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

@RestController
@RequestMapping("/casas")
public class CasaController {
    private CasaDAO dao = new CasaDAO();

    @RequestMapping("/{id}")
    public CasaDTO getCasa(@PathVariable long id) {
        Casa casa = dao.get(id);

        CasaDTO casaDTO = CasaDTO.converter(casa);

        return casaDTO;
    }

    @PostMapping
    public ResponseEntity<Casa> cadastrar(@RequestBody CasaDTO casaDTO, UriComponentsBuilder uriBuilder) {
        Casa casa = CasaDTO.converter(casaDTO, dao);
        dao.add(casa);

        URI uri = uriBuilder.path("/casas/{id}").buildAndExpand(casa.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @GetMapping("/{id}/metrosQuadrados")
    public double getMetrosQuadrados(@PathVariable long id) {
        Casa casa = dao.get(id);

        return casa.getTotalMetrosQuadrados();
    }

    @GetMapping("/{id}/valor")
    public double getValor(@PathVariable long id) {
        Casa casa = dao.get(id);

        return casa.getTotalMetrosQuadrados() * 800;
    }

    @GetMapping("/{id}/maiorComodo")
    public Comodo getMaiorComodo(@PathVariable long id) {
        Casa casa = dao.get(id);

        AtomicReference<Comodo> maiorComodo = new AtomicReference<>();
        AtomicReference<Double> valorMaiorComodo = new AtomicReference<>(0.0);

        casa.getComodos().forEach(comodo -> {
            if (comodo.getArea() > valorMaiorComodo.get()) {
                valorMaiorComodo.set(comodo.getArea());
                maiorComodo.set(comodo);
            }
        });

        return maiorComodo.get();
    }

    @GetMapping("/{id}/areaComodos")
    public Object[] getAreaComodos(@PathVariable long id) {
        Casa casa = dao.get(id);

        return casa.getComodos().stream().map(comodo -> {
            HashMap<String, String> hash = new HashMap();
            hash.put("nome", comodo.getNome());
            hash.put("area", String.valueOf(comodo.getArea()));

            return hash;
        }).toArray();
    }
}
