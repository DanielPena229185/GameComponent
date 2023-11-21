package org.itson.game;

import java.util.LinkedList;
import javax.swing.JOptionPane;
import org.itson.domaincomponent.domain.Tile;
import org.itson.interfaces.Observer;
import org.itson.mvc.Match.MatchComponent;
import org.itson.mvc.Pool.PoolView;
import org.itson.mvc.board.BoardView;
import org.itson.mvc.player.PlayerView;

public class MatchGame implements Observer{
    
    
    public MatchComponent matchesComponent;
    
    public MatchGame() {
        this.matchesComponent = new MatchComponent();
    }
    
    public void buildGame(){
        this.matchesComponent.buildGame();
    }
    
    public int getTilesSize(){
        return matchesComponent.getTilesSize();
    }
    
      @Override
    public void update(String message) {
        if ("click_event".equals(message)) {
            //JOptionPane.showMessageDialog(null, "You take a tile from pool.");
            Tile tile = getTileFromPool();
            JOptionPane.showMessageDialog(null, tile.getFirstFace().getValue() + ":" + tile.getSecondFace().getValue());
            JOptionPane.showMessageDialog(null, "Quedan: "+ getTilesSize() + "fichas.");
            addTileToPlayerList(tile);
        } else if("click_event".equals(message)){
            
        }
    }
 
    public void suscribeToBoardView(){
        this.matchesComponent.suscribeToBoardView(this);
    }
    
    public void suscribeToPoolView(){
        this.matchesComponent.suscribeToPoolView(this);
    }
    
    public void suscribeToPlayerView(){
        this.matchesComponent.suscribeToPlayerView(this);
    }
    
    public Tile getTileFromPool() {
        return matchesComponent.getTileFromPool();
    }
    
    public void addTileToPlayerList(Tile tile) {
        this.matchesComponent.addTileToPlayer(tile);
        JOptionPane.showMessageDialog(null, tile.getFirstFace().getValue() + ":" + tile.getSecondFace().getValue());
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
    
    public PlayerView getPlayerView(){
        return matchesComponent.getPlayerComponent().getPlayerView();
    }
    
    /*public Tile getTileSelected(){
        return this.matchesComponent.getTileSelected(tile);
    }*/
    
}
