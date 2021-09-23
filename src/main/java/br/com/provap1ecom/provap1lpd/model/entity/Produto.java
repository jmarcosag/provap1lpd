package br.com.provap1ecom.provap1lpd.model.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Produto {
    private Integer id;
    private String nome;
    private String descricao;
    private String fotoUrl;
    private LocalDate dataCadastro;
    private LocalTime horaCadastro;
    private LocalDate dataHoraUltimaAtualizacao;
    private Float valorUnitario;
    private List<Categoria> categoriaList;
    private List<PromocaoItem> PromocaoItemList;
    private Administrador cadastrante;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFotoUrl() {
        return fotoUrl;
    }

    public void setFotoUrl(String fotoUrl) {
        this.fotoUrl = fotoUrl;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalTime getHoraCadastro() {
        return horaCadastro;
    }

    public void setHoraCadastro(LocalTime horaCadastro) {
        this.horaCadastro = horaCadastro;
    }

    public LocalDate getDataHoraUltimaAtualizacao() {
        return dataHoraUltimaAtualizacao;
    }

    public void setDataHoraUltimaAtualizacao(LocalDate dataHoraUltimaAtualizacao) {
        this.dataHoraUltimaAtualizacao = dataHoraUltimaAtualizacao;
    }

    public Float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public List<Categoria> getCategoriaList() {
        return categoriaList;
    }

    public void setCategoriaList(List<Categoria> categoriaList) {
        this.categoriaList = categoriaList;
    }

    public List<PromocaoItem> getPromocaoItemList() {
        return PromocaoItemList;
    }

    public void setPromocaoItemList(List<PromocaoItem> promocaoItemList) {
        PromocaoItemList = promocaoItemList;
    }

    public Administrador getCadastrante() {
        return cadastrante;
    }

    public void setCadastrante(Administrador cadastrante) {
        this.cadastrante = cadastrante;
    }
}
