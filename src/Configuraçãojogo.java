
public class Configuraçãojogo extends javax.swing.JFrame {

    public Configuraçãojogo() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgDificuldade = new javax.swing.ButtonGroup();
        jpOpções = new javax.swing.JPanel();
        ckbAtivarMusica = new javax.swing.JCheckBox();
        ckbAtivarLegenda = new javax.swing.JCheckBox();
        ckbTelaCheia = new javax.swing.JCheckBox();
        jpDificuldade = new javax.swing.JPanel();
        rbFacil = new javax.swing.JRadioButton();
        rbMedio = new javax.swing.JRadioButton();
        rbDificil = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jsVolume = new javax.swing.JSlider();
        jbSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configuração");

        jpOpções.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opções", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 2, 18))); // NOI18N

        ckbAtivarMusica.setText("Ativar Musica");

        ckbAtivarLegenda.setText("Ativar Legenda");

        ckbTelaCheia.setText("Tela cheia");

        javax.swing.GroupLayout jpOpçõesLayout = new javax.swing.GroupLayout(jpOpções);
        jpOpções.setLayout(jpOpçõesLayout);
        jpOpçõesLayout.setHorizontalGroup(
            jpOpçõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpOpçõesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpOpçõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckbAtivarMusica)
                    .addComponent(ckbAtivarLegenda)
                    .addComponent(ckbTelaCheia))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpOpçõesLayout.setVerticalGroup(
            jpOpçõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpOpçõesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ckbAtivarMusica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckbAtivarLegenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckbTelaCheia)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpDificuldade.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dificuldade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 2, 18))); // NOI18N
        jpDificuldade.setPreferredSize(new java.awt.Dimension(400, 116));

        bgDificuldade.add(rbFacil);
        rbFacil.setText("Fácil");

        bgDificuldade.add(rbMedio);
        rbMedio.setText("Médio");

        bgDificuldade.add(rbDificil);
        rbDificil.setText("Difícil");

        javax.swing.GroupLayout jpDificuldadeLayout = new javax.swing.GroupLayout(jpDificuldade);
        jpDificuldade.setLayout(jpDificuldadeLayout);
        jpDificuldadeLayout.setHorizontalGroup(
            jpDificuldadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDificuldadeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDificuldadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbFacil)
                    .addComponent(rbMedio)
                    .addComponent(rbDificil))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpDificuldadeLayout.setVerticalGroup(
            jpDificuldadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDificuldadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbFacil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbMedio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbDificil)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Volume", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 2, 18))); // NOI18N

        jsVolume.setMajorTickSpacing(25);
        jsVolume.setSnapToTicks(true);
        jsVolume.setValue(0);

        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jsVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jbSalvar)))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jsVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jbSalvar)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpOpções, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpDificuldade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpOpções, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpDificuldade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        
        //RadioButton
        
        String dificuldade = "";
        
        if(rbFacil.isSelected()){
            dificuldade = "Fácil";
        }
        
        if(rbMedio.isSelected()){
            dificuldade = "Médio";
        }
           
        if(rbDificil.isSelected()){
            dificuldade = "Dificil";
        }
        
        
        
    }//GEN-LAST:event_jbSalvarActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Configuraçãojogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Configuraçãojogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Configuraçãojogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Configuraçãojogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Configuraçãojogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgDificuldade;
    private javax.swing.JCheckBox ckbAtivarLegenda;
    private javax.swing.JCheckBox ckbAtivarMusica;
    private javax.swing.JCheckBox ckbTelaCheia;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JPanel jpDificuldade;
    private javax.swing.JPanel jpOpções;
    private javax.swing.JSlider jsVolume;
    private javax.swing.JRadioButton rbDificil;
    private javax.swing.JRadioButton rbFacil;
    private javax.swing.JRadioButton rbMedio;
    // End of variables declaration//GEN-END:variables
}
