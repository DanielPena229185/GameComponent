/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.mvc.board;

import java.awt.FlowLayout;
import javax.swing.*;
import org.itson.domaincomponent.domain.Tile;
import org.itson.mvc.tile.TileModel;
import org.itson.mvc.tile.TileView;

/**
 *
 * @author PC
 */
public class BoardView extends JPanel {

    private BoardModel boardModel;
    private JPanel mainPanel;

    public BoardView(BoardModel boardModel) {
        this.boardModel = boardModel;
    }

    public BoardView() {
        mainPanel = new JPanel();
        mainPanel.setSize(1010, 580);
        mainPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

        add(mainPanel);
        //setVisible(true);
        
        // Crear y agregar imágenes de fichas al panel principal desde BoardModel
        for (Tile tile : boardModel.getTiles()) {
            TileView tileView = new TileView(new TileModel(tile));  // Crear una nueva instancia de TileModel según tu implementación
            tileView.drawTile();  // Dibujar la ficha en la vista
            mainPanel.add(tileView);
        }

        // Agregar el panel principal a la ventana
        add(mainPanel);

        // Hacer visible la ventana
        //setVisible(true);
    
    }
}
