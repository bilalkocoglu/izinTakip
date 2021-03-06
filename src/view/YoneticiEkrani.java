/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.YoneticiEkraniController;
import java.awt.Dimension;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.TableColumn;
import model.YoneticiEkraniModel;

/**
 *
 * @author pC2
 */
public class YoneticiEkrani extends javax.swing.JFrame {
    YoneticiEkraniController yoneticiEkraniController = new YoneticiEkraniController();
    YoneticiEkraniModel yoneticiEkraniModel = yoneticiEkraniController.getYoneticiEkraniModel();
    private int sayac = 0; //getirilecekbilgilerisec diyalogundaki comboboxa verilerin sadece 1 kez eklenmesi için
    /**
     * Creates new form YoneticiEkrani
     */
    public YoneticiEkrani() {
        initComponents();
        yoneticiEkraniController.yoneticiBilgileriAyarla();
        yoneticiAdLabel.setText(yoneticiEkraniModel.getAd());
        yoneticiSoyadLabel.setText(yoneticiEkraniModel.getSoyad());
        yoneticiEkraniController.bilgileriListele(kullaniciAdiLabel, tcLabel, sifreLabel, adLabel, soyadLabel, cinsiyetLabel, dogumTarihiLabel, sehirLabel);
        onaylanmayanTalepSayisi.setText("Bekleyen İzin :" +yoneticiEkraniController.onaylanmayanİzinSayisi());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tumKullaniciBilgileriDialog = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        tumKullaniciTable = new javax.swing.JTable();
        getirilecekBilgileriSecDialog = new javax.swing.JDialog();
        getirilecekVerilerComboBox = new javax.swing.JComboBox<>();
        bilgileriGetirButton = new javax.swing.JButton();
        izinleriGetirButton = new javax.swing.JButton();
        onaylanmamisIzinlerDialog = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        onaylanmamisIzinTable = new javax.swing.JTable();
        kaydetButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        yoneticiAdLabel = new javax.swing.JLabel();
        yoneticiSoyadLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        kullaniciAdiLabel = new javax.swing.JLabel();
        tcLabel = new javax.swing.JLabel();
        sifreLabel = new javax.swing.JLabel();
        adLabel = new javax.swing.JLabel();
        soyadLabel = new javax.swing.JLabel();
        cinsiyetLabel = new javax.swing.JLabel();
        dogumTarihiLabel = new javax.swing.JLabel();
        sehirLabel = new javax.swing.JLabel();
        birimLabel = new javax.swing.JLabel();
        kullaniciBilgileriListeleButton = new javax.swing.JButton();
        kullaniciBilgileriListeleButton1 = new javax.swing.JButton();
        onaylanmayanTalepSayisi = new javax.swing.JLabel();
        cikisButton = new javax.swing.JButton();

        tumKullaniciTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tumKullaniciTable);

        javax.swing.GroupLayout tumKullaniciBilgileriDialogLayout = new javax.swing.GroupLayout(tumKullaniciBilgileriDialog.getContentPane());
        tumKullaniciBilgileriDialog.getContentPane().setLayout(tumKullaniciBilgileriDialogLayout);
        tumKullaniciBilgileriDialogLayout.setHorizontalGroup(
            tumKullaniciBilgileriDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tumKullaniciBilgileriDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        tumKullaniciBilgileriDialogLayout.setVerticalGroup(
            tumKullaniciBilgileriDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tumKullaniciBilgileriDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );

        getirilecekVerilerComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hepsi" }));
        getirilecekVerilerComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getirilecekVerilerComboBoxActionPerformed(evt);
            }
        });

        bilgileriGetirButton.setText("Bilgileri Getir");
        bilgileriGetirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bilgileriGetirButtonActionPerformed(evt);
            }
        });

        izinleriGetirButton.setText("Izinleri Getir");
        izinleriGetirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                izinleriGetirButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout getirilecekBilgileriSecDialogLayout = new javax.swing.GroupLayout(getirilecekBilgileriSecDialog.getContentPane());
        getirilecekBilgileriSecDialog.getContentPane().setLayout(getirilecekBilgileriSecDialogLayout);
        getirilecekBilgileriSecDialogLayout.setHorizontalGroup(
            getirilecekBilgileriSecDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(getirilecekBilgileriSecDialogLayout.createSequentialGroup()
                .addGroup(getirilecekBilgileriSecDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(getirilecekBilgileriSecDialogLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(getirilecekVerilerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(getirilecekBilgileriSecDialogLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(bilgileriGetirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(izinleriGetirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        getirilecekBilgileriSecDialogLayout.setVerticalGroup(
            getirilecekBilgileriSecDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(getirilecekBilgileriSecDialogLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(getirilecekVerilerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(getirilecekBilgileriSecDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bilgileriGetirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(izinleriGetirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        onaylanmamisIzinTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(onaylanmamisIzinTable);

        kaydetButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/kaydet.png"))); // NOI18N
        kaydetButton.setFocusPainted(false);
        kaydetButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        kaydetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaydetButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("<html><b>Kaydi Degistirebilmek Icin Kayit Onay Kolonunun Altindaki Satirlara Tiklayiniz </b></html>");

        javax.swing.GroupLayout onaylanmamisIzinlerDialogLayout = new javax.swing.GroupLayout(onaylanmamisIzinlerDialog.getContentPane());
        onaylanmamisIzinlerDialog.getContentPane().setLayout(onaylanmamisIzinlerDialogLayout);
        onaylanmamisIzinlerDialogLayout.setHorizontalGroup(
            onaylanmamisIzinlerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(onaylanmamisIzinlerDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(onaylanmamisIzinlerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(onaylanmamisIzinlerDialogLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kaydetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, Short.MAX_VALUE))
                    .addGroup(onaylanmamisIzinlerDialogLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        onaylanmamisIzinlerDialogLayout.setVerticalGroup(
            onaylanmamisIzinlerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(onaylanmamisIzinlerDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(onaylanmamisIzinlerDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kaydetButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        yoneticiAdLabel.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        yoneticiAdLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yoneticiAdLabel.setText("jLabel1");

        yoneticiSoyadLabel.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        yoneticiSoyadLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yoneticiSoyadLabel.setText("jLabel1");

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TC NO :");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ŞİFRE :");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("AD :");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SOYAD :");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DOĞUM TARİHİ :");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CİNSİYET :");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("SEHİR :");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("KULLANICI ADI :");

        kullaniciAdiLabel.setForeground(new java.awt.Color(255, 255, 255));

        tcLabel.setForeground(new java.awt.Color(255, 255, 255));

        sifreLabel.setForeground(new java.awt.Color(255, 255, 255));

        adLabel.setForeground(new java.awt.Color(255, 255, 255));

        soyadLabel.setForeground(new java.awt.Color(255, 255, 255));

        cinsiyetLabel.setForeground(new java.awt.Color(255, 255, 255));

        dogumTarihiLabel.setForeground(new java.awt.Color(255, 255, 255));

        sehirLabel.setForeground(new java.awt.Color(255, 255, 255));

        birimLabel.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kullaniciAdiLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(tcLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sifreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(soyadLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cinsiyetLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dogumTarihiLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sehirLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(birimLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kullaniciAdiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sifreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soyadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cinsiyetLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dogumTarihiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sehirLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(birimLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        kullaniciBilgileriListeleButton.setText("Kullanıcı Bilgilerine Erişim");
        kullaniciBilgileriListeleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullaniciBilgileriListeleButtonActionPerformed(evt);
            }
        });

        kullaniciBilgileriListeleButton1.setText("İzin Taleplerini Onaylama");
        kullaniciBilgileriListeleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullaniciBilgileriListeleButton1ActionPerformed(evt);
            }
        });

        onaylanmayanTalepSayisi.setText("onaylanmayantalep");

        cikisButton.setText("Çıkış");
        cikisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikisButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(yoneticiAdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(yoneticiSoyadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 244, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kullaniciBilgileriListeleButton, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                            .addComponent(kullaniciBilgileriListeleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(onaylanmayanTalepSayisi, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cikisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(yoneticiAdLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(yoneticiSoyadLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(3, 3, 3)
                .addComponent(cikisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(kullaniciBilgileriListeleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(onaylanmayanTalepSayisi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kullaniciBilgileriListeleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kullaniciBilgileriListeleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullaniciBilgileriListeleButtonActionPerformed
        if(sayac==0){
            yoneticiEkraniController.isimleriEkle(getirilecekVerilerComboBox);
            sayac++;
        }
        getirilecekBilgileriSecDialog.setLocation(150, 150);
        getirilecekBilgileriSecDialog.setMinimumSize(new Dimension(260, 220));
        getirilecekBilgileriSecDialog.setVisible(true);
    }//GEN-LAST:event_kullaniciBilgileriListeleButtonActionPerformed

    private void bilgileriGetirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bilgileriGetirButtonActionPerformed
        int secilenSicil = yoneticiEkraniController.secilmisSicilNoyuGetir(getirilecekVerilerComboBox);
        tumKullaniciTable.setModel(yoneticiEkraniController.secilenPersonelBilgileriniGetir(secilenSicil));
        
        tumKullaniciBilgileriDialog.setLocation(170, 170);
        tumKullaniciBilgileriDialog.setMinimumSize(new Dimension(900, 400));
        tumKullaniciBilgileriDialog.setVisible(true);
    }//GEN-LAST:event_bilgileriGetirButtonActionPerformed

    private void getirilecekVerilerComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getirilecekVerilerComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getirilecekVerilerComboBoxActionPerformed

    private void izinleriGetirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_izinleriGetirButtonActionPerformed
        int secilenSicil = yoneticiEkraniController.secilmisSicilNoyuGetir(getirilecekVerilerComboBox);
        tumKullaniciTable.setModel(yoneticiEkraniController.secilenIzinleriGetir(secilenSicil));
        tumKullaniciBilgileriDialog.setLocation(170, 170);
        tumKullaniciBilgileriDialog.setMinimumSize(new Dimension(900, 400));
        tumKullaniciBilgileriDialog.setVisible(true);
    }//GEN-LAST:event_izinleriGetirButtonActionPerformed

    private void kullaniciBilgileriListeleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullaniciBilgileriListeleButton1ActionPerformed
        onaylanmamisIzinTable.setModel(yoneticiEkraniController.onaylanmamisTalepGetir());
        String[] dataItem = {"onaylanmadi", "onaylandi"};

        JComboBox countryCombo = new JComboBox(dataItem);

        TableColumn countryColumn = onaylanmamisIzinTable.getColumnModel().getColumn(4);

        countryColumn.setCellEditor(new DefaultCellEditor(countryCombo));
        onaylanmamisIzinlerDialog.setLocation(170, 170);
        onaylanmamisIzinlerDialog.setMinimumSize(new Dimension(760, 350));
        onaylanmamisIzinlerDialog.setVisible(true);
        onaylanmayanTalepSayisi.setText("Bekleyen İzin :" +yoneticiEkraniController.onaylanmayanİzinSayisi());
    }//GEN-LAST:event_kullaniciBilgileriListeleButton1ActionPerformed

    private void kaydetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaydetButtonActionPerformed
        
 
        yoneticiEkraniController.izinGüncelle(onaylanmamisIzinTable);
        onaylanmamisIzinTable.setModel(yoneticiEkraniController.onaylanmamisTalepGetir());
        String[] dataItem = {"onaylanmadi", "onaylandi"};
        JComboBox countryCombo = new JComboBox(dataItem);
        TableColumn countryColumn = onaylanmamisIzinTable.getColumnModel().getColumn(4);
        countryColumn.setCellEditor(new DefaultCellEditor(countryCombo));
        onaylanmayanTalepSayisi.setText("Bekleyen İzin :" +yoneticiEkraniController.onaylanmayanİzinSayisi());
        
    }//GEN-LAST:event_kaydetButtonActionPerformed

    private void cikisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikisButtonActionPerformed
        AnaEkran anaEkran = new AnaEkran();
        anaEkran.show();
        this.dispose();
    }//GEN-LAST:event_cikisButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(YoneticiEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(YoneticiEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(YoneticiEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YoneticiEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YoneticiEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adLabel;
    private javax.swing.JButton bilgileriGetirButton;
    private javax.swing.JLabel birimLabel;
    private javax.swing.JButton cikisButton;
    private javax.swing.JLabel cinsiyetLabel;
    private javax.swing.JLabel dogumTarihiLabel;
    private javax.swing.JDialog getirilecekBilgileriSecDialog;
    private javax.swing.JComboBox<String> getirilecekVerilerComboBox;
    private javax.swing.JButton izinleriGetirButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton kaydetButton;
    private javax.swing.JLabel kullaniciAdiLabel;
    private javax.swing.JButton kullaniciBilgileriListeleButton;
    private javax.swing.JButton kullaniciBilgileriListeleButton1;
    private javax.swing.JTable onaylanmamisIzinTable;
    private javax.swing.JDialog onaylanmamisIzinlerDialog;
    private javax.swing.JLabel onaylanmayanTalepSayisi;
    private javax.swing.JLabel sehirLabel;
    private javax.swing.JLabel sifreLabel;
    private javax.swing.JLabel soyadLabel;
    private javax.swing.JLabel tcLabel;
    private javax.swing.JDialog tumKullaniciBilgileriDialog;
    private javax.swing.JTable tumKullaniciTable;
    private javax.swing.JLabel yoneticiAdLabel;
    private javax.swing.JLabel yoneticiSoyadLabel;
    // End of variables declaration//GEN-END:variables
}
