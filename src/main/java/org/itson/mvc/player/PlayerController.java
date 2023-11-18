/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.mvc.player;

import java.util.LinkedList;
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
    
    public Boolean getTurn(){
        return this.playerModel.getPlayer().isTurn();
    }
    
    public Tile getTileFromList(Tile tile){
        return this.playerModel.removeTile(tile);
    }
    
    public void refreshPlayerView(){
        playerView.repaint();   
    }
    
}
