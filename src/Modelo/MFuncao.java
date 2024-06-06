
package Modelo;

import javax.swing.JOptionPane;


public class MFuncao {
    private int id_funcao;
    private String nome_funcao;
    private String descricao_funcao;

    public int getId_funcao() {
        return id_funcao;
    }

    public void setId_funcao(int id_funcao) {
        this.id_funcao = id_funcao;
    }

    public String getNome_funcao() {
        return nome_funcao;
    }

    public void setNome_funcao(String nome_funcao) {
        this.nome_funcao = nome_funcao;
    }

    public String getDescricao_funcao() {
        return descricao_funcao;
    }

    public void setDescricao_funcao(String descricao_funcao) {
        this.descricao_funcao = descricao_funcao;
    }
@Override
public String toString(){
    return getNome_funcao();
}
public void mensagem(String sms){
    JOptionPane.showMessageDialog(null, sms);
}
}
