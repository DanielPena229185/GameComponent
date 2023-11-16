/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.newGame.components.poolcomponent;

import java.awt.Color;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author TheMM
 */
public class PoolModel {
      private Color color;
    private int width;
    private int height;
    private List<Integer> tiles;
    
    public PoolModel() {
        this.tiles = new LinkedList<Integer>();
    }

    public Color getColor() {
        return color;
    }

    public void addTiles(Integer tile) {
        this.tiles.add(tile);
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public List<Integer> getTiles() {
        return tiles;
    }
    
     public int getTilesSize(){
         return this.tiles.size();
     }
    
    public int pickTile(){
       return this.tiles.remove(1);
    }
}
