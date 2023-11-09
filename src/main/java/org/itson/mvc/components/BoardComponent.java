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
    BoardController boardController;
    BoardModel boardModel;
    BoardView boardView;

    public BoardComponent(BoardController boardController, BoardModel boardModel, BoardView boardView) {
        this.boardController = boardController;
        this.boardModel = boardModel;
        this.boardView = boardView;
    }

    public BoardController getBoardController() {
        return boardController;
    }

    public void setBoardController(BoardController boardController) {
        this.boardController = boardController;
    }

    public BoardModel getBoardModel() {
        return boardModel;
    }

    public void setBoardModel(BoardModel boardModel) {
        this.boardModel = boardModel;
    }

    public BoardView getBoardView() {
        return boardView;
    }

    public void setBoardView(BoardView boardView) {
        this.boardView = boardView;
    }
    
}
