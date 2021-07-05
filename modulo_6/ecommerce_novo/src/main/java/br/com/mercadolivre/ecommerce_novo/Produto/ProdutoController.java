package br.com.mercadolivre.ecommerce_novo.Produto;

import br.com.mercadolivre.ecommerce_novo.Usuario.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    private CreateServiceProduto createServiceProduto;
    private RemoveServiceProduto removeServiceProduto;
    private MostraServiceProduto mostraServiceProduto;
    private AlteraServiceProduto alteraServiceProduto;


    @Autowired
    public ProdutoController(CreateServiceProduto createServiceProduto,
                             RemoveServiceProduto removeServiceProduto,
                             MostraServiceProduto mostraServiceProduto,
                             AlteraServiceProduto alteraServiceProduto) {
        this.createServiceProduto = createServiceProduto;
        this.removeServiceProduto = removeServiceProduto;
        this.mostraServiceProduto = mostraServiceProduto;
        this.alteraServiceProduto = alteraServiceProduto;
    }

    @PostMapping
    public ResponseEntity<Produto> createProduto(@RequestBody ProdutoDTO produtoDTO, @RequestHeader("level") String level) {
        return new ResponseEntity<>(createServiceProduto.execute(Level.valueOf(level), produtoDTO), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> removeProduto(@PathVariable Long id, @RequestHeader("level") String level) {
        String message = removeServiceProduto.execute(Level.valueOf(level), id);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProdutoDTO> mostraProduto(@PathVariable Long id){
        return new ResponseEntity<>(ProdutoDTO.converte(mostraServiceProduto.execute(id)), HttpStatus.OK);
    }


    @GetMapping()
    public ResponseEntity<List<ProdutoDTO>> mostraProdutos(){
        return new ResponseEntity<>(ProdutoDTO.converte(mostraServiceProduto.execute()), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> alteraProduto(@PathVariable Long id, @RequestBody ProdutoDTO produtoDTO,
                                                    @RequestHeader("level") String level){
        return new ResponseEntity<>(alteraServiceProduto.execute(id, produtoDTO, Level.valueOf(level)), HttpStatus.OK);
    }

//    @GetMapping
//    public List<Produto> readProduto(@RequestHeader("level") Level level) {
//        return
//
//    }
}
