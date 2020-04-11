/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Animaciones.Animacion;
import Animaciones.Controlador;
import java.awt.Color;
import java.awt.Component;
import java.util.concurrent.Callable;
import javax.swing.ImageIcon;

/**
 *
 * @author Robert
 */
public class Salida extends javax.swing.JFrame {
    
    Component c;
    Callable<Void> callcerrar, callmostrar, callcerrartodo;
    
    /**
     * Creates new form Salida
     */
//    public Salida() {
//        initComponents();
//        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/papeleria.png")).getImage());
//        //setLocationRelativeTo(c);
//        setOpacity(0);
//    }
    
    public Salida(Component c, String pregunta, Callable<Void> callin, Callable<Void> callout, Callable end) {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/papeleria.png")).getImage());
        //setLocationRelativeTo(c);
        //setOpacity(0);
        preguntaa.setText(pregunta);
        this.c = c;
        this.callcerrar = callin;
        this.callmostrar = callout;
        this.callcerrartodo = end;
        
        setVisible(false);
    }

    public void Mostrar()
    {
        setLocationRelativeTo(c);
        requestFocus();
        //Login.ins.Darken();
        //preguntaa.setText(pregunta);
        c.setEnabled(false);
        try{ callmostrar.call(); }catch(Exception ex){}
        //Controlador.main.AccionesVentana(this, () -> { setOpacity(1);setVisible(true); return null;}, 6);
        setVisible(true);
    }
    public void Ocultar(boolean todo)
    {
        c.setEnabled(true);
        setVisible(false);
        try
        {
            if(!todo)
                callcerrar.call();
            else
                callcerrartodo.call();
        }catch(Exception e){}
    }
    
    
    public Void Opacidad(float lerp, boolean min)
    {
        if(min)
            setOpacity(1 - lerp);
        else
            setOpacity(lerp);
        System.out.println("dsads");
        return null;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        preguntaa = new javax.swing.JLabel();
        botones = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(400, 150));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 150));
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new java.awt.FlowLayout());

        preguntaa.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        preguntaa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        preguntaa.setText("¿SEGURO DESEA SALIR?");
        preguntaa.setPreferredSize(new java.awt.Dimension(300, 60));
        getContentPane().add(preguntaa);

        botones.setPreferredSize(new java.awt.Dimension(300, 50));
        botones.setRequestFocusEnabled(false);

        jButton1.setBackground(new java.awt.Color(255, 102, 51));
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SI");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setPreferredSize(new java.awt.Dimension(100, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        botones.add(jButton1);

        jSeparator1.setMinimumSize(new java.awt.Dimension(100, 10));
        jSeparator1.setPreferredSize(new java.awt.Dimension(20, 10));
        botones.add(jSeparator1);

        jButton2.setBackground(new java.awt.Color(255, 102, 51));
        jButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("NO");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setPreferredSize(new java.awt.Dimension(100, 30));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        botones.add(jButton2);

        getContentPane().add(botones);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //SI
        Ocultar(true);
        //Login.ins.CerrarDef();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Ocultar(false);
    }//GEN-LAST:event_jButton2ActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Salida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Salida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Salida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Salida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Salida().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botones;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel preguntaa;
    // End of variables declaration//GEN-END:variables
}
