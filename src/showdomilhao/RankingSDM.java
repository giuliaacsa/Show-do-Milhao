/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package showdomilhao;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

/**
 *
 * @author User
 */
public class RankingSDM extends javax.swing.JFrame {
  
    /**
     * Creates new form RankingSDM
     */
    public RankingSDM() {
        initComponents();
        carregarRanking();
         
    }
  
   private void carregarRanking() {
        // Conecta ao banco e obtém os valores do ranking
        JBD conexao = new JBD();
        conexao.Consulta("SELECT pontos, nome  FROM tb_ranking ORDER BY pontos DESC LIMIT 5");
        //conexao.Consulta("SELECT  *  FROM tb_ranking");

        // Configura os valores nos labels
     JLabelNome1.setText(conexao.top1Name);
     JLabelPonto1.setText(String.valueOf(conexao.top1Points));
     JLabelNome2.setText(conexao.top2Name);
     JLabelPonto2.setText(String.valueOf(conexao.top2Points));
     JLabelNome3.setText(conexao.top3Name);
     JLabelPonto3.setText(String.valueOf(conexao.top3Points));
     JLabelNome4.setText(conexao.top4Name);
     JLabelPonto4.setText(String.valueOf(conexao.top4Points));
        }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jReiniciar = new javax.swing.JLabel();
        JLabelPonto4 = new javax.swing.JLabel();
        JLabelPonto3 = new javax.swing.JLabel();
        JLabelPonto2 = new javax.swing.JLabel();
        JLabelPonto1 = new javax.swing.JLabel();
        JLabelNome1 = new javax.swing.JLabel();
        JLabelNome2 = new javax.swing.JLabel();
        JLabelNome3 = new javax.swing.JLabel();
        JLabelNome4 = new javax.swing.JLabel();
        JLabelfundoP4 = new javax.swing.JLabel();
        JLabelFundoP3 = new javax.swing.JLabel();
        JLabelFundoP2 = new javax.swing.JLabel();
        JLabelfundoP1 = new javax.swing.JLabel();
        JLabelFundoN4 = new javax.swing.JLabel();
        JLabelFundoN3 = new javax.swing.JLabel();
        JLabelFundoN2 = new javax.swing.JLabel();
        JLabelFundoN1 = new javax.swing.JLabel();
        jRanking = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(636, 434));
        setMinimumSize(new java.awt.Dimension(636, 434));
        setPreferredSize(new java.awt.Dimension(636, 434));
        setSize(new java.awt.Dimension(636, 434));
        getContentPane().setLayout(null);

        jReiniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Reiniciar.png"))); // NOI18N
        jReiniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jReiniciarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jReiniciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jReiniciarMouseExited(evt);
            }
        });
        getContentPane().add(jReiniciar);
        jReiniciar.setBounds(210, 350, 200, 60);

        JLabelPonto4.setText("jLabel1");
        getContentPane().add(JLabelPonto4);
        JLabelPonto4.setBounds(340, 270, 170, 40);

        JLabelPonto3.setText("jLabel1");
        getContentPane().add(JLabelPonto3);
        JLabelPonto3.setBounds(340, 220, 170, 40);

        JLabelPonto2.setText("jLabel1");
        getContentPane().add(JLabelPonto2);
        JLabelPonto2.setBounds(340, 170, 170, 40);

        JLabelPonto1.setText("jLabel1");
        getContentPane().add(JLabelPonto1);
        JLabelPonto1.setBounds(340, 120, 170, 40);

        JLabelNome1.setText("jLabel1");
        getContentPane().add(JLabelNome1);
        JLabelNome1.setBounds(120, 120, 170, 40);

        JLabelNome2.setText("jLabel1");
        getContentPane().add(JLabelNome2);
        JLabelNome2.setBounds(120, 170, 170, 40);

        JLabelNome3.setText("jLabel1");
        getContentPane().add(JLabelNome3);
        JLabelNome3.setBounds(120, 220, 170, 40);

        JLabelNome4.setText("jLabel1");
        getContentPane().add(JLabelNome4);
        JLabelNome4.setBounds(120, 270, 170, 40);

        JLabelfundoP4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Position.png"))); // NOI18N
        getContentPane().add(JLabelfundoP4);
        JLabelfundoP4.setBounds(330, 220, 187, 50);

        JLabelFundoP3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Position.png"))); // NOI18N
        getContentPane().add(JLabelFundoP3);
        JLabelFundoP3.setBounds(330, 170, 187, 50);

        JLabelFundoP2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Position.png"))); // NOI18N
        getContentPane().add(JLabelFundoP2);
        JLabelFundoP2.setBounds(330, 120, 187, 50);

        JLabelfundoP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Position.png"))); // NOI18N
        getContentPane().add(JLabelfundoP1);
        JLabelfundoP1.setBounds(330, 270, 187, 50);

        JLabelFundoN4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Position.png"))); // NOI18N
        getContentPane().add(JLabelFundoN4);
        JLabelFundoN4.setBounds(110, 270, 187, 50);

        JLabelFundoN3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Position.png"))); // NOI18N
        getContentPane().add(JLabelFundoN3);
        JLabelFundoN3.setBounds(110, 220, 187, 50);

        JLabelFundoN2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Position.png"))); // NOI18N
        getContentPane().add(JLabelFundoN2);
        JLabelFundoN2.setBounds(110, 170, 187, 50);

        JLabelFundoN1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Position.png"))); // NOI18N
        getContentPane().add(JLabelFundoN1);
        JLabelFundoN1.setBounds(110, 120, 190, 50);

        jRanking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ranking.png"))); // NOI18N
        jRanking.setMaximumSize(new java.awt.Dimension(636, 434));
        jRanking.setMinimumSize(new java.awt.Dimension(636, 434));
        jRanking.setPreferredSize(new java.awt.Dimension(636, 434));
        getContentPane().add(jRanking);
        jRanking.setBounds(-3, -4, 990, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jReiniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jReiniciarMouseEntered
      jReiniciar.setIcon(new ImageIcon (getClass().getResource("/img/ReiniciarP.png")));
    }//GEN-LAST:event_jReiniciarMouseEntered

    private void jReiniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jReiniciarMouseExited
       jReiniciar.setIcon(new ImageIcon (getClass().getResource("/img/Reiniciar.png")));
    }//GEN-LAST:event_jReiniciarMouseExited

    private void jReiniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jReiniciarMouseClicked
     InicioSDM janelinha = new InicioSDM();
        janelinha.show();
        janelinha.setSize(646, 462);
        // Configure o JFrame para ser exibido
        janelinha.setVisible(true);
        
        // (Opcional) Feche o JFrame atual
        ((InicioSDM) SwingUtilities.getWindowAncestor(jReiniciar)).dispose();
    }//GEN-LAST:event_jReiniciarMouseClicked

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
            java.util.logging.Logger.getLogger(RankingSDM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RankingSDM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RankingSDM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RankingSDM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RankingSDM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelFundoN1;
    private javax.swing.JLabel JLabelFundoN2;
    private javax.swing.JLabel JLabelFundoN3;
    private javax.swing.JLabel JLabelFundoN4;
    private javax.swing.JLabel JLabelFundoP2;
    private javax.swing.JLabel JLabelFundoP3;
    private javax.swing.JLabel JLabelNome1;
    private javax.swing.JLabel JLabelNome2;
    private javax.swing.JLabel JLabelNome3;
    private javax.swing.JLabel JLabelNome4;
    private javax.swing.JLabel JLabelPonto1;
    private javax.swing.JLabel JLabelPonto2;
    private javax.swing.JLabel JLabelPonto3;
    private javax.swing.JLabel JLabelPonto4;
    private javax.swing.JLabel JLabelfundoP1;
    private javax.swing.JLabel JLabelfundoP4;
    private javax.swing.JLabel jRanking;
    private javax.swing.JLabel jReiniciar;
    // End of variables declaration//GEN-END:variables
}
