
/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author caueg
 */
public class Cliente {

    private int id_cli;
    private String nome_cli;
    private int cpf_cli;
    private int cepEnd_cli;
    private int numEnd_cli;
    private String compleEnd_cli;
    private String cidEnd_cli;
    private int tel_cli;
    private String email_cli;
    private char sexo_cli;
    private String estadoCivil_cli;
    private int dataNasc_cli;

    public Cliente() {
    }

    public Cliente(int id_cli, String nome_cli, int cpf_cli, int cepEnd_cli, int numEnd_cli, String compleEnd_cli, String cidEnd_cli, int tel_cli, String email_cli, char sexo_cli, String estadoCivil_cli, int dataNasc_cli) {
        this.id_cli = id_cli;
        this.nome_cli = nome_cli;
        this.cpf_cli = cpf_cli;
        this.cepEnd_cli = cepEnd_cli;
        this.numEnd_cli = numEnd_cli;
        this.compleEnd_cli = compleEnd_cli;
        this.cidEnd_cli = cidEnd_cli;
        this.tel_cli = tel_cli;
        this.email_cli = email_cli;
        this.sexo_cli = sexo_cli;
        this.estadoCivil_cli = estadoCivil_cli;
        this.dataNasc_cli = dataNasc_cli;
    }

    public int getId_cli() {
        return id_cli;
    }

    public void setId_cli(int id_cli) {
        this.id_cli = id_cli;
    }

    public String getNome_cli() {
        return nome_cli;
    }

    public void setNome_cli(String nome_cli) {
        this.nome_cli = nome_cli;
    }

    public int getCpf_cli() {
        return cpf_cli;
    }

    public void setCpf_cli(int cpf_cli) {
        this.cpf_cli = cpf_cli;
    }

    public int getCepEnd_cli() {
        return cepEnd_cli;
    }

    public void setCepEnd_cli(int cepEnd_cli) {
        this.cepEnd_cli = cepEnd_cli;
    }

    public int getNumEnd_cli() {
        return numEnd_cli;
    }

    public void setNumEnd_cli(int numEnd_cli) {
        this.numEnd_cli = numEnd_cli;
    }

    public String getCompleEnd_cli() {
        return compleEnd_cli;
    }

    public void setCompleEnd_cli(String compleEnd_cli) {
        this.compleEnd_cli = compleEnd_cli;
    }

    public String getCidEnd_cli() {
        return cidEnd_cli;
    }

    public void setCidEnd_cli(String cidEnd_cli) {
        this.cidEnd_cli = cidEnd_cli;
    }

    public int getTel_cli() {
        return tel_cli;
    }

    public void setTel_cli(int tel_cli) {
        this.tel_cli = tel_cli;
    }

    public String getEmail_cli() {
        return email_cli;
    }

    public void setEmail_cli(String email_cli) {
        this.email_cli = email_cli;
    }

    public char getSexo_cli() {
        return sexo_cli;
    }

    public void setSexo_cli(char sexo_cli) {
        this.sexo_cli = sexo_cli;
    }

    public String getEstadoCivil_cli() {
        return estadoCivil_cli;
    }

    public void setEstadoCivil_cli(String estadoCivil_cli) {
        this.estadoCivil_cli = estadoCivil_cli;
    }

    public int getDataNesc_cli() {
        return dataNasc_cli;
    }

    public void setDataNasc_cli(int dataNasc_cli) {
        this.dataNasc_cli = dataNasc_cli;
    }
}

