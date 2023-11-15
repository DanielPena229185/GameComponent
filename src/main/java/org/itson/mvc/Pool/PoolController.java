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

        // Agrega el MouseListener al PoolView
        poolView.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        SwingUtilities.invokeLater(() -> {
            // Manejar el evento de clic en el panel de pool
                //getPlayer.giveTile()
            System.out.println("Me diste click, soy el pozo!");
        });
    }

}
