/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.itson.screens;

import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

import org.itson.domaincomponent.domain.Tile;
import org.itson.domaincomponent.exceptions.PoolException;
import org.itson.game.MatchGame;

/**
 *
 * @author Paul Alejandro Vazquez Cervantes
 * @author Santiago Leyva Bojorquez
 */
public class frmMatch extends javax.swing.JFrame {

    private static frmMatch matchInstance;

    private MatchGame match = new MatchGame();

    public frmMatch() {

        initComponents();
        match.buildGame();
        
        match.getTilesSize();
        
        match.suscribeToBoardView();

        match.suscribeToPoolView();

        gamePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        paintBoardOnGamePanel();

        paintPoolOnGamePanel();

        gamePanel.add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 730));

        lbFondo.setIcon(new ImageIcon("src/main/resources/match/Fondo.jpeg"));

        this.pack();

    }

    public void paintBoardOnGamePanel() {
        gamePanel.add(this.match.getBoardView(), new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));
        this.match.matchesComponent.paintBoard();
    }

    public void paintPoolOnGamePanel() {

        gamePanel.add(this.match.getPoolView(), new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 126, -1, -1));
        this.match.matchesComponent.paintPool();
        //   gamePanel.setComponentZOrder(this.match.getPoolView(), 0);
    }

    private void closeCurrentWindow() {
        this.setVisible(false);
    }

    public static frmMatch getInstance() {
        if (matchInstance == null) {
            matchInstance = new frmMatch();
        }
        return matchInstance;
    }

    public void drawPlayersTiles() {

    }

    public Graphics drawTile() {

        return null;
    }

    public Tile getTile() {

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

        gamePanel = new javax.swing.JPanel();
        btnPause = new javax.swing.JButton();
        lbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gamePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/match/Pausa.jpg"))); // NOI18N
        btnPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPauseActionPerformed(evt);
            }
        });
        gamePanel.add(btnPause, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 40, 50));
        gamePanel.add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1290, 730));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gamePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPauseActionPerformed

    }//GEN-LAST:event_btnPauseActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPause;
    private javax.swing.JPanel gamePanel;
    private javax.swing.JLabel lbFondo;
    // End of variables declaration//GEN-END:variables
}
