/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.events;

import java.util.EventListener;
import java.util.EventObject;
import org.itson.mvc.tile.TileModel;

public class TilePaintedEvent extends EventObject {
    private TileModel tileModel;

    public TilePaintedEvent(Object source, TileModel tileModel) {
        super(source);
        this.tileModel = tileModel;
    }

    public TileModel getTileModel() {
        return tileModel;
    }
    
    public interface TilePaintedListener extends EventListener {
    void tilePainted(TilePaintedEvent event);
}
    
}
