/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Conexao.conexao;
import Modelo.Mfiliacao;
import Modelo.Mnivel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Alfredo Caconda
 */
public class Cfiliacao {
      private PreparedStatement ps;
    private ResultSet rs;
    conexao c= new conexao();
    
    public void guardar(Mfiliacao n){
         String sql= "insert into filiacao values (default,?,?,?,1)";
         
         try {
            ps=c.conectar().prepareStatement(sql);
            ps.setString(1,n.getNome_filiacao());
            ps.setInt(2,n.getEndereco().getId_endereco());
            ps.setString(3,n.getImagem());
//            ps.setInt(4,n.getMembro().getId_membro());
             if (ps.executeUpdate()==1) {
                 JOptionPane.showMessageDialog(null, "SUCESSO");
             } else {
                 JOptionPane.showMessageDialog(null, "ERRO");
             }
        } catch (Exception e) {
                 JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public void actualizar(Mnivel n){
         String sql= "update nivel set tipo_nivel=? where id_nivel =?";
         
         try {
            ps=c.conectar().prepareStatement(sql);
            ps.setString(1,n.getTipo());
            ps.setInt(2,n.getId_nivel());
             if (ps.executeUpdate()==1) {
                 JOptionPane.showMessageDialog(null, "SUCESSO");
             } else {
                 JOptionPane.showMessageDialog(null, "ERRO");
             }
        } catch (Exception e) {
                 JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public void apagar(Mnivel n){
         String sql= "delete from nivel where id_nivel =?";
         
         try {
            ps=c.conectar().prepareStatement(sql);
            ps.setInt(1,n.getId_nivel());
             if (ps.executeUpdate()==1) {
                 JOptionPane.showMessageDialog(null, "SUCESSO");
             } else {
                 JOptionPane.showMessageDialog(null, "ERRO");
             }
        } catch (Exception e) {
                 JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
     public ArrayList<Mfiliacao> listar() {
        ArrayList<Mfiliacao> dados = new ArrayList<>();
        String sql = "select * from filiacao";
        try {
            ps=c.conectar().prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Mfiliacao m= new Mfiliacao();
                m.setId_filiacao(rs.getInt("id_filiacao "));
                m.setNome_filiacao(rs.getString("nome_filiacao"));
//                m.setEndereco(rs.getInt("endereco"));
                m.setImagem(rs.getString("imagem"));
//                m.setMembro(rs.getInt("id_militante"));
                
                dados.add(m);
            }
        } catch (Exception e) {
            c.mensagem(e.getMessage());
        }
        return dados;
    }
    
}
