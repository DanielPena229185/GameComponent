/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.itson.newGame.components.gamecomponent;

import java.awt.Color;

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
       gameComponent.setColor(Color.cyan);
       gameComponent.show(100, 100);
       
       Thread.sleep(5000);
       gameComponent.setColor(Color.black);
       gameComponent.show(500, 500);
    }
    
}
