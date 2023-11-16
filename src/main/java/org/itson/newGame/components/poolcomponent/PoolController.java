/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.newGame.components.poolcomponent;

import java.util.Random;

/**
 *
 * @author TheMM
 */
public class PoolController {
    
    private PoolModel poolModel;
    private PoolView poolView;
    
    public PoolController(PoolModel poolModel, PoolView poolView) {
        this.poolModel = poolModel;
        this.poolView = poolView;
    }
    
    public int getTile() {
        int tile = this.poolModel.pickTile();
        this.poolView.refresh();
        return tile;
    }
    
    public int createTiles() {
        for (int i = 1; i <= new Random().nextInt(28); i++) {
            this.poolModel.addTiles(i);
        }
        this.poolView.refresh(); 
        return this.poolModel.getTilesSize();
       
    }
    
}
