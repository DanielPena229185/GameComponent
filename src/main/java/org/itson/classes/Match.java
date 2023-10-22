/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.classes;

import java.awt.List;
import java.util.LinkedList;
import org.itson.domaincomponent.domain.Pool;
import org.itson.domaincomponent.domain.Tile;
import org.itson.domaincomponent.exceptions.PoolException;

/**
 *
 * @author PC
 */
public class Match {
    
    private Pool pool;

    
    public Match() {
  
    }
    
    public Match(Pool pool) {
        this.pool = pool;
    }
    
    
    
    public LinkedList<Tile> getTiles(){
        
       LinkedList<Tile> tiles = new LinkedList<>();
       
       tiles = pool.getTiles();
        
        return tiles;
    }
    
    
    public Tile searchHighestMule() throws PoolException{
        return pool.getHighestMule();
    }
    
    public void swichtTilePossesion(){
        
    }
    
    
}
