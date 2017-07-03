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
public class KayitModel {
    private String ad;
    private String soyad;
    private String kullaniciAdi;
    private String tc;
    private String sifre;
    private String cinsiyet;
    private String sehir;
    private String dogumTarihi;
    private String yetki;
    private boolean kayitHata = true;
    private boolean kayit = false;
    private String birim;
    

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
     * @return the tc
     */
    public String getTc() {
        return tc;
    }

    /**
     * @param tc the tc to set
     */
    public void setTc(String tc) {
        this.tc = tc;
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
     * @return the sahir
     */
    public String getSehir() {
        return sehir;
    }

    /**
     * @param sahir the sahir to set
     */
    public void setSehir(String sehir) {
        this.sehir = sehir;
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
     * @return the yetki
     */
    public String getYetki() {
        return yetki;
    }

    /**
     * @param yetki the yetki to set
     */
    public void setYetki(String yetki) {
        this.yetki = yetki;
    }

    /**
     * @return the kayitHata
     */
    public boolean getKayitHata() {
        return kayitHata;
    }

    /**
     * @param kayitHata the kayitHata to set
     */
    public void setKayitHata(boolean kayitHata) {
        this.kayitHata = kayitHata;
    }

    /**
     * @return the kayit
     */
    public boolean getKayit() {
        return kayit;
    }

    /**
     * @param kayit the kayit to set
     */
    public void setKayit(boolean kayit) {
        this.kayit = kayit;
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
