/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.mvc.player;

import org.itson.domaincomponent.domain.Player;
import org.itson.domaincomponent.domain.Tile;

/**
 *
 * @author santi
 */
public class PlayerComponent {
    
 private static PlayerComponent playerComponent;
    PlayerView playerView;
    PlayerModel playerModel;
    PlayerController playerController;
    
    public PlayerComponent() {
         this.playerModel = new PlayerModel();
        this.playerView = new PlayerView(playerModel);
        this.playerController = new PlayerController(playerModel, playerView);
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
    
    public static PlayerComponent getInstance() {
        if (playerComponent == null) {
            playerComponent = new PlayerComponent();
        }
        return playerComponent;
    }
    
    public PlayerComponent createPlayerComponent(){
        return playerComponent;
    }
}