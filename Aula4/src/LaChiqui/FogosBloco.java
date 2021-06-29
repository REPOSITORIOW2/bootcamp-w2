package LC;

import java.util.*;


public class FogosBloco implements Fogos {

	private List<Fogos> listaFogos;
	
	public FogosBloco() {
		listaFogos = new ArrayList<Fogos>();
	}
	
	@Override
	public void explode() {
		this.listaFogos.forEach(item -> item.explode());
	}
	
	public void addFogos(Fogos fogos) {
		listaFogos.add(fogos);
	}

}
