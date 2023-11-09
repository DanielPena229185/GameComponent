/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.mvc.Pool;

import java.util.LinkedList;
import org.itson.domaincomponent.domain.Tile;
import org.itson.enums.ImagesSourcers;

/**
 *
 * @author PC
 */
public class PoolModel {

    LinkedList<Tile> tiles;

    String poolImagePath;

    int coordX;

    int coordY;

    int width;

    int height;

    public PoolModel() {
    }

    
     public PoolModel(int weight, int height) {
        this.width = weight;
        this.height = height;
        this.poolImagePath = ImagesSourcers.getSOURCE_IMAGE_POOL();
        tiles = new LinkedList<>();
    }
    
    public PoolModel(int coordX, int coordY, int weight, int height) {
        this.coordX = coordX;
        this.coordY = coordY;
        this.width = weight;
        this.height = height;
        this.poolImagePath = ImagesSourcers.getSOURCE_IMAGE_POOL();
        tiles = new LinkedList<>();
    }

    public LinkedList<Tile> getTiles() {
        return tiles;
    }

    public void setTiles(LinkedList<Tile> tiles) {
        this.tiles = tiles;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int weight) {
        this.width = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getPoolImagePath() {
        return poolImagePath;
    }

    public void setPoolImagePath(String poolImagePath) {
        this.poolImagePath = poolImagePath;
    }

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

}
