package LC;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		FogosBloco b1 = new FogosBloco();
		FogosBloco b2 = new FogosBloco();
		FogosBloco b3 = new FogosBloco();
		
		Fogos i1 = new FogosIndividual("Boom");
		Fogos i2 = new FogosIndividual("Paaa");
		Fogos i3 = new FogosIndividual("Papum");
		Fogos i4 = new FogosIndividual("Pratata");
		
		
		b1.addFogos(b2);
		b1.addFogos(b3);
		
		b2.addFogos(i1);
		b2.addFogos(i2);
		
		b3.addFogos(i3);
		b3.addFogos(i4);
		
		b1.explode();
		
		List <Convidado> listaConvidados= new ArrayList<>();
		listaConvidados.add(new ConvidadoMeli());
		listaConvidados.add(new ConvidadoStandard());
		listaConvidados.add(new ConvidadoMeli());
		listaConvidados.add(new ConvidadoStandard());
		listaConvidados.add(new ConvidadoMeli());
		listaConvidados.add(new ConvidadoStandard());
		listaConvidados.add(new ConvidadoMeli());
		listaConvidados.add(new ConvidadoStandard());
		
		listaConvidados.forEach(c -> c.comeBolo());
		
	}

}
