/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Conexao.conexao;
import Modelo.MMembro;
import Modelo.Mnivel;
import Modelo.VMembro;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ALFREDO CACONDA
 */
public class CMembro {

    private PreparedStatement ps;
    private ResultSet rs;
    conexao c = new conexao();

    public void salvar(MMembro m) {
        String sql = "insert into membro values (default,?,?,?)";
        try {
            ps = c.conectar().prepareStatement(sql);
            ps.setInt(1, m.getMilitante().getId_militante());
            ps.setInt(2, m.getFuncao().getId_funcao());
            ps.setString(3, m.getData_de_inicio());
            if (ps.executeUpdate() == 1) {
                c.mensagem("SUCESSO");
            } else {
                c.mensagem("ERRO");
            }
        } catch (Exception e) {
            c.mensagem(e.getMessage());
        }
    }
    public void actualizar(MMembro m) {
        String sql = "update membro set id_militante=?,id_funcao=?,data_membro=? where id_membro=?";
        try {
            ps = c.conectar().prepareStatement(sql);
            ps.setInt(1, m.getMilitante().getId_militante());
            ps.setInt(2, m.getFuncao().getId_funcao());
            ps.setString(3, m.getData_de_inicio());
            ps.setInt(4, m.getId_militante());
            if (ps.executeUpdate() == 1) {
                c.mensagem("SUCESSO");
            } else {
                c.mensagem("ERRO");
            }
        } catch (Exception e) {
            c.mensagem(e.getMessage());
        }
    }

    public ArrayList<VMembro> listar1(String pesquisar) {
        ArrayList<VMembro> dados = new ArrayList<>();
        String sql = "select * from membros where nome_militante like '%" + pesquisar + "%' order by id_membro	 desc";
        try {
            ps = c.conectar().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                VMembro m = new VMembro();
                m.setId_membro(rs.getInt("id_membro"));
                m.setNome_militante(rs.getString("nome_militante"));
                m.setNome_funcao(rs.getString("nome_funcao"));
                m.setData(rs.getString("data_membro"));
                dados.add(m);
            }
        } catch (Exception e) {
            c.mensagem(e.getMessage());
        }
        return dados;
    }
     public void apagar(MMembro n){
         String sql= "delete from membro where id_membro =?";
         try {
            ps=c.conectar().prepareStatement(sql);
            ps.setInt(1,n.getId_militante());
             if (ps.executeUpdate()==1) {
                 JOptionPane.showMessageDialog(null, "SUCESSO");
             } else {
                 JOptionPane.showMessageDialog(null, "ERRO");
             }
        } catch (Exception e) {
                 JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

}
