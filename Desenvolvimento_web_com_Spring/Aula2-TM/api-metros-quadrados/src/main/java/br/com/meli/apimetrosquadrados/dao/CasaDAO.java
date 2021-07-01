package br.com.meli.apimetrosquadrados.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import br.com.meli.apimetrosquadrados.dto.CasaDTO;
import br.com.meli.apimetrosquadrados.model.Casa;
import br.com.meli.apimetrosquadrados.model.Comodo;

public class CasaDAO {
	private static List<Casa> casas = new ArrayList<>();
	
	
	public static long add(CasaDTO casa) {
		Casa casaAdd = new Casa(casa);
		casaAdd.setId(casas.size()+1);
		casas.add(casaAdd);
		
		return casaAdd.getId();
	}
	
	public static Casa getCasa(long id) {
		Optional<Casa> opCasa = casas.stream().filter(item -> item.getId()==id).findFirst();
		if(opCasa.isPresent()) {
			return opCasa.get();
		}
		
		return null;
	}
	
	
	public static Comodo getMaiorComodo(long id) {
		Casa casa = getCasa(id);
		Comodo maiorComodo = null;
		double maiorArea = 0;
		double areaAtual;
		
		
		for(Comodo c : casa.getComodo()) {
			areaAtual = c.getLargura()*c.getComprimento();
			if(areaAtual>maiorArea) {
				maiorComodo = c;
				maiorArea=areaAtual;
			}
		}
		
		return maiorComodo;
		
	}
	
	public static List<Comodo> getComodos(long id){
		return getCasa(id).getComodo();
	}
}
