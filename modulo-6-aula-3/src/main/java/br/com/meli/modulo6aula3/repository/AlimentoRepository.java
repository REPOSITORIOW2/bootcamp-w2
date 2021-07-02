package br.com.meli.modulo6aula3.repository;

import br.com.meli.modulo6aula3.entity.dto.AlimentoDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.*;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@Repository
public class AlimentoRepository {
  public List<AlimentoDTO> listar() throws IOException {

    try {
      List<AlimentoDTO> alimentos = arquivoParaLista();
      return alimentos;
    } catch (IOException e){
      e.printStackTrace();
    }
    return null;
  }

  private List<AlimentoDTO> arquivoParaLista() throws IOException {
    ObjectMapper mapper = new ObjectMapper();
    TypeReference<List<AlimentoDTO>> typeReference = new TypeReference<List<AlimentoDTO>>(){};
    InputStream inputStream = TypeReference.class.getResourceAsStream("/json/food.json");
    List<AlimentoDTO> alimentos = mapper.readValue(inputStream,typeReference);
    return alimentos;
  }

  public AlimentoDTO getAlimento(String name) throws IOException  {
    List<AlimentoDTO> alimentos = arquivoParaLista();

    Optional<AlimentoDTO> alimento =  alimentos.stream().filter(a -> a.getName().equals(name)).findFirst();

    if(alimento.isPresent()) {
      return alimento.get();
    }
    return new AlimentoDTO();
  }

  public AlimentoDTO addAlimento(AlimentoDTO alimentoDTO) throws IOException, URISyntaxException {
    List<AlimentoDTO> lista = arquivoParaLista();
    ObjectMapper mapper = new ObjectMapper();

    lista.add(alimentoDTO);

    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(new File(TypeReference.class.getResource("/json/food.json").toURI()))));
    mapper.writeValue(out, lista);
    out.close();

    return alimentoDTO;
  }
}
