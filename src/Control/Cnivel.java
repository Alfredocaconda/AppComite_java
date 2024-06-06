/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Conexao.conexao;
import Modelo.Mnivel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Alfredo Caconda
 */
public class Cnivel {
    
     private PreparedStatement ps;
    private ResultSet rs;
    conexao c= new conexao();
    
    public void guardar(Mnivel n){
         String sql= "insert into nivel values (default,?)";
         
         try {
            ps=c.conectar().prepareStatement(sql);
            ps.setString(1,n.getTipo());
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
     public ArrayList<Mnivel> listar(String pesquisar) {
        ArrayList<Mnivel> dados = new ArrayList<>();
        String sql = "select * from nivel where tipo_nivel like '%" + pesquisar + "%' order by id_nivel";
        try {
            ps=c.conectar().prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Mnivel m= new Mnivel();
                m.setId_nivel(rs.getInt("id_nivel"));
                m.setTipo(rs.getString("tipo_nivel"));
                
                dados.add(m);
            }
        } catch (Exception e) {
            c.mensagem(e.getMessage());
        }
        return dados;
    }
     public ArrayList<Mnivel> consultar() {
        ArrayList<Mnivel> dados = new ArrayList<>();
        String sql = "select id_nivel,tipo_nivel from nivel";
        try {
            ps=c.conectar().prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Mnivel m= new Mnivel();
                m.setId_nivel(rs.getInt("id_nivel"));
                m.setTipo(rs.getString("tipo_nivel"));
                
                dados.add(m);
            }
        } catch (Exception e) {
            c.mensagem(e.getMessage());
        }
        return dados;
    }
    
}
