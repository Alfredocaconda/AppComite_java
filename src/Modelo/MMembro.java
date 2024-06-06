/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Alfredo Caconda
 */
public class MMembro {
     private int id_militante;
    private MFuncao funcao;
    private MMilitante militante;
    private Mnivel nivel;
    private String data_de_inicio;

    public int getId_militante() {
        return id_militante;
    }
    public void mensagem(String sms){
        JOptionPane.showMessageDialog(null, sms);
    }

    public void setId_militante(int id_militante) {
        this.id_militante = id_militante;
    }

    public MFuncao getFuncao() {
        return funcao;
    }

    public void setFuncao(MFuncao funcao) {
        this.funcao = funcao;
    }

    public MMilitante getMilitante() {
        return militante;
    }

    public void setMilitante(MMilitante militante) {
        this.militante = militante;
    }

    public Mnivel getNivel() {
        return nivel;
    }

    public void setNivel(Mnivel nivel) {
        this.nivel = nivel;
    }

    public String getData_de_inicio() {
        return data_de_inicio;
    }

    public void setData_de_inicio(String data_de_inicio) {
        this.data_de_inicio = data_de_inicio;
    }
    
    
    
}
