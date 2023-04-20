
package alurachallengeconversor.igu;


public class Moneda extends javax.swing.JFrame {

    
    public Moneda() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblDe = new javax.swing.JLabel();
        lblA = new javax.swing.JLabel();
        boxDe = new javax.swing.JComboBox<>();
        boxA = new javax.swing.JComboBox<>();
        lblMonto = new javax.swing.JLabel();
        btnConvertir = new javax.swing.JButton();
        txtResultado = new javax.swing.JTextField();
        lblResultado = new javax.swing.JLabel();
        btbReturn = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txtMonto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblDe.setText("De:");

        lblA.setText("a: ");

        boxDe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Dólar (USD)", "Euro (EUR)", "Libra Esterlina (GBP)", "Franco Suizo (CHF)", "Yen Japonés  (JPY)", "Dólar Hongkonés (HKD)", "Dólar Canadiense (CAD)", "Yuan Chino (CNY)", "Dólar Australiano (AUD)", "Real Brasileño (BRL)", "Rublo Ruso (RUB)", "Peso Mexicano (MXN)" }));

        boxA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Dólar (USD)", "Euro (EUR)", "Libra Esterlina (GBP)", "Franco Suizo (CHF)", "Yen Japonés  (JPY)", "Dólar Hongkonés (HKD)", "Dólar Canadiense (CAD)", "Yuan Chino (CNY)", "Dólar Australiano (AUD)", "Real Brasileño (BRL)", "Rublo Ruso (RUB)", "Peso Mexicano (MXN)" }));

        lblMonto.setText("Ingresa el monto ");

        btnConvertir.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnConvertir.setText("Convertir");
        btnConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertirActionPerformed(evt);
            }
        });

        txtResultado.setEditable(false);

        lblResultado.setText("Resultado:");

        btbReturn.setText("Volver a selector");
        btbReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbReturnActionPerformed(evt);
            }
        });

        btnClean.setText("Limpiar valores");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        btnExit.setText("SALIR");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        txtMonto.setText("0.00");
        txtMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblDe)
                                .addGap(18, 18, 18)
                                .addComponent(boxDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(boxA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMonto)
                            .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblResultado)
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnClean)
                                .addGap(31, 31, 31)
                                .addComponent(btbReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnConvertir, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                                .addComponent(txtResultado)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDe)
                            .addComponent(boxDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMonto)))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblA)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnConvertir)
                        .addGap(34, 34, 34)
                        .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblResultado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClean)
                    .addComponent(btbReturn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExit)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btbReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbReturnActionPerformed
        Selector selector = new Selector();
        selector.setVisible(true);
        selector.setLocationRelativeTo(null);
        dispose();
        
    }//GEN-LAST:event_btbReturnActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        boxDe.setSelectedIndex(0);
        boxA.setSelectedIndex(0);
        txtMonto.setText("0");
        txtResultado.setText("");
        
        
    }//GEN-LAST:event_btnCleanActionPerformed

    private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirActionPerformed
        
        String from = (String) boxDe.getSelectedItem();
        String to = (String) boxA.getSelectedItem();
        double rate = 0.0;
        double monto = Double.parseDouble(txtMonto.getText());
        

        if (monto == 0){
            txtResultado.setText("Ingresa el monto que deseas convertir");
            return;
        }
        if (to == "-" && from == "-") {
            txtResultado.setText("Selecciona tus monedas para continuar");
            return;
        }
        if (from == "-") {
            txtResultado.setText("No seleccionaste moneda Origen");
            return;
        } 
        if (to == "-") {
            txtResultado.setText("No seleccionaste moneda Destino");
            return;
        }   
        if (from.equals(to)) {
            txtResultado.setText("Seleccionaste la misma moneda como origen y destino");
        }
        
            switch (from) {
            case "Dólar (USD)" -> rate = 1.0;
            case "Euro (EUR)" -> rate = 0.90;
            case "Libra Esterlina (GBP)" -> rate = 0.80;
            case "Franco Suizo (CHF)" -> rate = 0.89;
            case "Yen Japonés  (JPY)" -> rate = 134.23;
            case "Dólar Hongkonés (HKD)" -> rate = 7.85;
            case "Dólar Canadiense (CAD)" -> rate = 1.35;
            case "Yuan Chino (CNY)" -> rate = 6.88;
            case "Dólar Australiano (AUD)" -> rate = 1.48;
            case "Real Brasileño (BRL)" -> rate = 5.06;
            case "Rublo Ruso (RUB)" -> rate = 81.53;
            case "Peso Mexicano (MXN)" -> rate = 18.01;
            }         
            double convertido = monto/rate;
            
            switch (to) {
            case "Dólar (USD)" -> rate = 1.0;
            case "Euro (EUR)" -> rate = 0.90;
            case "Libra Esterlina (GBP)" -> rate = 0.80;
            case "Franco Suizo (CHF)" -> rate = 0.89;
            case "Yen Japonés  (JPY)" -> rate = 134.23;
            case "Dólar Hongkonés (HKD)" -> rate = 7.85;
            case "Dólar Canadiense (CAD)" -> rate = 1.35;
            case "Yuan Chino (CNY)" -> rate = 6.88;
            case "Dólar Australiano (AUD)" -> rate = 1.48;
            case "Real Brasileño (BRL)" -> rate = 5.06;
            case "Rublo Ruso (RUB)" -> rate = 81.53;
            case "Peso Mexicano (MXN)" -> rate = 18.01;
            }
          
            double convertido1 = convertido*rate;
            
            txtResultado.setText("$" + String.format("%.2f", convertido1) + " de " + to);
    }//GEN-LAST:event_btnConvertirActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtMontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtMontoKeyTyped

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxA;
    private javax.swing.JComboBox<String> boxDe;
    private javax.swing.JButton btbReturn;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnConvertir;
    private javax.swing.JButton btnExit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblDe;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
