package org.itson.game;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.itson.domaincomponent.domain.Player;
import org.itson.domaincomponent.domain.Tile;
import org.itson.domaincomponent.exceptions.PoolException;
import org.itson.enums.BoardEvents;
import org.itson.enums.PlayerEvents;
import org.itson.enums.PoolEvents;
import org.itson.enums.TileEvents;
import org.itson.interfaces.Observer;
import org.itson.mvc.Match.MatchComponent;
import org.itson.mvc.Pool.PoolView;
import org.itson.mvc.board.BoardView;
import org.itson.mvc.player.PlayerView;
import org.itson.mvc.tile.TileComponent;

public class MatchGame implements Observer {

    public MatchComponent matchesComponent;
    private TileComponent playerTileSelected;
    private Player player;

    public MatchGame(Player player) {
        this.player = player;
        this.matchesComponent = new MatchComponent();
    }

    public void buildGame() throws PoolException {
        this.matchesComponent.buildGame();
    }

    public int getTilesSize() {
        return matchesComponent.getTilesSize();
    }

    @Override
    public void eventOnPoolUpdate(PoolEvents evt) {
        if (PoolEvents.LEFT_CLICK_ON_POOL_EVENT.equals(evt)) {
            getTileFromPoolEvent();
        }
    }

    @Override
    public void eventOnBoardUpdate(BoardEvents evt) {
        if (BoardEvents.LEFT_CLICK_ON_BOARD_EVENT.equals(evt)) {
            if (hasTileSelected()) {
                
            } else {
                JOptionPane.showMessageDialog(null, "You have to select a tile to set it on the board");
            }
        }
    }
    
    @Override
    public void eventOnPlayerUpdate(PlayerEvents evt){
        if(PlayerEvents.LEFT_CLICK_ON_PLAYER_EVENT.equals(evt)){
            JOptionPane.showMessageDialog(null, "hola, soy el player");
        }
    }

    /*@Override
    public void eventOnTileUpdate(TileEvents evt) {
        if (TileEvents.LEFT_CLICK_ON_TILE_EVENT.equals(evt)) {
            //getTileFromPlayerEvent();
            JOptionPane.showMessageDialog(null, "hola");
        }
        else{
            JOptionPane.showMessageDialog(null, "Hola, soy la ficha");
        }
    }*/

    public boolean hasTileSelected() {
        return playerTileSelected != null;
    }

    public void getTileFromPoolEvent() {
        try {
            TileComponent tile = getTileFromPool();
            addTileToPlayerList(tile);
        } catch (PoolException ex) {
            Logger.getLogger(MatchGame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getTileFromPlayerEvent(){
        JOptionPane.showMessageDialog(null, "hola");
        TileComponent tile = getTileFromPlayer();
        JOptionPane.showMessageDialog(null, tile.getTileModel().getId());
        //addTileToBoardList(tile);
    }

    //Suscripcion a los eventos
    public void suscribeToBoardView() {
        this.matchesComponent.suscribeToBoardView(this);
    }

    public void suscribeToPoolView() {
        this.matchesComponent.suscribeToPoolView(this);
    }

    public void suscribeToPlayerView() {
        this.matchesComponent.suscribeToPlayerView(this);
    }
    
    /*public void suscribeToTileView(){
        this.matchesComponent.suscribeToTileView(this);
    }*/

    /*public void buildGame(){
        this.matchesComponent.buildGame();
    }*/
    //Metodos generales
    public TileComponent getTileFromPool() throws PoolException {
        return matchesComponent.getTileFromPool();
    }
    
    public TileComponent getTileFromPlayer(){
        return matchesComponent.getTileSelected(playerTileSelected);
    }

    public Player[] getPlayersOnGame() {
        return this.matchesComponent.getPlayersOnGame();
    }

    public void addTileToPlayerList(TileComponent tile) {
        this.matchesComponent.addTileToPlayer(tile);
        this.matchesComponent.getPlayerComponent().getPlayerView().refresh();
        //JOptionPane.showMessageDialog(null, tile.getFirstFace().getValue() + ":" + tile.getSecondFace().getValue());
    }
    
    public void addTileToBoardList(TileComponent tile){
        this.matchesComponent.addTileToBoard(tile);
        this.matchesComponent.getBoardComponent().getBoardView().refresh();
    }

    public void createDominoTiles() throws PoolException {
        this.matchesComponent.createDominoTiles();
    }

    public Boolean getTurn() {
        return matchesComponent.getTurn();
    }

    public BoardView getBoardView() {
        return matchesComponent.getBoardComponent().getBoardView();

    }

    public PoolView getPoolView() {
        return matchesComponent.getPoolComponent().getView();
    }

    public PlayerView getPlayerView() {
        return matchesComponent.getPlayerComponent().getPlayerView();
    }

    public TileComponent getTileComponent() {
        return matchesComponent.getTileComponent();
    }

}
