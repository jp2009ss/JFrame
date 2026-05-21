
public class Calculadora extends javax.swing.JFrame {

    public Calculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txfNumero2 = new javax.swing.JTextField();
        txfNumero1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txfResultado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jbSomar = new javax.swing.JButton();
        jbSubtrair = new javax.swing.JButton();
        jbMultiplicação = new javax.swing.JButton();
        jbDividir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Super Calculadora Poderosa");

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(0, 0, 0), new java.awt.Color(102, 102, 102), new java.awt.Color(51, 51, 51)));

        txfNumero2.setBackground(new java.awt.Color(255, 255, 255));
        txfNumero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNumero2ActionPerformed(evt);
            }
        });

        txfNumero1.setBackground(new java.awt.Color(255, 255, 255));
        txfNumero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNumero1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel1.setText("Super Calculadora Poderosa");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Numero 1");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Numero 2");

        txfResultado.setEditable(false);
        txfResultado.setBackground(new java.awt.Color(255, 255, 255));
        txfResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfResultadoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Resultado");

        jbSomar.setBackground(new java.awt.Color(255, 255, 255));
        jbSomar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbSomar.setForeground(new java.awt.Color(0, 0, 0));
        jbSomar.setText("+");
        jbSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSomarActionPerformed(evt);
            }
        });

        jbSubtrair.setBackground(new java.awt.Color(255, 255, 255));
        jbSubtrair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbSubtrair.setForeground(new java.awt.Color(0, 0, 0));
        jbSubtrair.setText("-");
        jbSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSubtrairActionPerformed(evt);
            }
        });

        jbMultiplicação.setBackground(new java.awt.Color(255, 255, 255));
        jbMultiplicação.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbMultiplicação.setForeground(new java.awt.Color(0, 0, 0));
        jbMultiplicação.setText("x");
        jbMultiplicação.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMultiplicaçãoActionPerformed(evt);
            }
        });

        jbDividir.setBackground(new java.awt.Color(255, 255, 255));
        jbDividir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbDividir.setForeground(new java.awt.Color(0, 0, 0));
        jbDividir.setText("/");
        jbDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDividirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(txfNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txfNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jbSomar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbSubtrair)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbMultiplicação)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jbDividir))
                                    .addComponent(txfResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txfNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txfNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSomar)
                    .addComponent(jbSubtrair)
                    .addComponent(jbMultiplicação)
                    .addComponent(jbDividir))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txfResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txfResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfResultadoActionPerformed

    }//GEN-LAST:event_txfResultadoActionPerformed

    private void txfNumero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNumero1ActionPerformed

    }//GEN-LAST:event_txfNumero1ActionPerformed

    private void txfNumero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNumero2ActionPerformed
 
    }//GEN-LAST:event_txfNumero2ActionPerformed

    private void jbSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSomarActionPerformed
        
        String numero1Str = txfNumero1.getText();
        String numero2Str = txfNumero2.getText();
        
        double n1 = Double.parseDouble(numero1Str);
        double n2 =  Double.parseDouble(numero2Str);
        
        double resultado = n1 + n2;
        
        txfResultado.setText(String.valueOf(resultado));
    }//GEN-LAST:event_jbSomarActionPerformed

    private void jbSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSubtrairActionPerformed
        String numero1Str = txfNumero1.getText();
        String numero2Str = txfNumero2.getText();
        
        double n1 = Double.parseDouble(numero1Str);
        double n2 =  Double.parseDouble(numero2Str);
        
        double resultado = n1 - n2;
        
        txfResultado.setText(String.valueOf(resultado));
    }//GEN-LAST:event_jbSubtrairActionPerformed

    private void jbMultiplicaçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMultiplicaçãoActionPerformed
        String numero1Str = txfNumero1.getText();
        String numero2Str = txfNumero2.getText();
        
        double n1 = Double.parseDouble(numero1Str);
        double n2 =  Double.parseDouble(numero2Str);
        
        double resultado = n1 * n2;
        
        txfResultado.setText(String.valueOf(resultado));
    }//GEN-LAST:event_jbMultiplicaçãoActionPerformed

    private void jbDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDividirActionPerformed
        String numero1Str = txfNumero1.getText();
        String numero2Str = txfNumero2.getText();
        
        double n1 = Double.parseDouble(numero1Str);
        double n2 =  Double.parseDouble(numero2Str);
        
        double resultado = n1 / n2;
        
        txfResultado.setText(String.valueOf(resultado));
    }//GEN-LAST:event_jbDividirActionPerformed

    

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbDividir;
    private javax.swing.JButton jbMultiplicação;
    private javax.swing.JButton jbSomar;
    private javax.swing.JButton jbSubtrair;
    private javax.swing.JTextField txfNumero1;
    private javax.swing.JTextField txfNumero2;
    private javax.swing.JTextField txfResultado;
    // End of variables declaration//GEN-END:variables
}
