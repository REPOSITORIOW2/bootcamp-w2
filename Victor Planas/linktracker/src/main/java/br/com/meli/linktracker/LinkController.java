package br.com.meli.linktracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;

@RestController
@RequestMapping("/")
public class LinkController {

    @Autowired
    LinkRepository repository;


    @PostMapping("/url/{addSenha}/{senha}")
    public String returnLinkIdJson(@Valid @RequestBody LinkDTO url, @PathVariable boolean addSenha, @PathVariable String senha) throws LinkErrorException {
        if (addSenha) {
            repository.setSenha(senha);
        }
        LinkDTO link = new LinkDTO(url.getUrl());
        repository.adicionaBD(link);
        return link.toString();

    }

    @GetMapping("/link/{linkId}/{senha}")
    public String redirecionaUrl(@PathVariable int linkId, @PathVariable String senha) {
        if (repository.getSenha() == null) throw new NoPasswordException("Nenhuma senha foi definida");
        if (!repository.linkEhValido(linkId)) throw new LinkErrorException("Url inválida");
        if (senha == null) throw new NoPasswordException("Senha Inválida");
        if (!repository.getSenha().equals(senha)){
            throw new NoPasswordException("Senha errada");
        }
        LinkDTO linkAtual = repository.getLinkByID(linkId);
        linkAtual.usaRedirecionamento();
        return linkAtual.toString();
    }

    @GetMapping("/metrics/{linkId}")
    public int numeroDeRedirecionamentos(@PathVariable int linkId) {
        return repository.getLinkByID(linkId).getNumeroRedirecionamento();
    }

    @DeleteMapping("/invalidate/{linkId}")
    public LinkDTO invalidateLink(@PathVariable int linkId) {
        return repository.removeLinkDTO(linkId);
    }

    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "URL inválida")
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public LinkErrorException urlInvalida() {
        return new LinkErrorException("URL inválida!");
    }

}
