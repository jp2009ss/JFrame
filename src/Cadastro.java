
import javax.swing.JOptionPane;


public class Cadastro extends javax.swing.JFrame {


    public Cadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTurnoDeTrabalho = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        ckbValeAlimentação = new javax.swing.JCheckBox();
        ckbPlanoDeSaúde = new javax.swing.JCheckBox();
        ckbValeTransporte = new javax.swing.JCheckBox();
        ckbHomeOffice = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        rbManhã = new javax.swing.JRadioButton();
        rbTarde = new javax.swing.JRadioButton();
        rbNoite = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jsExperiencia = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jbSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 2, 18), new java.awt.Color(0, 51, 204))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nome Do Usuário; ");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Setor; ");

        jTextField1.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N

        jComboBox1.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " TI - Tecnologia da Informação", "Negócios e Digital", "Saúde e Cuidados", "Educação e Serviços" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Benefícios Desejados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 2, 18), new java.awt.Color(0, 51, 204))); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(220, 310));

        ckbValeAlimentação.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        ckbValeAlimentação.setForeground(new java.awt.Color(0, 0, 0));
        ckbValeAlimentação.setText("Vale Alimentação");

        ckbPlanoDeSaúde.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        ckbPlanoDeSaúde.setForeground(new java.awt.Color(0, 0, 0));
        ckbPlanoDeSaúde.setText("Plano De Saúde");

        ckbValeTransporte.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        ckbValeTransporte.setForeground(new java.awt.Color(0, 0, 0));
        ckbValeTransporte.setText("Vale Tranporte");

        ckbHomeOffice.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        ckbHomeOffice.setForeground(new java.awt.Color(0, 0, 0));
        ckbHomeOffice.setText("Home Office");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckbValeAlimentação)
                    .addComponent(ckbPlanoDeSaúde)
                    .addComponent(ckbValeTransporte)
                    .addComponent(ckbHomeOffice))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(ckbValeAlimentação)
                .addGap(20, 20, 20)
                .addComponent(ckbPlanoDeSaúde)
                .addGap(20, 20, 20)
                .addComponent(ckbValeTransporte)
                .addGap(20, 20, 20)
                .addComponent(ckbHomeOffice)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Turno de Trabalho", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 2, 18), new java.awt.Color(0, 51, 204))); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(220, 310));

        bgTurnoDeTrabalho.add(rbManhã);
        rbManhã.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        rbManhã.setForeground(new java.awt.Color(0, 0, 0));
        rbManhã.setText("Manhã");
        rbManhã.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbManhãActionPerformed(evt);
            }
        });

        bgTurnoDeTrabalho.add(rbTarde);
        rbTarde.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        rbTarde.setForeground(new java.awt.Color(0, 0, 0));
        rbTarde.setText("Tarde");
        rbTarde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTardeActionPerformed(evt);
            }
        });

        bgTurnoDeTrabalho.add(rbNoite);
        rbNoite.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        rbNoite.setForeground(new java.awt.Color(0, 0, 0));
        rbNoite.setText("Noite");
        rbNoite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNoiteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbManhã)
                    .addComponent(rbTarde)
                    .addComponent(rbNoite))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(rbManhã)
                .addGap(20, 20, 20)
                .addComponent(rbTarde)
                .addGap(20, 20, 20)
                .addComponent(rbNoite)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nível De Experiência", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 2, 18), new java.awt.Color(0, 51, 204))); // NOI18N
        jPanel4.setPreferredSize(new java.awt.Dimension(220, 310));

        jsExperiencia.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jsExperiencia.setForeground(new java.awt.Color(0, 0, 0));
        jsExperiencia.setMajorTickSpacing(2);
        jsExperiencia.setMaximum(10);
        jsExperiencia.setPaintLabels(true);
        jsExperiencia.setPaintTicks(true);
        jsExperiencia.setValue(0);

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Experiencia:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel3))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jsExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jsExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Salvar Informações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 2, 18), new java.awt.Color(0, 51, 204))); // NOI18N

        jbSalvar.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(jbSalvar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(jbSalvar)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rbNoiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNoiteActionPerformed
        bgTurnoDeTrabalho.add(rbNoite);
        rbNoite.setText("Noite");
    }//GEN-LAST:event_rbNoiteActionPerformed

    private void rbTardeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTardeActionPerformed
        bgTurnoDeTrabalho.add(rbTarde);
        rbTarde.setText("Tarde");
    }//GEN-LAST:event_rbTardeActionPerformed

    private void rbManhãActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbManhãActionPerformed
        bgTurnoDeTrabalho.add(rbManhã);
        rbManhã.setText("Manhã");
    }//GEN-LAST:event_rbManhãActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        
        String turno = "";
        
        //RadioButton
        
        if(rbManhã.isSelected()){
            turno = "Manhã";
        }
        
        if(rbTarde.isSelected()){
            turno = "Tarde";
        }
        
        if(rbNoite.isSelected()){
            turno = "Noite";
        }
        
        //Formação De Mensagem
        //Check Box
        String mensagem = "";
        
        mensagem += "Vale Alimentação " + ckbValeAlimentação.isSelected()+ ".\n";
        mensagem += "Plano De Saúde " + ckbPlanoDeSaúde.isSelected()+ ".\n";
        mensagem += "Vale Transporte " + ckbValeTransporte.isSelected()+ ".\n";
        mensagem += "Home Office " + ckbHomeOffice.isSelected()+ ".\n";
        
        //Turno
        
        mensagem += "Turno: " + turno + ".\n";
                        
        //Experiência
        
        mensagem += "Experiencia: " + jsExperiencia.getValue()+".";
        
         JOptionPane.showMessageDialog(null, mensagem);
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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgTurnoDeTrabalho;
    private javax.swing.JCheckBox ckbHomeOffice;
    private javax.swing.JCheckBox ckbPlanoDeSaúde;
    private javax.swing.JCheckBox ckbValeAlimentação;
    private javax.swing.JCheckBox ckbValeTransporte;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JSlider jsExperiencia;
    private javax.swing.JRadioButton rbManhã;
    private javax.swing.JRadioButton rbNoite;
    private javax.swing.JRadioButton rbTarde;
    // End of variables declaration//GEN-END:variables
}
