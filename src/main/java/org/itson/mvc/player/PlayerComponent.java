/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.mvc.player;

import org.itson.events.PlayerEvents;
import org.itson.events.TileEvents;
import org.itson.game.MatchGame;
import org.itson.interfaces.TileObserver;
import org.itson.mvc.tile.TileComponent;

/**
 *
 * @author santi
 */
public class PlayerComponent {
    
 //private static PlayerComponent playerComponent;
    PlayerView playerView;
    PlayerModel playerModel;
    PlayerController playerController;
    TileComponent tileComponent;
    
    public PlayerComponent() {
         this.playerModel = new PlayerModel(100, 50, 90, 550);
        this.playerView = new PlayerView(playerModel);
        this.playerController = new PlayerController(playerModel, playerView);
    }
    
    public void suscribeToView(MatchGame match){
        this.playerController.suscribeToView(match);
    }

    public void addTileToPlayerList(TileComponent tile){
        this.playerController.addTileToPlayerList(tile);
        this.playerController.suscribeToTiles();
    }
    
    public void suscribeToTiles(){
        this.playerController.suscribeToTiles();
    }
    
    public void unsiscribeToTiles(){
        this.playerController.unsuscribeOfTiles();
    }
    
    public PlayerView getPlayerView() {
        return playerView;
    }

    public PlayerModel getPlayerModel() {
        return playerModel;
    }
    public PlayerController getPlayerController() {
        return playerController;
    }
    
    public void refreshPlayer(){
        this.playerView.refresh();
    }
    
    /*public static PlayerComponent getInstance() {
        if (playerComponent == null) {
            playerComponent = new PlayerComponent();
        }
        return playerComponent;
    }
    
    public PlayerComponent createPlayerComponent(){
        return playerComponent;
    }*/
}