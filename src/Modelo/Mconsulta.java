/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author ALFREDO CACONDA
 */
public class Mconsulta {

    private int id_militante;
    private String nome_militante;
    private String genero_militante;
    private String data_nasc_militante;
    private String bairro;
    private String zona;
    private String rua;
    private String nome_partido_militante;
    private String data_ingre_militante;
    private String telefone_militante;
    private String email_militante;
    private String nro_bi_militante;
    private String foto;
    private String tipo_nivel;

    public int getId_militante() {
        return id_militante;
    }

    public void setId_militante(int id_militante) {
        this.id_militante = id_militante;
    }

    public String getNome_militante() {
        return nome_militante;
    }

    public void setNome_militante(String nome_militante) {
        this.nome_militante = nome_militante;
    }

    public String getGenero_militante() {
        return genero_militante;
    }

    public void setGenero_militante(String genero_militante) {
        this.genero_militante = genero_militante;
    }

    public String getData_nasc_militante() {
        return data_nasc_militante;
    }

    public void setData_nasc_militante(String data_nasc_militante) {
        this.data_nasc_militante = data_nasc_militante;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNome_partido_militante() {
        return nome_partido_militante;
    }

    public void setNome_partido_militante(String nome_partido_militante) {
        this.nome_partido_militante = nome_partido_militante;
    }

    public String getData_ingre_militante() {
        return data_ingre_militante;
    }

    public void setData_ingre_militante(String data_ingre_militante) {
        this.data_ingre_militante = data_ingre_militante;
    }

    public String getTelefone_militante() {
        return telefone_militante;
    }

    public void setTelefone_militante(String telefone_militante) {
        this.telefone_militante = telefone_militante;
    }

    public String getEmail_militante() {
        return email_militante;
    }

    public void setEmail_militante(String email_militante) {
        this.email_militante = email_militante;
    }

    public String getNro_bi_militante() {
        return nro_bi_militante;
    }

    public void setNro_bi_militante(String nro_bi_militante) {
        this.nro_bi_militante = nro_bi_militante;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getTipo_nivel() {
        return tipo_nivel;
    }

    public void setTipo_nivel(String tipo_nivel) {
        this.tipo_nivel = tipo_nivel;
    }
    @Override
    public String toString(){
        return getNome_militante();
    }
}
