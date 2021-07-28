package br.com.meli.linktracker;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Optional;

@Service
public class LinkRepository {
    private HashMap<Integer,LinkDTO> bd = new HashMap<>();
    private int contador = 0;
    private String senha = "";

    public HashMap<Integer, LinkDTO> getBd() {
        return bd;
    }

    public HashMap<Integer,LinkDTO> adicionaBD(LinkDTO link){
        bd.put(contador,link);
        contador++;
        return this.bd;
    }

    public LinkDTO getLinkByID(int id){
        return bd.get(id);
    }

    public LinkDTO removeLinkDTO(int id){
        return bd.remove(id);
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean linkEhValido(int linkID){
        return bd.containsKey(linkID);
    }
}
