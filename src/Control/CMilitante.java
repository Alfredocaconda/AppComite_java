/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Conexao.conexao;
import Modelo.MMilitante;
import Modelo.MViewmilitante;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ALFREDO CACONDA
 */
public class CMilitante {

    private PreparedStatement ps;
    private ResultSet rs;
    conexao c = new conexao();

    public ArrayList<MViewmilitante> listar(String pesquisar) {
        ArrayList<MViewmilitante> dados = new ArrayList<>();
        String sql = "select * from consultar where nome_militante like '%" + pesquisar + "%' order by id_militante desc ";
        try {
            ps=c.conectar().prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                MViewmilitante m= new MViewmilitante();
                m.setId_militante(rs.getInt("id_militante"));
                m.setNome_militante(rs.getString("nome_militante"));
                m.setGenero_militante(rs.getString("genero_militante"));
                m.setData_nasc_militante(rs.getString("data_nasc_militante"));
                m.setZona(rs.getString("zona"));
                m.setBairro(rs.getString("bairro"));
                m.setRua(rs.getString("rua"));
                m.setData_ingre_militante(rs.getString("data_ingre_militante"));
                m.setTelefone_militante(rs.getString("telefone_militante"));
                m.setEmail_militante(rs.getString("email_militante"));
                m.setNro_bi_militante(rs.getString("nro_bi_militante"));
                m.setFoto(rs.getString("foto"));
                m.setTipo_nivel(rs.getString("tipo_nivel"));
                dados.add(m);
            }
        } catch (Exception e) {
            c.mensagem(e.getMessage());
        }
        return dados;
    }
    public ArrayList<MMilitante> listar1() {
        ArrayList<MMilitante> dados = new ArrayList<>();
        String sql = "select * from militante";
        try {
            ps=c.conectar().prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                MMilitante m= new MMilitante();
                m.setId_militante(rs.getInt("id_militante"));
                m.setNome(rs.getString("nome_militante"));
                dados.add(m);
            }
        } catch (Exception e) {
            c.mensagem(e.getMessage());
        }
        return dados;
    }
    public void apagar(MMilitante p){
        String sql="delete from militante where id_militante=?";
        try {
            ps=c.conectar().prepareStatement(sql);
            ps.setInt(1, p.getId_militante());
            if (ps.executeUpdate()==1) {
                c.mensagem("SUCESSO");
            } else {
                c.mensagem("ERRO");
            }
        } catch (Exception e) {
                c.mensagem(e.getMessage());
        }
    }

    public void guardar(MMilitante M) {
        String sql = "insert into militante values (default,?,?,?,?,?,?,?,?,?,?)";
        try {
            ps = c.conectar().prepareStatement(sql);
            ps.setString(1, M.getNome());
            ps.setString(2, M.getGenero());
            ps.setString(3, M.getBi());
            ps.setString(4, M.getData_nasc());
            ps.setInt(5, M.getEndereco().getId_endereco());
            ps.setString(6, M.getData_ingresso());
            ps.setString(7, M.getTelefone());
            ps.setString(8, M.getEmal());
            ps.setString(9, M.getFoto());
            ps.setInt(10, M.getId_nivel().getId_nivel());
            if (ps.executeUpdate() == 1) {
                c.mensagem("SUCESSO");
            } else {
                c.mensagem("ERRO");
            }
        } catch (Exception e) {
            c.mensagem(e.getMessage());
        }
    }
    public void actualizar(MMilitante M) {
        String sql = "update militante set nome_militante=?, genero_militante=?, nro_bi_militante=?, data_nasc_militante=?,"
                + "endereco_militante=?, data_ingre_militante=?,"
                + "telefone_militante=?, email_militante=?, foto=?,id_nivel=? where id_militante=?";
        try {
            ps = c.conectar().prepareStatement(sql);
            ps.setString(1, M.getNome());
            ps.setString(2, M.getGenero());
            ps.setString(3, M.getBi());
            ps.setString(4, M.getData_nasc());
            ps.setInt(5, M.getEndereco().getId_endereco());
            ps.setString(6, M.getData_ingresso());
            ps.setString(7, M.getTelefone());
            ps.setString(8, M.getEmal());
            ps.setString(9, M.getFoto());
            ps.setInt(10, M.getId_nivel().getId_nivel());
            ps.setInt(11, M.getId_militante());
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
