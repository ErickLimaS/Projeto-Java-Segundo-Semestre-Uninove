/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import javax.swing.JOptionPane;
import data.CadastroDao;
import data.Usuario;

/**
 *
 * @author FABIANOEACACIA
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        bntSair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnEntrar1 = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));
        setPreferredSize(new java.awt.Dimension(500, 340));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Login");
        jLabel3.setToolTipText("");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 20, 510, 29);

        jPanel2.setBackground(new java.awt.Color(135, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 340));
        jPanel2.setLayout(null);

        bntSair.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bntSair.setText("Sair");
        bntSair.setToolTipText("");
        bntSair.setMaximumSize(new java.awt.Dimension(71, 25));
        bntSair.setMinimumSize(new java.awt.Dimension(71, 25));
        bntSair.setPreferredSize(new java.awt.Dimension(71, 25));
        bntSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSairActionPerformed(evt);
            }
        });
        bntSair.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bntSairKeyPressed(evt);
            }
        });
        jPanel2.add(bntSair);
        bntSair.setBounds(300, 190, 70, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Senha");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(80, 140, 40, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Usuario");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(80, 100, 50, 20);

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(txtUsuario);
        txtUsuario.setBounds(140, 100, 250, 30);

        btnEntrar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEntrar1.setText("Entrar");
        btnEntrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrar1ActionPerformed(evt);
            }
        });
        btnEntrar1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnEntrar1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnEntrar1KeyTyped(evt);
            }
        });
        jPanel2.add(btnEntrar1);
        btnEntrar1.setBounds(170, 190, 70, 30);

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        jPanel2.add(txtSenha);
        txtSenha.setBounds(140, 140, 250, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 500, 340);

        jMenu1.setText("Configurações");

        jCheckBoxMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Cadastre-se");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bntSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_bntSairActionPerformed

    
    private void bntSairKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bntSairKeyPressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_bntSairKeyPressed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        TelaCadastro tu = new TelaCadastro();
        tu.setVisible(true);
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void btnEntrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrar1ActionPerformed

        CadastroDao dao = new CadastroDao();
        boolean status = dao.conectar();
        if (status == true) {
            Usuario usu = dao.logar(txtUsuario.getText(), txtSenha.getText());
            if (usu==null) {
                JOptionPane.showMessageDialog(null, "Usuario e/ou senha incorretos");
            } else {
                JOptionPane.showMessageDialog(null, "Seja bem vindo/a!");
                TelaPrincipal tp = new TelaPrincipal();
                tp.setVisible(true);
                dispose();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Erro na conexão");
        }


    }//GEN-LAST:event_btnEntrar1ActionPerformed

    private void btnEntrar1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEntrar1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntrar1KeyPressed

    private void btnEntrar1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEntrar1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntrar1KeyTyped

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntSair;
    private javax.swing.JButton btnEntrar1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
