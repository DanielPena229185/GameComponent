/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.mvc.components;

import org.itson.mvc.player.PlayerController;
import org.itson.mvc.player.PlayerModel;
import org.itson.mvc.player.PlayerView;

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
        
    }

    public PlayerView getPlayerView() {
        return playerView;
    }

    public void setTileView(PlayerView playerView) {
        this.playerView = playerView;
    }

    public PlayerModel getPlayerModel() {
        return playerModel;
    }

    public void setPlayerModel(PlayerModel playerModel) {
        this.playerModel = playerModel;
    }

    public PlayerController getPlayerController() {
        return playerController;
    }

    public void setPlayerController(PlayerController playerController) {
        this.playerController = playerController;
    }
    
    public static PlayerComponent getInstance() {
        if (playerComponent == null) {
            playerComponent = new PlayerComponent();
        }
        return playerComponent;
    }
}