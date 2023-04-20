
package alurachallengeconversor.igu;

public class Selector extends javax.swing.JFrame {

    public Selector() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCoin = new javax.swing.JButton();
        btnTemp = new javax.swing.JButton();
        btnMed = new javax.swing.JButton();
        lblSelector = new javax.swing.JLabel();
        lblOwner = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        btnCoin.setText("CONVERSOR DE MONEDA");
        btnCoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCoinActionPerformed(evt);
            }
        });

        btnTemp.setText("CONVERSOR DE TEMPERATURA");
        btnTemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTempActionPerformed(evt);
            }
        });

        btnMed.setText("CONVERSOR DE MEDIDAS");
        btnMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedActionPerformed(evt);
            }
        });

        lblSelector.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lblSelector.setForeground(new java.awt.Color(0, 0, 0));
        lblSelector.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSelector.setText("SELECCIONA EL PROGRAMA");
        lblSelector.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblOwner.setBackground(new java.awt.Color(102, 102, 102));
        lblOwner.setFont(new java.awt.Font("Comic Sans MS", 3, 8)); // NOI18N
        lblOwner.setForeground(new java.awt.Color(0, 0, 0));
        lblOwner.setText("By 77EArthQUake77 ");

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
            .addComponent(lblSelector, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblOwner)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(267, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCoin, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMed, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(108, 108, 108)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSelector)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCoin)
                .addGap(12, 12, 12)
                .addComponent(btnTemp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMed)
                    .addComponent(btnExit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOwner)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoinActionPerformed
        Moneda moneda = new Moneda();
        moneda.setVisible(true);
        moneda.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnCoinActionPerformed

    private void btnTempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTempActionPerformed
        Temperatura temperatura = new Temperatura();
        temperatura.setTitle("Conversor de temperatura");
        temperatura.setVisible(true);
        temperatura.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnTempActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedActionPerformed
        Medida medida = new Medida();
        medida.setVisible(true);
        medida.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_btnMedActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCoin;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMed;
    private javax.swing.JButton btnTemp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblOwner;
    private javax.swing.JLabel lblSelector;
    // End of variables declaration//GEN-END:variables
}
