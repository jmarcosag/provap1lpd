package br.com.provap1ecom.provap1lpd.model.repository;

import br.com.provap1ecom.provap1lpd.model.entity.Categoria;
import br.com.provap1ecom.provap1lpd.model.entity.Produto;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;


public class ProdutoRepository {
    private JdbcTemplate jdbcTemplate;

    public ProdutoRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Produto cadastrar(Produto produto) throws Exception {
        String sql = "INSERT INTO produto(id, nome, descricao, fotoUrl, dataCadastro, dataUltimaAtualizacao, valorUnitario) VALUES (?, ?, ?, ?, ?, ?, ?)";
        int insert = jdbcTemplate.update(sql,
                produto.getId(),
                produto.getNome(),
                produto.getDescricao(),
                produto.getFotoUrl(),
                produto.getDataCadastro(),
                produto.getDataUltimaAtualizacao(),
                produto.getValorUnitario());

        if (insert == 1) {
            return produto;
        }

        throw new Exception("Erro ao fazer o cadastro");
    }

    public List<Produto> buscar(Integer id) throws Exception {
        String sql = "SELECT * FROM produto WHERE id = ?";
        List<Produto> search = (List<Produto>) jdbcTemplate.query(sql, new ProdutoMapper(), id);

        if (search.size() > 0) {
            return (List<Produto>) jdbcTemplate.query(sql, new Object[]{id}, new ProdutoMapper());
        }
        throw new Exception("Produto não encontrado");
    }

    public List<Produto> buscarPorNomeEOuValorMaxMin(String nome, Float valorMinimo, Float valorMaximo) {
        if (nome != null && valorMinimo == null && valorMaximo == null) {
            return jdbcTemplate.query("SELECT * FROM PRODUTO WHERE nome = ?", new ProdutoMapper(), nome);
        }
        if (nome == null && valorMinimo != null && valorMaximo != null) {
            return jdbcTemplate.query("SELECT * FROM PRODUTO WHERE valorUnitario >= ? AND valorUnitario <= ?", new ProdutoMapper(), valorMinimo, valorMaximo);
        }
        if (nome != null && valorMinimo != null && valorMaximo != null) {
            return jdbcTemplate.query("SELECT * FROM PRODUTO WHERE nome = ? AND valorUnitario >= ? AND valorUnitario <= ?", new ProdutoMapper(), nome, valorMinimo, valorMaximo);
        }
        return null;
    }
}