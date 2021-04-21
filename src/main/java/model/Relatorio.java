/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author caue.guardino
 */
public class Relatorio {

    private static int qtdVendas;
    private int vendaId;
    private int produtoId;
    private String clienteCpf;
    private String clienteNome;
    private int produtoQtd;
    private double valorTotal;
    private Date dataVenda;

    public Relatorio() {
        qtdVendas++;
        this.vendaId = qtdVendas;
    }

    public Relatorio(int produtoId, String clienteCpf, String clienteNome, int produtoQtd, double valorTotal, Date dataVenda) {

        qtdVendas++;
        this.vendaId = qtdVendas;
        this.clienteCpf = clienteCpf;
        this.clienteNome = clienteNome;
        this.produtoQtd = produtoQtd;
        this.valorTotal = valorTotal;
        this.dataVenda = dataVenda;

    }

    public Relatorio(int vendaId, int produtoId, String clienteCpf, String clienteNome, int produtoQtd, double valorTotal, Date dataVenda) {
        
        this.vendaId = vendaId;
        this.clienteCpf = clienteCpf;
        this.clienteNome = clienteNome;
        this.produtoQtd = produtoQtd;
        this.valorTotal = valorTotal;
        this.dataVenda = dataVenda;
    }

    public int getVendaId() {
        return vendaId;
    }

    public void setVendaId(int vendaId) {
        this.vendaId = vendaId;
    }

    public int getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(int produtoId) {
        this.produtoId = produtoId;
    }

    public String getClienteCpfNumeros() {
        return clienteCpf.replace(".", "").replace("-", "");
    }

    public void setClienteCpf(String clienteCpf) {
        this.clienteCpf = clienteCpf;
    }

    public String getClienteNome() {
        return clienteNome;
    }

    public void setClienteNome(String clienteNome) {
        this.clienteNome = clienteNome;
    }

    public int getProdutoQtd() {
        return produtoQtd;
    }

    public void setProdutoQtd(int produtoQtd) {
        this.produtoQtd = produtoQtd;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }
    
    
}
