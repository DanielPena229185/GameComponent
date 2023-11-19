/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.mvc.board;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;
import org.itson.domaincomponent.domain.Tile;

/**
 *
 * @author PC
 */
public class BoardController extends MouseAdapter{
    private BoardView boardView;
    private BoardModel boardModel;
    
    public BoardController(BoardView boardView, BoardModel boardModel){
        this.boardModel = boardModel;
        this.boardView = boardView;
        
        // Agrega el MouseListener al BoardView
        boardView.addMouseListener(this);
    }
    
    public void setTile(Tile tile){
        boardModel.setTile(tile);
    }

    public void refreshBoard() {
         this.boardView.refresh();
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        SwingUtilities.invokeLater(() -> {
            // Manejar el evento de clic en el panel de pool
            System.out.println("Me diste click, soy el board!");
        });
        
       
    }
}
