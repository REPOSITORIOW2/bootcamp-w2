package br.com.mercadolivre.food.Produto;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProdutoRepository {

    private static final File FILE = new File("food.json");

    @Autowired
	private ObjectMapper mapper;

    public List<Produto> getAll(){
		List<Produto> produtos = new ArrayList<>();
		try {
			FileInputStream is = new FileInputStream(FILE);
			TypeReference<List<Produto>> typeReference = new TypeReference<List<Produto>>() {};
			produtos = mapper.readValue(is, typeReference);
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return produtos;
	}

//	public void add(Anuncio anuncio) {
//		try {
//			 List<Anuncio> anuncios = getList();
//			 anuncios.add(anuncio);
//			 PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(FILE)));
//			 mapper.writeValue(out, anuncios);
//			 out.close();
//		} catch (JsonGenerationException e) {
//			e.printStackTrace();
//		} catch (JsonMappingException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
}
