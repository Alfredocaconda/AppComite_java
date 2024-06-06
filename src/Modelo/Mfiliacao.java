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
public class Mfiliacao {

    private int id_filiacao;
    private String nome_filiacao;
    private MEndereco endereco;
    private String imagem;
    private MMembro membro;

    public String getNome_filiacao() {
        return nome_filiacao;
    }

    public void setNome_filiacao(String nome_filiacao) {
        this.nome_filiacao = nome_filiacao;
    }

    public int getId_filiacao() {
        return id_filiacao;
    }

    public void setId_filiacao(int id_filiacao) {
        this.id_filiacao = id_filiacao;
    }

    public MEndereco getEndereco() {
        return endereco;
    }

    public void setEndereco(MEndereco endereco) {
        this.endereco = endereco;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public MMembro getMembro() {
        return membro;
    }

    public void setMembro(MMembro membro) {
        this.membro = membro;
    }
public void mensagem(String sms){
    JOptionPane.showMessageDialog(null, sms);
}
}
