//package br.com.provap1ecom.provap1lpd.model.repository;
//
//import br.com.provap1ecom.provap1lpd.model.entity.PromocaoItem;
//import org.springframework.jdbc.core.RowMapper;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.time.LocalDate;
//
//public class PromocaoItemMapper implements RowMapper<PromocaoItem> {
//
//    @Override
//    public PromocaoItem mapRow(ResultSet resultSet, int i) throws SQLException {
//        PromocaoItem promocaoItem = new PromocaoItem();
//        promocaoItem.setId(resultSet.getInt("id"));
//        promocaoItem.setValorPromocao(resultSet.getFloat("valorpromocao"));
//        promocaoItem.setDataCadastro(LocalDate.from(resultSet.getTimestamp("datacadastro").toLocalDateTime()));
//        promocaoItem.setDataUltimaAtualizacao(LocalDate.from(resultSet.getTimestamp("dataultimaatualizacao").toLocalDateTime()));
//        promocaoItem.setProdutoid(resultSet.getInt("produto"));
//        promocaoItem.setTabelaPromocao(resultSet.getInt("promocaoid"));
//
//        return promocaoItem;
//    }
//}
