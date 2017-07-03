/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.DBModel;

/**
 *
 * @author pC2
 */
public class DBBaglantiController {
    public void girilenDegerleriKontolEt(JTextField urlField, JTextField userField, JPasswordField sifreField){
        if(urlField.getText().equals("") || userField.getText().equals("")){
            DBModel.bilgilerdeHata=true;
            JOptionPane.showMessageDialog(null, "URL ve USER Bos Bıraklamaz !!", "Hata Mesaji", 2);
        } 
        else{
            DBModel.bilgilerdeHata=false;  
            DBModel.url=urlField.getText();
            DBModel.user=userField.getText();
            DBModel.pass=sifreField.getText();
        }
    }
}
