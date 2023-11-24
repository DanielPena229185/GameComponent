package org.itson.game;

import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.itson.domaincomponent.domain.Player;
import org.itson.domaincomponent.domain.Tile;
import org.itson.domaincomponent.exceptions.PoolException;
import org.itson.enums.CustomEvents;
import org.itson.interfaces.Observer;
import org.itson.mvc.Match.MatchComponent;
import org.itson.mvc.Pool.PoolView;
import org.itson.mvc.board.BoardView;
import org.itson.mvc.player.PlayerView;
import org.itson.mvc.tile.TileComponent;

public class MatchGame implements Observer{
    
    
    public MatchComponent matchesComponent;
    private Tile playerTileSelected;
    private Player player;
    
    public MatchGame(Player player) {
        this.player = player;
        this.matchesComponent = new MatchComponent();
    }
    
    public void buildGame() throws PoolException{
        this.matchesComponent.buildGame();
    }
    
    public int getTilesSize(){
        return matchesComponent.getTilesSize();
    }
    
      @Override
    public void update(CustomEvents message) {
        if (CustomEvents.LEFT_CLICK_EVENT.equals(message)) {
            try {
               
                TileComponent tile = getTileFromPool();
                addTileToPlayerList(tile);
            } catch (PoolException ex) {
                Logger.getLogger(MatchGame.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if(CustomEvents.RIGHT_CLICK_EVENT.equals(message)){
            JOptionPane.showMessageDialog(null, "Tienes que dar click izquierdo, ya lo cambie wey.");
        }
    }
    
    
    //Suscripcion a los eventos
    public void suscribeToBoardView(){
        this.matchesComponent.suscribeToBoardView(this);
    }
    
    public void suscribeToPoolView(){
        this.matchesComponent.suscribeToPoolView(this);
    }
    
    public void suscribeToPlayerView(){
        this.matchesComponent.suscribeToPlayerView(this);
    }
    
    /*public void buildGame(){
        this.matchesComponent.buildGame();
    }*/
    
    
    //Metodos generales

    public TileComponent getTileFromPool() throws PoolException {
        return matchesComponent.getTileFromPool();
    }

    public Player[] getPlayersOnGame(){
        return this.matchesComponent.getPlayersOnGame();
    }
    
    public void addTileToPlayerList(TileComponent tile) {
        this.matchesComponent.addTileToPlayer(tile);
        this.matchesComponent.getPlayerComponent().getPlayerView().refresh();
        //JOptionPane.showMessageDialog(null, tile.getFirstFace().getValue() + ":" + tile.getSecondFace().getValue());
    }
    
    public void createDominoTiles() throws PoolException{
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
    
    public TileComponent getTileComponent(){
        return matchesComponent.getTileComponent();
    }
    
}
