package br.com.provap1ecom.provap1lpd.model.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Pedido {
    private Integer id;
    private LocalDate dataCadastro;
    private Float valorTotal;
    private List<ItemPedido> listaItemPedido;
    private PedidoStatus pedidoStatus;
    private List<Pagamento> listaPagamento;
    private Cliente cliente;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<ItemPedido> getlistaItemPedido() {
        return listaItemPedido;
    }

    public PedidoStatus getPedidoStatus() {
        return pedidoStatus;
    }

    public void setPedidoStatus(PedidoStatus pedidoStatus) {
        this.pedidoStatus = pedidoStatus;
    }

    public List<Pagamento> getlistaPagamento() {
        return listaPagamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
