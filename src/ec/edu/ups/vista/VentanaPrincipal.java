/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Amstrong
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    int c;
    ImageIcon o;
    ImageIcon x;
    int[][] m;
    int fin;

    public VentanaPrincipal() {
        fin = 0;
        c = 0;
        o = new ImageIcon("0.jpg");
        x = new ImageIcon("X.jpg");
        m = new int[3][3];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = 0;
            }
        }

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

        jLabel1 = new javax.swing.JLabel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        jLabelResultado = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btn1.setBackground(new java.awt.Color(51, 255, 255));
        btn1.setForeground(new java.awt.Color(51, 255, 51));
        btn1.setToolTipText("");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1);
        btn1.setBounds(40, 290, 100, 82);

        btn2.setBackground(new java.awt.Color(51, 255, 255));
        btn2.setForeground(new java.awt.Color(51, 255, 51));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2);
        btn2.setBounds(40, 210, 100, 83);

        btn3.setBackground(new java.awt.Color(51, 255, 255));
        btn3.setForeground(new java.awt.Color(51, 255, 51));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3);
        btn3.setBounds(40, 130, 100, 79);

        btn4.setBackground(new java.awt.Color(51, 255, 255));
        btn4.setForeground(new java.awt.Color(51, 255, 51));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4);
        btn4.setBounds(140, 130, 100, 82);

        btn5.setBackground(new java.awt.Color(51, 255, 255));
        btn5.setForeground(new java.awt.Color(51, 255, 51));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5);
        btn5.setBounds(240, 210, 100, 83);

        btn6.setBackground(new java.awt.Color(51, 255, 255));
        btn6.setForeground(new java.awt.Color(51, 255, 51));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6);
        btn6.setBounds(140, 290, 100, 79);

        btn7.setBackground(new java.awt.Color(51, 255, 255));
        btn7.setForeground(new java.awt.Color(51, 255, 51));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7);
        btn7.setBounds(240, 290, 100, 82);

        btn8.setBackground(new java.awt.Color(51, 255, 255));
        btn8.setForeground(new java.awt.Color(51, 255, 51));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8);
        btn8.setBounds(140, 210, 100, 83);

        btn9.setBackground(new java.awt.Color(51, 255, 255));
        btn9.setForeground(new java.awt.Color(51, 255, 51));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9);
        btn9.setBounds(240, 130, 100, 82);

        btnReiniciar.setBackground(new java.awt.Color(255, 0, 0));
        btnReiniciar.setForeground(new java.awt.Color(255, 102, 102));
        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btnReiniciar);
        btnReiniciar.setBounds(120, 50, 142, 23);

        jLabelResultado.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        getContentPane().add(jLabelResultado);
        jLabelResultado.setBounds(65, 1402, 179, 0);

        jLabel3.setBackground(new java.awt.Color(51, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(280, 48, 146, 0);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/3.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 480, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        btn4.setIcon(new ImageIcon(x.getImage().getScaledInstance(100, 100, 100)));
        m[0][1] = 1;

        btn4.setEnabled(false);
        c++;
        maquina();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        btn8.setIcon(new ImageIcon(x.getImage().getScaledInstance(100, 100, 100)));
        m[1][2] = 1;

        btn8.setEnabled(false);
        c++;
        maquina();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        btn9.setIcon(new ImageIcon(x.getImage().getScaledInstance(100, 100, 100)));
        m[2][2] = 1;

        btn9.setEnabled(false);
        c++;
        maquina();
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        btn3.setIcon(new ImageIcon(x.getImage().getScaledInstance(100, 100, 100)));
        m[2][0] = 1;

        btn3.setEnabled(false);
        c++;
        maquina();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        btn5.setIcon(new ImageIcon(x.getImage().getScaledInstance(100, 100, 100)));
        m[1][1] = 1;

        btn5.setEnabled(false);
        c++;
        maquina();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        btn2.setIcon(new ImageIcon(x.getImage().getScaledInstance(100, 100, 100)));
        m[1][0] = 1;

        btn2.setEnabled(false);
        c++;
        maquina();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed

        btn1.setIcon(new ImageIcon(x.getImage().getScaledInstance(100, 100, 100)));
        m[0][0] = 1;

        btn1.setEnabled(false);
        c++;
        maquina();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        btn6.setIcon(new ImageIcon(x.getImage().getScaledInstance(100, 100, 100)));
        m[2][1] = 1;

        btn6.setEnabled(false);
        c++;
        maquina();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        btn7.setIcon(new ImageIcon(x.getImage().getScaledInstance(100, 100, 100)));
        m[0][2] = 1;

        btn7.setEnabled(false);
        c++;
        maquina();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        //  VentanaPrincipal.main (null);
        c = 0;
        fin = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = 0;
            }
        }
        btn1.setIcon(null);
        btn2.setIcon(null);
        btn3.setIcon(null);
        btn4.setIcon(null);
        btn5.setIcon(null);
        btn6.setIcon(null);
        btn7.setIcon(null);
        btn8.setIcon(null);
        btn9.setIcon(null);
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);

    }//GEN-LAST:event_btnReiniciarActionPerformed
    private void maquina() {
        int x = -1;
        int y = -1;
        int co = 0;
        int cn = 0;
        int n = 3;
        do {
            n--;
            for (int i = 0; i < m.length && cn == 0; i++) {
                co = 0;
                if (m[i][co] == 0 && cn == 0) {
                    if (i == 0 && cn == 0) {
                        if (m[i + 1][co] == m[i + 2][co] && m[i + 1][co] == n) {
                            x = i;
                            y = co;
                            cn = 1;
                        }
                    }
                    if (i == 1 && cn == 0) {
                        if (m[i - 1][co] == m[i + 1][co] && m[i - 1][co] == n) {
                            x = i;
                            y = co;
                            cn = 1;
                        }
                    }
                    if (i == 2 && cn == 0) {
                        if (m[i - 1][co] == m[i - 2][co] && m[i - 1][co] == n) {
                            x = i;
                            y = co;
                            cn = 1;
                        }
                    }
                    if (m[i][co + 1] == m[i][co + 2] && m[i][co + 1] == n && cn == 0) {
                        x = i;
                        y = co;
                        cn = 1;
                    }
                }
            }
            for (int i = 0; i < m.length && cn == 0; i++) {
                co = 1;
                if (m[i][co] == 0 && cn == 0) {
                    if (i == 0 && cn == 0) {
                        if (m[i + 1][co] == m[i + 2][co] && m[i + 1][co] == n) {
                            x = i;
                            y = co;
                            cn = 1;
                        }
                    }
                    if (i == 1 && cn == 0) {
                        if (m[i - 1][co] == m[i + 1][co] && m[i - 1][co] == n) {
                            x = i;
                            y = co;
                            cn = 1;
                        }
                    }
                    if (i == 2 && cn == 0) {
                        if (m[i - 1][co] == m[i - 2][co] && m[i - 1][co] == n) {
                            x = i;
                            y = co;
                            cn = 1;
                        }
                    }
                    if (m[i][co - 1] == m[i][co + 1] && m[i][co - 1] == n && cn == 0) {
                        x = i;
                        y = co;
                        cn = 1;
                    }
                }
            }
            for (int i = 0; i < m.length && cn == 0; i++) {
                co = 2;
                if (m[i][co] == 0 && cn == 0) {
                    if (i == 0 && cn == 0) {
                        if (m[i + 1][co] == m[i + 2][co] && m[i + 1][co] == n) {
                            x = i;
                            y = co;
                            cn = 1;
                        }
                    }
                    if (i == 1 && cn == 0) {
                        if (m[i - 1][co] == m[i + 1][co] && m[i - 1][co] == n) {
                            x = i;
                            y = co;
                            cn = 1;
                        }
                    }
                    if (i == 2 && cn == 0) {
                        if (m[i - 1][co] == m[i - 2][co] && m[i - 1][co] == n) {
                            x = i;
                            y = co;
                            cn = 1;
                        }
                    }
                    if (m[i][co - 2] == m[i][co - 1] && m[i][co - 2] == n && cn == 0) {
                        x = i;
                        y = co;
                        cn = 1;
                    }
                }
            }

            if (m[1][1] == 0 && cn == 0) {
                if (m[0][0] == m[2][2] && m[0][0] == n) {
                    x = 1;
                    y = 1;
                    cn = 1;
                }
                if (m[0][2] == m[2][0] && m[0][2] == n && cn == 0) {
                    x = 1;
                    y = 1;
                    cn = 1;
                }
            }
            if (m[0][0] == 0 && cn == 0) {
                if (m[1][1] == m[2][2] && m[1][1] == n) {
                    x = 0;
                    y = 0;
                    cn = 1;
                }
            }
            if (m[0][2] == 0 && cn == 0) {
                if (m[1][1] == m[2][0] && m[1][1] == n) {
                    x = 0;
                    y = 2;
                    cn = 1;
                }
            }
            if (m[2][0] == 0 && cn == 0) {
                if (m[1][1] == m[0][2] && m[1][1] == n) {
                    x = 2;
                    y = 0;
                    cn = 1;
                }
            }
            if (m[2][2] == 0 && cn == 0) {
                if (m[1][1] == m[0][0] && m[1][1] == n) {
                    x = 2;
                    y = 2;
                    cn = 1;
                }
            }

        } while (cn == 0 && n != 1);

        if (cn == 0 && c != 9) {
            do {
                x = (int) (Math.random() * 3);
                y = (int) (Math.random() * 3);
                if (m[x][y] == 0) {
                    cn = 1;
                }
            } while (cn == 0);
        }
        if (x == 0 && y == 0) {
            btn1.setIcon(new ImageIcon(o.getImage().getScaledInstance(100, 100, 100)));
            m[0][0] = 2;
            c++;
            btn1.setEnabled(false);
        }
        if (x == 1 && y == 0) {
            btn2.setIcon(new ImageIcon(o.getImage().getScaledInstance(100, 100, 100)));
            m[1][0] = 2;
            c++;
            btn2.setEnabled(false);
        }
        if (x == 2 && y == 0) {
            btn3.setIcon(new ImageIcon(o.getImage().getScaledInstance(100, 100, 100)));
            m[2][0] = 2;
            c++;
            btn3.setEnabled(false);
        }
        if (x == 0 && y == 1) {
            btn4.setIcon(new ImageIcon(o.getImage().getScaledInstance(100, 100, 100)));
            m[0][1] = 2;
            c++;
            btn4.setEnabled(false);
        }
        if (x == 1 && y == 1) {
            btn5.setIcon(new ImageIcon(o.getImage().getScaledInstance(100, 100, 100)));
            m[1][1] = 2;
            c++;
            btn5.setEnabled(false);
        }
        if (x == 2 && y == 1) {
            btn6.setIcon(new ImageIcon(o.getImage().getScaledInstance(100, 100, 100)));
            m[2][1] = 2;
            c++;
            btn6.setEnabled(false);
        }
        if (x == 0 && y == 2) {
            btn7.setIcon(new ImageIcon(o.getImage().getScaledInstance(100, 100, 100)));
            m[0][2] = 2;
            c++;
            btn7.setEnabled(false);
        }
        if (x == 1 && y == 2) {
            btn8.setIcon(new ImageIcon(o.getImage().getScaledInstance(100, 100, 100)));
            m[1][2] = 2;
            c++;
            btn8.setEnabled(false);
        }
        if (x == 2 && y == 2) {
            btn9.setIcon(new ImageIcon(o.getImage().getScaledInstance(100, 100, 100)));
            m[2][2] = 2;
            c++;
            btn9.setEnabled(false);
        }

        if (m[0][0] == m[0][1] && m[0][0] == m[0][2] && m[0][0] != 0) {
            fin = m[0][0];
        } else if (m[1][0] == m[1][1] && m[1][0] == m[1][2] && m[1][0] != 0) {
            fin = m[1][0];
        } else if (m[2][0] == m[2][1] && m[2][0] == m[2][2] && m[2][0] != 0) {
            fin = m[2][0];
        } else if (m[0][0] == m[1][0] && m[0][0] == m[2][0] && m[0][0] != 0) {
            fin = m[0][0];
        } else if (m[0][1] == m[1][1] && m[0][1] == m[2][1] && m[0][1] != 0) {
            fin = m[0][1];
        } else if (m[0][2] == m[1][2] && m[0][2] == m[2][2] && m[0][2] != 0) {
            fin = m[0][2];
        } else if (m[0][0] == m[1][1] && m[0][0] == m[2][2] && m[0][0] != 0) {
            fin = m[0][0];
        } else if (m[0][2] == m[1][1] && m[0][2] == m[2][0] && m[0][2] != 0) {
            fin = m[0][2];
        }

        if (fin != 0 || c == 9) {
            if (fin != 0) {
                if (fin == 1) {
                    jLabelResultado.setText("El Ganador es: X");
                } else {
                    jLabelResultado.setText("El Ganador es: O");
                }
                btn1.setEnabled(false);
                btn2.setEnabled(false);
                btn3.setEnabled(false);
                btn4.setEnabled(false);
                btn5.setEnabled(false);
                btn6.setEnabled(false);
                btn7.setEnabled(false);
                btn8.setEnabled(false);
                btn9.setEnabled(false);
            } else {
                jLabelResultado.setText("Empate");
            }
        }

    }

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelResultado;
    // End of variables declaration//GEN-END:variables
}
