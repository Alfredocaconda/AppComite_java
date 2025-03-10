/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Conexao.conexao;
import Modal.Mfuncionario;
import Modelo.MMilitante;
import Modelo.Mmembro;
import java.io.File;
import java.io.FileWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Alfredo Caconda
 */
public class Clogin {

    private PreparedStatement ps;
    private ResultSet rs;
    conexao c = new conexao();

    public int consultar(Mmembro m) {
        int v = 0;
        String sql = "select idf,usuario,senha,nome,cargo from membro where usuario =? && senha =? ";
        try {
            ps = c.conectar().prepareStatement(sql);
            ps.setString(1, m.getUsuario());
            ps.setString(2, m.getSenha());
            rs = ps.executeQuery();
            if (rs.first()) {
                if (rs.getString("cargo").equalsIgnoreCase("gerente")) {

                    v = 1;
                } else if (rs.getString("cargo").equalsIgnoreCase("tecnico")) {

                    v = 3;
                }else {
                    v = 2;
                }
                loginTexto(rs.getInt("IDF"), rs.getString("nome"), rs.getString("cargo"));
            } else {
                c.mensagem("Usuario ou senha errada");
            }
        } catch (SQLException ex) {
            c.mensagem(ex.getMessage());
        }
        return v;
    }
    String url = "C:/arquivo/login.txt";
    File ff = new File(url);

    public String recuprarValor(int valor) {
        String recupera = "programador";
        try {
            Scanner s = new Scanner(ff);
            while (s.hasNextLine()) {
                if (valor == 0) {
                    recupera = s.nextLine().split("separa")[0];//recuprar o id do funcionario
                } else if(valor == 1)  {
                    recupera = s.nextLine().split("separa")[1];//recuperar o nome
                }else{
                    recupera = s.nextLine().split("separa")[2];//recuperar o nome
                    
                }
            }

        } catch (Exception e) {
        }
        return recupera;
    }

    private void loginTexto(int id, String nome, String cargo) {
        //para guardar o arquivo no disco c
        File f = new File("C:/arquivo");
        f.mkdir();

        try {
            FileWriter fw = new FileWriter(ff);
            fw.write(id + "separa" + nome + "separa" + cargo);
            fw.close();
        } catch (Exception e) {
            c.mensagem(e.getMessage());
        }
    }
}
