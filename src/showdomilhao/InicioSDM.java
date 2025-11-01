
package showdomilhao;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;



public class InicioSDM extends javax.swing.JFrame {

     JBD conexao = new JBD();
     
    public InicioSDM() {
        initComponents();
    }
    
  
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jIniciar = new javax.swing.JLabel();
        jFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 204));
        getContentPane().setLayout(null);

        jTextField1.setBorder(null);
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(270, 290, 100, 16);

        jIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/botaoIniciar.png"))); // NOI18N
        jIniciar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jIniciarMouseMoved(evt);
            }
        });
        jIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jIniciarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jIniciarMouseExited(evt);
            }
        });
        getContentPane().add(jIniciar);
        jIniciar.setBounds(250, 350, 140, 60);

        jFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fundo 2.png"))); // NOI18N
        getContentPane().add(jFundo);
        jFundo.setBounds(0, 0, 677, 432);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jIniciarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jIniciarMouseMoved
    jIniciar.setIcon(new ImageIcon (getClass().getResource("/img/pressIniciar.png")));
    }//GEN-LAST:event_jIniciarMouseMoved

    private void jIniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jIniciarMouseExited
    jIniciar.setIcon(new ImageIcon (getClass().getResource("/img/botaoIniciar.png")));
    }//GEN-LAST:event_jIniciarMouseExited

    private void jIniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jIniciarMouseClicked
        String nomeJogador = JOptionPane.showInputDialog(this, "Digite seu nome:");
        
       if (nomeJogador != null && !nomeJogador.trim().isEmpty())   {
              
        PerguntasSDM perguntas = new PerguntasSDM();
        perguntas.show();
        perguntas.setSize(646, 462);
        
        salvaNome(nomeJogador);
        
        // Configure o JFrame para ser exibido
        perguntas.setVisible(true);
        
        // (Opcional) Feche o JFrame atual
        ((InicioSDM) SwingUtilities.getWindowAncestor(jIniciar)).dispose();
        
       }else {
        JOptionPane.showMessageDialog(this, "Você precisa digitar um nome para começar o jogo.");
    }
    }//GEN-LAST:event_jIniciarMouseClicked

      private void salvaNome(String nomeJogador) {
      
       conexao.ManipularDados("INSERT INTO tb_ranking (nome) VALUES ('"+nomeJogador+"')");
          System.out.println(nomeJogador);
      }
    
    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1MouseClicked

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
            java.util.logging.Logger.getLogger(InicioSDM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSDM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSDM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSDM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        InicioSDM janelinha = new InicioSDM();
        janelinha.show();
        janelinha.setSize(646, 462);

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSDM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jFundo;
    private javax.swing.JLabel jIniciar;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

  
}
