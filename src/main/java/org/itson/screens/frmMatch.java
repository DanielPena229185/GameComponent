/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.itson.screens;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import org.itson.classes.DomainMatch;
import org.itson.domaincomponent.domain.Board;
import org.itson.domaincomponent.domain.Pool;
import org.itson.domaincomponent.domain.Tile;
import org.itson.domaincomponent.exceptions.PoolException;
import org.itson.mvc.Pool.PoolController;
import org.itson.mvc.Pool.PoolModel;
import org.itson.mvc.Pool.PoolView;
import org.itson.mvc.board.BoardController;
import org.itson.mvc.board.BoardModel;
import org.itson.mvc.board.BoardView;

/**
 *
 * @author Paul Alejandro Vazquez Cervantes
 * @author Santiago Leyva Bojorquez
 */
public class frmMatch extends javax.swing.JFrame {

    private static frmMatch matchInstance;
    

    /**
     * Creates new form frmBoard
     */
 public frmMatch() {

        initComponents();
        
        

        // Mantén el AbsoluteLayout
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        // Agrega boardView y poolView con restricciones
        jPanel1.add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 730));
//        jPanel1.add(boardView, new org.netbeans.lib.awtextra.AbsoluteConstraints(boardModel.getCoordX(), boardModel.getCoordY(), -1, -1));
//        jPanel1.add(poolView, new org.netbeans.lib.awtextra.AbsoluteConstraints(poolModel.getCoordX(), poolModel.getCoordY(), -1, -1));
        
        lbFondo.setIcon(new ImageIcon("src/main/resources/match/Fondo.jpeg"));
        // Cambia la posición z de poolView a la parte superior
        
        

//        board = Board.getInstance();// aqui me quedé
//        //board.addTileBeginning(newTile);
//        pool = Pool.getInstance();
//        pool.createDominoTiles();

        this.pack();
    
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

    public Graphics drawPool() {

        return null;
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

        jPanel1 = new javax.swing.JPanel();
        playerTilesPannel = new javax.swing.JPanel();
        btnPause = new javax.swing.JButton();
        lbFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout playerTilesPannelLayout = new javax.swing.GroupLayout(playerTilesPannel);
        playerTilesPannel.setLayout(playerTilesPannelLayout);
        playerTilesPannelLayout.setHorizontalGroup(
            playerTilesPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        playerTilesPannelLayout.setVerticalGroup(
            playerTilesPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPanel1.add(playerTilesPannel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 600, 740, 90));

        btnPause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/match/Pausa.jpg"))); // NOI18N
        btnPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPauseActionPerformed(evt);
            }
        });
        jPanel1.add(btnPause, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 40, 50));
        jPanel1.add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1290, 730));

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

    private void btnPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPauseActionPerformed
        
    }//GEN-LAST:event_btnPauseActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPause;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JPanel playerTilesPannel;
    // End of variables declaration//GEN-END:variables
}
