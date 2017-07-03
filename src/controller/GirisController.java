/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.GirisModel;

/**
 *
 * @author pC2
 */
public class GirisController {
    private Connection conn ;
    private Statement stmt ;
    private ResultSet rs;
    private GirisModel girisModel = new GirisModel();
    private DBcontroller dbc = new DBcontroller();
    
    public GirisController(){
        if(dbc.getBagliMi()){
           conn=dbc.getConn();
           try {
               stmt = conn.createStatement();
           } catch (SQLException ex) {
               Logger.getLogger(GirisController.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       else{
           conn = dbc.baglan();
           try {
               stmt = conn.createStatement();
           } catch (SQLException ex) {
               Logger.getLogger(GirisController.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
        
    }
    
    public void girisKonrol(JTextField kullaniciAdiField, JPasswordField sifreField){
        if(kullaniciAdiField.getText().equals("")||sifreField.getText().equals("")){
            getGirisModel().setGirisHata(true);
            JOptionPane.showMessageDialog(null, "Kullanici Adi veya Sifre Bos Birakilamaz.", "Hata Mesaji", 2);
        }
        else{
            getGirisModel().setGirisHata(false);
            getGirisModel().setkullaniciAdi(kullaniciAdiField.getText());
            getGirisModel().setSifre(sifreField.getText());
        }
    }
    //girisYap metodunu girishata false ise çalıştır.
    public void girisYap(){
        try {
            rs = stmt.executeQuery("SELECT COUNT(*) FROM personal_bilgileri WHERE kullaniciAdi='"+getGirisModel().getkullaniciAdi()+"' and sifre ='"+getGirisModel().getSifre()+"'");
            while(rs.next()){
                if(rs.getString(1).equals("0")){
                    JOptionPane.showMessageDialog(null, "Kullanıcı Adi veya Sifre Hatalı", "Hata Mesajı",2);
                    getGirisModel().setGiris(false);
                }
                else if(rs.getString(1).equals("1")){
                    JOptionPane.showMessageDialog(null, "Giris Basarili");
                    getGirisModel().setGiris(true);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(GirisController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String yetkiKontrol(){
        try {
            rs = stmt.executeQuery("select Yetki,SicilNo from personal_bilgileri where KullaniciAdi='"+girisModel.getkullaniciAdi()+"' and Sifre='"+girisModel.getSifre()+"'");
            while(rs.next()){
                if(rs.getString(1).toLowerCase().equals("personel")){
                    
                    girisModel.SicilNo=Integer.parseInt(rs.getString(2));
                    return "personel";
                }
                else{
                    girisModel.SicilNo=Integer.parseInt(rs.getString(2));
                    return "yonetici";
                }        
            }
        } catch (SQLException ex) {
            Logger.getLogger(GirisController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    /**
     * @return the conn
     */
    public Connection getConn() {
        return conn;
    }

    /**
     * @return the girisModel
     */
    public GirisModel getGirisModel() {
        return girisModel;
    }
}
