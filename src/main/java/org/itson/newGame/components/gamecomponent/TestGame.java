/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.itson.newGame.components.gamecomponent;

import java.awt.Color;
import org.itson.newGame.components.poolcomponent.PoolComponent;

/**
 *
 * @author TheMM
 */
public class TestGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        GameComponent gameComponent = new GameComponent();
        
        PoolComponent poolComponent = new PoolComponent();
        
        gameComponent.addPoolComponent(poolComponent);
        
        gameComponent.createDominoTiles();
        
        gameComponent.setColor(Color.cyan);
        
        
        gameComponent.show(100, 100);
        

        Thread.sleep(2000);
        
        gameComponent.setColor(Color.black);
        
        gameComponent.createDominoTiles();
        
        gameComponent.show(500, 500);
        
    }

}
