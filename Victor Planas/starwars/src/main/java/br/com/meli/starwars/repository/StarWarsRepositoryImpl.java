package br.com.meli.starwars.repository;

import br.com.meli.starwars.entity.Personagem;
import br.com.meli.starwars.entity.PersonagemDTO;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Repository
public class StarWarsRepositoryImpl implements StarWarsRepository{

    @Override
    public PersonagemDTO getPersonagemByNamePart(String name) {
        List<PersonagemDTO> personagemDTOList = carregaJson();
        PersonagemDTO personagem = null;
        if(personagemDTOList != null){
            Optional<PersonagemDTO> item = personagemDTOList.stream().filter(personagemDTO -> personagemDTO.getName().contains(name)).findFirst();
            personagem = item.get();
        }
        return personagem;
    }

    public List<PersonagemDTO> carregaJson(){
        File file = null;
        try{
            file = ResourceUtils.getFile("src/main/resources/static/starwars.json");
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<PersonagemDTO>> typeReference = new TypeReference<List<PersonagemDTO>>() {};
        List<PersonagemDTO> listaPersonagemDTO = null;
        try {
            listaPersonagemDTO = objectMapper.readValue(file, typeReference);
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listaPersonagemDTO;
    }
}
