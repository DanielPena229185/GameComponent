/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.newGame.components.poolcomponent;

/**
 *
 * @author TheMM
 */
public class PoolComponent {
 
    private PoolModel poolModel;
    private PoolView poolView;
    private PoolController poolController;

    public PoolComponent() {
        this.poolModel = new PoolModel();
        this.poolView = new PoolView(poolModel);
        this.poolController = new PoolController(poolModel, poolView);
    }
    
    
    public int getTile(){
        return this.poolController.getTile();
    }
    
    
    
}
