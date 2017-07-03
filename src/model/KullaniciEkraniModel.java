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
public class KullaniciEkraniModel {
    private String kullaniciAdi;
    private String tcNo;
    private String sifre;
    private String ad;
    private String soyad;
    private String cinsiyet;
    private String dogumTarihi;
    private String sehir;
    public static int kalanIzin;
    private boolean guncellemedeHata = false;
    private boolean guncelleme = false ;
    private String birim ;
    /**
     * @return the kullaniciAdi
     */
    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    /**
     * @param kullaniciAdi the kullaniciAdi to set
     */
    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    /**
     * @return the tcNo
     */
    public String getTcNo() {
        return tcNo;
    }

    /**
     * @param tcNo the tcNo to set
     */
    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
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
     * @return the ad
     */
    public String getAd() {
        return ad;
    }

    /**
     * @param ad the ad to set
     */
    public void setAd(String ad) {
        this.ad = ad;
    }

    /**
     * @return the soyad
     */
    public String getSoyad() {
        return soyad;
    }

    /**
     * @param soyad the soyad to set
     */
    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    /**
     * @return the cinsiyet
     */
    public String getCinsiyet() {
        return cinsiyet;
    }

    /**
     * @param cinsiyet the cinsiyet to set
     */
    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    /**
     * @return the dogumTarihi
     */
    public String getDogumTarihi() {
        return dogumTarihi;
    }

    /**
     * @param dogumTarihi the dogumTarihi to set
     */
    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    /**
     * @return the sehir
     */
    public String getSehir() {
        return sehir;
    }

    /**
     * @param sehir the sehir to set
     */
    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    /**
     * @return the kalanIzin
     */
    public int getKalanIzin() {
        return kalanIzin;
    }

    /**
     * @param kalanIzin the kalanIzin to set
     */
    public void setKalanIzin(int kalanIzin) {
        this.kalanIzin = kalanIzin;
    }

    /**
     * @return the guncellemedeHata
     */
    public boolean getGuncellemedeHata() {
        return guncellemedeHata;
    }

    /**
     * @param guncellemedeHata the guncellemedeHata to set
     */
    public void setGuncellemedeHata(boolean guncellemedeHata) {
        this.guncellemedeHata = guncellemedeHata;
    }

    /**
     * @return the guncelleme
     */
    public boolean getGuncelleme() {
        return guncelleme;
    }

    /**
     * @param guncelleme the guncelleme to set
     */
    public void setGuncelleme(boolean guncelleme) {
        this.guncelleme = guncelleme;
    }

    /**
     * @return the birim
     */
    public String getBirim() {
        return birim;
    }

    /**
     * @param birim the birim to set
     */
    public void setBirim(String birim) {
        this.birim = birim;
    }

   

}
