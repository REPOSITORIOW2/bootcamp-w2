package br.com.meli.modulo6aula4.repositories;

import br.com.meli.modulo6aula4.dtos.PedidoDTO;
import br.com.meli.modulo6aula4.dtos.ProdutosDTO;
import br.com.meli.modulo6aula4.dtos.UsuarioDTO;
import br.com.meli.modulo6aula4.dtos.UsuarioPedidoDTO;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class PedidoRepository {

    private static final File FILE = new File("pedido.json");
    @Autowired
    private ObjectMapper mapper;

    public List<PedidoDTO> getList() {
        List<PedidoDTO> Pedido = new ArrayList<>();
        try {
            FileInputStream is = new FileInputStream(FILE);
            TypeReference<List<PedidoDTO>> typeReference = new TypeReference<List<PedidoDTO>>() {
            };
            Pedido = mapper.readValue(is, typeReference);
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return Pedido;
    }

    public PedidoDTO add(UsuarioPedidoDTO usuarioPedidoDTO) {

        List<PedidoDTO> Pedido = getList();
        PedidoDTO pedidoDTO = new PedidoDTO((long) (Pedido.size() + 1), usuarioPedidoDTO.getProdutos(), usuarioPedidoDTO.getUsuarioId());
        Pedido.add(pedidoDTO);
        saveFile(Pedido);
        return pedidoDTO;
    }

    public void deletar(PedidoDTO PedidoDTO) {

        List<PedidoDTO> Pedido = getList();
        Pedido.removeIf(e -> e.getId().equals(PedidoDTO.getId()));
        saveFile(Pedido);

    }

    public void atualizar(PedidoDTO pedido) {

        List<PedidoDTO> Pedido = getList();
        Optional<PedidoDTO> pedidoOptional = Pedido.stream().filter(e -> e.getId().equals(pedido.getId())).findFirst();
        pedidoOptional.ifPresent(e -> {
            e.update(pedido);
            saveFile(Pedido);
        });
    }

    public PedidoDTO getById(Long id){

        List<PedidoDTO> pedido = getList();
        Optional<PedidoDTO> pedidoOptional = pedido.stream().filter(e -> e.getId().equals(id)).findFirst();

        return pedidoOptional.orElse(null);
    }
    private void saveFile(List<PedidoDTO> Pedido) {

        try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(FILE)));
            mapper.writeValue(out, Pedido);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
