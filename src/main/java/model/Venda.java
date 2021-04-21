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
public class Venda {

    private static int qtdTotalVendas;
    private int idVenda;
    private int prodId;
    private int clienteId;
    private String clienteCpf;
    private int prodQtd;
    private double valorUniProd;
    private double valorTotalProd;
    private Date dataVenda;

    public Venda() {

        qtdTotalVendas++;
        this.idVenda = qtdTotalVendas;
    }

    public Venda(int prodId, int clienteId, String clienteCpf, int prodQtd, double valorUniProd, double valorTotalProd, Date dataVenda) {

        qtdTotalVendas++;
        this.idVenda = qtdTotalVendas;
        this.prodId = prodId;
        this.clienteId = clienteId;
        this.clienteCpf = clienteCpf;
        this.prodQtd = prodQtd;
        this.valorUniProd = valorUniProd;
        this.valorTotalProd = (prodQtd * valorUniProd);
        this.dataVenda = dataVenda;

    }

    public Venda(int idVenda, int prodId, int clienteId, String clienteCpf, int prodQtd, double valorUniProd, double valorTotalProd, Date dataVenda) {

        this.idVenda = idVenda;
        this.prodId = prodId;
        this.clienteId = clienteId;
        this.clienteCpf = clienteCpf;
        this.prodQtd = prodQtd;
        this.valorUniProd = valorUniProd;
        this.valorTotalProd = (prodQtd * valorUniProd);
        this.dataVenda = dataVenda;

    }

    public static int getQtdTotalVendas() {
        return qtdTotalVendas;
    }

    public static void setQtdTotalVendas(int qtdTotalVendas) {
        Venda.qtdTotalVendas = qtdTotalVendas;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public String getClienteCpfNumeros() {
        return clienteCpf.replace(".", "").replace("-", "");
    }

    public void setClienteCpf(String clienteCpf) {
        this.clienteCpf = clienteCpf;
    }

    public int getProdQtd() {
        return prodQtd;
    }

    public void setProdQtd(int prodQtd) {
        this.prodQtd = prodQtd;
    }

    public double getValorUniProd() {
        return valorUniProd;
    }

    public void setValorUniProd(double valorUniProd) {
        this.valorUniProd = valorUniProd;
    }

    public double getValorTotalProd() {
        return valorTotalProd;
    }

    public void setValorTotalProd(double valorTotalProd) {
        this.valorTotalProd = valorTotalProd;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

}
