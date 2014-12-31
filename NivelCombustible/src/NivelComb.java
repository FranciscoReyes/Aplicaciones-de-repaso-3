
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class NivelComb extends javax.swing.JFrame {
    static final Logger LOG1 = Logger.getLogger("NivelComb.NivelComb");
    /**
     * Creates new form NivelComb
     */
    public NivelComb() {
        initComponents();
        LOG1.setLevel(Level.ALL);
        
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
        capacidad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        contenido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        reserva = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ancho = new javax.swing.JTextField();
        boton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pantalla = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Capacidad Depósito:");

        jLabel2.setText("Contenido:");

        jLabel3.setText("Reserva:");

        jLabel4.setText("Ancho Barra:");

        boton.setText("Generar");
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });

        pantalla.setEditable(false);
        pantalla.setColumns(20);
        pantalla.setRows(5);
        jScrollPane1.setViewportView(pantalla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(capacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contenido, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reserva, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ancho, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton))
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(capacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(reserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ancho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed
        pantalla.setText(null);
        int nCapacidad = 0;
        int nContenido = 0;
        int nReserva = 0;
        int nBarras = 0;
        
        //Este try-catch comprueba que el usuario no escribe letras en los campos a rellenar
        try {
        nCapacidad = Integer.valueOf(capacidad.getText());
        nContenido = Integer.valueOf(contenido.getText());
        nReserva = Integer.valueOf(reserva.getText());
        nBarras = Integer.valueOf(ancho.getText());
        } catch (NumberFormatException e1) {
            JOptionPane.showMessageDialog(this, "Error, inserte un número");
            LOG1.warning("Usuario ha introducido un caracter no numerico en un campo");
        }
        if (nContenido > nCapacidad || nReserva > nCapacidad) {
           JOptionPane.showMessageDialog(this, "Error, el contenido y/o reserva no puede ser mayor que la capacidad");
           LOG1.warning("Error, contenido y/o reserva > capacidad");
        } else {
            int nSinReserva;
            int nVacio;
            if (nContenido >= nReserva) {
                nVacio = nCapacidad - nContenido;
                nSinReserva = nContenido - nReserva;
            } else {
                nReserva = nReserva - nContenido;
                nSinReserva = 0;
                nVacio = nCapacidad - nContenido;
            }
            

            int ancho1;


            for (int r=1; r <= nReserva; r++) {
                ancho1=1;
                while ( ancho1 <= nBarras){
                    if (ancho1 == nBarras) {
                        pantalla.append("2\n");
                        ancho1++;

                    } else {
                        pantalla.append("2");
                        ancho1++;
                    }
                }
            }

            for (int cont= 1; cont <= nSinReserva; cont++) {
                ancho1=1;
                while (ancho1 <= nBarras) {
                    if (ancho1 == nBarras) {
                        pantalla.append("1\n");
                        ancho1++;
                    } else {
                        pantalla.append("1");
                        ancho1++;
                    }
                }
            }

            for (int vacio=1; vacio<= nVacio; vacio++) {
                ancho1=1;
                while (ancho1 <= nBarras) {
                    if (ancho1 == nBarras) {
                        pantalla.append("0\n");
                        ancho1++;
                    } else {
                        pantalla.append("0");
                        ancho1++;
                    }   
                }
            } 
        }
        
        
        
        
    }//GEN-LAST:event_botonActionPerformed

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
            java.util.logging.Logger.getLogger(NivelComb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NivelComb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NivelComb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NivelComb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NivelComb().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ancho;
    private javax.swing.JButton boton;
    private javax.swing.JTextField capacidad;
    private javax.swing.JTextField contenido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea pantalla;
    private javax.swing.JTextField reserva;
    // End of variables declaration//GEN-END:variables
}
