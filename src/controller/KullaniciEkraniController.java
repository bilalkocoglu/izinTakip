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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.GirisModel;
import model.KayitModel;
import model.KullaniciEkraniModel;
import view.KullaniciEkrani;

/**
 *
 * @author pC2
 */
public class KullaniciEkraniController {
    private Connection conn ;
    private Statement stmt ;
    private PreparedStatement ps;
    private ResultSet rs;
    private DBcontroller dbc = new DBcontroller();
    private KullaniciEkraniModel kullaniciEkraniModel = new KullaniciEkraniModel();
    private KayitController kayitController = new KayitController();
    public KullaniciEkraniController(){
        
        if(dbc.getBagliMi()){
           conn=dbc.getConn();
           try {
               stmt = conn.createStatement();
           } catch (SQLException ex) {
               System.out.println("kbilgileri constracter metodu jatalı");
           }
       }
       else{
           conn = dbc.baglan();
           try {
               stmt = conn.createStatement();
           } catch (SQLException ex) {
               System.out.println("kbilgileri constracter metodu jatalı");
           }
       }
    }
    
    public void kullaniciBilgileriAyarla(){
        try {
            System.out.println(GirisModel.SicilNo);
            rs = stmt.executeQuery("select * from personal_bilgileri where SicilNo="+GirisModel.SicilNo+"");
            while(rs.next()){
                
                getKullaniciEkraniModel().setKullaniciAdi(rs.getString(2));
                getKullaniciEkraniModel().setTcNo(rs.getString(5));
                getKullaniciEkraniModel().setSifre(rs.getString(6));
                getKullaniciEkraniModel().setAd(rs.getString(7));
                getKullaniciEkraniModel().setSoyad(rs.getString(8));
                getKullaniciEkraniModel().setCinsiyet(rs.getString(9));
                getKullaniciEkraniModel().setDogumTarihi(rs.getString(10));
                getKullaniciEkraniModel().setSehir(rs.getString(11));
                getKullaniciEkraniModel().setKalanIzin(Integer.parseInt(rs.getString(12)));
                getKullaniciEkraniModel().setBirim(rs.getString(4));
                
            }
        } catch (SQLException ex) {
            System.out.println("kullanici bilgileri metodu jatalı");
        }
    }
    
    public void bilgileriListele(Object kullaniciAdiLabel, Object tcNoLabel, Object sifreLabel, Object adLabel, Object soyadLabel, Object cinsiyetLabel, Object dogumTarihiLabel, Object sehirLabel, Object kalanIzinLabel, Object birimLabel){
        if(kullaniciAdiLabel.getClass()==JLabel.class){
            ((JLabel)kullaniciAdiLabel).setText(getKullaniciEkraniModel().getKullaniciAdi());
            ((JLabel)tcNoLabel).setText(getKullaniciEkraniModel().getTcNo());
            ((JLabel)sifreLabel).setText(getKullaniciEkraniModel().getSifre());
            ((JLabel)adLabel).setText(getKullaniciEkraniModel().getAd());
            ((JLabel)soyadLabel).setText(getKullaniciEkraniModel().getSoyad());
            ((JLabel)cinsiyetLabel).setText(getKullaniciEkraniModel().getCinsiyet());
            ((JLabel)dogumTarihiLabel).setText(getKullaniciEkraniModel().getDogumTarihi());
            ((JLabel)sehirLabel).setText(getKullaniciEkraniModel().getSehir());
            ((JLabel)kalanIzinLabel).setText(Integer.toString(getKullaniciEkraniModel().getKalanIzin()));
            ((JLabel)birimLabel).setText(getKullaniciEkraniModel().getBirim());
        }
        else if(kullaniciAdiLabel.getClass()==JTextField.class){
            ((JTextField)kullaniciAdiLabel).setText(getKullaniciEkraniModel().getKullaniciAdi());
            ((JTextField)tcNoLabel).setText(getKullaniciEkraniModel().getTcNo());
            ((JTextField)sifreLabel).setText(getKullaniciEkraniModel().getSifre());
            ((JTextField)adLabel).setText(getKullaniciEkraniModel().getAd());
            ((JTextField)soyadLabel).setText(getKullaniciEkraniModel().getSoyad());
            ((JTextField)dogumTarihiLabel).setText(getKullaniciEkraniModel().getDogumTarihi());
            ((JTextField)sehirLabel).setText(getKullaniciEkraniModel().getSehir());
            ((JTextField)birimLabel).setText(getKullaniciEkraniModel().getBirim());
        }
    }
    
    public void guncellemeKontrol(String cinsiyet, JTextField adField,JTextField soyadField,JTextField kullaniciAdiField, JTextField sifreField,JTextField tcField,JTextField sehirField, JTextField dogumTarihiField , JTextField birimField ){
        if(cinsiyet.equals("Secilmemis") || adField.getText().equals("") || soyadField.getText().equals("") ||            
            kullaniciAdiField.getText().equals("") || sifreField.getText().equals("") ||tcField.getText().equals("") ||sehirField.getText().equals("") ||  dogumTarihiField.getText().equals("") || birimField.getText().equals("")) {
            getKullaniciEkraniModel().setGuncellemedeHata(true);
            JOptionPane.showMessageDialog(null, "Güncelleme Yapabilmek İçin Bilgileri Eksiksiz Olarak Doldurmaniz Gerekmektedir.", "Hata Mesaji", 2);
        }
        else{
            getKullaniciEkraniModel().setGuncellemedeHata(false);
            getKullaniciEkraniModel().setAd(adField.getText());
            getKullaniciEkraniModel().setCinsiyet(cinsiyet);
            getKullaniciEkraniModel().setDogumTarihi(dogumTarihiField.getText());
            getKullaniciEkraniModel().setKullaniciAdi(kullaniciAdiField.getText());
            getKullaniciEkraniModel().setSehir(sehirField.getText());
            getKullaniciEkraniModel().setSifre(sifreField.getText());
            getKullaniciEkraniModel().setSoyad(soyadField.getText());
            getKullaniciEkraniModel().setTcNo(tcField.getText());
            getKullaniciEkraniModel().setBirim(birimField.getText());
        }
    }

    public void guncellemeYap(){
        try {
            rs = stmt.executeQuery("select count(*) from personal_bilgileri where KullaniciAdi='"+getKullaniciEkraniModel().getKullaniciAdi()+"' and TcNo='"+getKullaniciEkraniModel().getTcNo()+"'");
            while(rs.next()){
                if(!(rs.getString(1).equals("0"))){
                    getKullaniciEkraniModel().setGuncelleme(false);
                    JOptionPane.showMessageDialog(null, "Bu kayit mevcut.", "Hata Mesajı", 2);
                }
                else if(rs.getString(1).equals("0")){
                    int sonuc = stmt.executeUpdate("update personal_bilgileri  set KullaniciAdi='"+getKullaniciEkraniModel().getKullaniciAdi()+"', TcNo='"+getKullaniciEkraniModel().getTcNo()+"' ,Birim = '"+getKullaniciEkraniModel().getBirim()+"', Sifre='"+getKullaniciEkraniModel().getSifre()+"' , Ad='"+getKullaniciEkraniModel().getAd()+"', Soyad='"+getKullaniciEkraniModel().getSoyad()+"', Cinsiyet='"+getKullaniciEkraniModel().getCinsiyet()+"', DogumTarihi='"+getKullaniciEkraniModel().getDogumTarihi()+"',Sehir='"+getKullaniciEkraniModel().getSehir()+"' where SicilNo="+GirisModel.SicilNo+"");
                    if(sonuc==1){
                        kullaniciEkraniModel.setGuncelleme(true);
                        JOptionPane.showMessageDialog(null, "Guncelleme Basarili", "Bilgi Mesaji", 2);
                        
                        
                    }
                    else{
                        kullaniciEkraniModel.setGuncelleme(false);
                        JOptionPane.showMessageDialog(null, "Guncelleme Yapılamadı", "Hata Mesaji", 2);
                    }
                }
            }
        } catch (SQLException ex) {
           System.out.println("guncelleme yap hatalı");
        }
        
    }    
    
    /**
     * @return the kullaniciEkraniModel
     */
    public KullaniciEkraniModel getKullaniciEkraniModel() {
        return kullaniciEkraniModel;
    }
}
