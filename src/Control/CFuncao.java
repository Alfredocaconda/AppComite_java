package Control;

import Conexao.conexao;
import Modelo.MFuncao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CFuncao {

    private PreparedStatement ps;
    private ResultSet rs;
    conexao c = new conexao();

    public ArrayList<MFuncao> Consultar() {
        ArrayList<MFuncao> dados = new ArrayList<>();
        String sql = "select id_funcao, nome_funcao from funcao";
        try {
            ps = c.conectar().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                MFuncao m = new MFuncao();
                m.setNome_funcao(rs.getString("nome_funcao"));
                m.setId_funcao(rs.getInt("id_funcao"));
                dados.add(m);
            }
        } catch (Exception e) {
            c.mensagem(e.getMessage());
        }
        return dados;

    }

    public void guardar(MFuncao f) {
        
        String sql = "insert into funcao values (default,?,?)";

        try {
            ps = c.conectar().prepareStatement(sql);
            ps.setString(1, f.getNome_funcao());
            ps.setString(2, f.getDescricao_funcao());
             if (ps.executeUpdate() == 1) {
               c.mensagem("SUCESSO");
            } else {
               c.mensagem("ERRO");
            }
        } catch (Exception e) {
            c.mensagem(e.getMessage());
        }
    }
    public void actualizar(MFuncao f) {
        
        String sql = "update funcao set nome_funcao=?,descricao_funcao=? where id_funcao=?";

        try {
            ps = c.conectar().prepareStatement(sql);
            ps.setString(1, f.getNome_funcao());
            ps.setString(2, f.getDescricao_funcao());
            ps.setInt(3, f.getId_funcao());
            if (ps.executeUpdate() == 1) {
               c.mensagem("SUCESSO");
            } else {
               c.mensagem("ERRO");
            }
        } catch (Exception e) {
            c.mensagem(e.getMessage());
        }
    }
    public void apagar(MFuncao f) {
        
        String sql = "delete from funcao where id_funcao=?";

        try {
            ps = c.conectar().prepareStatement(sql);
            ps.setInt(1, f.getId_funcao());
            if (ps.executeUpdate() == 1) {
               c.mensagem("SUCESSO");
            } else {
               c.mensagem("ERRO");
            }
        } catch (Exception e) {
            c.mensagem(e.getMessage());
        }
    }

    public ArrayList<MFuncao> listar(String pesquisar) {
        ArrayList<MFuncao> dados = new ArrayList<>();
        String sql = "select * from funcao where nome_funcao like '%" + pesquisar + "%' order by id_funcao desc";
        try {
            ps = c.conectar().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                MFuncao m = new MFuncao();
                m.setId_funcao(rs.getInt("id_funcao"));
                m.setNome_funcao(rs.getString("nome_funcao"));
                m.setDescricao_funcao(rs.getString("descricao_funcao"));
                dados.add(m);
            }
        } catch (Exception e) {
            c.mensagem(e.getMessage());
        }
        return dados;
    }
}
