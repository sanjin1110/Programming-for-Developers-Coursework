package GuiApp;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author user
 */
public class Select extends javax.swing.JFrame {

    /**
     * Creates new form Select
     */
    public Select() {
        initComponents();
        setTitle("Select Feature");
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        addHouse = new javax.swing.JButton();
        connectpipe = new javax.swing.JButton();
        viewHouse = new javax.swing.JButton();
        viewpipe = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(248, 253, 167));
        jPanel1.setPreferredSize(new java.awt.Dimension(549, 364));

        jLabel1.setBackground(new java.awt.Color(204, 102, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(11, 57, 215));
        jLabel1.setText("Choose Action");

        addHouse.setBackground(new java.awt.Color(51, 51, 255));
        addHouse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addHouse.setForeground(new java.awt.Color(255, 255, 255));
        addHouse.setText("Add House");
        addHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addHouseActionPerformed(evt);
            }
        });

        connectpipe.setBackground(new java.awt.Color(51, 51, 255));
        connectpipe.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        connectpipe.setForeground(new java.awt.Color(255, 255, 255));
        connectpipe.setText("Connect Pipes");
        connectpipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectpipeActionPerformed(evt);
            }
        });

        viewHouse.setBackground(new java.awt.Color(51, 51, 255));
        viewHouse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        viewHouse.setForeground(new java.awt.Color(255, 255, 255));
        viewHouse.setText("View House");
        viewHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewHouseActionPerformed(evt);
            }
        });

        viewpipe.setBackground(new java.awt.Color(51, 51, 255));
        viewpipe.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        viewpipe.setForeground(new java.awt.Color(255, 255, 255));
        viewpipe.setText("Show Connection");
        viewpipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewpipeActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(215, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(connectpipe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewHouse, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addHouse, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewpipe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addHouse)
                .addGap(18, 18, 18)
                .addComponent(viewHouse)
                .addGap(18, 18, 18)
                .addComponent(connectpipe)
                .addGap(18, 18, 18)
                .addComponent(viewpipe)
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void connectpipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectpipeActionPerformed
        // TODO add your handling code here:
        dispose();
        new AddCon().setVisible(true);
        
    }//GEN-LAST:event_connectpipeActionPerformed

    private void viewpipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewpipeActionPerformed
        // TODO add your handling code here:
        try { 
            // file path to  open
            File u = new File("details.txt"); 

            Desktop d = Desktop.getDesktop(); 
            d.open(u); 
        } catch (IOException eevt) { 
            JOptionPane.showMessageDialog(this, eevt.getMessage()); 
        } 
        
    }//GEN-LAST:event_viewpipeActionPerformed

    private void addHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addHouseActionPerformed
        // TODO add your handling code here:
        dispose();
        new Addhouse().setVisible(true);
    }//GEN-LAST:event_addHouseActionPerformed

    private void viewHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewHouseActionPerformed
        // TODO add your handling code here:
        dispose();
        new viewhouse();
    }//GEN-LAST:event_viewHouseActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        new Dashboard().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addHouse;
    private javax.swing.JButton connectpipe;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton viewHouse;
    private javax.swing.JButton viewpipe;
    // End of variables declaration//GEN-END:variables
}