/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.mvc.components;

import org.itson.mvc.tile.TileController;
import org.itson.mvc.tile.TileModel;
import org.itson.mvc.tile.TileView;

/**
 *
 * @author PC
 */
public class TileComponent {
    
    private static TileComponent tileComponent;
    TileView tileView;
    TileModel tileModel;
    TileController tileController;
    
    public TileComponent() {
        
    }

    public TileView getTileView() {
        return tileView;
    }

    public void setTileView(TileView tileView) {
        this.tileView = tileView;
    }

    public TileModel getTileModel() {
        return tileModel;
    }

    public void setTileModel(TileModel tileModel) {
        this.tileModel = tileModel;
    }

    public TileController getTileController() {
        return tileController;
    }

    public void setTileController(TileController tileController) {
        this.tileController = tileController;
    }
    
    public static TileComponent getInstance() {
        if (tileComponent == null) {
            tileComponent = new TileComponent();
        }
        return tileComponent;
    }
}
