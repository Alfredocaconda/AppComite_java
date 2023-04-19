/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Conexao.conexao;
import Modelo.MMilitante;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ALFREDO CACONDA
 */
public class CMilitante {
    private PreparedStatement ps;
    private ResultSet rs;
    conexao c= new conexao();
    public void guardar(MMilitante M){
        String sql="insert into militante values (default,?,?,?,?,?,?,?,?,?,?)";
        try {
            ps=c.conectar().prepareStatement(sql);
            ps.setString(1, M.getNome());
            ps.setString(2, M.getGenero());
            ps.setString(3, M.getData_nasc());
            ps.setString(4, M.getEndereco());
            ps.setString(5, M.getData_ingresso());
            ps.setInt(6, M.getTelefone());
            ps.setString(7, M.getEmal());
            ps.setString(8, M.getBi());
            ps.setString(9, M.getFoto());
            ps.setString(10, M.getId_nivel());
            if (ps.executeUpdate()==1) {
                c.mensagem("SUCESSO");
            } else {
                c.mensagem("ERRO");
            }
        } catch (Exception e) {
            c.mensagem(e.getMessage());
        }
    }
}