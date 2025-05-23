/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.user;

import controller.ProfileController;
import controller.ResidueController;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.Residue;
import model.User;

/**
 *
 * @author juand
 */
public class Recycle extends javax.swing.JFrame {

    /**
     * Creates new form Recycle
     */
    public Recycle() {
        initComponents();
        ResidueController.showResidueController(tbResidues);
        YourPoints();
        txtYourPoints.setEnabled(false);
        txtRecyclePoints.setEnabled(false);
        txtTotalPoints.setEnabled(false);
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
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnBack1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbResidues = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtYourPoints = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        txtTotalPoints = new javax.swing.JTextField();
        txtRecyclePoints = new javax.swing.JTextField();
        btnCalculate = new javax.swing.JButton();
        btnRecycle = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setType(java.awt.Window.Type.UTILITY);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(10, 49, 48));
        jPanel4.setPreferredSize(new java.awt.Dimension(467, 117));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/logo4.png"))); // NOI18N
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 80, 110));

        btnBack1.setBackground(new java.awt.Color(85, 140, 54));
        btnBack1.setForeground(new java.awt.Color(255, 255, 255));
        btnBack1.setText("BACK");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });
        jPanel4.add(btnBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 80, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(128, 204, 40));
        jLabel10.setText("ECO");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 13, 100, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(128, 204, 40));
        jLabel11.setText("FRIENDLY");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 43, 150, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("CODE");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 73, 50, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Recycle");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 140, 80));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 110));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N
        jLabel1.setText("Look for the material you want to recycle");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 158, -1, 20));
        jPanel3.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 185, 260, -1));

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/search.png"))); // NOI18N
        btnSearch.setPreferredSize(new java.awt.Dimension(33, 5));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel3.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, -1, 30));

        tbResidues.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbResidues.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbResiduesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbResidues);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 217, 300, 242));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Your Points:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 94, -1));

        jLabel15.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N
        jLabel15.setText("Recycle Points:");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Weight:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 87, -1));

        jLabel16.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 22)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Total Points:");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 87, -1));
        jPanel3.add(txtYourPoints, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 88, -1));

        txtWeight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtWeightKeyTyped(evt);
            }
        });
        jPanel3.add(txtWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 88, -1));
        jPanel3.add(txtTotalPoints, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 88, -1));
        jPanel3.add(txtRecyclePoints, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 88, -1));

        btnCalculate.setText("CALCULATE");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });
        jPanel3.add(btnCalculate, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 144, 45));

        btnRecycle.setText("RECYCLE");
        btnRecycle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecycleActionPerformed(evt);
            }
        });
        jPanel3.add(btnRecycle, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 144, 45));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/recicle2.jpg"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 171, 250, 260));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        dispose();
        UsersView usersView = new UsersView();
        usersView.setLocationRelativeTo(null);
        usersView.setVisible(true);
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        addFilter(tbResidues, txtSearch, 2);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        if (!validador()) return;
        int total = Calculate();
        txtTotalPoints.setText(total + "");
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void tbResiduesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbResiduesMouseClicked
        Residue r = ResidueController.selectResidueController(tbResidues);
        txtRecyclePoints.setText(String.valueOf(r.getPoints()));
    }//GEN-LAST:event_tbResiduesMouseClicked

    private void btnRecycleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecycleActionPerformed
        if (!validador()) return;
        int total = Calculate();
        ProfileController.insertPoints(total);
        JOptionPane.showMessageDialog(null, "Recycle successfully");

        this.dispose(); 
        UsersView view = new UsersView();
        view.setLocationRelativeTo(null);
        view.setVisible(true);

    }//GEN-LAST:event_btnRecycleActionPerformed

    private void txtWeightKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWeightKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) && c != '.' && c != KeyEvent.VK_BACK_SPACE) {
            evt.consume();
        }

        if (c == '.' && txtWeight.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtWeightKeyTyped
    
    private void YourPoints() {
        User u = ProfileController.getProfile();
        txtYourPoints.setText(String.valueOf(u.getPoints()));
    }

    private boolean validador() {
        if (txtYourPoints.getText().equals("") || txtRecyclePoints.getText().equals("") || txtWeight.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter a valid value");
            return false;
        }
        return true;
    }

    private int Calculate() {

            int yourPoints = Integer.parseInt(txtYourPoints.getText());
            int recyclePoints = Integer.parseInt(txtRecyclePoints.getText());
            double weight = Double.parseDouble(txtWeight.getText());
            return (int) Math.round(yourPoints + (recyclePoints * weight));

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
            java.util.logging.Logger.getLogger(Recycle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Recycle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Recycle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recycle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recycle().setVisible(true);
            }
        });
    }
    
    public void addFilter(JTable table, JTextField textField, int columnIndex) {
        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(table.getModel());
        table.setRowSorter(rowSorter);

        textField.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                filtrar();
            }

            @Override
            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                filtrar();
            }

            @Override
            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                filtrar();
            }

            private void filtrar() {
                String searchText = textField.getText();
                if (searchText.trim().isEmpty()) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + searchText, columnIndex)); 
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnRecycle;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbResidues;
    private javax.swing.JTextField txtRecyclePoints;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTotalPoints;
    private javax.swing.JTextField txtWeight;
    private javax.swing.JTextField txtYourPoints;
    // End of variables declaration//GEN-END:variables
}
