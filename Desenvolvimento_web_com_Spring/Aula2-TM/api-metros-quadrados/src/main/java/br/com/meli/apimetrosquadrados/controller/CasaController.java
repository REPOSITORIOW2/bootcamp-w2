package br.com.meli.apimetrosquadrados.controller;

import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriBuilder;
import org.springframework.web.util.UriComponentsBuilder;


import br.com.meli.apimetrosquadrados.dao.CasaDAO;
import br.com.meli.apimetrosquadrados.dto.CasaDTO;
import br.com.meli.apimetrosquadrados.dto.ComodoDTO;
import br.com.meli.apimetrosquadrados.model.Casa;
import br.com.meli.apimetrosquadrados.model.Comodo;

@RestController
@RequestMapping("/casa")
public class CasaController {
	
	@PostMapping
	public ResponseEntity<CasaDTO> cadastrarCasa(@RequestBody CasaDTO casa, UriComponentsBuilder uriBuilder) {
		long id = CasaDAO.add(casa);
		URI uri = uriBuilder.path("/casa/{id}").buildAndExpand(id).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<CasaDTO> getCasa(@PathVariable long id) {
		CasaDTO casaDTO = new CasaDTO(CasaDAO.getCasa(id));
		
		
		return new ResponseEntity<CasaDTO>(casaDTO, HttpStatus.OK);
	}
	
	
	@GetMapping("/totalm2/{id}")
	public ResponseEntity<Double> getMetrosQuadrados(@PathVariable long id){
		Casa casa = CasaDAO.getCasa(id);
		double somaMetrosQuadrados = 0;
		
		for(Comodo c : casa.getComodo())
			somaMetrosQuadrados += c.getComprimento()*c.getLargura();
		
		
		return new ResponseEntity<Double>(somaMetrosQuadrados,HttpStatus.OK);
	}
	
	@GetMapping("/valor/{id}")
	public ResponseEntity<Double> getvalor(@PathVariable long id){
		Casa casa = CasaDAO.getCasa(id);
		double somaMetrosQuadrados = 0;
		double valor;
		
		for(Comodo c : casa.getComodo())
			somaMetrosQuadrados += c.getComprimento()*c.getLargura();

		valor = somaMetrosQuadrados*800;
		return new ResponseEntity<Double>(valor,HttpStatus.OK);
	}	
	
	@GetMapping("/maiorcomodo/{id}")
	public ResponseEntity<Comodo> getMaiorComodo(@PathVariable long id){
		Comodo c = CasaDAO.getMaiorComodo(id); 
		return new ResponseEntity<Comodo>(c,HttpStatus.OK);
	}
	
	
	@GetMapping("/areacomodos/{id}")
	public ResponseEntity<List<ComodoDTO>> getComodoArea(@PathVariable long id){
		List<ComodoDTO> comodos = new ArrayList<>();
		
		for(Comodo c : CasaDAO.getComodos(id)) {
			comodos.add(new ComodoDTO(c));
		}
		
		return new ResponseEntity<List<ComodoDTO>>(comodos,HttpStatus.OK);
	}
	
	
	
	
	
	

}
