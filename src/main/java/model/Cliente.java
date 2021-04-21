/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author caue.guardino
 */
public class Cliente {

    private static int qtdClientesCriados;
    private int idCli;
    private String nomeCli;
    private String cpfCli;
    private int cepEndCli;
    private int numEndCli;
    private String compleEndCli;
    private String cidEndCli;
    private int telCli;
    private String emailCli;
    private char sexoCli;
    private String estadoCivilCli;
    private int dataNascCli;

    public Cliente() {

        qtdClientesCriados++;
        this.idCli = qtdClientesCriados;

    }

    public Cliente(String nomeCli, String cpfCli, int cepEndCli, int numEndCli, String compleEndCli, String cidEndCli, int telCli, String emailCli, char sexoCli, String estadoCivilCli, int dataNascCli) {
       
        qtdClientesCriados++;
        this.idCli = qtdClientesCriados;
        this.nomeCli = nomeCli;
        this.cpfCli = cpfCli;
        this.cepEndCli = cepEndCli;
        this.numEndCli = numEndCli;
        this.compleEndCli = compleEndCli;
        this.cidEndCli = cidEndCli;
        this.telCli = telCli;
        this.emailCli = emailCli;
        this.sexoCli = sexoCli;
        this.estadoCivilCli = estadoCivilCli;
        this.dataNascCli = dataNascCli;

    }

    public Cliente(int idCli, String nomeCli, String cpfCli, int cepEndCli, int numEndCli, String compleEndCli, String cidEndCli, int telCli, String emailCli, char sexoCli, String estadoCivilCli, int dataNascCli) {
        this.idCli = idCli;
        this.nomeCli = nomeCli;
        this.cpfCli = cpfCli;
        this.cepEndCli = cepEndCli;
        this.numEndCli = numEndCli;
        this.compleEndCli = compleEndCli;
        this.cidEndCli = cidEndCli;
        this.telCli = telCli;
        this.emailCli = emailCli;
        this.sexoCli = sexoCli;
        this.estadoCivilCli = estadoCivilCli;
        this.dataNascCli = dataNascCli;
    }

    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public String getNomeCli() {
        return nomeCli;
    }

    public void setNomeCli(String nomeCli) {
        this.nomeCli = nomeCli;
    }

    public String getCpfSomenteNumCli() {
        
        return cpfCli.replace(".", "").replace("-", "");
    }

    public void setCpfCli(String cpfCli) {
        this.cpfCli = cpfCli;
    }

    public int getCepEndCli() {
        return cepEndCli;
    }

    public void setCepEndCli(int cepEndCli) {
        this.cepEndCli = cepEndCli;
    }

    public int getNumEndCli() {
        return numEndCli;
    }

    public void setNumEndCli(int numEndCli) {
        this.numEndCli = numEndCli;
    }

    public String getCompleEndCli() {
        return compleEndCli;
    }

    public void setCompleEndCli(String compleEndCli) {
        this.compleEndCli = compleEndCli;
    }

    public String getCidEndCli() {
        return cidEndCli;
    }

    public void setCidEndCli(String cidEndCli) {
        this.cidEndCli = cidEndCli;
    }

    public int getTelCli() {
        return telCli;
    }

    public void setTelCli(int telCli) {
        this.telCli = telCli;
    }

    public String getEmailCli() {
        return emailCli;
    }

    public void setEmailCli(String emailCli) {
        this.emailCli = emailCli;
    }

    public char getSexoCli() {
        return sexoCli;
    }

    public void setSexoCli(char sexoCli) {
        this.sexoCli = sexoCli;
    }

    public String getEstadoCivilCli() {
        return estadoCivilCli;
    }

    public void setEstadoCivilCli(String estadoCivilCli) {
        this.estadoCivilCli = estadoCivilCli;
    }

    public int getDataNescCli() {
        return dataNascCli;
    }

    public void setDataNascCli(int dataNascCli) {
        this.dataNascCli = dataNascCli;
    }
}
