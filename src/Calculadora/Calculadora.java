
package Calculadora;

//import Operaciones.Operaciones;
import Operaciones.Operaciones;
import javax.swing.JOptionPane;


public class Calculadora extends javax.swing.JFrame {
    
    Operaciones ope= new Operaciones();
    
    String valor1 = "";
    String cantidad = "";
    int bndp = 0;
    int bnd0 = 0;
    int op = 0;

    public Calculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jPanel3 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jDisplay = new javax.swing.JTextField();
        jButtonretroceder = new javax.swing.JButton();
        jLmensaje = new javax.swing.JToolBar();
        mensaje = new java.awt.Label();
        jButtonraiz = new javax.swing.JButton();
        jButtonpotencia = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButtondivicion = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButtonnume5 = new javax.swing.JButton();
        jButtonmultiplicacion = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButtonsuma = new javax.swing.JButton();
        jButtonigual = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButtonresta = new javax.swing.JButton();
        jButtonpunto = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jButton5.setText("<");

        jButton18.setText("<");

        jButton33.setBackground(new java.awt.Color(255, 0, 51));
        jButton33.setForeground(new java.awt.Color(255, 255, 255));
        jButton33.setText("<");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jDisplay.setBackground(new java.awt.Color(51, 51, 51));
        jDisplay.setForeground(new java.awt.Color(255, 255, 255));
        jDisplay.setCaretColor(new java.awt.Color(255, 255, 255));
        jDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDisplayActionPerformed(evt);
            }
        });

        jButtonretroceder.setBackground(new java.awt.Color(56, 56, 56));
        jButtonretroceder.setForeground(new java.awt.Color(255, 255, 255));
        jButtonretroceder.setText("C");
        jButtonretroceder.setAutoscrolls(true);
        jButtonretroceder.setName("jButtonretroceder"); // NOI18N
        jButtonretroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonretrocederActionPerformed(evt);
            }
        });

        jLmensaje.setRollover(true);

        mensaje.setBackground(new java.awt.Color(51, 51, 51));
        mensaje.setForeground(new java.awt.Color(255, 255, 255));
        mensaje.setText("Resultado   ");
        jLmensaje.add(mensaje);
        mensaje.getAccessibleContext().setAccessibleName("");

        jButtonraiz.setBackground(new java.awt.Color(56, 56, 56));
        jButtonraiz.setForeground(new java.awt.Color(255, 255, 255));
        jButtonraiz.setText("√");
        jButtonraiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonraizActionPerformed(evt);
            }
        });

        jButtonpotencia.setBackground(new java.awt.Color(56, 56, 56));
        jButtonpotencia.setForeground(new java.awt.Color(255, 255, 255));
        jButtonpotencia.setText("^");
        jButtonpotencia.setMargin(new java.awt.Insets(2, 14, 2, 20));
        jButtonpotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonpotenciaActionPerformed(evt);
            }
        });

        jButtonLimpiar.setBackground(new java.awt.Color(56, 56, 56));
        jButtonLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLimpiar.setText("CE");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(56, 56, 56));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("8");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(56, 56, 56));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButtondivicion.setBackground(new java.awt.Color(56, 56, 56));
        jButtondivicion.setForeground(new java.awt.Color(255, 255, 255));
        jButtondivicion.setText("/");
        jButtondivicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtondivicionActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(56, 56, 56));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButtonnume5.setBackground(new java.awt.Color(56, 56, 56));
        jButtonnume5.setForeground(new java.awt.Color(255, 255, 255));
        jButtonnume5.setText("5");
        jButtonnume5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonnume5ActionPerformed(evt);
            }
        });

        jButtonmultiplicacion.setBackground(new java.awt.Color(56, 56, 56));
        jButtonmultiplicacion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonmultiplicacion.setText("x");
        jButtonmultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonmultiplicacionActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(56, 56, 56));
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("9");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton0.setBackground(new java.awt.Color(56, 56, 56));
        jButton0.setForeground(new java.awt.Color(255, 255, 255));
        jButton0.setText("0");
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(56, 56, 56));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(56, 56, 56));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("6");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButtonsuma.setBackground(new java.awt.Color(56, 56, 56));
        jButtonsuma.setForeground(new java.awt.Color(255, 255, 255));
        jButtonsuma.setText("+");
        jButtonsuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsumaActionPerformed(evt);
            }
        });

        jButtonigual.setBackground(new java.awt.Color(56, 56, 56));
        jButtonigual.setForeground(new java.awt.Color(255, 255, 255));
        jButtonigual.setText("=");
        jButtonigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonigualActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(56, 56, 56));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(56, 56, 56));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButtonresta.setBackground(new java.awt.Color(56, 56, 56));
        jButtonresta.setForeground(new java.awt.Color(255, 255, 255));
        jButtonresta.setText("-");
        jButtonresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonrestaActionPerformed(evt);
            }
        });

        jButtonpunto.setBackground(new java.awt.Color(56, 56, 56));
        jButtonpunto.setForeground(new java.awt.Color(255, 255, 255));
        jButtonpunto.setText(".");
        jButtonpunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonpuntoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonnume5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonmultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtondivicion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonretroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonraiz, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonpotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLmensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonresta, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonpunto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonigual, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonsuma, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonretroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonraiz, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonpotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtondivicion, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonnume5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonmultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonresta, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonsuma, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonigual, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonpunto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLmensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonretroceder.getAccessibleContext().setAccessibleName("");
        jButtonretroceder.getAccessibleContext().setAccessibleDescription("r");

        jMenu1.setText("File");

        jMenu3.setText("Datos");
        jMenu1.add(jMenu3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

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
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonmultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonmultiplicacionActionPerformed
       op=3;
       mensaje.setText( jDisplay.getText()+" * ");
       operador();
    }//GEN-LAST:event_jButtonmultiplicacionActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        valor1 = "7";
        concatena();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        valor1 = "9";
        concatena();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButtonretrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonretrocederActionPerformed
jDisplay.setText(jDisplay.getText().substring(0,jDisplay.getText().length()-1));
       if(jDisplay.getText().length()==0){
           jDisplay.setText("0.0");
       }        
    }//GEN-LAST:event_jButtonretrocederActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        valor1 = "0";
        concatena();
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        valor1 = "1";
        concatena();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        valor1 = "2";
        concatena();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        valor1 = "3";
        concatena();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        valor1 = "4";
        concatena();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButtonnume5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonnume5ActionPerformed
        valor1 = "5";
        concatena();
    }//GEN-LAST:event_jButtonnume5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        valor1 = "6";
        concatena();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        valor1 = "8";
        concatena();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        jDisplay.setText("esperando instruccion");
        op=0;
        limpiar();
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonraizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonraizActionPerformed
        op=5;
       mensaje.setText( mensaje.getText() + " √ ");
       operador();
    }//GEN-LAST:event_jButtonraizActionPerformed

    private void jButtonpotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonpotenciaActionPerformed
       op=6;
       mensaje.setText( jDisplay.getText()+" ^ ");
       operador();
    }//GEN-LAST:event_jButtonpotenciaActionPerformed

    private void jButtonigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonigualActionPerformed
         ope.setY(Double.parseDouble(jDisplay.getText()));
       mensaje.setText(mensaje.getText()+jDisplay.getText());
       seleccion();
    }//GEN-LAST:event_jButtonigualActionPerformed

    private void jButtonpuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonpuntoActionPerformed
        if(bndp==0){
            valor1=".";
            bndp=1;
            concatena();
        }
    }//GEN-LAST:event_jButtonpuntoActionPerformed

    private void jButtonrestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonrestaActionPerformed
        op=2;
       mensaje.setText( jDisplay.getText()+"-");
       operador();
    }//GEN-LAST:event_jButtonrestaActionPerformed

    private void jButtondivicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondivicionActionPerformed
        op=4;
       mensaje.setText( jDisplay.getText()+" / ");
       operador();
    }//GEN-LAST:event_jButtondivicionActionPerformed

    private void jButtonsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsumaActionPerformed
        op=1;
       mensaje.setText( jDisplay.getText()+ " + ");
       operador();
    }//GEN-LAST:event_jButtonsumaActionPerformed

    private void jDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDisplayActionPerformed

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtondivicion;
    private javax.swing.JButton jButtonigual;
    private javax.swing.JButton jButtonmultiplicacion;
    private javax.swing.JButton jButtonnume5;
    private javax.swing.JButton jButtonpotencia;
    private javax.swing.JButton jButtonpunto;
    private javax.swing.JButton jButtonraiz;
    private javax.swing.JButton jButtonresta;
    private javax.swing.JButton jButtonretroceder;
    private javax.swing.JButton jButtonsuma;
    private javax.swing.JTextField jDisplay;
    private javax.swing.JToolBar jLmensaje;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private java.awt.Label mensaje;
    // End of variables declaration//GEN-END:variables

    private void concatena() {
        cantidad = cantidad + valor1;
       
         jDisplay.setText(cantidad);
    }
public void seleccion(){
        switch(op){
            case 1:
                jDisplay.setText(""+ope.suma());
            break;
              case 2:
                jDisplay.setText(""+ope.resta());
            break;
              case 3:
             
                jDisplay.setText(""+ope.multiplicacion());
            break;
            case 4:
                  if(ope.getY()==0){
                      JOptionPane.showMessageDialog(null,"Division entre cer0","Syntax Error",JOptionPane.ERROR_MESSAGE);
                  }
                jDisplay.setText(""+ope.division());
            break;
              case 5:
                jDisplay.setText(""+ope.raiz());
            break;
              case 6:
                jDisplay.setText(""+ope.potencia());
            break;
              default:
                   JOptionPane.showMessageDialog(null,"Estas bien pendejo","Error",JOptionPane.ERROR_MESSAGE);
              break;
        }
    //    jLmensaje.setText(jLmensaje.getText()+" = "+jDisplay.getText());
    }

    private void limpiar() {
        jDisplay.setText("0.0");
        cantidad="";
        valor1="";
        bndp=0;
    }

    private void operador() {
        ope.setA(Double.parseDouble(jDisplay.getText()));
        limpiar();
    }


    
}
