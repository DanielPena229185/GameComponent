/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.mvc.player;

import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.SwingUtilities;
import org.itson.enums.BoardEvents;
import org.itson.enums.PlayerEvents;
import org.itson.game.MatchGame;
import org.itson.interfaces.Observer;
import org.itson.mvc.tile.TileComponent;

/**
 *
 * @author santi
 */
public class PlayerController extends MouseAdapter{
    
    private PlayerModel playerModel;
    
    private PlayerView playerView;

    private List<Observer> observers = new ArrayList<>();

    
    public PlayerController(PlayerModel playerModel, PlayerView playerView) {
        this.playerModel = playerModel;
        this.playerView = playerView;
         this.suscribeToClick();
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
    
    private void suscribeToClick() {
        this.playerView.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
              if(SwingUtilities.isLeftMouseButton(evt)){
                  notifyObservers(PlayerEvents.LEFT_CLICK_ON_PLAYER_EVENT);
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

    public void notifyObservers(PlayerEvents message) {
        for (Observer observer : observers) {
            observer.eventOnPlayerUpdate(message);
        }
    }
    
}
