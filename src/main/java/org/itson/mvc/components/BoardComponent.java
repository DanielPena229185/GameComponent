/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.mvc.components;

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
        boardModel = new BoardModel();
        boardView = new BoardView(boardModel);
        boardController = new BoardController(boardView, boardModel);
    }

    public BoardController getBoardController() {
        return boardController;
    }

   
    public BoardView getBoardView() {
        return boardView;
    }

    public static BoardComponent getInstance() {
        if (boardComponent == null) {
            boardComponent = new BoardComponent();
        }
        return boardComponent;
    }
    
}
