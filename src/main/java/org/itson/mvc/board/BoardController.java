/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.mvc.board;

import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.util.List;
import org.itson.domaincomponent.domain.Tile;
import org.itson.enums.BoardEvents;
import org.itson.game.MatchGame;
import org.itson.interfaces.Observer;

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
        
    }
    
    public void suscribe(MatchGame match){
        this.addObserver(match);
    }
    
    public void setTile(Tile tile){
        boardModel.setTile(tile);
    }

    public void refreshBoard() {
         this.boardView.refresh();
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
