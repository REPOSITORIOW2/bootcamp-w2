package com.meli.aula10.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.meli.aula10.domain.Produto;
import com.meli.aula10.domain.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

@Repository
public class ProdutoRepository {
    private static final String USUARIOS_JSON_FILE = "produtos.json";

    private File getJson(String fileName) throws FileNotFoundException {
        File file = null;
        file = ResourceUtils.getFile("classpath:" + fileName);
        return file;
    }

    private List<Produto> getProdutos() {
        List<Produto> produtos = null;
        try {
            File file = this.getJson(USUARIOS_JSON_FILE);
            ObjectMapper mapper = new ObjectMapper();
            TypeReference<List<Produto>> typeRef = new TypeReference<>() {
            };
            produtos = mapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return produtos;
    }

    public Produto getById(int id){
        List<Produto> novaLista = findAll();
        var produtoOpt = novaLista.stream().filter(p -> p.getId() == id).findFirst();
        if(produtoOpt.isPresent())
            return produtoOpt.get();
        return null;
    }

    public List<Produto> findAll() {
        return this.getProdutos();
    }

    public void addProduto(Produto p){
        List<Produto> novaLista = findAll();
        novaLista.add(p);
        try {
            File file = this.getJson(USUARIOS_JSON_FILE);
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(file, novaLista);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void removeProduto(int idProduto){
        List<Produto> novaLista = findAll();
        Produto produtoImportado = getById(idProduto);
        novaLista.remove(produtoImportado);
        try {
            File file = this.getJson(USUARIOS_JSON_FILE);
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(file, novaLista);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void editProduto(int id, Produto p){
        List<Produto> novaLista = findAll();
        Produto produtoImportado = getById(id);
        produtoImportado.setNome(p.getNome());
        produtoImportado.setCategorias(p.getCategorias());
        produtoImportado.setValor(p.getValor());
        produtoImportado.setQuantidade(p.getQuantidade());
        try {
            File file = this.getJson(USUARIOS_JSON_FILE);
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(file, novaLista);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
