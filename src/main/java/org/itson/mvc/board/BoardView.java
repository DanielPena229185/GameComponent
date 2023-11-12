/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.mvc.board;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
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
    private BufferedImage boardImage; // Imagen de la primera cara
    //private JPanel mainPanel;

    public BoardView(BoardModel boardModel) {
        this.boardModel = boardModel;
        loadFaceImages();
    }
    
    
    private void loadFaceImages() {
        try {
            
            boardImage = ImageIO.read(new File(boardModel.getBoardImagePath()));
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void drawBoard() {
      
    // Verifica que las imágenes estén cargadas antes de dibujar
    if (boardImage != null) {
        boardImage = new BufferedImage(boardModel.getWidth(), boardModel.getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = boardImage.createGraphics();

  
        g2d.drawImage(boardImage, 0, 0, null);

        g2d.dispose();
        
        repaint();
        System.out.println(boardImage);
    }
}
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        System.out.println("sss");
        if (boardImage != null) {
            g.drawImage(boardImage, boardModel.getCoordX(), boardModel.getCoordY(), null);
           
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(120, 130);
    }

    /*public BoardView() {
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
    
    }*/
}
