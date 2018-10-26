/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.incurrency.framework.display;

import com.incurrency.framework.Algorithm;
import static com.incurrency.framework.Algorithm.timeZone;
import com.incurrency.framework.BeanSymbol;
import com.incurrency.framework.DateUtil;
import com.incurrency.framework.Pair;
import com.incurrency.framework.Parameters;
import com.incurrency.framework.Utilities;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.TimeZone;
import java.util.logging.Logger;

/**
 *
 * @author Pankaj
 */
public class PricesForm extends javax.swing.JFrame {

    private int rowno;
    private static final Logger logger = Logger.getLogger(MarketDataForm.class.getName());

    /**
     * Creates new form PricesForm
     */
    public PricesForm(int rowno) {
        initComponents();
        this.rowno = rowno;
        BeanSymbol s = Parameters.symbol.get(rowno);
        String symbol = s.getDisplayname();
        this.lblSymbol.setText(symbol);
        this.txtClose.setText(String.valueOf(s.getClosePrice()));
        this.txtOpen.setText(String.valueOf(s.getOpenPrice()));
        this.txtHigh.setText(String.valueOf(s.getHighPrice()));
        this.txtLow.setText(String.valueOf(s.getLowPrice()));
        this.txtVolume.setText(String.valueOf(s.getVolume()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lblSymbol = new javax.swing.JLabel();
        txtClose = new javax.swing.JTextField();
        txtOpen = new javax.swing.JTextField();
        txtHigh = new javax.swing.JTextField();
        txtLow = new javax.swing.JTextField();
        txtVolume = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblClose = new javax.swing.JLabel();
        lblOpen = new javax.swing.JLabel();
        lblHigh = new javax.swing.JLabel();
        lblLow = new javax.swing.JLabel();
        lblVolume = new javax.swing.JLabel();
        lblEmpty = new javax.swing.JLabel();
        btnReload = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        lblSymbol.setText("Symbol:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        getContentPane().add(lblSymbol, gridBagConstraints);

        txtClose.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        getContentPane().add(txtClose, gridBagConstraints);

        txtOpen.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        getContentPane().add(txtOpen, gridBagConstraints);

        txtHigh.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        getContentPane().add(txtHigh, gridBagConstraints);

        txtLow.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        getContentPane().add(txtLow, gridBagConstraints);

        txtVolume.setText("0");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        getContentPane().add(txtVolume, gridBagConstraints);

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        getContentPane().add(btnSave, gridBagConstraints);

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        getContentPane().add(btnCancel, gridBagConstraints);

        lblClose.setText("Close:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        getContentPane().add(lblClose, gridBagConstraints);

        lblOpen.setText("Open:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        getContentPane().add(lblOpen, gridBagConstraints);

        lblHigh.setText("High:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        getContentPane().add(lblHigh, gridBagConstraints);

        lblLow.setText("Low:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        getContentPane().add(lblLow, gridBagConstraints);

        lblVolume.setText("Volume:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        getContentPane().add(lblVolume, gridBagConstraints);

        lblEmpty.setText("                           ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        getContentPane().add(lblEmpty, gridBagConstraints);

        btnReload.setText("Reload");
        btnReload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReloadActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 0);
        getContentPane().add(btnReload, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        BeanSymbol s = Parameters.symbol.get(rowno);
        s.setClosePrice(Double.valueOf(txtClose.getText()));
        s.setOpenPrice(Double.valueOf(txtOpen.getText()));
        s.setHighPrice(Double.valueOf(txtHigh.getText()), true);
        s.setLowPrice(Double.valueOf(txtLow.getText()), true);
        s.setVolume(Integer.valueOf(txtVolume.getText()), true);
        dispose();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        dispose(); //Destroy the JFrame object
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnReloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReloadActionPerformed
        BeanSymbol s = Parameters.symbol.get(rowno);
        String today = DateUtil.getFormatedDate("yyyy-MM-dd", new Date().getTime(), TimeZone.getTimeZone(Algorithm.timeZone));
        today = today + " " + Algorithm.openHour + ":" + Algorithm.openMinute + ":" + "00";
        long ltoday = DateUtil.getFormattedDate(today, "yyyy-MM-dd HH:mm:ss", timeZone).getTime();
        if (new Date().getTime() > ltoday) {
            ArrayList<Pair> pairs = Utilities.getPrices(s, ":tick:close", DateUtil.getFormattedDate(today, "yyyy-MM-dd", timeZone), new Date());
            if (pairs.size() > 0) {
                ArrayList<Integer> itemsToRemove = new ArrayList<>();
                int i = -1;
                for (Pair p : pairs) {
                    i++;
                    if (p.getTime() < ltoday) {
                        itemsToRemove.add(i);
                    }
                }
                if (itemsToRemove.size() > 1) {
                    itemsToRemove.remove(itemsToRemove.size() - 1);
                }
                Collections.sort(itemsToRemove, Collections.reverseOrder());
                for (int r : itemsToRemove) {
                    pairs.remove(r);
                }
                double out = 0;
                for (Pair p : pairs) {
                    double value = Utilities.getDouble(p.getValue(), 0);
                    out = Math.max(out, value);
                }
                out = Math.max(out, s.getLastPrice());
                s.setHighPrice(out, false);
            }
        }

        today = DateUtil.getFormatedDate("yyyy-MM-dd", new Date().getTime(), TimeZone.getTimeZone(Algorithm.timeZone));
        today = today + " " + Algorithm.openHour + ":" + Algorithm.openMinute + ":" + "00";
        ltoday = DateUtil.getFormattedDate(today, "yyyy-MM-dd HH:mm:ss", timeZone).getTime();
        if (new Date().getTime() > ltoday) {
            ArrayList<Pair> pairs = Utilities.getPrices(s, ":tick:close", DateUtil.getFormattedDate(today, "yyyy-MM-dd", timeZone), new Date());
            if (pairs.size() > 0) {
                ArrayList<Integer> itemsToRemove = new ArrayList<>();
                int i = -1;
                for (Pair p : pairs) {
                    i++;
                    if (p.getTime() < ltoday) {
                        itemsToRemove.add(i);
                    }
                }
                if (itemsToRemove.size() > 1) {
                    itemsToRemove.remove(itemsToRemove.size() - 1);
                }
                Collections.sort(itemsToRemove, Collections.reverseOrder());
                for (int r : itemsToRemove) {
                    pairs.remove(r);
                }
                double out = Double.MAX_VALUE;
                for (Pair p : pairs) {
                    double value = Utilities.getDouble(p.getValue(), Double.MAX_VALUE);
                    out = Math.min(out, value);
                }
                out = Math.min(out, s.getLastPrice());
                s.setLowPrice(out, false);
            }
        }

        today = DateUtil.getFormatedDate("yyyy-MM-dd", new Date().getTime(), TimeZone.getTimeZone(Algorithm.timeZone));
        today = today + " " + Algorithm.openHour + ":" + Algorithm.openMinute + ":" + "00";
        ltoday = DateUtil.getFormattedDate(today, "yyyy-MM-dd HH:mm:ss", timeZone).getTime();
        if (new Date().getTime() > ltoday) {
            ArrayList<Pair> pairs = Utilities.getPrices(s, ":tick:close", DateUtil.getFormattedDate(today, "yyyy-MM-dd", timeZone), new Date());
            if (pairs.size() > 0) {
                ArrayList<Integer> itemsToRemove = new ArrayList<>();
                int i = -1;
                for (Pair p : pairs) {
                    i++;
                    if (p.getTime() < ltoday) {
                        itemsToRemove.add(i);
                    }
                }
                if (itemsToRemove.size() > 1) {
                    itemsToRemove.remove(itemsToRemove.size() - 1);
                }
                Collections.sort(itemsToRemove, Collections.reverseOrder());
                for (int r : itemsToRemove) {
                    pairs.remove(r);
                }
                double out = Utilities.getDouble(pairs.size() > 0 ? pairs.get(0).getValue() : 0, 0);
                s.setOpenPrice(out);
            }
        }

    }//GEN-LAST:event_btnReloadActionPerformed

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
            java.util.logging.Logger.getLogger(PricesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PricesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PricesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PricesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PricesForm(0).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnReload;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblEmpty;
    private javax.swing.JLabel lblHigh;
    private javax.swing.JLabel lblLow;
    private javax.swing.JLabel lblOpen;
    private javax.swing.JLabel lblSymbol;
    private javax.swing.JLabel lblVolume;
    private javax.swing.JTextField txtClose;
    private javax.swing.JTextField txtHigh;
    private javax.swing.JTextField txtLow;
    private javax.swing.JTextField txtOpen;
    private javax.swing.JTextField txtVolume;
    // End of variables declaration//GEN-END:variables

}