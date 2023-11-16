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
public class GameComponent {
    private GameController gameController;
    private GameModel gameModel;
    private GameView gameView;

    public GameComponent() {
        this.gameModel = new GameModel();
        this.gameView = new GameView(gameModel);
        this.gameController = new GameController(gameModel, gameView);
    }
    
    
    public void setColor(Color color){
        this.gameController.setColor(color);
    }
    
    public void show(int width, int height){
        this.gameController.show(width, height);
    }
    
}
