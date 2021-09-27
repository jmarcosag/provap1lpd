package br.com.provap1ecom.provap1lpd.model.repository;

import br.com.provap1ecom.provap1lpd.model.entity.Produto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class ProdutoMapper implements RowMapper<Produto> {

    @Override
    public Produto mapRow(ResultSet resultSet, int i) throws SQLException {
        Produto produto = new Produto();
        produto.setId(resultSet.getInt("id"));
        produto.setNome(resultSet.getString("nome"));
        produto.setDescricao(resultSet.getString("descricao"));
        produto.setFotoUrl(resultSet.getString("fotourl"));
        produto.setDataCadastro(LocalDate.from(resultSet.getTimestamp("datacadastro").toLocalDateTime()));
        produto.setDataUltimaAtualizacao(LocalDate.from(resultSet.getTimestamp("dataultimaatualizacao").toLocalDateTime()));
        produto.setValorUnitario(resultSet.getFloat("valorunitario"));

        return produto;
    }
}
