/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import cargo.AumentoSalarial;
import javax.swing.JOptionPane;
import modelo.Funcionario;


public class InterfaceCalcSalario extends javax.swing.JFrame {

    
    public InterfaceCalcSalario() {
        initComponents();
        labelResultadoSalario.setText("");
        labelResultadoDiferenca.setText("");
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNome = new javax.swing.JLabel();
        cpNome = new javax.swing.JTextField();
        labelSalario = new javax.swing.JLabel();
        cpSalario = new javax.swing.JTextField();
        labelCodigoCargo = new javax.swing.JLabel();
        cpCodigoCargo = new javax.swing.JTextField();
        labelTempoServico = new javax.swing.JLabel();
        cpTempoServico = new javax.swing.JTextField();
        btCalcular = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        labelNovoSalario = new javax.swing.JLabel();
        labelResultadoSalario = new javax.swing.JLabel();
        labelDiferenca = new javax.swing.JLabel();
        labelResultadoDiferenca = new javax.swing.JLabel();
        lSobreNome = new javax.swing.JLabel();
        cpsobreNome = new javax.swing.JTextField();
        jLseuNome = new javax.swing.JLabel();
        SaidaNome = new javax.swing.JLabel();
        jLSobreNome = new javax.swing.JLabel();
        SaidaSobrenome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSaidaCargo = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cálculo de aumento salarial");
        setAutoRequestFocus(false);
        setResizable(false);

        labelNome.setLabelFor(cpNome);
        labelNome.setText("Informe seu nome:");

        labelSalario.setLabelFor(cpSalario);
        labelSalario.setText("Informe o salário:");

        labelCodigoCargo.setText("Informe o código do cargo:");

        labelTempoServico.setText("Informe o tempo de serviço:");

        btCalcular.setText("Calcular");
        btCalcular.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 1, true));
        btCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcularActionPerformed(evt);
            }
        });

        labelNovoSalario.setText("Novo Salário:");

        labelResultadoSalario.setText("(resultado salário)");

        labelDiferenca.setText("Diferença:");

        labelResultadoDiferenca.setText("(resultado diferença)");

        lSobreNome.setLabelFor(cpsobreNome);
        lSobreNome.setText("Informe seu sobrenome:");

        jLseuNome.setText("Seu nome :");

        SaidaNome.setText("(seu nome)");

        jLSobreNome.setText("Seu sobre nome:");

        SaidaSobrenome.setText("(seu sobre nome)");

        jLabel1.setText("Cargo:");

        jSaidaCargo.setText("(seu cargo)");

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/loog.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNome)
                            .addComponent(cpNome, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lSobreNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cpsobreNome, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLSobreNome, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SaidaSobrenome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelSalario)
                                    .addComponent(labelCodigoCargo)
                                    .addComponent(labelTempoServico)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLseuNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(labelNovoSalario, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelResultadoSalario)
                                            .addComponent(SaidaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelDiferenca)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jSaidaCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelResultadoDiferenca)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(btCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(104, 104, 104))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cpTempoServico, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                            .addComponent(cpCodigoCargo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cpSalario, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(lSobreNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpsobreNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(labelSalario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cpSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelCodigoCargo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cpCodigoCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelTempoServico)
                .addGap(18, 18, 18)
                .addComponent(cpTempoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCalcular)
                .addGap(11, 11, 11)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLseuNome)
                    .addComponent(SaidaNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLSobreNome)
                    .addComponent(SaidaSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNovoSalario)
                    .addComponent(labelResultadoSalario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDiferenca)
                    .addComponent(labelResultadoDiferenca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jSaidaCargo))
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcularActionPerformed
        
        String nome = cpNome.getText();
        String sobreNome = cpsobreNome.getText();
        double salario = Double.parseDouble(cpSalario.getText());        
        int codCargo = 
        Integer.parseInt(cpCodigoCargo.getText());        
        int tempoServico = 
        Integer.parseInt(cpTempoServico.getText());
        String cargo = "";
        Funcionario f = new Funcionario();
        
        
        f.setNome(nome);
        f.setSalario(salario);
        f.setCodCargo(codCargo);
        f.setSobreNome(sobreNome);
        f.setTempServico(tempoServico);
        
        AumentoSalarial s = new AumentoSalarial(f);
        double novoSalario = s.calcularAumento();
        
        labelResultadoSalario.setText(""+novoSalario);
        
        labelResultadoDiferenca
        .setText(""+(novoSalario - f.getSalario()));
          
        SaidaNome.setText(""+ f.getNome());
        SaidaSobrenome.setText(""+f.getSobreNome());
        jSaidaCargo.setText( " "+ cargo);
    }//GEN-LAST:event_btCalcularActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(InterfaceCalcSalario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceCalcSalario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceCalcSalario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceCalcSalario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceCalcSalario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SaidaNome;
    private javax.swing.JLabel SaidaSobrenome;
    private javax.swing.JButton btCalcular;
    private javax.swing.JTextField cpCodigoCargo;
    private javax.swing.JTextField cpNome;
    private javax.swing.JTextField cpSalario;
    private javax.swing.JTextField cpTempoServico;
    private javax.swing.JTextField cpsobreNome;
    private javax.swing.JLabel jLSobreNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLseuNome;
    private javax.swing.JLabel jSaidaCargo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lSobreNome;
    private javax.swing.JLabel labelCodigoCargo;
    private javax.swing.JLabel labelDiferenca;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNovoSalario;
    private javax.swing.JLabel labelResultadoDiferenca;
    private javax.swing.JLabel labelResultadoSalario;
    private javax.swing.JLabel labelSalario;
    private javax.swing.JLabel labelTempoServico;
    // End of variables declaration//GEN-END:variables
}
