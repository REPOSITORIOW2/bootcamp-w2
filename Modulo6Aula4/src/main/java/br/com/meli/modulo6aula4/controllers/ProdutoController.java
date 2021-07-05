package br.com.meli.modulo6aula4.controllers;

import br.com.meli.modulo6aula4.dtos.UsuarioProdutoDTO;
import br.com.meli.modulo6aula4.dtos.ProdutosDTO;
import br.com.meli.modulo6aula4.dtos.UsuarioDTO;
import br.com.meli.modulo6aula4.enums.UsuarioEnum;
import br.com.meli.modulo6aula4.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/api/produto")
@RestController

public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @PostMapping(value = "/cadastrar")
    public ResponseEntity<ProdutosDTO> CadastrarProduto(@RequestBody UsuarioProdutoDTO usuarioProdutoDTO) {

        ProdutosDTO produtosDTO = produtoService.adicionaProduto(usuarioProdutoDTO.getProduto(), usuarioProdutoDTO.getUsuario());

        if (produtosDTO == null) {
            return ResponseEntity.status(401).build();
        }
        return ResponseEntity.ok(produtosDTO);
    }

    @GetMapping(value = "/listar")
    public ResponseEntity<List<ProdutosDTO>> ListarProdutos() {

        List<ProdutosDTO> produtosDTO = produtoService.getAll();

        return ResponseEntity.ok(produtosDTO);
    }

    @DeleteMapping(value = "deletar/{id}")
    public ResponseEntity DeletarProduto(@PathVariable(value = "id") Long id, @RequestBody UsuarioDTO usuarioDTO) {
        if (usuarioDTO.getTipo().equals(UsuarioEnum.ADMINISTRADOR)) {
            produtoService.deletarProduto(id);
            return ResponseEntity.status(202).build();

        }
        return ResponseEntity.status(401).build();
    }

    @PutMapping(value = "atualizar/{id}")
    public ResponseEntity<ProdutosDTO> AtualizarProduto(@PathVariable(value = "id") Long id, @RequestBody UsuarioProdutoDTO usuarioProdutoDTO) {
        if (usuarioProdutoDTO.getUsuario().getTipo().equals(UsuarioEnum.ADMINISTRADOR)) {
            return ResponseEntity.ok(produtoService.atualizarProduto(usuarioProdutoDTO.getProduto()));
        }
        return ResponseEntity.status(401).build();
    }
}
