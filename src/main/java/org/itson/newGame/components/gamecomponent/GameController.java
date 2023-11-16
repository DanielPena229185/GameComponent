/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.newGame.components.gamecomponent;

import java.awt.Color;

/**
 *
 * @author TheMM
 */
public class GameController {
    private GameModel gameModel;
    private GameView gameView;

    public GameController(GameModel gameModel, GameView gameView) {
        this.gameModel = gameModel;
        this.gameView = gameView;
    }
    
    public void setColor(Color color){
        this.gameModel.setColor(color);
        this.gameView.refresh();
    }
    
    public void show(int width, int height){
        this.gameModel.setHeight(height);
        this.gameModel.setWidth(width);
        this.gameView.refresh();
        this.gameView.setVisible(true);
    }
}
