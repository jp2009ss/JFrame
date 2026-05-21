
import java.util.Random;


public class PedraPapelTesoura extends javax.swing.JFrame {

    public PedraPapelTesoura() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Jokenpo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jbJogar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        rbPedra = new javax.swing.JRadioButton();
        rbPapel = new javax.swing.JRadioButton();
        rbTesoura = new javax.swing.JRadioButton();
        txfResultado = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pedra Papel Tesoura");
        setName("frame"); // NOI18N
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pedra Papel Tesoura", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 2, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jbJogar.setText("Jogar");
        jbJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbJogarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Escolha uma opção: ");

        Jokenpo.add(rbPedra);
        rbPedra.setBorder(null);
        rbPedra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-pedra-50.png"))); // NOI18N
        rbPedra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPedraActionPerformed(evt);
            }
        });

        Jokenpo.add(rbPapel);
        rbPapel.setBorder(null);
        rbPapel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-papel-50.png"))); // NOI18N

        Jokenpo.add(rbTesoura);
        rbTesoura.setBorder(null);
        rbTesoura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-tesoura-50.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jbJogar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txfResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbPedra)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbPapel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbTesoura)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txfResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbPedra)
                    .addComponent(rbPapel)
                    .addComponent(rbTesoura))
                .addGap(18, 18, 18)
                .addComponent(jbJogar)
                .addContainerGap(63, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbJogarActionPerformed

   int usuario = -1;
   
        if (rbPedra.isSelected()) {
            usuario = 0;
            
        }else if (rbPapel.isSelected()){
            usuario = 1;
            
        }else if (rbTesoura.isSelected()){
            usuario = 2;
            
        }else{
            txfResultado.setText("Escolha uma opção!!!!");
            return;
        }
        
        Random random = new Random();
        int computador = random.nextInt(3);
        
        String escolhaComputador = "";
        
        switch (computador) {
            case 0:
                escolhaComputador = "Papel";
                break;
                
            case 1:
                escolhaComputador = "Pedra";
                break;
                
            case 2:
                escolhaComputador = "Tesoura";
                break;
        }
        
        if (usuario == computador) {
            txfResultado.setText("Empate " +escolhaComputador);
            
        }else if((usuario == 0 && computador == 1) || (usuario == 1 && computador == 2) || (usuario == 2 && computador == 1)){
            txfResultado.setText("Você Venceu " + escolhaComputador );
            
        }else{
            txfResultado.setText("Computador Venceu " +escolhaComputador);
        }
        
    }//GEN-LAST:event_jbJogarActionPerformed

    private void rbPedraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPedraActionPerformed
        
    }//GEN-LAST:event_rbPedraActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PedraPapelTesoura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PedraPapelTesoura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PedraPapelTesoura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PedraPapelTesoura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PedraPapelTesoura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Jokenpo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbJogar;
    private javax.swing.JRadioButton rbPapel;
    private javax.swing.JRadioButton rbPedra;
    private javax.swing.JRadioButton rbTesoura;
    private javax.swing.JTextField txfResultado;
    // End of variables declaration//GEN-END:variables
}
