/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package alurachallengeconversor.igu;

public class Medida extends javax.swing.JFrame {

    
    public Medida() {
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
        txtDist = new javax.swing.JTextField();
        lblDist = new javax.swing.JLabel();
        btnConvertir = new javax.swing.JButton();
        txtResultado = new javax.swing.JTextField();
        lblResultado = new javax.swing.JLabel();
        btbReturn = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblDe.setText("De:");

        lblA.setText("a: ");

        boxDe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Centimetro (cm)", "Metro (m)", "Kilometro (km)", "Pulgada (in)", "Yarda (yd)", "Pies (ft)", "Milla (mi)", "Milla nautica (NM)", " " }));

        boxA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Centimetro (cm)", "Metro (m)", "Kilometro (km)", "Pulgada (in)", "Yarda (yd)", "Pies (ft)", "Milla (mi)", "Milla nautica (NM)", " " }));

        txtDist.setText("0.00");
        txtDist.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDistKeyTyped(evt);
            }
        });

        lblDist.setText("Ingresa la medida");

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
                            .addComponent(lblDist)
                            .addComponent(txtDist, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(194, 194, 194)
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
                        .addComponent(lblDist)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblA)
                    .addComponent(txtDist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnConvertir)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblResultado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        txtDist.setText("");
        txtResultado.setText("");
    }//GEN-LAST:event_btnCleanActionPerformed

    private void btnConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertirActionPerformed
        String from = (String) boxDe.getSelectedItem();
        String to = (String) boxA.getSelectedItem();
        double dist = Double.parseDouble(txtDist.getText());
        double rate = 0.0;
        
        

        if (dist == 0){
            txtResultado.setText("Ingresa la distancia que deseas convertir");
            return;
        }
        if (to == "-" && from == "-") {
            txtResultado.setText("Selecciona unidades de longitud para continuar");
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
            txtResultado.setText(txtDist.getText());
        }   
        
        switch (from) {
            case "Centimetro (cm)" -> rate = 100.0;
            case "Metro (m)"-> rate = 1.0;
            case "Kilometro (km)" -> rate = 0.001;
            case "Pulgada (in)"-> rate = 39.37;
            case "Yarda (yd)"-> rate = 1.09;
            case "Pies (ft)"-> rate = 3.28;
            case "Milla (mi)"-> rate = 0.00062;
            case "Milla nautica (NM)"-> rate = 0.00054;
        }
        
        double convertido = dist/rate;
        
        switch (to) {
            case "Centimetro (cm)"-> rate = 100.0;
            case "Metro (m)"-> rate = 1.0;
            case "Kilometro (km)" -> rate = 0.001;
            case "Pulgada (in)"-> rate = 39.37;
            case "Yarda (yd)"-> rate = 1.09;
            case "Pies (ft)"-> rate = 3.28;
            case "Milla (mi)"-> rate = 0.00062;
            case "Milla nautica (NM)"-> rate = 0.00054;
        }
        double convertido1 = convertido*rate;
            
            txtResultado.setText(String.format("%.5f", convertido1) + " de " + to);
    }//GEN-LAST:event_btnConvertirActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtDistKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDistKeyTyped
           int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }
    }//GEN-LAST:event_txtDistKeyTyped

   
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
    private javax.swing.JLabel lblDist;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JTextField txtDist;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
