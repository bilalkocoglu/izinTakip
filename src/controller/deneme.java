/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author pC2
 */
public class deneme {

    
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("kayitliVeritabani.txt");
            BufferedReader reader = null;
            reader = new BufferedReader(new FileReader(file));
            int i=0;
            String satir = reader.readLine();
            
            while (satir!=null) {

                System.out.println(satir);
                
                satir = reader.readLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(deneme.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
