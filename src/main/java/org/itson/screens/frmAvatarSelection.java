/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.itson.screens;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.itson.domaincomponent.domain.Player;
import org.itson.enums.PlayerNames;
import org.itson.methods.tile.Methods;

/**
 *
 * @author santi
 */
public class frmAvatarSelection extends javax.swing.JFrame {

    private static frmAvatarSelection avatarSelectionInstance;
    private Methods methods = new Methods();

    /**
     * Creates new form frmAvatarSelection
     */
    public frmAvatarSelection() {
        initComponents();
    }

    private void closeCurrentWindow() {
        this.setVisible(false);
    }

    public static frmAvatarSelection getInstance() {
        if (avatarSelectionInstance == null) {
            avatarSelectionInstance = new frmAvatarSelection();
        }
        return avatarSelectionInstance;
    }

    public Player createPlayer() {
        return new Player(methods.getSelectedAvatarEnum(avatarSeleccionado.getIcon().toString()).toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoPanel = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        TituloMenor = new javax.swing.JLabel();
        elGallo = new javax.swing.JButton();
        elBorracho = new javax.swing.JButton();
        laDama = new javax.swing.JButton();
        elApache = new javax.swing.JButton();
        elValiente = new javax.swing.JButton();
        laChalupa = new javax.swing.JButton();
        elDiablito = new javax.swing.JButton();
        elSol = new javax.swing.JButton();
        unirse = new javax.swing.JButton();
        avatarSeleccionado = new javax.swing.JLabel();
        Titulo1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));

        fondoPanel.setMaximumSize(new java.awt.Dimension(1280, 720));
        fondoPanel.setMinimumSize(new java.awt.Dimension(1280, 720));
        fondoPanel.setPreferredSize(new java.awt.Dimension(1280, 720));
        fondoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("SansSerif", 0, 48)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.setText("Iniciar sesión");
        fondoPanel.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, 60));

        TituloMenor.setBackground(new java.awt.Color(0, 0, 0));
        TituloMenor.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        TituloMenor.setForeground(new java.awt.Color(0, 0, 0));
        TituloMenor.setText("Escoge tu avatar");
        fondoPanel.add(TituloMenor, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 190, 30));

        elGallo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/avatars/El_Gallo.jpg"))); // NOI18N
        elGallo.setBorder(null);
        elGallo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elGalloActionPerformed(evt);
            }
        });
        fondoPanel.add(elGallo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, -1));

        elBorracho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/avatars/El_borracho.jpg"))); // NOI18N
        elBorracho.setBorder(null);
        elBorracho.setBorderPainted(false);
        elBorracho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elBorrachoActionPerformed(evt);
            }
        });
        fondoPanel.add(elBorracho, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, -1, -1));

        laDama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/avatars/La_dama.jpg"))); // NOI18N
        laDama.setBorder(null);
        laDama.setBorderPainted(false);
        laDama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laDamaActionPerformed(evt);
            }
        });
        fondoPanel.add(laDama, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, -1, -1));

        elApache.setIcon(new javax.swing.ImageIcon(getClass().getResource("/avatars/El_apache.jpg"))); // NOI18N
        elApache.setBorder(null);
        elApache.setBorderPainted(false);
        elApache.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elApacheActionPerformed(evt);
            }
        });
        fondoPanel.add(elApache, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 120, -1, -1));

        elValiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/avatars/El_Valiente.jpg"))); // NOI18N
        elValiente.setBorder(null);
        elValiente.setBorderPainted(false);
        elValiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elValienteActionPerformed(evt);
            }
        });
        fondoPanel.add(elValiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, -1, -1));

        laChalupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/avatars/La_chalupa.jpg"))); // NOI18N
        laChalupa.setBorder(null);
        laChalupa.setBorderPainted(false);
        laChalupa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laChalupaActionPerformed(evt);
            }
        });
        fondoPanel.add(laChalupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, -1, -1));

        elDiablito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/avatars/El_diablo.jpg"))); // NOI18N
        elDiablito.setBorder(null);
        elDiablito.setBorderPainted(false);
        elDiablito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elDiablitoActionPerformed(evt);
            }
        });
        fondoPanel.add(elDiablito, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 360, -1, -1));

        elSol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/avatars/El_sol.jpg"))); // NOI18N
        elSol.setBorder(null);
        elSol.setBorderPainted(false);
        elSol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elSolActionPerformed(evt);
            }
        });
        fondoPanel.add(elSol, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 360, -1, -1));

        unirse.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        unirse.setText("Ir al lobby");
        unirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unirseActionPerformed(evt);
            }
        });
        fondoPanel.add(unirse, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 630, -1, -1));

        avatarSeleccionado.setEnabled(false);
        fondoPanel.add(avatarSeleccionado, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 150, 220));

        Titulo1.setFont(new java.awt.Font("SansSerif", 0, 48)); // NOI18N
        Titulo1.setForeground(new java.awt.Color(0, 0, 0));
        Titulo1.setText("Tu seleccion");
        fondoPanel.add(Titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 270, 40));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/fondo.jpeg"))); // NOI18N
        fondoPanel.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * This method is an event handler for a user action, in this case clicking
     * the button, when triggered, it loads an image file named
     * "El_borracho.jpg" and sets it as the icon for the GUI component
     * 'avatarSeleccionado'.
     *
     * @param evt a button click event
     */
    private void elBorrachoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elBorrachoActionPerformed
        ImageIcon avatar = new ImageIcon("src/main/resources/avatars/El_borracho.jpg"); // Reemplaza con la ruta correcta de la imagen  

        avatarSeleccionado.setIcon(avatar);
        avatarSeleccionado.setEnabled(true);
    }//GEN-LAST:event_elBorrachoActionPerformed
    /**
     * This method is an event handler for a user action, in this case clicking
     * the button, when triggered, it loads an image file named "El_apache.jpg"
     * and sets it as the icon for the GUI component 'avatarSeleccionado'.
     *
     * @param evt a button click event
     */
    private void elApacheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elApacheActionPerformed
        ImageIcon avatar = new ImageIcon("src/main/resources/avatars/El_apache.jpg"); // Reemplaza con la ruta correcta de la imagen  
        avatarSeleccionado.setIcon(avatar);
        avatarSeleccionado.setEnabled(true);
    }//GEN-LAST:event_elApacheActionPerformed
    /**
     * This method is an event handler for a user action, in this case clicking
     * the button, when triggered, it loads an image file named
     * "El_Valiente.jpg" and sets it as the icon for the GUI component
     * 'avatarSeleccionado'.
     *
     * @param evt a button click event
     */
    private void elValienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elValienteActionPerformed
        ImageIcon avatar = new ImageIcon("src/main/resources/avatars/El_Valiente.jpg"); // Reemplaza con la ruta correcta de la imagen  
        avatarSeleccionado.setIcon(avatar);
        avatarSeleccionado.setEnabled(true);
    }//GEN-LAST:event_elValienteActionPerformed

    private void unirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unirseActionPerformed
        if (avatarSeleccionado.isEnabled()) {
           
            frmHome.getInstance().setPlayer(createPlayer());
            frmHome.getInstance().setVisible(true); 
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona un avatar para jugar", "avatar no seleccionado", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_unirseActionPerformed
    /**
     * This method is an event handler for a user action, in this case clicking
     * the button, when triggered, it loads an image file named "El_Gallo.jpg"
     * and sets it as the icon for the GUI component 'avatarSeleccionado'.
     *
     * @param evt a button click event
     */
    private void elGalloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elGalloActionPerformed
        ImageIcon avatar = new ImageIcon("src/main/resources/avatars/El_Gallo.jpg"); // Reemplaza con la ruta correcta de la imagen  
        avatarSeleccionado.setIcon(avatar);
        avatarSeleccionado.setEnabled(true);

    }//GEN-LAST:event_elGalloActionPerformed
    /**
     * This method is an event handler for a user action, in this case clicking
     * the button, when triggered, it loads an image file named "La_dama.jpg"
     * and sets it as the icon for the GUI component 'avatarSeleccionado'.
     *
     * @param evt a button click event
     */
    private void laDamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laDamaActionPerformed
        ImageIcon avatar = new ImageIcon("src/main/resources/avatars/La_dama.jpg"); // Reemplaza con la ruta correcta de la imagen  
        avatarSeleccionado.setIcon(avatar);
        avatarSeleccionado.setEnabled(true);
    }//GEN-LAST:event_laDamaActionPerformed
    /**
     * This method is an event handler for a user action, in this case clicking
     * the button, when triggered, it loads an image file named "La_chalupa.jpg"
     * and sets it as the icon for the GUI component 'avatarSeleccionado'.
     *
     * @param evt a button click event
     */
    private void laChalupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laChalupaActionPerformed
        ImageIcon avatar = new ImageIcon("src/main/resources/avatars/La_chalupa.jpg"); // Reemplaza con la ruta correcta de la imagen  
        avatarSeleccionado.setIcon(avatar);
        avatarSeleccionado.setEnabled(true);
    }//GEN-LAST:event_laChalupaActionPerformed
    /**
     * This method is an event handler for a user action, in this case clicking
     * the button, when triggered, it loads an image file named "El_diablo.jpg"
     * and sets it as the icon for the GUI component 'avatarSeleccionado'.
     *
     * @param evt a button click event
     */
    private void elDiablitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elDiablitoActionPerformed
        ImageIcon avatar = new ImageIcon("src/main/resources/avatars/El_diablo.jpg"); // Reemplaza con la ruta correcta de la imagen  
        avatarSeleccionado.setIcon(avatar);
        avatarSeleccionado.setEnabled(true);
    }//GEN-LAST:event_elDiablitoActionPerformed
    /**
     * This method is an event handler for a user action, in this case clicking
     * the button, when triggered, it loads an image file named "El_sol.jpg" and
     * sets it as the icon for the GUI component 'avatarSeleccionado'.
     *
     * @param evt a button click event
     */
    private void elSolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elSolActionPerformed
        ImageIcon avatar = new ImageIcon("src/main/resources/avatars/El_sol.jpg"); // Reemplaza con la ruta correcta de la imagen  
        avatarSeleccionado.setIcon(avatar);
        avatarSeleccionado.setEnabled(true);
    }//GEN-LAST:event_elSolActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Titulo1;
    private javax.swing.JLabel TituloMenor;
    private javax.swing.JLabel avatarSeleccionado;
    private javax.swing.JButton elApache;
    private javax.swing.JButton elBorracho;
    private javax.swing.JButton elDiablito;
    private javax.swing.JButton elGallo;
    private javax.swing.JButton elSol;
    private javax.swing.JButton elValiente;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel fondoPanel;
    private javax.swing.JButton laChalupa;
    private javax.swing.JButton laDama;
    private javax.swing.JButton unirse;
    // End of variables declaration//GEN-END:variables
}
