/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Conexao.conexao;
import Modelo.MEndereco;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ALFREDO CACONDA
 */
public class Cendereco {

    private PreparedStatement ps;
    private ResultSet rs;

    conexao c = new conexao();

    public ArrayList<MEndereco> listar() {
        ArrayList<MEndereco> dados = new ArrayList<>();
        String sql = "select * from endereco";
        try {
            ps = c.conectar().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                MEndereco m = new MEndereco();
                m.setId_endereco(rs.getInt("id_endereco"));
                m.setZona(rs.getString("Zona"));
                m.setBairro(rs.getString("Bairro"));
                m.setRua(rs.getString("Rua"));
                dados.add(m);
            }
        } catch (Exception e) {
            c.mensagem(e.getMessage());
        }
        return dados;

    }

    public void guardar(MEndereco f) {
        String sql = "insert into endereco values (default,?,?,?)";

        try {
            ps = c.conectar().prepareStatement(sql);
            ps.setString(1, f.getZona());
            ps.setString(2, f.getBairro());
            ps.setString(3, f.getRua());
            if (ps.executeUpdate() == 1) {
                c.mensagem("SUCESSO");
            } else {
                c.mensagem("ERRO");
            }
        } catch (Exception e) {
            c.mensagem(e.getMessage());
        }
    }

    public void actualizar(MEndereco f) {
        String sql = "update endereco set Zona=?,Bairro=?,Rua=? where id_endereco=?";
        try {
            ps = c.conectar().prepareStatement(sql);
            ps.setString(1, f.getZona());
            ps.setString(2, f.getBairro());
            ps.setString(3, f.getRua());
            ps.setInt(4, f.getId_endereco());
            if (ps.executeUpdate() == 1) {
                c.mensagem("SUCESSO");
            } else {
                c.mensagem("ERRO");
            }
        } catch (Exception e) {
            c.mensagem(e.getMessage());
        }
    }

    public void apagar(MEndereco end) {
        String sql = "delete from endereco where id_endereco=?";
        try {
            ps = c.conectar().prepareStatement(sql);
            ps.setInt(1, end.getId_endereco());
            if (ps.executeUpdate() == 1) {
                c.mensagem("SUCESSO");
            } else {
                c.mensagem("ERRO");
            }
        } catch (Exception e) {
            c.mensagem(e.getMessage());
        }
    }

}
