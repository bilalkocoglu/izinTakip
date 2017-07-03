/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author pC2
 */
public class IzinTalepModel {
    private Date baslangicTarihi;
    private Date bitisTarihi;
    private int kullanilanIzin;
    private String izinTürü;
    private boolean bilgilerdeHata =true;
    private boolean talep = false;

    /**
     * @return the baslangicTarihi
     */
    public Date getBaslangicTarihi() {
        return baslangicTarihi;
    }

    /**
     * @param baslangicTarihi the baslangicTarihi to set
     */
    public void setBaslangicTarihi(Date baslangicTarihi) {
        this.baslangicTarihi = baslangicTarihi;
    }

    /**
     * @return the bitisTarihi
     */
    public Date getBitisTarihi() {
        return bitisTarihi;
    }

    /**
     * @param bitisTarihi the bitisTarihi to set
     */
    public void setBitisTarihi(Date bitisTarihi) {
        this.bitisTarihi = bitisTarihi;
    }

    /**
     * @return the kullanilanIzin
     */
    public int getKullanilanIzin() {
        return kullanilanIzin;
    }

    /**
     * @param kullanilanIzin the kullanilanIzin to set
     */
    public void setKullanilanIzin(int kullanilanIzin) {
        this.kullanilanIzin = kullanilanIzin;
    }

    /**
     * @return the izinTürü
     */
    public String getIzinTürü() {
        return izinTürü;
    }

    /**
     * @param izinTürü the izinTürü to set
     */
    public void setIzinTürü(String izinTürü) {
        this.izinTürü = izinTürü;
    }

    /**
     * @return the bilgilerdeHata
     */
    public boolean getBilgilerdeHata() {
        return bilgilerdeHata;
    }

    /**
     * @param bilgilerdeHata the bilgilerdeHata to set
     */
    public void setBilgilerdeHata(boolean bilgilerdeHata) {
        this.bilgilerdeHata = bilgilerdeHata;
    }

    /**
     * @return the talep
     */
    public boolean getTalep() {
        return talep;
    }

    /**
     * @param talep the talep to set
     */
    public void setTalep(boolean talep) {
        this.talep = talep;
    }
    
}
