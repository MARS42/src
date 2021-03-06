/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Animaciones.Animacion;
//import Animacion.Animacion;
//import Animacion.Fade;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author omara
 */
public class MensajeError extends javax.swing.JFrame {

    /**
     * Creates new form Mensaje
     */
    //static MensajeError sin;
    Dimension screenSize;
    int xCenter, yCenter;
    
    Animacion show, hide;

    public MensajeError(String err) {
        initComponents();
        //sin = this;
        screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        xCenter = (screenSize.width - this.getWidth())/2;
        yCenter = 0;
        this.setLocation(xCenter, yCenter);
        
        show = new Animaciones.Animacion(this, getX(), getY() + getHeight() / 2, getWidth(), getHeight(), 
                () -> { setOpacity(1); return null; }, 3);
        show.setUpdateAction(() -> Opacidad(show.getLerp(), false));
        hide = new Animaciones.Animacion(this, getX(), getY(), getWidth(), getHeight(), () -> { setOpacity(0); dispose();return null; }, 3);
        hide.setUpdateAction(() -> Opacidad(hide.getLerp(), true));
        
//animacion();
        Mensaje.setText(err);
        setOpacity(0);
        show.Reinciar();
        setVisible(true);
    }

    public Void Opacidad(float lerp, boolean min)
    {
        if(min)
            setOpacity(1 - lerp);
        else
            setOpacity(lerp);
        return null;
    }
    
    public void MostrarNO(String err)
    {
        Mensaje.setText(err);
        requestFocus();

        //Login.ins.Darken();
        //preguntaa.setText(pregunta);
        //Controlador.main.AccionesVentana(this, () -> { setOpacity(1);setVisible(true); return null;}, 6);
        //setVisible(true);
        
//show.Reinciar();
    }
    
//    public void animacion() {
//        
//       
//          if ((this.getY() + (this.getHeight())) > screenSize.height) {
//            
//        } else {
//            Animacion.bajar(this.getY(), (this.getY() + (this.getHeight() / 2)), 1, 2, this);
////            Animacion.subir(this.getY(), (this.getY()-(this.getHeight()/2)), 2, 5, this);
//        }  
//       
//       
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Mensaje = new javax.swing.JTextPane();
        BtnRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 350, 350, 350));
        setMaximumSize(new java.awt.Dimension(400, 350));
        setMinimumSize(new java.awt.Dimension(400, 350));
        setName("Error"); // NOI18N
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(400, 350));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 350));
        setType(java.awt.Window.Type.UTILITY);

        jPanel3.setBackground(new java.awt.Color(0, 153, 204));

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(390, 40));

        jLabel1.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Error");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(390, 295));

        jScrollPane1.setBorder(null);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(370, 220));

        Mensaje.setEditable(false);
        Mensaje.setBorder(null);
        Mensaje.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N
        jScrollPane1.setViewportView(Mensaje);

        jPanel1.add(jScrollPane1);

        BtnRegistro.setBackground(new java.awt.Color(0, 153, 0));
        BtnRegistro.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BtnRegistro.setForeground(new java.awt.Color(255, 255, 255));
        BtnRegistro.setText("Continuar");
        BtnRegistro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnRegistro.setFocusable(false);
        BtnRegistro.setPreferredSize(new java.awt.Dimension(125, 35));
        BtnRegistro.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BtnRegistroMouseMoved(evt);
            }
        });
        BtnRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnRegistroMouseExited(evt);
            }
        });
        BtnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistroActionPerformed(evt);
            }
        });
        jPanel1.add(BtnRegistro);

        jPanel3.add(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistroActionPerformed
        // TODO add your handling code here:
        //Fade.JFrameFadeOut(1f, 0f, 0.1f, 30, this,Fade.DISPOSE);
        hide.Reinciar();
        //setVisible(false);
        //dispose();
    }//GEN-LAST:event_BtnRegistroActionPerformed

    private void BtnRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRegistroMouseExited
        // TODO add your handling code here:
        BtnRegistro.setBackground(new java.awt.Color(255, 102, 0));
    }//GEN-LAST:event_BtnRegistroMouseExited

    private void BtnRegistroMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRegistroMouseMoved
        // TODO add your handling code here:
        //[255,122,47]
        BtnRegistro.setBackground(new java.awt.Color(255, 122, 47));
    }//GEN-LAST:event_BtnRegistroMouseMoved

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegistro;
    public static javax.swing.JTextPane Mensaje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
