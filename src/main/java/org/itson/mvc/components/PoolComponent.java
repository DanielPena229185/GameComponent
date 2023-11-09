/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.mvc.components;

import org.itson.mvc.Pool.PoolController;
import org.itson.mvc.Pool.PoolModel;
import org.itson.mvc.Pool.PoolView;

/**
 *
 * @author PC
 */
public class PoolComponent {
    PoolController poolController;
    PoolModel poolModel;
    PoolView poolView;

    public PoolComponent() {
    }

    
    
    public PoolComponent(PoolController poolController, PoolModel poolModel, PoolView poolView) {
        this.poolController = poolController;
        this.poolModel = poolModel;
        this.poolView = poolView;
    }
    
    public PoolController getPoolController() {
        return poolController;
    }

    public void setPoolController(PoolController poolController) {
        this.poolController = poolController;
    }

    public PoolModel getPoolModel() {
        return poolModel;
    }

    public void setPoolModel(PoolModel poolModel) {
        this.poolModel = poolModel;
    }

    public PoolView getPoolView() {
        return poolView;
    }

    public void setPoolView(PoolView poolView) {
        this.poolView = poolView;
    }
    
    
    
}
