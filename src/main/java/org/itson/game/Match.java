package org.itson.game;

import java.util.LinkedList;
import org.itson.domaincomponent.domain.Tile;
import org.itson.mvc.Match.MatchComponent;
import org.itson.mvc.board.BoardView;

public class Match {
    
    public MatchComponent matchesComponent;
    
    public Match() {
        this.matchesComponent = new MatchComponent();
    }
    
    public Tile getTileFromPool() {
        return matchesComponent.getTileFromPool();
    }
    
    public void addTileToPlayerList() {
        this.matchesComponent.addTileToPlayer(getTileFromPool());
    }
    
    public void createDominoTiles(){
        this.matchesComponent.createDominoTiles();
    }
    
    public Boolean getTurn(){
        return matchesComponent.getTurn();
    }
    
    public BoardView getBoardView(){
        return matchesComponent.getBoardView();
    }
    
    
    /*public Tile getTileSelected(){
        return this.matchesComponent.getTileSelected(tile);
    }*/
    
}
