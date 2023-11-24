/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.mvc.player;

import org.itson.domaincomponent.domain.Tile;
import org.itson.game.MatchGame;
import org.itson.mvc.tile.TileComponent;

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
    
    public void suscribeToView(MatchGame match){
        this.playerView.addObserver(match);
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
    
}
