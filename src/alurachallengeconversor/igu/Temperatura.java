
package alurachallengeconversor.igu;


public class Temperatura extends javax.swing.JFrame {

    
    public Temperatura() {
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
        txtTemp = new javax.swing.JTextField();
        lblTemp = new javax.swing.JLabel();
        btnConvertir = new javax.swing.JButton();
        txtResultado = new javax.swing.JTextField();
        lblResultado = new javax.swing.JLabel();
        btbReturn = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblDe.setText("De:");

        lblA.setText("a: ");

        boxDe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Celsius", "Fahrenheit", "Kelvin" }));

        boxA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Celsius", "Fahrenheit", "Kelvin" }));

        txtTemp.setText("0.00");
        txtTemp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTempKeyTyped(evt);
            }
        });

        lblTemp.setText("Ingresa los grados");

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
                            .addComponent(lblTemp)
                            .addComponent(txtTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191))
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
                        .addComponent(lblTemp)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblA)
                    .addComponent(txtTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnConvertir)
                        .addGap(34, 34, 34)
                        .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblResultado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
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
        txtTemp.setText("0");
        txtResultado.setText("");

    }//GEN-LAST:event_btnCleanActionPerformed

    private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirActionPerformed
        String from = (String) boxDe.getSelectedItem();
        String to = (String) boxA.getSelectedItem();
        double temp = Double.parseDouble(txtTemp.getText());
        double celsius = 1.0;
        double kelvin = 1.0;
        double fahrenheit = 1.0;
        
        

        if (temp == 0){
            txtResultado.setText("Ingresa los grados que deseas convertir");
            return;
        }
        if (to == "-" && from == "-") {
            txtResultado.setText("Selecciona unidades de temperatura para continuar");
            return;
        }
        if (from == "-") {
            txtResultado.setText("No seleccionaste unidad Origen");
            return;
        } 
        if (to == "-") {
            txtResultado.setText("No seleccionaste unidad Destino");
            return;
        }   
        if (from.equals(to)) {
            txtResultado.setText(txtTemp.getText());
        }    
        
        switch (from) {
    case "Celsius" -> {
        if (to.equals("Kelvin")) {
            kelvin = temp + 273.15;
            txtResultado.setText(String.format("%.2f", kelvin) + " °" + to);
            return;
        } else if (to.equals("Fahrenheit")) {
            fahrenheit = (temp * 1.8) + 32;
            txtResultado.setText(String.format("%.2f", fahrenheit) + " °" + to);
            return;
        }   
    }
    case "Kelvin" -> {
        if (to.equals("Celsius")) {
            celsius = temp - 273.15;
            txtResultado.setText(String.format("%.2f", celsius) + " °" + to);
            return;
        } else if (to.equals("Fahrenheit")) {
            fahrenheit = ((temp - 273.15)*1.8)+ 32;
            txtResultado.setText( String.format("%.2f", fahrenheit) + " °" + to);
            return;
        }   }
    case "Farenheit" -> {
        if (to.equals("Celsius")) {
            celsius = (temp - 32)/1.8;
            txtResultado.setText(String.format("%.2f", celsius) + " °" + to);
            return;
            } else if (to.equals("Kelvin")) {
            kelvin = ((temp - 32)/1.8)+273.15;
            txtResultado.setText(String.format("%.2f", kelvin) + " °" + to);
            return;
            }  
        }
        
    }
    }//GEN-LAST:event_btnConvertirActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtTempKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTempKeyTyped
           int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }
    }//GEN-LAST:event_txtTempKeyTyped

    
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
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblTemp;
    private javax.swing.JTextField txtResultado;
    private javax.swing.JTextField txtTemp;
    // End of variables declaration//GEN-END:variables
}
