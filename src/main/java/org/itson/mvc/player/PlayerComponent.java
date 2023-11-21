/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.mvc.player;

import org.itson.domaincomponent.domain.Tile;
import org.itson.game.MatchGame;

/**
 *
 * @author santi
 */
public class PlayerComponent {
    
 //private static PlayerComponent playerComponent;
    PlayerView playerView;
    PlayerModel playerModel;
    PlayerController playerController;
    
    public PlayerComponent() {
         this.playerModel = new PlayerModel(100, 50, 90, 550);
        this.playerView = new PlayerView(playerModel);
        this.playerController = new PlayerController(playerModel, playerView);
    }
    
    public void suscribeToView(MatchGame match){
        this.playerController.suscribeToView(match);
    }

    public void addTileToPlayerList(Tile tile){
        this.playerController.addTileToPlayerList(tile);
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