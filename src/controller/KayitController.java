/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.GirisModel;
import model.KayitModel;

/**
 *
 * @author pC2
 */
public class KayitController {
    private Connection conn ;
    private Statement stmt ;
    private PreparedStatement ps;
    private ResultSet rs;
    private DBcontroller dbc = new DBcontroller();
    private KayitModel kayitModel = new KayitModel();
    private ButtonGroup cinsiyetButtonGroup;
    private ButtonGroup yetkiButtonGroup;
    
    public KayitController(){
        
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
    
    public void kayitKontrol(String cinsiyet, String yetki, JTextField adField,JTextField soyadField,JTextField kullaniciAdiField, JPasswordField sifreField,JTextField tcField,JTextField sehirField, JTextField dogumTarihiField ,JTextField birimField){
        if(cinsiyet.equals("secilmemis") || yetki.equals("secilmemis") || adField.getText().equals("") || soyadField.getText().equals("") ||            
            kullaniciAdiField.getText().equals("") || sifreField.getText().equals("") ||tcField.getText().equals("") ||sehirField.getText().equals("") ||  dogumTarihiField.getText().equals("") || birimField.getText().equals("")) {
            getKayitModel().setKayitHata(true);
            JOptionPane.showMessageDialog(null, "Kayit Bilgilerini Eksiksiz Olarak Doldurmaniz Gerekmektedir.", "Hata Mesaji", 2);
        }
        else{
            
            
            getKayitModel().setKayitHata(false);
            getKayitModel().setAd((adField.getText()).toUpperCase());
            getKayitModel().setCinsiyet(cinsiyet);
            getKayitModel().setDogumTarihi(dogumTarihiField.getText());
            getKayitModel().setKullaniciAdi(kullaniciAdiField.getText());
            getKayitModel().setSehir(sehirField.getText());
            getKayitModel().setSifre(sifreField.getText());
            getKayitModel().setSoyad((soyadField.getText()).toUpperCase());
            getKayitModel().setTc(tcField.getText());
            getKayitModel().setYetki(yetki);
            getKayitModel().setBirim(birimField.getText());
            
        }
    }
    
    public String seciliDugmeleriAl(ButtonGroup buttonGroup){
       for(Enumeration<AbstractButton> tumDugmeler = buttonGroup.getElements();
               tumDugmeler.hasMoreElements();) {
           AbstractButton dugme = tumDugmeler.nextElement();
           if(dugme.isSelected()){
               return dugme.getActionCommand();
           }
       }
       return "Secilmemis";
    }
    
    //bu metodu kayitHata false olduğunda çalıştır
    public void kayitYap(){
        try {
            rs = stmt.executeQuery("select count(*) from personal_bilgileri where KullaniciAdi='"+getKayitModel().getKullaniciAdi()+"' or TcNo='"+getKayitModel().getTc()+"'");
            while(rs.next()){
                if(!(rs.getString(1).equals("0"))){
                    getKayitModel().setKayit(false);
                    JOptionPane.showMessageDialog(null, "Bu kayit mevcut.", "Hata Mesajı", 2);
                }
                else if(rs.getString(1).equals("0")){
                    int sonuc = stmt.executeUpdate("insert into personal_bilgileri (KullaniciAdi,Yetki,Birim,TcNo,Sifre,Ad,Soyad,Cinsiyet,DogumTarihi,Sehir,KalanIzin) values ('"+getKayitModel().getKullaniciAdi()+"','"+getKayitModel().getYetki()+"','"+getKayitModel().getBirim()+"','"+getKayitModel().getTc()+"','"+getKayitModel().getSifre()+"','"+getKayitModel().getAd()+"','"+getKayitModel().getSoyad()+"','"+getKayitModel().getCinsiyet()+"','"+getKayitModel().getDogumTarihi()+"','"+getKayitModel().getSehir()+"',100)");
                    if(sonuc==1){
                        JOptionPane.showMessageDialog(null, "Kayit Basarili", "Bilgi Mesaji", 2);
                        getKayitModel().setKayit(true);
                    }    
                    else
                        JOptionPane.showMessageDialog(null, "Kayit Yapılamadı", "Bilgi Mesaji", 2);
                }
            }
        } catch (SQLException ex) {
           
        }
        
    }

    /**
     * @return the kayitModel
     */
    public KayitModel getKayitModel() {
        return kayitModel;
    }

    /**
     * @return the cinsiyetButtonGroup
     */
    public ButtonGroup getCinsiyetButtonGroup() {
        return cinsiyetButtonGroup;
    }

    /**
     * @param cinsiyetButtonGroup the cinsiyetButtonGroup to set
     */
    public void setCinsiyetButtonGroup(ButtonGroup cinsiyetButtonGroup) {
        this.cinsiyetButtonGroup = cinsiyetButtonGroup;
    }

    /**
     * @return the yetkiButtonGroup
     */
    public ButtonGroup getYetkiButtonGroup() {
        return yetkiButtonGroup;
    }

    /**
     * @param yetkiButtonGroup the yetkiButtonGroup to set
     */
    public void setYetkiButtonGroup(ButtonGroup yetkiButtonGroup) {
        this.yetkiButtonGroup = yetkiButtonGroup;
    }
}
