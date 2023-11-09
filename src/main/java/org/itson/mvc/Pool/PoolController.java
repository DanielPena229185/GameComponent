/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.mvc.Pool;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

/**
 *
 * @author PC
 */
public class PoolController  extends MouseAdapter {
    private PoolView poolView;
    private PoolModel poolModel;

    public PoolController(PoolView poolView, PoolModel poolModel) {
        this.poolView = poolView;
        this.poolModel = poolModel;
    }
    
   @Override
    public void mouseClicked(MouseEvent e) {
        poolModel.setCoordX(e.getX() - 50);
        poolModel.setCoordY(e.getY() - 120);
        
        SwingUtilities.invokeLater(() -> {
            poolView.drawTile();
        });
    }

}
