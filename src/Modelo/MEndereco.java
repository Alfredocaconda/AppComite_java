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
public class MEndereco {
    private int id_endereco;
    private String zona;
    private String bairro;
    private String rua;

    public int getId_endereco() {
        return id_endereco;
    }

    public void setId_endereco(int id_endereco) {
        this.id_endereco = id_endereco;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
     @Override
       public String toString(){
           return getZona()+"/"+getBairro()+"/"+getRua();
       }
    public void mensagem(String sms){
        JOptionPane.showMessageDialog(null, sms);
    }
    
}
