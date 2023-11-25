/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.mvc.player;

import java.util.ArrayList;
import java.util.List;
import org.itson.enums.BoardEvents;
import org.itson.game.MatchGame;
import org.itson.interfaces.Observer;
import org.itson.mvc.tile.TileComponent;

/**
 *
 * @author santi
 */
public class PlayerController {
    
    private PlayerModel playerModel;
    
    private PlayerView playerView;

    private List<Observer> observers = new ArrayList<>();

    
    public PlayerController(PlayerModel playerModel, PlayerView playerView) {
        this.playerModel = playerModel;
        this.playerView = playerView;
    }
    
    public void suscribeToView(MatchGame match){
        this.addObserver(match);
    }
    
    public void addTileToPlayerList(TileComponent tile){
        this.playerModel.addTile(tile); 
        this.refreshPlayerView();
    }
    
    public Boolean getTurn(){
        return this.playerModel.getPlayer().isTurn();
    }
    
    public TileComponent getTileFromList(TileComponent tile){
        return this.playerModel.removeTile(tile);
    }
    
    public void refreshPlayerView(){
        playerView.refresh();   
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
