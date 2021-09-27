package br.com.provap1ecom.provap1lpd.controller;

import br.com.provap1ecom.provap1lpd.model.entity.Categoria;
import br.com.provap1ecom.provap1lpd.model.entity.Produto;
import br.com.provap1ecom.provap1lpd.model.repository.CategoriaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    private CategoriaRepository categoriaRepository;

    public CategoriaController(JdbcTemplate jdbcTemplate) {
        categoriaRepository = new CategoriaRepository(jdbcTemplate);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public List<Categoria> buscar(@PathVariable Integer id) throws Exception {
        return categoriaRepository.buscar(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}/produto")
    public List<Produto> buscarProdutoPorNomeEOuValorMaxMin(@PathVariable int id, @RequestParam(required = false) String nome, Float valorMinimo, Float valorMaximo) {
        return categoriaRepository.buscarProdutoPorNomeEOuValorMaxMin(id, nome, valorMinimo, valorMaximo);
    }
}
