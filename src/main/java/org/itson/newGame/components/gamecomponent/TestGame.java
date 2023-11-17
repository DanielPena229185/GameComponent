/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.itson.newGame.components.gamecomponent;

import java.awt.Color;
import org.itson.domaincomponent.domain.Tile;
import org.itson.mvc.Match.MatchComponent;
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
        MatchComponent matchesComponent = new MatchComponent();

        matchesComponent.createDominoTiles();

        matchesComponent.addTileToPlayer(matchesComponent.getTileFromPool());
        
    }

}
