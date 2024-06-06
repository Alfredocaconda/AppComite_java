/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author ALFREDO CACONDA
 */
public class MMilitante {
    private int id_militante;
    private String nome;
    private String genero;
    private String data_nasc;
    private MEndereco endereco;
    private String data_ingresso;
    private String telefone;
    private String emal;
    private String bi;
    private String foto;
    private Mnivel id_nivel;

    public MEndereco getEndereco() {
        return endereco;
    }

    public void setEndereco(MEndereco endereco) {
        this.endereco = endereco;
    }

    public Mnivel getId_nivel() {
        return id_nivel;
    }

    public void setId_nivel(Mnivel id_nivel) {
        this.id_nivel = id_nivel;
    }
    public int getId_militante() {
        return id_militante;
    }

    public void setId_militante(int id_militante) {
        this.id_militante = id_militante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getData_ingresso() {
        return data_ingresso;
    }

    public void setData_ingresso(String data_ingresso) {
        this.data_ingresso = data_ingresso;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmal() {
        return emal;
    }

    public void setEmal(String emal) {
        this.emal = emal;
    }

    public String getBi() {
        return bi;
    }

    public void setBi(String bi) {
        this.bi = bi;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    
    public void mensagem(String sms){
        JOptionPane.showMessageDialog(null, sms);
    }
    @Override
       public String toString(){
           return getNome();
       }
}
