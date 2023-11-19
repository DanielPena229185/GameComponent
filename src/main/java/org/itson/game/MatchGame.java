package org.itson.game;

import java.util.LinkedList;
import javax.swing.JOptionPane;
import org.itson.domaincomponent.domain.Tile;
import org.itson.interfaces.Observer;
import org.itson.mvc.Match.MatchComponent;
import org.itson.mvc.Pool.PoolView;
import org.itson.mvc.board.BoardView;

public class MatchGame implements Observer{
    
    
    public MatchComponent matchesComponent;
    
    public MatchGame() {
        this.matchesComponent = new MatchComponent();
    }
    
    
      @Override
    public void update(String message) {
        if ("click_event".equals(message)) {
            JOptionPane.showMessageDialog(null, "You take a tile from pool.");
        }
    }
 
    
    
    public void suscribeToPoolView(){
        this.matchesComponent.suscribeToPoolView(this);
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
        return matchesComponent.getBoardComponent().getBoardView();
                
    }
    
    public PoolView getPoolView(){
        return matchesComponent.getPoolComponent().getView();
    }
    
    /*public Tile getTileSelected(){
        return this.matchesComponent.getTileSelected(tile);
    }*/
    
}
