/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;

/**
 *
 * @author xp
 */
public class VentanaCalculadora extends javax.swing.JFrame {

    double operando1 = 0;
    String operacion = "";
            
            
    public VentanaCalculadora() {
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

        boi = new javax.swing.JButton();
        pantalla = new javax.swing.JLabel();
        ce = new javax.swing.JButton();
        division = new javax.swing.JButton();
        e = new javax.swing.JButton();
        porcentaje = new javax.swing.JButton();
        corchete = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        resta = new javax.swing.JButton();
        suma = new javax.swing.JButton();
        X = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        button0 = new javax.swing.JButton();
        boton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        boi.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        boi.setText("boi");
        boi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boiMousePressed(evt);
            }
        });

        pantalla.setBackground(new java.awt.Color(51, 51, 51));
        pantalla.setFont(new java.awt.Font("Tw Cen MT", 0, 52)); // NOI18N
        pantalla.setForeground(new java.awt.Color(102, 255, 0));
        pantalla.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pantalla.setText("0");
        pantalla.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 0), 2, true));
        pantalla.setOpaque(true);

        ce.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ce.setText("ce");
        ce.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ceMousePressed(evt);
            }
        });

        division.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        division.setText("/");
        division.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                divisionMousePressed(evt);
            }
        });

        e.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        e.setText("e");
        e.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eMousePressed(evt);
            }
        });

        porcentaje.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        porcentaje.setText("%");
        porcentaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                porcentajeMousePressed(evt);
            }
        });

        corchete.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        corchete.setText("{");
        corchete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                corcheteMousePressed(evt);
            }
        });

        boton9.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        boton9.setText("9");
        boton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton9MousePressed(evt);
            }
        });

        boton8.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        boton8.setText("8");
        boton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton8MousePressed(evt);
            }
        });

        boton6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        boton6.setText("6");
        boton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton6MousePressed(evt);
            }
        });

        boton7.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        boton7.setText("7");
        boton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton7MousePressed(evt);
            }
        });

        boton5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        boton5.setText("5");
        boton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton5MousePressed(evt);
            }
        });

        boton4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        boton4.setText("4");
        boton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton4MousePressed(evt);
            }
        });

        resta.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        resta.setText("-");
        resta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                restaMousePressed(evt);
            }
        });

        suma.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        suma.setText("+");
        suma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sumaMousePressed(evt);
            }
        });

        X.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        X.setText("x");
        X.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                XMousePressed(evt);
            }
        });

        boton3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        boton3.setText("3");
        boton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton3MousePressed(evt);
            }
        });

        igual.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        igual.setText("=");
        igual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                igualMousePressed(evt);
            }
        });

        boton2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        boton2.setText("2");
        boton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton2MousePressed(evt);
            }
        });

        button0.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        button0.setText("0");
        button0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button0MousePressed(evt);
            }
        });

        boton1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        boton1.setText("1");
        boton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boi, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ce, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(division, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(corchete, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(X, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(resta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(suma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pantalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(button0, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ce, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(division, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(e, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(X, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(corchete, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(resta, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(suma, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button0, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void botonPulsado(String numeroPulsado){
       String numeroEnPantalla = pantalla.getText();
       if(numeroEnPantalla == "0"){
           pantalla.setText(numeroPulsado);
       }else{
           pantalla.setText(numeroEnPantalla + numeroPulsado);
       }
       
    }
    private void operacionPulsada(String opera){
       operando1 = Double.valueOf(pantalla.getText());
        pantalla.setText("0");
        operacion = opera;
    }
    
    private void boiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boiMousePressed
        botonPulsado("boi");
    }//GEN-LAST:event_boiMousePressed

    private void ceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ceMousePressed
        pantalla.setText("0");
    }//GEN-LAST:event_ceMousePressed

    private void divisionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_divisionMousePressed
        operacionPulsada("/");
    }//GEN-LAST:event_divisionMousePressed

    private void eMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_eMousePressed

    private void porcentajeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_porcentajeMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_porcentajeMousePressed

    private void corcheteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_corcheteMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_corcheteMousePressed

    private void boton9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton9MousePressed
        botonPulsado("9");
    }//GEN-LAST:event_boton9MousePressed

    private void boton8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton8MousePressed
        botonPulsado("8");
    }//GEN-LAST:event_boton8MousePressed

    private void boton6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton6MousePressed
        botonPulsado("6");
    }//GEN-LAST:event_boton6MousePressed

    private void boton7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton7MousePressed
        botonPulsado("7");
    }//GEN-LAST:event_boton7MousePressed

    private void boton5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton5MousePressed
        botonPulsado("5");
    }//GEN-LAST:event_boton5MousePressed

    private void boton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton4MousePressed
        botonPulsado("4");
    }//GEN-LAST:event_boton4MousePressed

    private void restaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restaMousePressed
        operacionPulsada("-");
    }//GEN-LAST:event_restaMousePressed

    private void sumaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sumaMousePressed
        operacionPulsada("+");
    }//GEN-LAST:event_sumaMousePressed

    private void XMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMousePressed
        operacionPulsada("*");
    }//GEN-LAST:event_XMousePressed

    private void boton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton3MousePressed
        botonPulsado("3");
    }//GEN-LAST:event_boton3MousePressed

    private void igualMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_igualMousePressed
        double operando2 = Double.valueOf(pantalla.getText());
        if(operacion.equals("+")){
            operando1 = operando1 + operando2;
        }
         if(operacion.equals("-")){
            operando1 = operando1 - operando2;
        }
          if(operacion.equals("/")){
            operando1 = operando1 / operando2;
        }
           if(operacion.equals("*")){
            operando1 = operando1 * operando2;
        }
           pantalla.setText(String.valueOf(operando1));
           
    }//GEN-LAST:event_igualMousePressed

    private void boton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton2MousePressed
       botonPulsado("2");
    }//GEN-LAST:event_boton2MousePressed

    private void button0MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button0MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_button0MousePressed

    private void boton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton1MousePressed
        botonPulsado("1");
    }//GEN-LAST:event_boton1MousePressed

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
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton X;
    private javax.swing.JButton boi;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton button0;
    private javax.swing.JButton ce;
    private javax.swing.JButton corchete;
    private javax.swing.JButton division;
    private javax.swing.JButton e;
    private javax.swing.JButton igual;
    private javax.swing.JLabel pantalla;
    private javax.swing.JButton porcentaje;
    private javax.swing.JButton resta;
    private javax.swing.JButton suma;
    // End of variables declaration//GEN-END:variables
}
