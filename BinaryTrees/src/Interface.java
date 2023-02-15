
import javax.swing.JFileChooser;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author pbara
 */
public class Interface extends javax.swing.JFrame {

    /**
     * Creates new form Interface
     */
    public Interface() {
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

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        boximagen = new javax.swing.JComboBox<>();
        txtimagen = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarchivo = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtconsola = new javax.swing.JTextArea();
        btnguardar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnarboles = new javax.swing.JButton();
        btnsig = new javax.swing.JButton();
        btnauto = new javax.swing.JButton();
        btntrans = new javax.swing.JButton();
        btnabrir = new javax.swing.JButton();
        btnanalizar = new javax.swing.JButton();
        btngenerar = new javax.swing.JButton();
        btnguardarcomo = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jFrame3.setAlwaysOnTop(true);
        jFrame3.setBackground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(30, 36, 37));
        jPanel2.setLayout(null);

        boximagen.setBackground(new java.awt.Color(204, 102, 0));
        boximagen.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        boximagen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        boximagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boximagenActionPerformed(evt);
            }
        });
        jPanel2.add(boximagen);
        boximagen.setBounds(710, 80, 230, 40);

        txtimagen.setBackground(new java.awt.Color(185, 195, 196));
        txtimagen.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout txtimagenLayout = new javax.swing.GroupLayout(txtimagen);
        txtimagen.setLayout(txtimagenLayout);
        txtimagenLayout.setHorizontalGroup(
            txtimagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );
        txtimagenLayout.setVerticalGroup(
            txtimagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        jPanel2.add(txtimagen);
        txtimagen.setBounds(710, 150, 470, 430);

        txtarchivo.setBackground(new java.awt.Color(185, 195, 196));
        txtarchivo.setColumns(20);
        txtarchivo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtarchivo.setForeground(new java.awt.Color(0, 0, 0));
        txtarchivo.setRows(5);
        jScrollPane1.setViewportView(txtarchivo);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(20, 150, 430, 370);

        txtconsola.setBackground(new java.awt.Color(185, 195, 196));
        txtconsola.setColumns(20);
        txtconsola.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtconsola.setForeground(new java.awt.Color(0, 0, 0));
        txtconsola.setRows(5);
        jScrollPane2.setViewportView(txtconsola);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(20, 600, 1160, 160);

        btnguardar.setBackground(new java.awt.Color(204, 102, 0));
        btnguardar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.setBorder(null);
        jPanel2.add(btnguardar);
        btnguardar.setBounds(170, 80, 130, 40);

        jPanel5.setBackground(new java.awt.Color(185, 195, 196));
        jPanel5.setLayout(null);

        btnarboles.setBackground(new java.awt.Color(204, 102, 0));
        btnarboles.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnarboles.setText("Árboles");
        btnarboles.setBorder(null);
        btnarboles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnarbolesActionPerformed(evt);
            }
        });
        jPanel5.add(btnarboles);
        btnarboles.setBounds(20, 50, 184, 50);

        btnsig.setBackground(new java.awt.Color(204, 102, 0));
        btnsig.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnsig.setText("Tabla de Siguientes");
        btnsig.setBorder(null);
        jPanel5.add(btnsig);
        btnsig.setBounds(20, 160, 184, 50);

        btnauto.setBackground(new java.awt.Color(204, 102, 0));
        btnauto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnauto.setText("Tabla de autómata");
        btnauto.setBorder(null);
        jPanel5.add(btnauto);
        btnauto.setBounds(20, 280, 184, 50);

        btntrans.setBackground(new java.awt.Color(204, 102, 0));
        btntrans.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btntrans.setText("Tabla de transiciones");
        btntrans.setBorder(null);
        jPanel5.add(btntrans);
        btntrans.setBounds(20, 390, 184, 50);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(470, 80, 220, 500);

        btnabrir.setBackground(new java.awt.Color(204, 102, 0));
        btnabrir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnabrir.setText("Abrir");
        btnabrir.setBorder(null);
        btnabrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnabrirActionPerformed(evt);
            }
        });
        jPanel2.add(btnabrir);
        btnabrir.setBounds(20, 80, 130, 40);

        btnanalizar.setBackground(new java.awt.Color(204, 102, 0));
        btnanalizar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnanalizar.setText("Analizar gramática");
        btnanalizar.setBorder(null);
        jPanel2.add(btnanalizar);
        btnanalizar.setBounds(250, 540, 200, 40);

        btngenerar.setBackground(new java.awt.Color(204, 102, 0));
        btngenerar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btngenerar.setText("Generar autómata");
        btngenerar.setBorder(null);
        btngenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngenerarActionPerformed(evt);
            }
        });
        jPanel2.add(btngenerar);
        btngenerar.setBounds(20, 540, 210, 40);

        btnguardarcomo.setBackground(new java.awt.Color(204, 102, 0));
        btnguardarcomo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnguardarcomo.setText("Guardar \ncomo");
        btnguardarcomo.setBorder(null);
        jPanel2.add(btnguardarcomo);
        btnguardarcomo.setBounds(320, 80, 130, 40);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(204, 102, 0));
        jTextField1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("     E x  R e g a n  U S A C");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(0, 0, 1210, 60);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boximagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boximagenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boximagenActionPerformed

    private void btnarbolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnarbolesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnarbolesActionPerformed

    private void btngenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenerarActionPerformed
        String consola="Bienvenidos al mundo";
        txtconsola.setText(consola);
    }//GEN-LAST:event_btngenerarActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnabrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnabrirActionPerformed
        JFileChooser abrir = new JFileChooser();
        int op = abrir.showOpenDialog(this);
        /*if (op==JFileChooser.APPROVE_OPTION){
            
            setArchivo(abrir.getSelectedFile().getPath());
            txtexaminar.setText(getArchivo());
        }*/
    }//GEN-LAST:event_btnabrirActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boximagen;
    private javax.swing.JButton btnabrir;
    private javax.swing.JButton btnanalizar;
    private javax.swing.JButton btnarboles;
    private javax.swing.JButton btnauto;
    private javax.swing.JButton btngenerar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnguardarcomo;
    private javax.swing.JButton btnsig;
    private javax.swing.JButton btntrans;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea txtarchivo;
    private javax.swing.JTextArea txtconsola;
    private javax.swing.JPanel txtimagen;
    // End of variables declaration//GEN-END:variables
}
