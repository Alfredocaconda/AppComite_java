/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Conexao.conexao;
import Modelo.MEndereco;
import Modelo.MQUOTA;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ALFREDO CACONDA
 */
public class Cquota {
 
    
    PreparedStatement ps;
    ResultSet rs;
    conexao c = new conexao();

    public void salvar(MQUOTA n) {
        String sql = "insert into vv values(default,?,?)";
        try {
            ps = c.conectar().prepareStatement(sql);
            ps.setInt(1, n.getId_funcao());
            ps.setInt(2, n.getValor());
            if (ps.executeUpdate() == 1) {
                n.mensagem("SUCESSO");
            } else {
                n.mensagem("ERRO");
            }
        } catch (Exception e) {
            n.mensagem(e.getMessage());
        }
    }

}
