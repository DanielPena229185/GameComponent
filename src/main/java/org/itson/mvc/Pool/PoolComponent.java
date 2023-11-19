/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.mvc.Pool;

import org.itson.domaincomponent.domain.Tile;
import org.itson.game.MatchGame;
import org.itson.mvc.Pool.PoolController;
import org.itson.mvc.Pool.PoolModel;
import org.itson.mvc.Pool.PoolView;

/**
 *
 * @author PC
 */
public class PoolComponent {

    private static PoolComponent poolComponent;
    PoolModel poolModel;
    PoolView poolView;
    PoolController poolController;

    public PoolComponent() {
        this.poolModel = new PoolModel(120, 130, 1110, 260);
        this.poolView = new PoolView(poolModel);
        this.poolController = new PoolController(poolView, poolModel);
    }
    
    public void suscribeToView(MatchGame match){
        this.poolController.suscribeToView(match);
    }
    
    public Tile getTileFromPool(){
        return this.poolController.getTileFromPool();
    }
    
    public void createDominoTiles(){
        this.poolController.createDominoTiles();
    }
    public PoolModel getModel() {
        return poolModel;
    }

    public PoolController getController() {
        return poolController;
    }

    
    public PoolView getView() {
        return poolView;
    }

    public void refresh(){
        this.poolController.refresh();
    }
    
    public static PoolComponent getInstance() {
        if (poolComponent == null) {
            poolComponent = new PoolComponent();
        }
        return poolComponent;
    }
}
