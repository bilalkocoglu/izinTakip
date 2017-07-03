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
import javax.swing.table.DefaultTableModel;
import model.GirisModel;
import model.KullaniciEkraniModel;

/**
 *
 * @author pC2
 */
public class KabulEdilenIzinController {
    private Connection conn ;
    private Statement stmt ;
    private PreparedStatement ps;
    private ResultSet rs;
    private DBcontroller dbc = new DBcontroller();
    
    
    public KabulEdilenIzinController(){
        
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
    
    public DefaultTableModel tabloModelGetir(){
        DefaultTableModel table = new DefaultTableModel();
        try {
            rs = stmt.executeQuery("select KayitNo,IzinBaslangicTarihi,IzinBitisTarihi,KullanilanIzinMiktari,IzinTürü,IzinOnay from izin_bilgiler where SicilNo="+GirisModel.SicilNo+" and IzinOnay='onaylandi'");
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
            return null;
        }
        
    }
    
    public DefaultTableModel tumIzinlerTabloModelGetir(){
        DefaultTableModel table = new DefaultTableModel();
        try {
            rs = stmt.executeQuery("select KayitNo,IzinBaslangicTarihi,IzinBitisTarihi,KullanilanIzinMiktari,IzinTürü,IzinOnay from izin_bilgiler where SicilNo="+GirisModel.SicilNo+"");
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
            return null;
        }
        
    }
}
