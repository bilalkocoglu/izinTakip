/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.DBModel;

/**
 *
 * @author pC2
 */
public class DBcontroller {
    private Connection conn;
    String url = DBModel.url;
    String user = DBModel.user;
    String pass = DBModel.pass;
    private boolean bagliMi = false;
    private Statement stmt;

    public Connection baglan() {
       
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            
            try {
                setConn(DriverManager.getConnection(DBModel.url,DBModel.user,DBModel.pass));
                stmt = getConn().createStatement();
                bagliMi = true;
            } catch (SQLException ex) {
                Logger.getLogger(DBcontroller.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"Bağlantı oluşturulamadı.","Hata Mesaji",2);
                bagliMi = false;
            }
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Bağlantı oluşturulamadı.","Hata Mesaji",2);
            bagliMi = false;
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(DBcontroller.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Bağlantı oluşturulamadı.","Hata Mesaji",2);
            bagliMi = false;
        }
        return getConn();
    }   

    
    
    
    public void setConn(Connection conn) {
        this.conn = conn;
    }
    
    public Connection getConn() {
        return conn;
    }
    
    public boolean getBagliMi() {
        return bagliMi;
    }
    
}
    
    
    
  

    
    
    
    

