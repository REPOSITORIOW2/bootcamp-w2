package br.com.meli.Aula9_Exercicio1.repository;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.meli.Aula9_Exercicio1.domain.Ingrediente;
import br.com.meli.Aula9_Exercicio1.domain.Receita;


@Repository
public abstract class GenericRepository <T>{

	private String fileName;
	
	public GenericRepository(String file){
		this.fileName = file;
	}
    
    private File getJson(String fileName) throws FileNotFoundException {
        File file = null;
        file = ResourceUtils.getFile("classpath:" + fileName);
        return file;
    }
    
    abstract T finByName(String name);
    
    public List<T> findAll (){
    	List<T> t = null;
        try {
            File file = this.getJson(fileName);
            ObjectMapper mapper = new ObjectMapper();
            TypeReference<List<T>> typeRef = new TypeReference<>() {};
            t = mapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return t;
    }
}
