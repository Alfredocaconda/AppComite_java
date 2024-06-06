/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Alfredo Caconda
 */
public class VMembro {
    
    private int id_membro;
    private String nome_militante;
    private String nome_funcao;
    private String data;

    public int getId_membro() {
        return id_membro;
    }

    public void setId_membro(int id_membro) {
        this.id_membro = id_membro;
    }

    public String getNome_militante() {
        return nome_militante;
    }

    public void setNome_militante(String nome_militante) {
        this.nome_militante = nome_militante;
    }

    public String getNome_funcao() {
        return nome_funcao;
    }

    public void setNome_funcao(String nome_funcao) {
        this.nome_funcao = nome_funcao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    
}
