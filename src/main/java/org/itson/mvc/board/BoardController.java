/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.mvc.board;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;

/**
 *
 * @author PC
 */
public class BoardController extends MouseAdapter{
    private BoardModel boardModel;
    private BoardView boardView;
    
    public BoardController(BoardModel boardModel, BoardView boardView){
        this.boardModel = boardModel;
        this.boardView = boardView;
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        boardModel.setCoordX(e.getX() - 50);
        boardModel.setCoordY(e.getY() - 120);
        
        SwingUtilities.invokeLater(() -> {
            boardView.drawBoard();
        });
    }
}
