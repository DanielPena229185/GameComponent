/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.newGame.components.gamecomponent;

import javax.swing.JFrame;

/**
 *
 * @author TheMM
 */
public class GameView extends JFrame{
    private GameModel gameModel;

    public GameView(GameModel gameModel) {
        this.gameModel = gameModel;
    }
    
    public void refresh(){
        this.getContentPane().setBackground(this.gameModel.getColor());
        this.setSize(this.gameModel.getWidth(), this.gameModel.getHeight());
    }
}
