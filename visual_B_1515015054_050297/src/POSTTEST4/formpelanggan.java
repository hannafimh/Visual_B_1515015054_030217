/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POSTTEST4;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.Event.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Spitzery
 */
public class formpelanggan extends javax.swing.JFrame {

    /**
     * Creates new form formpelanggan
     */
    public formpelanggan() {
        initComponents();
        nama1.getDocument().addDocumentListener(new DocumentListener() {
  public void changedUpdate(DocumentEvent e) {
    changed();
  }
  public void removeUpdate(DocumentEvent e) {
    changed();
  }
  public void insertUpdate(DocumentEvent e) {
    changed();
  }

  public void changed() {
     

  }
});
        telp.getDocument().addDocumentListener(new DocumentListener() {
  public void changedUpdate(DocumentEvent e) {
    changed();
  }
  public void removeUpdate(DocumentEvent e) {
    changed();
  }
  public void insertUpdate(DocumentEvent e) {
    changed();
  }

  public void changed() {
     if (nama1.getText().equals("")||telp.getText().equals("")){
       pro.setEnabled(false);
     }
     else {
       pro.setEnabled(true);
    }

  }
});
        addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent e)
        {
            
        }
    });
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        totalharga = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        telp = new javax.swing.JTextField();
        berat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        diskon = new javax.swing.JSlider();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        expr = new javax.swing.JRadioButton();
        reg = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        nama1 = new javax.swing.JTextField();
        diskonn = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        pro = new javax.swing.JButton();
        ulang = new javax.swing.JButton();
        keluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setForeground(new java.awt.Color(51, 51, 255));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setForeground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Moch. Hanafi");

        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 153, 255));
        jLabel2.setText("Form Pelanggan");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator3)
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addGap(45, 45, 45)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("NAMA");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        totalharga.setText("jTextField1");
        jPanel3.add(totalharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 100, -1));

        jLabel4.setText("No. Telpon");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        telp.setText("jTextField2");
        telp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telpMouseClicked(evt);
            }
        });
        telp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telpKeyTyped(evt);
            }
        });
        jPanel3.add(telp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 140, -1));

        berat.setText("0");
        berat.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel3.add(berat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 32, 30));

        jLabel5.setText("Berat Barang");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel6.setText("Kg");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        diskon.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                diskonStateChanged(evt);
            }
        });
        jPanel3.add(diskon, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 130, -1));

        jLabel7.setText("Atur Diskon");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, -1));

        jLabel8.setText("Jenis Jasa");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        buttonGroup1.add(expr);
        expr.setText("express");
        jPanel3.add(expr, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        buttonGroup1.add(reg);
        reg.setText("Reguler");
        jPanel3.add(reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        jLabel9.setText("Total Harga");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));

        nama1.setText("jTextField1");
        jPanel3.add(nama1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 140, -1));

        diskonn.setText("jLabel10");
        jPanel3.add(diskonn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 10, 190));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 170, 10));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 180, 10));

        pro.setText("Proses");
        pro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                proMouseClicked(evt);
            }
        });
        pro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proActionPerformed(evt);
            }
        });

        ulang.setText("Ulangi");
        ulang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ulangMouseClicked(evt);
            }
        });

        keluar.setText("Keluar");
        keluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                keluarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(pro)
                        .addGap(18, 18, 18)
                        .addComponent(ulang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(keluar)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pro)
                    .addComponent(ulang)
                    .addComponent(keluar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        nama1.setText("");
        telp.setText("");
        totalharga.setText("");
        diskonn.setText(""+diskon.getValue());
        diskon.setValue(50);
        totalharga.setEditable(false);
        
        
        
    }//GEN-LAST:event_formWindowOpened

    private void ulangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ulangMouseClicked
        // TODO add your handling code here:
        nama1.setText("");
        telp.setText("");
        totalharga.setText("");
        berat.setText("0");
        diskonn.setText(""+diskon.getValue());
        diskon.setValue(50);
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_ulangMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
                                        
    setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    
    }//GEN-LAST:event_formWindowClosing

    private void keluarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keluarMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_keluarMouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowClosed

    private void diskonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_diskonStateChanged
        // TODO add your handling code here:
        //JSlider source = (JSlider) event.getSource();
        diskonn.setText(""+diskon.getValue());
        
    }//GEN-LAST:event_diskonStateChanged

    private void telpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telpKeyTyped

    
    }//GEN-LAST:event_telpKeyTyped

    private void telpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telpMouseClicked
        // TODO add your handling code here:
        telp.setText("+628");
    }//GEN-LAST:event_telpMouseClicked

    private void proMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_proMouseClicked

    private void proActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proActionPerformed
        // TODO add your handling code here:
         int regu=0,exp=0;
        int Berat = Integer.parseInt(berat.getText());
        double Diskon =(double)diskon.getValue()/100;
        regu=(11500*Berat);
        exp=(int) (regu*1.5);
        if (reg.isSelected()==true){
            double total = regu-(regu*Diskon);
            totalharga.setText(String.valueOf(total));
        }
        if (expr.isSelected()==true){
            double total = exp-(exp*Diskon);
            totalharga.setText(String.valueOf(total));
        }
    }//GEN-LAST:event_proActionPerformed

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
            java.util.logging.Logger.getLogger(formpelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formpelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formpelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formpelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formpelanggan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField berat;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JSlider diskon;
    private javax.swing.JLabel diskonn;
    private javax.swing.JRadioButton expr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JButton keluar;
    private javax.swing.JTextField nama1;
    private javax.swing.JButton pro;
    private javax.swing.JRadioButton reg;
    private javax.swing.JTextField telp;
    private javax.swing.JTextField totalharga;
    private javax.swing.JButton ulang;
    // End of variables declaration//GEN-END:variables
}
