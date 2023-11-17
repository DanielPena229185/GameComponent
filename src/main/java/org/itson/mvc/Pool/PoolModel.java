/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.mvc.Pool;

import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.classes.DomainPool;
import org.itson.domaincomponent.domain.Pool;
import org.itson.domaincomponent.domain.Tile;
import org.itson.domaincomponent.exceptions.PoolException;
import org.itson.enums.ImagesSourcers;

/**
 *
 * @author PC
 */
public class PoolModel {

    private LinkedList<Tile> tiles;
    private String poolImagePath;
    private int coordX;
    private int coordY;
    private int width;
    private int height;

    public PoolModel() {
        this.poolImagePath = ImagesSourcers.getSOURCE_IMAGE_POOL();
        this.width = 120;
        this.height = 130;
        this.tiles = new LinkedList<>();
        this.coordX = 1110;
        this.coordY = 260;
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

    public void createDominoTiles() {
        try {
            setTiles(Pool.getInstance().createDominoTiles());
        } catch (PoolException ex) {
            Logger.getLogger(PoolModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Tile pickTileFromTilesList() {
        try {

            Tile tile = Pool.getInstance().getRandomTile();

            this.tiles.remove(tile);
            return tile;
        } catch (PoolException ex) {
            Logger.getLogger(PoolModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

}
