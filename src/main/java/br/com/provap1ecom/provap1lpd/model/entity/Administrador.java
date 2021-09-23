package br.com.provap1ecom.provap1lpd.model.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Administrador extends Usuario {
    private List<Categoria> categoriaList;

    public Administrador(Integer id, String nomeCompleto, String email, String senha, LocalDate dataCadastro, LocalTime horaCadastro, LocalDate dataUltimaAtualizacao, String urlFoto) {
        super(id, nomeCompleto, email, senha, dataCadastro, horaCadastro, dataUltimaAtualizacao, urlFoto);
    }

    public List<Categoria> getCategoriaList() {
        return categoriaList;
    }

    public void setCategoriaList(List<Categoria> categoriaList) {
        this.categoriaList = categoriaList;
    }
}
