/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.mvc.Pool;

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
        poolModel = new PoolModel();
        poolView = new PoolView(poolModel);
        poolController = new PoolController(poolView, poolModel);
    }

    public PoolModel getModel(){
        return poolModel;
    }
    
    public PoolController getController() {
        return poolController;
    }

    public PoolView getView() {
        return poolView;
    }

    public static PoolComponent getInstance() {
        if (poolComponent == null) {
            poolComponent = new PoolComponent();
        }
        return poolComponent;
    }
    
    public PoolComponent createPoolComponent(){
        this.poolModel = new PoolModel();
        this.poolView = new PoolView(poolModel);
        this.poolController = new PoolController(poolView, poolModel);
        return poolComponent;
    }

}
