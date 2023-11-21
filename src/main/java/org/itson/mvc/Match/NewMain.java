/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.itson.mvc.Match;

import org.itson.game.MatchGame;
import org.itson.game.TurnManager;

/**
 *
 * @author PC
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MatchGame mtc = new MatchGame();
        
       
       mtc.suscribeToPoolView();
       
       
              TurnManager trn = new TurnManager();
        
        trn.generateTurns(mtc.getPlayersOnGame());
        
        trn.printTurns();
      // mtc.getPoolView().simulatePanelClick();
        
    }
    
}
