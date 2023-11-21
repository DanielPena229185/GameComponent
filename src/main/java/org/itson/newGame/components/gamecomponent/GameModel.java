/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.newGame.components.gamecomponent;

import java.awt.Color;
import org.itson.newGame.components.poolcomponent.PoolComponent;

/**
 *
 * @author TheMM
 */
public class GameModel {
    private Color color;
    private int width;
    private int height;
    private PoolComponent poolComponent;
    
    public GameModel() {
    }

    public Color getColor() {
        return color;
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

    public PoolComponent getPoolComponent() {
        return poolComponent;
    }

    public void setPoolComponent(PoolComponent poolComponent) {
        this.poolComponent = poolComponent;
    }
    
    
    
}
