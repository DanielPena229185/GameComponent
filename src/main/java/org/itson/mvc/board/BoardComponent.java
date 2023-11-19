/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.mvc.board;

import org.itson.mvc.Pool.PoolController;
import org.itson.mvc.Pool.PoolModel;
import org.itson.mvc.Pool.PoolView;
import org.itson.mvc.board.BoardController;
import org.itson.mvc.board.BoardModel;
import org.itson.mvc.board.BoardView;

/**
 *
 * @author PC
 */
public class BoardComponent {
    private static BoardComponent boardComponent;
    BoardController boardController;
    BoardModel boardModel;
    BoardView boardView;
    
    public BoardComponent() {
        boardModel = new BoardModel(730, 630, 0, 0);
        boardView = new BoardView(boardModel);
        boardController = new BoardController(boardView, boardModel);
    }

    public BoardModel getBoardModel(){
        return boardModel;
    }
    
    public BoardController getBoardController() {
        return boardController;
    }

   
    public BoardView getBoardView() {
        return boardView;
    }
    
    public void refreshBoard(){
        this.boardView.refresh();
    }
}
