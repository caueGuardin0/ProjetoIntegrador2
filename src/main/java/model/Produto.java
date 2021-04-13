/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author caue.guardino
 */
public class Produto {

    private static int qtdProdutosCadastrados;
    private int idProd;
    private String marcaProd;
    private String modeloProd;
    private char modalidadeProd;
    private String corProd;
    private int tamanhoProd;
    private double precoProd;
    private int qtdProd;

    public Produto() {

        qtdProdutosCadastrados++;
        this.idProd = qtdProdutosCadastrados;

    }

    public Produto(String marcaProd, String modeloProd, char modalidadeProd, String corProd, int tamanhoProd, double precoProd, int qtdProd) {

        qtdProdutosCadastrados++;
        this.idProd = qtdProdutosCadastrados;
        this.marcaProd = marcaProd;
        this.modeloProd = modeloProd;
        this.modalidadeProd = modalidadeProd;
        this.corProd = corProd;
        this.tamanhoProd = tamanhoProd;
        this.precoProd = precoProd;
        this.qtdProd = qtdProd;

    }

    public Produto(int idProd, String marcaProd, String modeloProd, char modalidadeProd, String corProd, int tamanhoProd, double precoProd, int qtdProd) {

        this.idProd = idProd;
        this.marcaProd = marcaProd;
        this.modeloProd = modeloProd;
        this.modalidadeProd = modalidadeProd;
        this.corProd = corProd;
        this.tamanhoProd = tamanhoProd;
        this.precoProd = precoProd;
        this.qtdProd = qtdProd;
        
    }
    
     public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public String getMarcaProd() {
        return marcaProd;
    }

    public void setMarcaProd(String marcaProd) {
        this.marcaProd = marcaProd;
    }

    public String getModeloProd() {
        return modeloProd;
    }

    public void setModeloProd(String modeloProd) {
        this.modeloProd = modeloProd;
    }
    
    public char getModalidadeProd(){
        return modalidadeProd;
    }
    
    public void setModalidadeProd(char modalidadeProd){
        this.modalidadeProd = modalidadeProd;
    }

    public String getCorProd() {
        return corProd;
    }

    public void setCorProd(String corProd) {
        this.corProd = corProd;
    }

    public int getTamanhoProd() {
        return tamanhoProd;
    }

    public void setTamanhoProd(int tamanhoProd) {
        this.tamanhoProd = tamanhoProd;
    }

    public double getPrecoProd() {
        return precoProd;
    }

    public void setPrecoProd(double precoProd) {
        this.precoProd = precoProd;
    }

    public int getQtdProd() {
        return qtdProd;
    }

    public void setQuantidade(int qtdProd) {
        this.qtdProd = qtdProd;
    }

}
    
