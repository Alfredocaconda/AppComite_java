/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Juliana Cunhanga
 */
public class Mquota {
    private int id_quota;
    private double valor;

    public int getId_quota() {
        return id_quota;
    }

    public void setId_quota(int id_quota) {
        this.id_quota = id_quota;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

   public void mensagem(String sms){
       JOptionPane.showMessageDialog(null, sms);
   } 
    
}
