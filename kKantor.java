
package kKantorek;

public class kKantor extends javax.swing.JFrame {
double zloty = 1;
double euro =4.3;
double dollar = 3.8;
double funt = 4.9;
double frankSzwajcarski = 3.6;


    public kKantor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NaTakaWaluta2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        CB2 = new javax.swing.JComboBox<>();
        CB1 = new javax.swing.JComboBox<>();
        jTextField8 = new javax.swing.JLabel();
        ZTejWaluty = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JLabel();
        NaTakaWaluta = new javax.swing.JLabel();
        Reset = new javax.swing.JButton();
        Przelicz = new javax.swing.JButton();
        Exit = new javax.swing.JButton();

        NaTakaWaluta2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        NaTakaWaluta2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jButton3.setText("PRZELICZ");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(698, 392));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Wymiana Walut");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));

        CB2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        CB2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Wybierz walutę", "ZLOTY", "EURO", "DOLLAR", "FUNT", "FRANK_SZWAJCARSKI" }));
        CB2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        CB1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        CB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Wybierz walutę", "ZLOTY", "EURO", "DOLLAR", "FUNT", "FRANK_SZWAJCARSKI" }));
        CB1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jTextField8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTextField8.setText("Z tej waluty:");
        jTextField8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        ZTejWaluty.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        ZTejWaluty.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jTextField9.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTextField9.setText("Na tą walutę:");
        jTextField9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        NaTakaWaluta.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        NaTakaWaluta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        Reset.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        Reset.setText("RESET");
        Reset.setActionCommand("RESET");
        Reset.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        Przelicz.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        Przelicz.setText("PRZELICZ");
        Przelicz.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Przelicz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrzeliczActionPerformed(evt);
            }
        });

        Exit.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        Exit.setText("WYJDŹ");
        Exit.setToolTipText("");
        Exit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Reset, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ZTejWaluty, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(NaTakaWaluta, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(Przelicz, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CB1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CB2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CB1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(ZTejWaluty, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NaTakaWaluta, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(CB2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Przelicz, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
      System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        ZTejWaluty.setText(null);
        NaTakaWaluta.setText(null);
        CB1.setSelectedIndex(0);
        CB2.setSelectedIndex(0);
    }//GEN-LAST:event_ResetActionPerformed

    private void PrzeliczActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrzeliczActionPerformed

        double Wejscie = Double.parseDouble(ZTejWaluty.getText()); //konwertuję Stringa na Double
        
        //GDY WARTOŚĆ WEJŚCIOWA TO ZŁOTÓWKI
        if (CB1.getSelectedItem().equals("ZLOTY"))
                {
                    
                    if (CB2.getSelectedItem().equals("ZLOTY"))
                    {
                        String probka = String.format("%.2f", Wejscie/zloty);
                        NaTakaWaluta.setText(probka);
                    }
                    if (CB2.getSelectedItem().equals("EURO"))
                    {
                        String probka = String.format("%.2f", Wejscie/euro);
                        NaTakaWaluta.setText(probka);
                    }
                    if (CB2.getSelectedItem().equals("DOLLAR"))
                    {
                        String probka = String.format("%.2f", Wejscie/dollar);
                        NaTakaWaluta.setText(probka);
                    }
                    if (CB2.getSelectedItem().equals("FUNT"))
                    {
                        String probka = String.format("%.2f", Wejscie/funt);
                        NaTakaWaluta.setText(probka);
                    }
                    if (CB2.getSelectedItem().equals("FRANK_SZWAJCARSKI"))
                    {
                        String probka = String.format("%.2f", Wejscie/frankSzwajcarski);
                        NaTakaWaluta.setText(probka);
                    }
                }
        //GDY WARTOŚĆ WEJŚCIOWA TO EURO
        if (CB1.getSelectedItem().equals("EURO"))
        {
            Wejscie=Wejscie*euro;   //OTRZYMUJEMY WARTOŚĆ WEJŚCIOWĄ W ZŁOTÓWKACH
                    if (CB2.getSelectedItem().equals("ZLOTY"))
                    {
                        String probka = String.format("%.2f", Wejscie/zloty);
                        NaTakaWaluta.setText(probka);
                    }
                    if (CB2.getSelectedItem().equals("EURO"))
                    {
                        String probka = String.format("%.2f", Wejscie/euro);
                        NaTakaWaluta.setText(probka);
                    }
                    if (CB2.getSelectedItem().equals("DOLLAR"))
                    {
                        String probka = String.format("%.2f", Wejscie/dollar);
                        NaTakaWaluta.setText(probka);
                    }
                    if (CB2.getSelectedItem().equals("FUNT"))
                    {
                        String probka = String.format("%.2f", Wejscie/funt);
                        NaTakaWaluta.setText(probka);
                    }
                    if (CB2.getSelectedItem().equals("FRANK_SZWAJCARSKI"))
                    {
                        String probka = String.format("%.2f", Wejscie/frankSzwajcarski);
                        NaTakaWaluta.setText(probka);
                    }
        }
        //GDY WARTOŚĆ WEJŚCIOWA TO DOLLAR
        if (CB1.getSelectedItem().equals("DOLLAR"))
        {
            Wejscie=Wejscie*dollar;   //OTRZYMUJEMY WARTOŚĆ WEJŚCIOWĄ W ZŁOTÓWKACH
                    if (CB2.getSelectedItem().equals("ZLOTY"))
                    {
                        String probka = String.format("%.2f", Wejscie/zloty);
                        NaTakaWaluta.setText(probka);
                    }
                    if (CB2.getSelectedItem().equals("EURO"))
                    {
                        String probka = String.format("%.2f", Wejscie/euro);
                        NaTakaWaluta.setText(probka);
                    }
                    if (CB2.getSelectedItem().equals("DOLLAR"))
                    {
                        String probka = String.format("%.2f", Wejscie/dollar);
                        NaTakaWaluta.setText(probka);
                    }
                    if (CB2.getSelectedItem().equals("FUNT"))
                    {
                        String probka = String.format("%.2f", Wejscie/funt);
                        NaTakaWaluta.setText(probka);
                    }
                    if (CB2.getSelectedItem().equals("FRANK_SZWAJCARSKI"))
                    {
                        String probka = String.format("%.2f", Wejscie/frankSzwajcarski);
                        NaTakaWaluta.setText(probka);
                    }
        }
        //GDY WARTOŚĆ WEJŚCIOWA TO FUNT
        if (CB1.getSelectedItem().equals("FUNT"))
        {
            Wejscie=Wejscie*funt;   //OTRZYMUJEMY WARTOŚĆ WEJŚCIOWĄ W ZŁOTÓWKACH
                    if (CB2.getSelectedItem().equals("ZLOTY"))
                    {
                        String probka = String.format("%.2f", Wejscie/zloty);
                        NaTakaWaluta.setText(probka);
                    }
                    if (CB2.getSelectedItem().equals("EURO"))
                    {
                        String probka = String.format("%.2f", Wejscie/euro);
                        NaTakaWaluta.setText(probka);
                    }
                    if (CB2.getSelectedItem().equals("DOLLAR"))
                    {
                        String probka = String.format("%.2f", Wejscie/dollar);
                        NaTakaWaluta.setText(probka);
                    }
                    if (CB2.getSelectedItem().equals("FUNT"))
                    {
                        String probka = String.format("%.2f", Wejscie/funt);
                        NaTakaWaluta.setText(probka);
                    }
                    if (CB2.getSelectedItem().equals("FRANK_SZWAJCARSKI"))
                    {
                        String probka = String.format("%.2f", Wejscie/frankSzwajcarski);
                        NaTakaWaluta.setText(probka);
                    }
        }
        //GDY WARTOŚĆ WEJŚCIOWA TO FRANK SZWAJCARSKI
        if (CB1.getSelectedItem().equals("FRANK_SZWAJCARSKI"))
        {
            Wejscie=Wejscie*frankSzwajcarski;   //OTRZYMUJEMY WARTOŚĆ WEJŚCIOWĄ W ZŁOTÓWKACH
                    if (CB2.getSelectedItem().equals("ZLOTY"))
                    {
                        String probka = String.format("%.2f", Wejscie/zloty);
                        NaTakaWaluta.setText(probka);
                    }
                    if (CB2.getSelectedItem().equals("EURO"))
                    {
                        String probka = String.format("%.2f", Wejscie/euro);
                        NaTakaWaluta.setText(probka);
                    }
                    if (CB2.getSelectedItem().equals("DOLLAR"))
                    {
                        String probka = String.format("%.2f", Wejscie/dollar);
                        NaTakaWaluta.setText(probka);
                    }
                    if (CB2.getSelectedItem().equals("FUNT"))
                    {
                        String probka = String.format("%.2f", Wejscie/funt);
                        NaTakaWaluta.setText(probka);
                    }
                    if (CB2.getSelectedItem().equals("FRANK_SZWAJCARSKI"))
                    {
                        String probka = String.format("%.2f", Wejscie/frankSzwajcarski);
                        NaTakaWaluta.setText(probka);
                    }
        }

        
    }//GEN-LAST:event_PrzeliczActionPerformed


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
            java.util.logging.Logger.getLogger(kKantor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kKantor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kKantor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kKantor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kKantor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB1;
    private javax.swing.JComboBox<String> CB2;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel NaTakaWaluta;
    private javax.swing.JLabel NaTakaWaluta2;
    private javax.swing.JButton Przelicz;
    private javax.swing.JButton Reset;
    private javax.swing.JTextField ZTejWaluty;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jTextField8;
    private javax.swing.JLabel jTextField9;
    // End of variables declaration//GEN-END:variables
}
