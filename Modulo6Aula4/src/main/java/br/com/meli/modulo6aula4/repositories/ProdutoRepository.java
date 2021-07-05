package br.com.meli.modulo6aula4.repositories;

import br.com.meli.modulo6aula4.dtos.ProdutosDTO;
import br.com.meli.modulo6aula4.enums.ProdutoEnum;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class ProdutoRepository {

    private static final File FILE = new File("produtos.json");
    @Autowired
    private ObjectMapper mapper;

    public List<ProdutosDTO> getList() {
        List<ProdutosDTO> produtos = new ArrayList<>();
        try {
            FileInputStream is = new FileInputStream(FILE);
            TypeReference<List<ProdutosDTO>> typeReference = new TypeReference<List<ProdutosDTO>>() {
            };
            produtos = mapper.readValue(is, typeReference);
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return produtos;
    }

    public void add(ProdutosDTO produto) {

        List<ProdutosDTO> produtos = getList();
        produtos.add(produto);
        saveFile(produtos);

    }

    public void deletar(ProdutosDTO produtosDTO) {

        List<ProdutosDTO> produtos = getList();
        produtos.removeIf(e -> e.getId().equals(produtosDTO.getId()));
        saveFile(produtos);

    }

    public void atualizar(ProdutosDTO produto) {

        List<ProdutosDTO> produtos = getList();
        Optional<ProdutosDTO> produtoOptional = produtos.stream().filter(e -> e.getId().equals(produto.getId())).findFirst();
        produtoOptional.ifPresent(e -> {
            e.update(produto);
            saveFile(produtos);
        });
    }

    public List<ProdutosDTO> getByCategory(ProdutoEnum categoria){
        List<ProdutosDTO> produtos = getList();

        return produtos.stream().filter(e -> e.getCategoria().equals(categoria)).collect(Collectors.toList());

    }

    public ProdutosDTO getById(Long id){

        List<ProdutosDTO> produtos = getList();
        Optional<ProdutosDTO> produtoOptional = produtos.stream().filter(e -> e.getId().equals(id)).findFirst();

        return produtoOptional.orElse(null);
    }

    private void saveFile(List<ProdutosDTO> produtos) {

        try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(FILE)));
            mapper.writeValue(out, produtos);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
