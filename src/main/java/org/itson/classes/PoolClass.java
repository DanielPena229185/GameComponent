package org.itson.classes;

import java.util.LinkedList;
import org.itson.domaincomponent.domain.Player;
import org.itson.domaincomponent.domain.Pool;
import org.itson.domaincomponent.domain.Tile;
import org.itson.domaincomponent.exceptions.PoolException;

public class PoolClass {

    private Pool pool;
    private MatchClass matchClass;
    
    public PoolClass() {
        this.pool = Pool.getInstance();
    }
    
    public Pool getPool() { 
        return Pool.getInstance();
    }
    
    public LinkedList<Tile> createDominoTiles() throws PoolException{
        return pool.createDominoTiles();
    }
    
    public void distributeTilesToPlayers(Player[] players) throws PoolException{
       if(pool.getTiles().isEmpty()){
           pool.createDominoTiles();
       } 
       
       
       
    }
}
