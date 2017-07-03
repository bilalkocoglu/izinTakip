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
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import model.GirisModel;
import model.KullaniciEkraniModel;
import model.YoneticiEkraniModel;

/**
 *
 * @author pC2
 */
public class YoneticiEkraniController {
    private Connection conn ;
    private Statement stmt ;
    private PreparedStatement ps;
    private ResultSet rs;
    private ResultSet rs1;
    private ResultSet rs2;
    private DBcontroller dbc = new DBcontroller();
    private YoneticiEkraniModel yoneticiEkraniModel = new YoneticiEkraniModel();
    
    public YoneticiEkraniController(){
        
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
    public void yoneticiBilgileriAyarla(){
        try {
            System.out.println(GirisModel.SicilNo);
            rs = stmt.executeQuery("select * from personal_bilgileri where SicilNo="+GirisModel.SicilNo+"");
            while(rs.next()){
                
                getYoneticiEkraniModel().setKullaniciAdi(rs.getString(2));
                getYoneticiEkraniModel().setTcNo(rs.getString(5));
                getYoneticiEkraniModel().setSifre(rs.getString(6));
                getYoneticiEkraniModel().setAd(rs.getString(7));
                getYoneticiEkraniModel().setSoyad(rs.getString(8));
                getYoneticiEkraniModel().setCinsiyet(rs.getString(9));
                getYoneticiEkraniModel().setDogumTarihi(rs.getString(10));
                getYoneticiEkraniModel().setSehir(rs.getString(11));
                
            }
        } catch (SQLException ex) {
            System.out.println("kullanici bilgileri metodu jatalı");
        }
    }
    public void bilgileriListele(JLabel kullaniciAdiLabel, JLabel tcNoLabel, JLabel sifreLabel, JLabel adLabel, JLabel soyadLabel, JLabel cinsiyetLabel, JLabel dogumTarihiLabel, JLabel sehirLabel){
        
        (kullaniciAdiLabel).setText(getYoneticiEkraniModel().getKullaniciAdi());
        (tcNoLabel).setText(getYoneticiEkraniModel().getTcNo());
        (sifreLabel).setText(getYoneticiEkraniModel().getSifre());
        (adLabel).setText(getYoneticiEkraniModel().getAd());
        (soyadLabel).setText(getYoneticiEkraniModel().getSoyad());
        (cinsiyetLabel).setText(getYoneticiEkraniModel().getCinsiyet());
        (dogumTarihiLabel).setText(getYoneticiEkraniModel().getDogumTarihi());
        (sehirLabel).setText(getYoneticiEkraniModel().getSehir());
    }
    
    public DefaultTableModel secilenPersonelBilgileriniGetir(int SicilNo){
        DefaultTableModel table = new DefaultTableModel();
        try {
            if(SicilNo==0)
                rs2 = stmt.executeQuery("select * from personal_bilgileri where not Yetki='yönetici'");
            else
                rs2 = stmt.executeQuery("select * from personal_bilgileri where not Yetki='yönetici' and SicilNo="+SicilNo+"");
            int sutunSayisi = rs2.getMetaData().getColumnCount();
            for(int i=1;i<=sutunSayisi;i++){
                table.addColumn(rs2.getMetaData().getColumnName(i));
            }
            while(rs2.next()){
              Object[] row=new Object[sutunSayisi];
               for(int i=1;i<=sutunSayisi;i++)
                  row[i-1]=rs2.getObject(i);
              table.addRow(row);
            }
            return table;
        } catch (SQLException ex) {
            Logger.getLogger(YoneticiEkraniController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public DefaultTableModel secilenIzinleriGetir(int SicilNo){
        DefaultTableModel table = new DefaultTableModel();
        try {
            if(SicilNo==0)
                rs2 = stmt.executeQuery("select KayitNo,IzinBaslangicTarihi,IzinBitisTarihi,KullanilanIzinMiktari,IzinOnay  from izin_bilgiler");
            else
                rs2 = stmt.executeQuery("select KayitNo,IzinBaslangicTarihi,IzinBitisTarihi,KullanilanIzinMiktari,IzinOnay  from izin_bilgiler where SicilNo="+SicilNo+"");
            int sutunSayisi = rs2.getMetaData().getColumnCount();
            for(int i=1;i<=sutunSayisi;i++){
                table.addColumn(rs2.getMetaData().getColumnName(i));
            }
            while(rs2.next()){
              Object[] row=new Object[sutunSayisi];
               for(int i=1;i<=sutunSayisi;i++)
                  row[i-1]=rs2.getObject(i);
              table.addRow(row);
            }
            return table;
        } catch (SQLException ex) {
            Logger.getLogger(YoneticiEkraniController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void isimleriEkle(JComboBox isimlerComboBox){
        try {
            rs = stmt.executeQuery("select concat(Ad,' ', Soyad) from personal_bilgileri where not Yetki='yonetici'");
            while(rs.next()){
                isimlerComboBox.addItem(rs.getString(1));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(YoneticiEkraniController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public DefaultTableModel onaylanmamisTalepGetir(){
        DefaultTableModel table = new DefaultTableModel();
        try {
            rs = stmt.executeQuery("select KayitNo,IzinBaslangicTarihi,IzinBitisTarihi,KullanilanIzinMiktari,IzinOnay  from izin_bilgiler where IzinOnay = 'onaylanmadi'");
            int sutunSayisi = rs.getMetaData().getColumnCount();
            for(int i=1;i<=sutunSayisi;i++){
                table.addColumn(rs.getMetaData().getColumnName(i));
            }
            while(rs.next()){
              Object[] row=new Object[sutunSayisi];
               for(int i=1;i<=sutunSayisi;i++)
                  row[i-1]=rs.getObject(i);
              table.addRow(row);
            }
            return table;
        } catch (SQLException ex) {
            Logger.getLogger(YoneticiEkraniController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public int onaylanmayanİzinSayisi(){
        try {
            rs = stmt.executeQuery("select count(*) from izin_bilgiler where IzinOnay='onaylanmadi'");
            while(rs.next()){
                return Integer.parseInt(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(YoneticiEkraniController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    public int secilmisSicilNoyuGetir(JComboBox secimBox){
        if(secimBox.getSelectedItem().equals("Hepsi"))
            return 0;
        else{
            try {
                rs1 = stmt.executeQuery("select SicilNo from personal_bilgileri where concat(Ad,' ', Soyad) like '"+secimBox.getSelectedItem()+"'");
                while(rs1.next()){
                    return Integer.parseInt(rs1.getString(1));
                }
            } catch (SQLException ex) {
                Logger.getLogger(YoneticiEkraniController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }
    
    public void izinGüncelle(JTable table){
        int satirSayisi = table.getModel().getRowCount();
        for(int i=0;i<satirSayisi;i++){
            String secim = table.getModel().getValueAt(i, 4).toString();
            if(secim.equals("onaylandi")){
                try {
                    int sonuc = stmt.executeUpdate("update izin_bilgiler set IzinOnay='onaylandi' where KayitNo="+table.getModel().getValueAt(i, 0).toString()+"");
                    if(sonuc==0){
                        JOptionPane.showMessageDialog(null, (i+1)+". Satir Güncellenemedi", "Hata Mesaji", 2);
                    }
                    else if(sonuc==1){
                        rs = stmt.executeQuery("select SicilNo,KullanilanIzinMiktari from izin_bilgiler where KayitNo="+table.getModel().getValueAt(i, 0).toString()+"");
                        while(rs.next()){
                            int SicilNo = Integer.parseInt(rs.getString(1));
                            int kullanilanIzin = Integer.parseInt(rs.getString(2));
                            int sonuc1 = stmt.executeUpdate("update personal_bilgileri set KalanIzin=KalanIzin-"+kullanilanIzin+" where SicilNo="+SicilNo+"");
                            if(sonuc==1){
                                System.out.println("Basarili");
                            }
                        }
                    }
                } catch (SQLException ex) {
                    
                }
            }
        }
        JOptionPane.showMessageDialog(null, "İslem Tamamlandi !", "Bilgi Mesaji", 0);
        
    }
    
    /**
     * @return the kullaniciEkraniModel
     */
    public YoneticiEkraniModel getYoneticiEkraniModel() {
        return yoneticiEkraniModel;
    }
}
