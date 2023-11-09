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
    TileView tileView;
    TileModel tileModel;
    TileController tileController;
    
    public TileComponent(TileView tileView, TileModel tileModel, TileController tileController) {
        this.tileView = tileView;
        this.tileModel = tileModel;
        this.tileController = tileController;
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
}
