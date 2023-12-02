/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.mvc.board;

import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.SwingUtilities;
import org.itson.events.BoardEvents;
import org.itson.game.MatchGame;
import org.itson.interfaces.Observer;
import org.itson.mvc.tile.TileComponent;

/**
 *
 * @author PC
 */
public class BoardController extends MouseAdapter{
    private BoardView boardView;
    private BoardModel boardModel;
    private List<Observer> observers = new ArrayList<>();
    
    public BoardController(BoardView boardView, BoardModel boardModel){
        this.boardModel = boardModel;
        this.boardView = boardView;
        suscribeToClick();
    }
    
    public void suscribe(MatchGame match){
        this.addObserver(match);
    }
    
    public void addTileToBoard(TileComponent tile){
        this.boardModel.addTile(tile);
    }
    
    /*public void setTile(Tile tile){
        boardModel.setTile(tile);
    }*/

    public void refreshBoard() {
         this.boardView.refresh();
    }
        private void suscribeToClick() {
        this.boardView.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
              if(SwingUtilities.isLeftMouseButton(evt)){
                  notifyObservers(BoardEvents.LEFT_CLICK_ON_BOARD_EVENT);
              }
            }
        });
    }
    
       public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(BoardEvents message) {
        for (Observer observer : observers) {
            observer.eventOnBoardUpdate(message);
        }
    }
}
