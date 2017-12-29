/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Connection.Database;
import Model.DijkstraAlgorithm;
import Model.DijkstraTest;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.graphstream.ui.graphicGraph.GraphicElement;
import org.graphstream.ui.graphicGraph.GraphicGraph;
import org.graphstream.ui.view.Camera;
import org.graphstream.ui.view.View;
import org.graphstream.ui.view.util.MouseManager;
import org.graphstream.ui.view.util.ShortcutManager;

/**
 *
 * @author VELIA
 */
public class App extends javax.swing.JFrame {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pstmt = null;

    /**
     * Creates new form App
     */
    public App() throws ClassNotFoundException, SQLException {
        initComponents();
        conn = Database.ConnectDB();
        listQp();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        panel1 = new java.awt.Panel();
        Judul = new java.awt.Label();
        canvas1 = new java.awt.Canvas();
        labelYourLocaton = new java.awt.Label();
        labelObject = new java.awt.Label();
        canvas2 = new java.awt.Canvas();
        jComboYourLocation = new javax.swing.JComboBox();
        jComboDestinationObject = new javax.swing.JComboBox();
        canvas3 = new java.awt.Canvas();
        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        show = new javax.swing.JPanel();
        path = new java.awt.TextArea();
        label3 = new java.awt.Label();
        jTextNearestObject = new javax.swing.JTextField();
        label5 = new java.awt.Label();
        distancesbycoor = new javax.swing.JTextField();
        distances1 = new javax.swing.JTextField();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("jCheckBoxMenuItem3");

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        jMenu3.setText("jMenu3");

        jMenuItem1.setText("jMenuItem1");

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

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 153, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Judul.setAlignment(java.awt.Label.CENTER);
        Judul.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Judul.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 48)); // NOI18N
        Judul.setForeground(new java.awt.Color(102, 153, 255));
        Judul.setMaximumSize(new java.awt.Dimension(52, 45));
        Judul.setText("Find It");
        getContentPane().add(Judul, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 156, 58));
        Judul.getAccessibleContext().setAccessibleName("Title");

        getContentPane().add(canvas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(897, 121, -1, -1));

        labelYourLocaton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        labelYourLocaton.setForeground(new java.awt.Color(102, 153, 255));
        labelYourLocaton.setText("Your Location");
        getContentPane().add(labelYourLocaton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        labelObject.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        labelObject.setForeground(new java.awt.Color(102, 153, 255));
        labelObject.setText("Destiantion Object");
        getContentPane().add(labelObject, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));
        getContentPane().add(canvas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(897, 770, -1, -1));

        jComboYourLocation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select your location" }));
        jComboYourLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboYourLocationActionPerformed(evt);
            }
        });
        getContentPane().add(jComboYourLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 146, -1));

        jComboDestinationObject.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Classroom", "Service Room", "Lecture/Staff Room", "Meeting Room", "Storage Room", "Server Room", "Kitchen", "Thesis Defence Room", "Musholla", "Longue", "Laboratory", "Toilet", "Secrretariat", "Student Meeting Room", "Practicum Laboratory" }));
        jComboDestinationObject.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboDestinationObjectPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboDestinationObject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboDestinationObjectActionPerformed(evt);
            }
        });
        getContentPane().add(jComboDestinationObject, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 146, -1));
        getContentPane().add(canvas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 24, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(240, 240, 240));

        label1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label1.setForeground(new java.awt.Color(102, 153, 255));
        label1.setText("Path");

        show.setBackground(new java.awt.Color(255, 255, 255));
        show.setForeground(new java.awt.Color(204, 204, 204));
        show.setToolTipText("");

        javax.swing.GroupLayout showLayout = new javax.swing.GroupLayout(show);
        show.setLayout(showLayout);
        showLayout.setHorizontalGroup(
            showLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 611, Short.MAX_VALUE)
        );
        showLayout.setVerticalGroup(
            showLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 503, Short.MAX_VALUE)
        );

        path.setForeground(new java.awt.Color(102, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(path, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(path, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 830, 560));

        label3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label3.setForeground(new java.awt.Color(102, 153, 255));
        label3.setText("Real Distance");
        getContentPane().add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, -1, 10));

        jTextNearestObject.setForeground(new java.awt.Color(102, 153, 255));
        getContentPane().add(jTextNearestObject, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 400, -1));

        label5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label5.setForeground(new java.awt.Color(102, 153, 255));
        label5.setText("-Nearest Object-");
        getContentPane().add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, -1, -1));

        distancesbycoor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distancesbycoorActionPerformed(evt);
            }
        });
        getContentPane().add(distancesbycoor, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 190, -1));

        distances1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distances1ActionPerformed(evt);
            }
        });
        getContentPane().add(distances1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 200, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jComboDestinationObjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboDestinationObjectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboDestinationObjectActionPerformed

    private void jComboYourLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboYourLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboYourLocationActionPerformed

    private void jComboDestinationObjectPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboDestinationObjectPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        String tmp = (String) jComboYourLocation.getSelectedItem();
        String sql= "select *from room where room_code=?";
        try {
            pstmt=conn.prepareStatement(sql);
            pstmt.setString(1, tmp);
            rs =pstmt.executeQuery();
            if (rs.next()) {
                DijkstraTest dt = new DijkstraTest();
//                String add1 = rs.getString("room_name");
//                jTextNearestObject.setText(add1);
//                path.setText(dt.testExcute(this, rs.getString("room_code")));
                
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jComboDestinationObjectPopupMenuWillBecomeInvisible

    private void distancesbycoorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distancesbycoorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_distancesbycoorActionPerformed

    private void distances1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distances1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_distances1ActionPerformed

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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new App().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label Judul;
    private java.awt.Canvas canvas1;
    private java.awt.Canvas canvas2;
    private java.awt.Canvas canvas3;
    private javax.swing.JTextField distances1;
    private javax.swing.JTextField distancesbycoor;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JComboBox jComboDestinationObject;
    private javax.swing.JComboBox jComboYourLocation;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JTextField jTextNearestObject;
    private java.awt.Label label1;
    private java.awt.Label label3;
    private java.awt.Label label5;
    private java.awt.Label labelObject;
    private java.awt.Label labelYourLocaton;
    private java.awt.Panel panel1;
    private java.awt.TextArea path;
    private javax.swing.JPanel show;
    // End of variables declaration//GEN-END:variables

   public void listQp() throws SQLException{
       String sql= "select *from room";
       pstmt =conn.prepareStatement(sql);
       rs = pstmt.executeQuery();
       while (rs.next()) {
           jComboYourLocation.addItem(rs.getString("room_code"));
       }
 
   }

    public JComboBox getjComboDestinationObject() {
        return jComboDestinationObject;
    }

    public JComboBox getjComboYourLocation() {
        return jComboYourLocation;
    }

    
   
    
}