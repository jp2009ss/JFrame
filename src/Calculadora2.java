import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora2 extends javax.swing.JFrame {

     private JTextField campo;
 
    private String operador = "";
    private double numero1, numero2, resultado;
    
     public Calculadora2() {
 
        setTitle("Calculadora");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
 
        setLayout(new BorderLayout());
 
        campo = new JTextField();
        campo.setEditable(false);
        campo.setFont(new Font("Arial", Font.PLAIN, 24));
 
        add(campo, BorderLayout.NORTH);
 
        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(4, 4));
 
        String[] botoes = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"
        };
 
        for (String texto : botoes) {
 
            JButton botao = new JButton(texto);
            painel.add(botao);
 
            botao.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
 
                    String comando = botao.getText();
 
                    if ("0123456789".contains(comando)) {
                        campo.setText(campo.getText() + comando);
 
                    } else if (comando.equals("C")) {
 
                        campo.setText("");
                        numero1 = 0;
                        numero2 = 0;
                        operador = "";
 
                    } else if (comando.equals("=")) {
 
                        numero2 = Double.parseDouble(campo.getText());
 
                        switch (operador) {
 
                            case "+":
                                resultado = numero1 + numero2;
                                break;
 
                            case "-":
                                resultado = numero1 - numero2;
                                break;
 
                            case "*":
                                resultado = numero1 * numero2;
                                break;
 
                            case "/":
                                resultado = numero1 / numero2;
                                break;
                        }
 
                        campo.setText(String.valueOf(resultado));
 
                    } else {
 
                        numero1 = Double.parseDouble(campo.getText());
                        operador = comando;
                        campo.setText("");
                    }
                }
            });
        }
 
        add(painel, BorderLayout.CENTER);
    }
     
 public static void main(String[] args) {
        new Calculadora2().setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jb1 = new javax.swing.JButton();
        jb2 = new javax.swing.JButton();
        jb4 = new javax.swing.JButton();
        jb5 = new javax.swing.JButton();
        jb8 = new javax.swing.JButton();
        jb7 = new javax.swing.JButton();
        jb3 = new javax.swing.JButton();
        jb6 = new javax.swing.JButton();
        jb9 = new javax.swing.JButton();
        jb0 = new javax.swing.JButton();
        jbAdição = new javax.swing.JButton();
        jbSubtração = new javax.swing.JButton();
        jbMultiplicação = new javax.swing.JButton();
        jbDivisão = new javax.swing.JButton();
        txfCampo = new javax.swing.JTextField();
        jbIgual = new javax.swing.JButton();
        jbDeletar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jb1.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        jb1.setText("1");

        jb2.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        jb2.setText("2");
        jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb2ActionPerformed(evt);
            }
        });

        jb4.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        jb4.setText("4");

        jb5.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        jb5.setText("5");

        jb8.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        jb8.setText("8");

        jb7.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        jb7.setText("7");

        jb3.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        jb3.setText("3");

        jb6.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        jb6.setText("6");

        jb9.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        jb9.setText("9");

        jb0.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        jb0.setText("0");

        jbAdição.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        jbAdição.setText("+");

        jbSubtração.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        jbSubtração.setText("-");

        jbMultiplicação.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        jbMultiplicação.setText("*");

        jbDivisão.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        jbDivisão.setText("÷");

        txfCampo.setEditable(false);
        txfCampo.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N

        jbIgual.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        jbIgual.setText("=");

        jbDeletar.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        jbDeletar.setText("c");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jb1)
                                .addGap(18, 18, 18)
                                .addComponent(jb2)
                                .addGap(18, 18, 18)
                                .addComponent(jb3)
                                .addGap(58, 58, 58)
                                .addComponent(jbAdição))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jb4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jb5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jb7)
                                        .addGap(18, 18, 18)
                                        .addComponent(jb8))
                                    .addComponent(jb0))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jb9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbDeletar))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jb6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbMultiplicação)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbSubtração)
                            .addComponent(jbDivisão)
                            .addComponent(jbIgual))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(txfCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb1)
                    .addComponent(jb2)
                    .addComponent(jb3)
                    .addComponent(jbAdição)
                    .addComponent(jbSubtração))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb4)
                    .addComponent(jb5)
                    .addComponent(jb6)
                    .addComponent(jbMultiplicação)
                    .addComponent(jbDivisão))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb9)
                    .addComponent(jb8)
                    .addComponent(jb7)
                    .addComponent(jbIgual)
                    .addComponent(jbDeletar))
                .addGap(18, 18, 18)
                .addComponent(jb0)
                .addContainerGap(56, Short.MAX_VALUE))
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

    private void jb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb2ActionPerformed
       
    }//GEN-LAST:event_jb2ActionPerformed




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jb0;
    private javax.swing.JButton jb1;
    private javax.swing.JButton jb2;
    private javax.swing.JButton jb3;
    private javax.swing.JButton jb4;
    private javax.swing.JButton jb5;
    private javax.swing.JButton jb6;
    private javax.swing.JButton jb7;
    private javax.swing.JButton jb8;
    private javax.swing.JButton jb9;
    private javax.swing.JButton jbAdição;
    private javax.swing.JButton jbDeletar;
    private javax.swing.JButton jbDivisão;
    private javax.swing.JButton jbIgual;
    private javax.swing.JButton jbMultiplicação;
    private javax.swing.JButton jbSubtração;
    private javax.swing.JTextField txfCampo;
    // End of variables declaration//GEN-END:variables
}
