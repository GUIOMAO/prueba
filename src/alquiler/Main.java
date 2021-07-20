//Tarea Unidad 1 - Lenguaje de Programación Avanzado I
//Autores: Lady Guiovana Espitia Z - Henzcer Mauricio Peña I

//Cambio 2

package alquiler;

import java.text.DecimalFormat;

public class Main extends javax.swing.JFrame {

    private final double vlrBaseDia             = 50;
    private final double vlrAdicionalDiaCoche   = 1.5;
    private final double vlrAdicionalMicrobus   = 2;
    private final double vlrAdiconalFurgonXTonelada = 20;
    private final double vlrAdicionalCamion     = 40;
    
    
     public Main() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        placaInput = new javax.swing.JTextField();
        tipoVehiculoInput = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        nroDiasInput = new javax.swing.JTextField();
        calcularBoton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        vlrTotalOutput = new javax.swing.JLabel();
        nuevoBoton = new javax.swing.JButton();
        mensajeOutput = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pmaInput = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        label1 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplicación de alquiler de vehículos");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Tipo de vehículo");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Placa");

        placaInput.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        placaInput.setForeground(new java.awt.Color(204, 204, 204));
        placaInput.setToolTipText("Digite aquí su placa ...");
        placaInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placaInputActionPerformed(evt);
            }
        });

        tipoVehiculoInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Coche", "Microbus", "Furgoneta", "Camión" }));
        tipoVehiculoInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoVehiculoInputActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Nro días a alquilar");

        nroDiasInput.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        nroDiasInput.setForeground(new java.awt.Color(204, 204, 204));
        nroDiasInput.setToolTipText("Digite aquí su placa ...");
        nroDiasInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nroDiasInputActionPerformed(evt);
            }
        });

        calcularBoton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        calcularBoton.setForeground(new java.awt.Color(0, 153, 153));
        calcularBoton.setText("Calcular valor");
        calcularBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularBotonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("El valor del alquiler del vehículo es:");

        vlrTotalOutput.setBackground(new java.awt.Color(255, 255, 204));
        vlrTotalOutput.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        vlrTotalOutput.setForeground(new java.awt.Color(255, 0, 51));
        vlrTotalOutput.setText("0");

        nuevoBoton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nuevoBoton.setForeground(new java.awt.Color(0, 153, 153));
        nuevoBoton.setText("Limpiar");
        nuevoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoBotonActionPerformed(evt);
            }
        });

        mensajeOutput.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mensajeOutput.setForeground(new java.awt.Color(255, 0, 0));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Digite PMA en toneladas (0 para coche o microbus)");

        pmaInput.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        pmaInput.setForeground(new java.awt.Color(204, 204, 204));
        pmaInput.setToolTipText("Digite aquí su placa ...");
        pmaInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pmaInputActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alquiler/Logo.png"))); // NOI18N
        jLabel6.setText("jLabel6");

        label1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 153, 102));
        label1.setText("ALQUILER DE VEHICULOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(placaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tipoVehiculoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nroDiasInput, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(pmaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(mensajeOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(485, 485, 485)
                        .addComponent(calcularBoton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(544, 544, 544)
                        .addComponent(nuevoBoton)))
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(vlrTotalOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(placaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tipoVehiculoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(nroDiasInput, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pmaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(calcularBoton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(mensajeOutput)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vlrTotalOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel4)))
                .addGap(27, 27, 27)
                .addComponent(nuevoBoton)
                .addGap(50, 50, 50))
        );

        label1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcularBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularBotonActionPerformed
        mensajeOutput.setText(null);
                
        String placaVar       = this.placaInput.getText();
        int indexTipVehiSel   = this.tipoVehiculoInput.getSelectedIndex();
        String nroDiasVar     = this.nroDiasInput.getText();
        String pmaVar         = this.pmaInput.getText();  
        
        
        try{
            int nroDiasInt   = Integer.parseInt(nroDiasVar);
            int pmaInt       = Integer.parseInt(pmaVar);
            
            double vlrNeto      = vlrBaseDia * nroDiasInt;
            double vlrAdicional = 0;
        
            switch(indexTipVehiSel)
            {
               case 0 : // Coche
                  vlrAdicional = vlrAdicionalDiaCoche * nroDiasInt;
               break; 

               case 1 : // Microbus
                   vlrAdicional = (vlrAdicionalDiaCoche * nroDiasInt) + vlrAdicionalMicrobus;
               break;

               case 2 : //Furgoneta
                    vlrAdicional = pmaInt * vlrAdiconalFurgonXTonelada;
               break; 

               case 3: //Camión
                   vlrAdicional = (pmaInt * vlrAdiconalFurgonXTonelada) + vlrAdicionalCamion;
                   //vlrAdicional = (vlrAdicionalDiaCoche * nroDiasInt) + vlrAdicionalCamion;
               break;

               default:
                   System.err.println("Valor no válido");
            }

            double vlrTotal     = vlrNeto + vlrAdicional;

            DecimalFormat myFormatter = new DecimalFormat("$ ###,###.###");

            this.vlrTotalOutput.setText(myFormatter.format(vlrTotal));
        }catch(NumberFormatException nfe){
            this.vlrTotalOutput.setText("0");
            mensajeOutput.setText("Nro días inválidos");
                       

        }        
    }//GEN-LAST:event_calcularBotonActionPerformed

    private void nuevoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoBotonActionPerformed
        this.placaInput.setText(null);
        this.tipoVehiculoInput.setSelectedIndex(0);
        this.nroDiasInput.setText(null);
        this.vlrTotalOutput.setText(null);
        this.mensajeOutput.setText(null);
        this.pmaInput.setText(null);
    }//GEN-LAST:event_nuevoBotonActionPerformed

    private void tipoVehiculoInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoVehiculoInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoVehiculoInputActionPerformed

    private void pmaInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pmaInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pmaInputActionPerformed

    private void nroDiasInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nroDiasInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nroDiasInputActionPerformed

    private void placaInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placaInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_placaInputActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcularBoton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private java.awt.Label label1;
    private javax.swing.JLabel mensajeOutput;
    private javax.swing.JTextField nroDiasInput;
    private javax.swing.JButton nuevoBoton;
    private javax.swing.JTextField placaInput;
    private javax.swing.JTextField pmaInput;
    private javax.swing.JComboBox<String> tipoVehiculoInput;
    private javax.swing.JLabel vlrTotalOutput;
    // End of variables declaration//GEN-END:variables
}
