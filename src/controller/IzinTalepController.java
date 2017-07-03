/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.GirisModel;
import model.IzinTalepModel;
import model.KullaniciEkraniModel;

/**
 *
 * @author pC2
 */
public class IzinTalepController {
    private Connection conn ;
    private Statement stmt ;
    private PreparedStatement ps;
    private ResultSet rs;
    private ResultSet rs1;
    private ResultSet rs2;
    private DBcontroller dbc = new DBcontroller();
    private IzinTalepModel izinTalepModel = new IzinTalepModel();
    
    public IzinTalepController(){
        
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
    
    public void izinBilgileriKontrolEt(JTextField baslangicField, JTextField bitisField, String izinTürü){
        if(baslangicField.getText().equals("") || bitisField.getText().equals("")){
            izinTalepModel.setBilgilerdeHata(true);
            JOptionPane.showMessageDialog(null, "Bilgilerin Eksiksiz Doldurulmuş Olması Gerekir !!", "Hata Mesaji", 2);
        }
        else{
            getIzinTalepModel().setBilgilerdeHata(false);
            getIzinTalepModel().setBaslangicTarihi(Date.valueOf(baslangicField.getText()));
            getIzinTalepModel().setBitisTarihi(Date.valueOf(bitisField.getText()));
            getIzinTalepModel().setIzinTürü(izinTürü);
        }
    }
    
    
    
    //bu metod izinbilgilerinde hata yoksa çalıştırılacak
    public void talebiTamamla(JTextField baslangicField, JTextField bitisField, JLabel kullanilanIzinLabel){
        try {
            rs = stmt.executeQuery("select count(*) from izin_bilgiler where SicilNo="+GirisModel.SicilNo+" and (IzinBaslangicTarihi <='"+baslangicField.getText()+"' and IzinBitisTarihi>='"+bitisField.getText()+"')");
            while(rs.next()){
                if(Integer.parseInt(rs.getString(1))>=1){
                    izinTalepModel.setTalep(false);
                    JOptionPane.showMessageDialog(null, "Bu Tarihler Arasi Izinli Gozukuyorsunuz !", "Hata Mesaji", 2);
                }
                else{
                    int sonuc = stmt.executeUpdate("insert into izin_bilgiler (SicilNo,IzinBaslangicTarihi,IzinBitisTarihi,IzinTürü,KullanilanIzinMiktari,IzinOnay) values ('"+GirisModel.SicilNo+"','"+baslangicField.getText()+"','"+bitisField.getText()+"','"+getIzinTalepModel().getIzinTürü()+"',100,'onaylanmadi')");
                    if(sonuc==1){
                        rs1 = stmt.executeQuery("select KayitNo from izin_bilgiler order by KayitNo desc");
                        while(rs1.next()){
                            int kayitNo = Integer.parseInt(rs1.getString(1));
                            rs2 = stmt.executeQuery("select datediff(IzinBitisTarihi,IzinBaslangicTarihi) from izin_bilgiler where KayitNo="+kayitNo+"");
                            while(rs2.next()){
                                getIzinTalepModel().setKullanilanIzin(Integer.parseInt(rs2.getString(1)));
                                kullanilanIzinLabel.setText("Istenilen izin : "+rs2.getString(1));
                                if(getIzinTalepModel().getKullanilanIzin()>KullaniciEkraniModel.kalanIzin){
                                    izinTalepModel.setTalep(false);
                                    JOptionPane.showMessageDialog(null, "Talep Edilen İzin("+getIzinTalepModel().getKullanilanIzin()+") ! Bu Kadar İzin Hakkınız Yok !", "Hata Mesaji", 2);
                                }
                                else{
                                    int sonuc1 = stmt.executeUpdate("update izin_bilgiler set KullanilanIzinMiktari='"+getIzinTalepModel().getKullanilanIzin()+"' where KayitNo="+kayitNo+"");
                                    if(sonuc1==1){
                                        getIzinTalepModel().setTalep(true);
                                        JOptionPane.showMessageDialog(null, "Talep Basarili !", "Bilgi Mesajı", 2);
                                       
                                    }
                                    else{
                                        getIzinTalepModel().setTalep(false);
                                        JOptionPane.showMessageDialog(null, "Talep Basarısız !", "Bilgi Mesajı", 2);
                                    }
                                }
                            }
                        }
                    }
                    else{
                        getIzinTalepModel().setTalep(false);
                        JOptionPane.showMessageDialog(null, "İzin Talebiniz Başarısız ! !"); 
                    }
                }
            }
        } catch (SQLException ex) {
            
        }
    }

    /**
     * @return the izinTalepModel
     */
    public IzinTalepModel getIzinTalepModel() {
        return izinTalepModel;
    }
}
