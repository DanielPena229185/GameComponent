/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.mvc.tile;

import org.itson.domaincomponent.domain.Tile;
import org.itson.game.MatchGame;

/**
 *
 * @author PC
 */
public class TileComponent {

    TileView tileView;
    TileModel tileModel;
    TileController tileController;
    
    public TileComponent(Tile tile) {
        this.tileModel = new TileModel(tile);
        this.tileView = new TileView(tileModel);
        this.tileController = new TileController(tileModel, tileView);
        
    }
    
    public void suscribeToView(MatchGame match){
        this.tileController.suscribe(match);
    }
    
    public void refresh(){
        this.tileController.refresh();
    }

    public Tile getTile(){
       return this.tileController.getTile();
    }
    
    
    public TileView getTileView() {
        return tileView;
    } 

    public TileModel getTileModel() {
        return tileModel;
    }

    public TileController getTileController() {
        return tileController;
    }

}
