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
    private int quantidade_prod;
    
    public Produto(){}
    
    public Produto(String marca_prod, String modelo_prod, String estilo_prod, char modalidade_prod, String cor_prod, int tamanho_prod, int preco_prod, int quantidade_prod){   
        this.marca_prod = marca_prod;
        this.modelo_prod = modelo_prod;
        this.estilo_prod = estilo_prod;
        this.modalidade_prod = modalidade_prod;
        this.cor_prod = cor_prod;
        this.tamanho_prod = tamanho_prod;
        this.preco_prod = preco_prod;
        this.quantidade_prod = quantidade_prod;   
    }
    
}
