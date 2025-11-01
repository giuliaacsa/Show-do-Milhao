/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package showdomilhao;

import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;


/**
 *
 * @author User
 */
public class PerguntasSDM extends javax.swing.JFrame {
    
    

    public PerguntasSDM() {
        initComponents();
        
        proximaPergunta();
        atualizarPontuacao();
    }
    
    public Integer alternativaCorreta;
    private int pontuacao = 0;
    private int valorPergunta = 1;
    private int contadorPulos = 0; 
    private final int maxPulos = 3; 
    private int contadorAjuda = 0; // Contador para o uso da ajuda
    private final int maxAjuda = 4; // Limite máximo de usos da ajuda
    public String nomeJogador;
 
    
    public void proximaPergunta(){
        JBD conectar = new JBD();
        
        conectar.Consulta("SELECT * FROM `tb_perguntas` ORDER BY RAND() LIMIT 1");
        
        jQuestion.setText(conectar.p);
        jQuiz1A.setText(conectar.a1);
        jQuiz2A.setText(conectar.a2);
        jQuiz3A.setText(conectar.a3);
        jQuiz4A.setText(conectar.a4);
        
        
        
        ArrayList<String> alternativa = new ArrayList();
        alternativa.add(conectar.a1);
        alternativa.add(conectar.a2);
        alternativa.add(conectar.a3);
        alternativa.add(conectar.a4);
        
        System.out.println(alternativa);
        Collections.shuffle(alternativa);
        System.out.println(alternativa);
        
        alternativaCorreta = 0;  
        
        if (alternativa.get(0).equals(conectar.a1))alternativaCorreta = 1;
        if (alternativa.get(1).equals(conectar.a1))alternativaCorreta = 2;
        if (alternativa.get(2).equals(conectar.a1))alternativaCorreta = 3;
        if (alternativa.get(3).equals(conectar.a1))alternativaCorreta = 4;
        
        
        jQuestion.setText("<html> <p>" + conectar.p+ "<br> </p><html>");
        jQuiz1A.setText("<html> <p>" + alternativa.get(0)+ "<br> </p><html>");
        jQuiz2A.setText("<html> <p>" + alternativa.get(1)+ "<br> </p><html>");
        jQuiz3A.setText("<html> <p>" + alternativa.get(2)+ "<br> </p><html>");
        jQuiz4A.setText("<html> <p>" + alternativa.get(3)+ "<br> </p><html>");
        
        System.out.println(alternativaCorreta);
        
    }
    
    public void VerificarAlternativa(int alternativa) {
    if (alternativaCorreta != alternativa) {
        salvarPontuacao(this.pontuacao);

        JOptionPane.showMessageDialog(this, "Você errou! Sua pontuação final foi: " + pontuacao);
        String mensagem = "A alternativa correta era " + alternativaCorreta + ". Fim de Jogo!";
        
        // Mostra a mensagem e, ao clicar em OK, abre o JFrame RankingSDM
        JOptionPane.showMessageDialog(this, mensagem, "Resposta Incorreta", JOptionPane.ERROR_MESSAGE);
        
        // Fecha o JFrame atual e abre o RankingSDM
        this.dispose(); // Fecha o PerguntasSDM
        RankingSDM Rank = new RankingSDM();
        Rank.setSize(646, 462);
        Rank.show();
        
        Rank.setVisible(true); // Abre o RankingSDM
    }
}

     
   
    
    private void atualizarPontuacao(){
        jPonto.setText(String.valueOf(pontuacao));
    }
    
    public void salvarPontuacao(int pontos) {
    JBD conexao = new JBD();
    String query = "INSERT INTO tb_ranking pontos VALUES (" + pontos + ")";
    
    try {
        conexao.ManipularDados(query);
        JOptionPane.showMessageDialog(this, "Pontuação salva com sucesso!");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao salvar a pontuação: " + e.getMessage());
    }
}
    
     public static void executarAudio(String soundFile) {
        try {
            File f = new File( soundFile);
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(f.toURI().toURL());
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            System.out.println(e);
        }
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jQuiz2A = new javax.swing.JLabel();
        jQuiz4A = new javax.swing.JLabel();
        jQuiz3A = new javax.swing.JLabel();
        jQuestion = new javax.swing.JLabel();
        jQuiz1A = new javax.swing.JLabel();
        jQuiz1 = new javax.swing.JLabel();
        jQuiz2 = new javax.swing.JLabel();
        jQuiz3 = new javax.swing.JLabel();
        jQuiz4 = new javax.swing.JLabel();
        jPular = new javax.swing.JLabel();
        jAjuda = new javax.swing.JLabel();
        jDesistir = new javax.swing.JLabel();
        jPonto = new javax.swing.JLabel();
        jFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jQuiz2A.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jQuiz2A.setForeground(new java.awt.Color(255, 255, 255));
        jQuiz2A.setText("Steve Rogers (Capitão América)");
        getContentPane().add(jQuiz2A);
        jQuiz2A.setBounds(80, 260, 230, 40);

        jQuiz4A.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jQuiz4A.setForeground(new java.awt.Color(255, 255, 255));
        jQuiz4A.setText("Thor Odinson (Thor)");
        getContentPane().add(jQuiz4A);
        jQuiz4A.setBounds(80, 360, 230, 40);

        jQuiz3A.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jQuiz3A.setForeground(new java.awt.Color(255, 255, 255));
        jQuiz3A.setText("Natasha Romanoff (Viúva Negra)");
        getContentPane().add(jQuiz3A);
        jQuiz3A.setBounds(80, 310, 230, 40);

        jQuestion.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        jQuestion.setForeground(new java.awt.Color(255, 255, 255));
        jQuestion.setText("Quem é considerado o primeiro vingador do MCU?");
        getContentPane().add(jQuestion);
        jQuestion.setBounds(100, 100, 540, 80);

        jQuiz1A.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jQuiz1A.setForeground(new java.awt.Color(255, 255, 255));
        jQuiz1A.setText("Carol Danvers (Capitã Marvel)");
        getContentPane().add(jQuiz1A);
        jQuiz1A.setBounds(80, 210, 230, 40);

        jQuiz1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/quiz1.png"))); // NOI18N
        jQuiz1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jQuiz1MouseMoved(evt);
            }
        });
        jQuiz1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jQuiz1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jQuiz1MouseExited(evt);
            }
        });
        getContentPane().add(jQuiz1);
        jQuiz1.setBounds(30, 210, 280, 40);

        jQuiz2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/quiz2.png"))); // NOI18N
        jQuiz2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jQuiz2MouseMoved(evt);
            }
        });
        jQuiz2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jQuiz2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jQuiz2MouseExited(evt);
            }
        });
        getContentPane().add(jQuiz2);
        jQuiz2.setBounds(30, 260, 280, 40);

        jQuiz3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/quiz3.png"))); // NOI18N
        jQuiz3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jQuiz3MouseMoved(evt);
            }
        });
        jQuiz3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jQuiz3MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jQuiz3MouseExited(evt);
            }
        });
        getContentPane().add(jQuiz3);
        jQuiz3.setBounds(30, 310, 280, 40);

        jQuiz4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/quiz4.png"))); // NOI18N
        jQuiz4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jQuiz4MouseMoved(evt);
            }
        });
        jQuiz4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jQuiz4MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jQuiz4MouseExited(evt);
            }
        });
        getContentPane().add(jQuiz4);
        jQuiz4.setBounds(30, 360, 280, 40);

        jPular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Pular.png"))); // NOI18N
        jPular.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPularMouseMoved(evt);
            }
        });
        jPular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPularMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPularMouseExited(evt);
            }
        });
        getContentPane().add(jPular);
        jPular.setBounds(420, 210, 150, 57);

        jAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ajuda.png"))); // NOI18N
        jAjuda.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jAjudaMouseMoved(evt);
            }
        });
        jAjuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jAjudaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jAjudaMouseExited(evt);
            }
        });
        getContentPane().add(jAjuda);
        jAjuda.setBounds(420, 280, 150, 57);

        jDesistir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Desistir.png"))); // NOI18N
        jDesistir.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jDesistirMouseMoved(evt);
            }
        });
        jDesistir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDesistirMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jDesistirMouseExited(evt);
            }
        });
        getContentPane().add(jDesistir);
        jDesistir.setBounds(420, 360, 170, 57);

        jPonto.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPonto.setForeground(new java.awt.Color(255, 255, 255));
        jPonto.setText("0");
        getContentPane().add(jPonto);
        jPonto.setBounds(520, 40, 80, 25);

        jFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fundo2.png"))); // NOI18N
        jFundo.setMaximumSize(new java.awt.Dimension(636, 434));
        jFundo.setMinimumSize(new java.awt.Dimension(636, 434));
        jFundo.setPreferredSize(new java.awt.Dimension(636, 434));
        getContentPane().add(jFundo);
        jFundo.setBounds(0, 0, 636, 434);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPularMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPularMouseMoved
     jPular.setIcon(new ImageIcon (getClass().getResource("/img/PularPress.png")));
    }//GEN-LAST:event_jPularMouseMoved

    private void jPularMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPularMouseExited
     jPular.setIcon(new ImageIcon (getClass().getResource("/img/Pular.png")));
    }//GEN-LAST:event_jPularMouseExited

    private void jAjudaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAjudaMouseMoved
     jAjuda.setIcon(new ImageIcon (getClass().getResource("/img/AjudaPress.png")));
    }//GEN-LAST:event_jAjudaMouseMoved

    private void jAjudaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAjudaMouseExited
     jAjuda.setIcon(new ImageIcon (getClass().getResource("/img/Ajuda.png")));
    }//GEN-LAST:event_jAjudaMouseExited

    private void jDesistirMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDesistirMouseMoved
     jDesistir.setIcon(new ImageIcon (getClass().getResource("/img/DesistirPress.png")));
    }//GEN-LAST:event_jDesistirMouseMoved

    private void jDesistirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDesistirMouseExited
     jDesistir.setIcon(new ImageIcon (getClass().getResource("/img/Desistir.png")));
    }//GEN-LAST:event_jDesistirMouseExited

    private void jQuiz1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jQuiz1MouseMoved
     jQuiz1.setIcon(new ImageIcon (getClass().getResource("/img/quizPress1.png")));
    }//GEN-LAST:event_jQuiz1MouseMoved

    private void jQuiz1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jQuiz1MouseExited
     jQuiz1.setIcon(new ImageIcon (getClass().getResource("/img/quiz1.png")));
    }//GEN-LAST:event_jQuiz1MouseExited

    private void jQuiz2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jQuiz2MouseMoved
     jQuiz2.setIcon(new ImageIcon (getClass().getResource("/img/quizPress2.png")));
    }//GEN-LAST:event_jQuiz2MouseMoved

    private void jQuiz2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jQuiz2MouseExited
     jQuiz2.setIcon(new ImageIcon (getClass().getResource("/img/quiz2.png")));
    }//GEN-LAST:event_jQuiz2MouseExited

    private void jQuiz3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jQuiz3MouseMoved
      jQuiz3.setIcon(new ImageIcon (getClass().getResource("/img/quizPress3.png")));
    }//GEN-LAST:event_jQuiz3MouseMoved

    private void jQuiz3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jQuiz3MouseExited
      jQuiz3.setIcon(new ImageIcon (getClass().getResource("/img/quiz3.png")));
    }//GEN-LAST:event_jQuiz3MouseExited

    private void jQuiz4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jQuiz4MouseMoved
     jQuiz4.setIcon(new ImageIcon (getClass().getResource("/img/quizPress4.png")));
    }//GEN-LAST:event_jQuiz4MouseMoved

    private void jQuiz4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jQuiz4MouseExited
      jQuiz4.setIcon(new ImageIcon (getClass().getResource("/img/quiz4.png")));
    }//GEN-LAST:event_jQuiz4MouseExited

    private void jQuiz1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jQuiz1MouseClicked
    Object[] opcoes = {"Sim", "Não"};
     
     int escolha = JOptionPane.showOptionDialog(null, "Você tem certeza disso?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
     
     if (escolha == JOptionPane.YES_OPTION) {
         if (alternativaCorreta == 1){
             jQuiz1.setIcon(new ImageIcon (getClass().getResource("/img/quizPress1R.png")));
             
             pontuacao += valorPergunta;
             valorPergunta *= 2;
             
             atualizarPontuacao();
             
             JOptionPane.showMessageDialog(null, "Certa a Resposta!");{
              proximaPergunta();
         }
              
             
         }else if (alternativaCorreta == 2) {
             jQuiz2.setIcon(new ImageIcon (getClass().getResource("/img/quiz2R.png")));
             
             pontuacao /= 2;
             
             atualizarPontuacao();
             VerificarAlternativa(1);
             
         }else if(alternativaCorreta == 3) {
             jQuiz3.setIcon(new ImageIcon (getClass().getResource("/img/quiz3R.png")));
             
              pontuacao /= 2;
             
             atualizarPontuacao();
              VerificarAlternativa(1);
         }else if(alternativaCorreta == 4) {
             jQuiz4.setIcon(new ImageIcon (getClass().getResource("/img/quiz4R.png")));
             
              pontuacao /= 2;
             
             atualizarPontuacao();
             VerificarAlternativa(1);
         }
     }
    }//GEN-LAST:event_jQuiz1MouseClicked

    private void jQuiz2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jQuiz2MouseClicked
      Object[] opcoes = {"Sim", "Não"};
     
     int escolha = JOptionPane.showOptionDialog(null, "Você tem certeza disso?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
     
     if (escolha == JOptionPane.YES_OPTION) {
         if (alternativaCorreta == 1){
             jQuiz1.setIcon(new ImageIcon (getClass().getResource("/img/quiz1R.png")));
             
             pontuacao /= 2;
             
             atualizarPontuacao();
              VerificarAlternativa(2);
             
         }else if(alternativaCorreta == 2) {
             jQuiz2.setIcon(new ImageIcon (getClass().getResource("/img/quizPress2R.png")));
             
             pontuacao += valorPergunta;
             valorPergunta *= 2;
             
             atualizarPontuacao();
             
             
            JOptionPane.showMessageDialog(null, "Certa a Resposta!");{
              proximaPergunta();
         }
             
         
              
         }else if(alternativaCorreta == 3) {
             jQuiz3.setIcon(new ImageIcon (getClass().getResource("/img/quiz3R.png")));
             
             pontuacao /= 2;
             
             atualizarPontuacao();
              VerificarAlternativa(2);
             
         }else if(alternativaCorreta == 4) {
             jQuiz4.setIcon(new ImageIcon (getClass().getResource("/img/quiz4R.png")));
             
              pontuacao /= 2;
             
             atualizarPontuacao();
              VerificarAlternativa(2);
         }
     }
    }//GEN-LAST:event_jQuiz2MouseClicked

    private void jQuiz3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jQuiz3MouseClicked
      Object[] opcoes = {"Sim", "Não"};
     
     int escolha = JOptionPane.showOptionDialog(null, "Você tem certeza disso?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
     
     if (escolha == JOptionPane.YES_OPTION) {
         if (alternativaCorreta == 1){
             jQuiz1.setIcon(new ImageIcon (getClass().getResource("/img/quiz1R.png")));
             
             pontuacao /= 2;
             
             atualizarPontuacao();
              VerificarAlternativa(3);
             
         }else if(alternativaCorreta == 2) {
             jQuiz2.setIcon(new ImageIcon (getClass().getResource("/img/quiz2R.png")));
             
              pontuacao /= 2;
             
             atualizarPontuacao();
              VerificarAlternativa(3);
             
         }else if(alternativaCorreta == 3) {
             jQuiz3.setIcon(new ImageIcon (getClass().getResource("/img/quizPress3R.png")));
             
              pontuacao += valorPergunta;
             valorPergunta *= 2;
             
             atualizarPontuacao();
             
              JOptionPane.showMessageDialog(null, "Certa a Resposta!");{
              proximaPergunta();
         }
             
         }else if(alternativaCorreta == 4) {
             jQuiz4.setIcon(new ImageIcon (getClass().getResource("/img/quiz4R.png")));
             
              pontuacao /= 2;
             
             atualizarPontuacao();
              VerificarAlternativa(3);
         }
     }
    }//GEN-LAST:event_jQuiz3MouseClicked

    private void jQuiz4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jQuiz4MouseClicked
      Object[] opcoes = {"Sim", "Não"};
     
     int escolha = JOptionPane.showOptionDialog(null, "Você tem certeza disso?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
     
     if (escolha == JOptionPane.YES_OPTION) {
         
         if (alternativaCorreta == 1){
             jQuiz1.setIcon(new ImageIcon (getClass().getResource("/img/quiz1R.png")));
             
             pontuacao /= 2;
             
             atualizarPontuacao();
              VerificarAlternativa(4);
             
         }else if(alternativaCorreta == 2) {
             jQuiz2.setIcon(new ImageIcon (getClass().getResource("/img/quiz2R.png")));
             
             pontuacao /= 2;
             
             atualizarPontuacao();
              VerificarAlternativa(4);
             
         }else if(alternativaCorreta == 3) {
             jQuiz3.setIcon(new ImageIcon (getClass().getResource("/img/quiz3R.png")));
             
              pontuacao /= 2;
             
             atualizarPontuacao();
             VerificarAlternativa(4);
             
         }else if(alternativaCorreta == 4) {
             jQuiz4.setIcon(new ImageIcon (getClass().getResource("/img/quizPress4R.png")));
             
             pontuacao += valorPergunta;
             valorPergunta *= 2;
             
             atualizarPontuacao();
             
            
             JOptionPane.showMessageDialog(null, "Certa a Resposta!");{
              proximaPergunta();
         }
         }
     }
    }//GEN-LAST:event_jQuiz4MouseClicked

    private void jPularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPularMouseClicked
        if (contadorPulos < maxPulos) {
        contadorPulos++; 
        proximaPergunta(); 
        if (contadorPulos >= maxPulos) {
            jPular.setEnabled(false); 
            jPular.setIcon(new ImageIcon(getClass().getResource("/img/Pular.png"))); 
        }
    }
    }//GEN-LAST:event_jPularMouseClicked

    private void jAjudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jAjudaMouseClicked
      if (contadorAjuda <= maxAjuda) {
        contadorAjuda++; // Incrementa o contador de uso da ajuda

        // Eliminar uma alternativa incorreta
        ArrayList<JLabel> alternativas = new ArrayList<>();
        alternativas.add(jQuiz1A);
        alternativas.add(jQuiz2A);
        alternativas.add(jQuiz3A);
        alternativas.add(jQuiz4A);

        // Remove a alternativa correta da lista
        JLabel alternativaCorretaLabel = null;
        switch (alternativaCorreta) {
            case 1 -> alternativaCorretaLabel = jQuiz1A;
            case 2 -> alternativaCorretaLabel = jQuiz2A;
            case 3 -> alternativaCorretaLabel = jQuiz3A;
            case 4 -> alternativaCorretaLabel = jQuiz4A;
        }

        alternativas.remove(alternativaCorretaLabel);

        // Seleciona uma alternativa incorreta aleatória e a "elimina"
        Collections.shuffle(alternativas); // Embaralha as alternativas
        JLabel alternativaParaRemover = alternativas.get(0); // Pega a primeira da lista
        alternativaParaRemover.setText(""); // Remove o texto (ou pode usar .setVisible(false))

        // Desativa o botão de ajuda após atingir o limite de uso
        if (contadorAjuda >= maxAjuda) {
            jAjuda.setEnabled(false); // Desativa o botão
            jAjuda.setIcon(new ImageIcon(getClass().getResource("/img/Ajuda.png"))); // Ícone desativado, se houver
        }
    }
    }//GEN-LAST:event_jAjudaMouseClicked

    private void jDesistirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDesistirMouseClicked
       Object[] opcoes = {"Sim", "Não"};
       
       int resposta = JOptionPane.showOptionDialog(null, "Você tem certeza disso?", "Desistir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        
            if (resposta == JOptionPane.YES_OPTION){
                this.dispose();
                
                RankingSDM Rank = new RankingSDM();
                Rank.setSize(646, 462);
                Rank.show();
            }
    }//GEN-LAST:event_jDesistirMouseClicked
    

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
            java.util.logging.Logger.getLogger(PerguntasSDM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerguntasSDM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerguntasSDM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerguntasSDM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        PerguntasSDM perguntas = new PerguntasSDM();
        perguntas.show();
        perguntas.setSize(646, 462);
       
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerguntasSDM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jAjuda;
    private javax.swing.JLabel jDesistir;
    private javax.swing.JLabel jFundo;
    private javax.swing.JLabel jPonto;
    private javax.swing.JLabel jPular;
    private javax.swing.JLabel jQuestion;
    private javax.swing.JLabel jQuiz1;
    private javax.swing.JLabel jQuiz1A;
    private javax.swing.JLabel jQuiz2;
    private javax.swing.JLabel jQuiz2A;
    private javax.swing.JLabel jQuiz3;
    private javax.swing.JLabel jQuiz3A;
    private javax.swing.JLabel jQuiz4;
    private javax.swing.JLabel jQuiz4A;
    // End of variables declaration//GEN-END:variables
}
