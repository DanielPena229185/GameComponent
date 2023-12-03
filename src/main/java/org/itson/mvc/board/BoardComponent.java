/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.mvc.board;

import javax.swing.JOptionPane;
import org.itson.game.MatchGame;
import org.itson.mvc.tile.TileComponent;

/**
 *
 * @author PC
 */
public class BoardComponent {
    BoardController boardController;
    BoardModel boardModel;
    BoardView boardView;
    
    public BoardComponent() {
        boardModel = new BoardModel(730, 630, 0, 0);
        boardView = new BoardView(boardModel);
        boardController = new BoardController(boardView, boardModel);
    }
    
    public void suscribe(MatchGame match){
        this.boardController.suscribe(match);
    }
    
    public void addTileToBoard(TileComponent tile){
     if(getBoardModel().getTiles().peek()==null){
        this.boardController.addTileToBoard(tile);
         System.out.println("primera");
     }
     else if(tile.getTileModel().getFirsFace().getValue()==getBoardModel().getTiles().peekLast().getTile().getFirstFace().getValue()){
         
        this.boardController.addTileToBoard(tile); 
        System.out.println("segunda");}
     else{
     JOptionPane.showMessageDialog(boardView, "Ficha sin valor similar a la del tablero", "Ficha invalida", JOptionPane.ERROR_MESSAGE);
     System.out.println("tercera");
     }   
        System.out.println("sas");  
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
