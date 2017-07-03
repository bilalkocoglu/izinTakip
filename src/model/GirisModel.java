/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author pC2
 */
public class GirisModel {
    private String kullaniciAdi;
    private String sifre;
    private boolean girisHata = true;
    public static boolean giris;
    public static int SicilNo;
    /**
     * @return the Tc
     */
    public String getkullaniciAdi() {
        return kullaniciAdi;
    }

    /**
     * @param Tc the Tc to set
     */
    public void setkullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    /**
     * @return the sifre
     */
    public String getSifre() {
        return sifre;
    }

    /**
     * @param sifre the sifre to set
     */
    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    /**
     * @return the girisHata
     */
    public boolean getGirisHata() {
        return girisHata;
    }

    /**
     * @param girisHata the girisHata to set
     */
    public void setGirisHata(boolean girisHata) {
        this.girisHata = girisHata;
    }

    /**
     * @return the giris
     */
    public boolean getGiris() {
        return giris;
    }

    /**
     * @param giris the giris to set
     */
    public void setGiris(boolean giris) {
        this.giris = giris;
    }

    /**
     * @return the SicilNo
     */
    public int getSicilNo() {
        return SicilNo;
    }

    /**
     * @param SicilNo the SicilNo to set
     */
    public void setSicilNo(int SicilNo) {
        this.SicilNo = SicilNo;
    }
}
