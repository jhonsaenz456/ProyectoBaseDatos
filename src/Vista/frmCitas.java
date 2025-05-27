/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Modelo.fCitasMedicas;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Control.vCitasMedicas;
/**
 *
 * @author ASUS
 */
public class frmCitas extends javax.swing.JFrame {

    /**
     * Creates new form frmCitas
     */
    public frmCitas() {
        initComponents();
        mostrar();
    }

void mostrar(){
    try {
        DefaultTableModel modelo;
        fCitasMedicas func = new fCitasMedicas();
        modelo = func.mostrar();
        tbDatos.setModel(modelo);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(rootPane, e);
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        txtDetallesRegis = new javax.swing.JTextField();
        cbxMedicoDispo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cbxSede = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtMotivoCita = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbxEspecialidad = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDatos = new javax.swing.JTable();
        btnContinuar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnRetroceder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("REGISTRO DE CITAS ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 190, 70));

        jLabel2.setText("Sede");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jLabel3.setText("Fecha");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel4.setText("Hora");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        jLabel5.setText("MotivoCita");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 150, -1));
        getContentPane().add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 150, -1));
        getContentPane().add(txtDetallesRegis, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 230, -1));

        cbxMedicoDispo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Freddy", "Julio ", "Juan ", "Flor" }));
        cbxMedicoDispo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMedicoDispoActionPerformed(evt);
            }
        });
        getContentPane().add(cbxMedicoDispo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));

        jLabel6.setText("Medico Disponible");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        cbxSede.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lima Norte", "Callao ", "Chepen " }));
        getContentPane().add(cbxSede, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));

        jLabel7.setText("Detalles Registrados");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));
        getContentPane().add(txtMotivoCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 220, -1));

        jLabel8.setText("Especialidad");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        cbxEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ginecologia ", "Dermatologia" }));
        getContentPane().add(cbxEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        tbDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbDatos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 880, 300));

        btnContinuar.setText("CONTINUAR");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 620, 150, 60));

        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 620, 150, 60));

        btnRetroceder.setText("RETROCEDER");
        btnRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrocederActionPerformed(evt);
            }
        });
        getContentPane().add(btnRetroceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 620, 150, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxMedicoDispoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMedicoDispoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxMedicoDispoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        vCitasMedicas dts = new vCitasMedicas();
        fCitasMedicas func = new fCitasMedicas();
        dts.setMotivoCita(txtMotivoCita.getText());
        dts.setEspecialidad(cbxEspecialidad.getSelectedItem().toString());
        dts.setMedicoDisponible(cbxMedicoDispo.getSelectedItem().toString());
        dts.setSede(cbxSede.getSelectedItem().toString());
        dts.setFecha(txtFecha.getText()); 
        dts.setHora(txtHora.getText());   
        dts.setDetallesRegistrados(txtDetallesRegis.getText());
        func.Registrar(dts);
        mostrar();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed
        // TODO add your handling code here:
         frmEstudiantes form = new frmEstudiantes();
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRetrocederActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        // TODO add your handling code here:
        frmConfirmacionCita form = new frmConfirmacionCita();
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnContinuarActionPerformed

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
            java.util.logging.Logger.getLogger(frmCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCitas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRetroceder;
    private javax.swing.JComboBox<String> cbxEspecialidad;
    private javax.swing.JComboBox<String> cbxMedicoDispo;
    private javax.swing.JComboBox<String> cbxSede;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDatos;
    private javax.swing.JTextField txtDetallesRegis;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtMotivoCita;
    // End of variables declaration//GEN-END:variables
}
