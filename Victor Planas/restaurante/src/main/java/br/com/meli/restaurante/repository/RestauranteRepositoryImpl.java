package br.com.meli.restaurante.repository;

import br.com.meli.restaurante.Pedido;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SequenceWriter;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.*;
import java.util.List;
@Service
public class RestauranteRepositoryImpl implements RestauranteRepository {


    public List<Pedido> loadResource() {
        File file = null;
        try {
            file = ResourceUtils.getFile("src/main/resources/static/pedidos.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<Pedido>> ref = new TypeReference<>() {
        };
        List<Pedido> produtoList = null;
        try {
            produtoList = objectMapper.readValue(file, ref);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return produtoList;
    }

    @Override
    public Pedido addResource(Pedido pedido) throws IOException {
        try {
            File file = new File("src/main/resources/static/pedidos.json");
            FileWriter fileWriter = new FileWriter(file, true);

            ObjectMapper mapper = new ObjectMapper();

            SequenceWriter seqWriter = mapper.writer().writeValuesAsArray(fileWriter);
            seqWriter.write(pedido);
            seqWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pedido;
    }

    @Override
    public List<Pedido> deleteResource(Pedido pedido) throws IOException {

        List<Pedido> listapedido = loadResource();
        listapedido.remove(pedido);
        try {
            FileWriter fwOb = new FileWriter("src/main/resources/static/pedidos.json", false);
            PrintWriter pwOb = new PrintWriter(fwOb, false);
            pwOb.flush();
            pwOb.close();
            fwOb.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Pedido pedido1 : listapedido) {
            addResource(pedido1);
        }
        return listapedido;
    }

    @Override
    public List<Pedido> updateResource(Pedido pedidoVelho, Pedido pedidoNovo) throws IOException {
        deleteResource(pedidoVelho);
        addResource(pedidoNovo);
        return loadResource();
    }


}
