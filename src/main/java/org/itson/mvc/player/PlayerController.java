/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.mvc.player;

import javax.swing.JOptionPane;
import org.itson.domaincomponent.domain.Tile;

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
    
    public void addTileToPlayerList(Tile tile){
        JOptionPane.showMessageDialog(null, tile.getFirstFace().getValue() + " " + tile.getSecondFace().getValue());
        this.playerModel.addTile(tile); 
        //playerview refresh; 
    }
    
    
    public void refreshPlayerView(){
        playerView.repaint();   
    }
    
}
