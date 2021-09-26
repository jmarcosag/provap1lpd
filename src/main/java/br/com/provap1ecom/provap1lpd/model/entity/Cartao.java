package br.com.provap1ecom.provap1lpd.model.entity;

import java.time.LocalDateTime;

public class Cartao {

        private Integer id;
        private LocalDateTime dataCriacao;
        private Boolean excluido;
        private TipoCartao tipoCartao;

        public Integer getId() {
        return id;
    }

        public void setId(Integer id) {
        this.id = id;
    }

        public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

        public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

        public Boolean getExcluido() {
        return excluido;
    }

        public void setExcluido(Boolean excluido) {
        this.excluido = excluido;
    }

        public TipoCartao getTipoCartao() {
        return tipoCartao;
    }

        public void setTipoCartao(TipoCartao tipoCartao) {
        this.tipoCartao = tipoCartao;
    }
}
