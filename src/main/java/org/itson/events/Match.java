/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.events;

import java.awt.List;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.EventListener;
import javax.swing.JOptionPane;
import org.itson.domaincomponent.domain.Tile;
import org.itson.mvc.Pool.PoolView;
import org.itson.mvc.tile.TileModel;

/**
 *
 * @author TheMM
 */
public class Match {

    //Here is gonna be to catch the events
    Tile playerTileSelected;

    public MouseListener poolPanelClickEvent = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            // Display a message box
            JOptionPane.showMessageDialog(null, "Haz dado click en el panel pool");

            // Print a message to the console
            System.out.println("Haz dado click en el panel pool");
        }
    };

    public void addListenerToPoolView(PoolView poolView) {
        poolView.addMouseListener(poolPanelClickEvent);
    }
    
    
    
    
    

}
