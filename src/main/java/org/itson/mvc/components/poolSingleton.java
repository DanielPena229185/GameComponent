/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.mvc.components;

import org.itson.mvc.Pool.*;

/**
 *
 * @author TheMM
 */
public class poolSingleton {

    private static PoolComponent poolComponentInstance;

    private PoolView poolView;
    private PoolModel poolModel;
    private PoolController poolController;

    public poolSingleton() {
    }

    public poolSingleton(PoolView poolView, PoolModel poolModel, PoolController poolController) {
        this.poolView = poolView;
        this.poolModel = poolModel;
        this.poolController = poolController;
    }

    public static PoolComponent getInstance() {
        if (poolComponentInstance == null) {
            poolComponentInstance = new PoolComponent();
        }
        return poolComponentInstance;
    }
}
