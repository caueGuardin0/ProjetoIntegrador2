/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author caueg
 */
public class Produto {
    
    private String marca_prod;
    private String modelo_prod;
    private String estilo_prod;
    private char modalidade_prod;
    private String cor_prod;
    private int tamanho_prod;
    private int preco_prod;
    private int qtd_prod;
    
    public Produto(){}
    
    public Produto(String marca_prod, String modelo_prod, String estilo_prod, char modalidade_prod, String cor_prod, int tamanho_prod, int preco_prod, int qtd_prod){   
        this.marca_prod = marca_prod;
        this.modelo_prod = modelo_prod;
        this.estilo_prod = estilo_prod;
        this.modalidade_prod = modalidade_prod;
        this.cor_prod = cor_prod;
        this.tamanho_prod = tamanho_prod;
        this.preco_prod = preco_prod;
        this.qtd_prod = qtd_prod;   
    }
    
    public String getMarca_prod(){
        return marca_prod;
    }
    
    public void setMarca_prod(String marca_prod){
        this.marca_prod = marca_prod;
    }
    
    public String getModelo_prod(){
        return modelo_prod;
    }
    
    public void setModelo_prod(String modelo_prod){
        this.modelo_prod = modelo_prod;
    }
    
    public String getEstilo_prod(){
        return estilo_prod;
    }
    
    public void setEstilo_prod(String estilo_prod){
        this.estilo_prod = estilo_prod;
    }
    
    public char getModelidade_prod(){
        return modalidade_prod;
    }
    
    public void setModalidade_prod(char modalidade_prod){
        this.modalidade_prod = modalidade_prod;
    }
    
    public String getCor_prod(){
        return cor_prod;
    }
    
    public void setCor_prod(String cor_prod){
        this.cor_prod = cor_prod;
    }
    
    public int getTamanho_prod(){
        return tamanho_prod;
    }
    
    public void setTamanho_prod(int tamanho_prod){
        this.tamanho_prod = tamanho_prod;
    }
    
    public int getPreco_prod(){
        return preco_prod;
    }
    
    public void setPreco_prod(int preco_prod){
        this.preco_prod = preco_prod;
    }
    
    public int getQtd_prod(){
        return qtd_prod;
    }
    
    public void setQtd_prod(int qtd_prod){
        this.qtd_prod = qtd_prod;
    }
    
}
