/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.classes;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;
import org.itson.domaincomponent.domain.Player;
import org.itson.domaincomponent.domain.Pool;
import org.itson.domaincomponent.domain.Tile;
import org.itson.domaincomponent.exceptions.PoolException;


public class Lobby {
    
    private Pool pool;
    
    public void dealTiles(ArrayList<Player> players) throws PoolException{
        
          LinkedList<Tile> list = pool.createDominoTiles();
        for (int i = 0; i < players.size(); i++) {
            
        }
    }
}
