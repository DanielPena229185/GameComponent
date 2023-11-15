/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.mvc.player;

/**
 *
 * @author santi
 */
public class PlayerController {
    
    private PlayerModel playerModel;
    
    private PlayerView playerView;

    public PlayerController(PlayerModel playerModel, PlayerView playerView) {
        this.playerModel = playerModel;
        this.playerView = playerView;
    }
    
    
    public void refreshPlayerView(){
        playerView.repaint();   
    }
    
}
