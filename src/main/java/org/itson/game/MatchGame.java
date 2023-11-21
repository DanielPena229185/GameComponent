package org.itson.game;

import java.util.LinkedList;
import javax.swing.JOptionPane;
import org.itson.domaincomponent.domain.Player;
import org.itson.domaincomponent.domain.Tile;
import org.itson.interfaces.Observer;
import org.itson.mvc.Match.MatchComponent;
import org.itson.mvc.Pool.PoolView;
import org.itson.mvc.board.BoardView;

public class MatchGame implements Observer{
    
    
    public MatchComponent matchesComponent;
    private Tile playerTileSelected;
    
    
    public MatchGame() {
        this.matchesComponent = new MatchComponent();
    }
    
    
      @Override
    public void update(String message) {
        if ("click_event".equals(message)) {
            JOptionPane.showMessageDialog(null, "You take a tile from pool.");
        }
    }
    
    
    //Suscripcion a los eventos
    public void suscribeToBoardView(){
        this.matchesComponent.suscribeToBoardView(this);
    }
    
    public void suscribeToPoolView(){
        this.matchesComponent.suscribeToPoolView(this);
    }
    
    
    
    //Metodos generales

    public Tile getTileFromPool() {
        return matchesComponent.getTileFromPool();
    }

    public Player[] getPlayersOnGame(){
        return this.matchesComponent.getPlayersOnGame();
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
    
}
