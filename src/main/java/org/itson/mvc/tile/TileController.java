package org.itson.mvc.tile;

import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.SwingUtilities;
import org.itson.classes.DomainMatch;
import org.itson.classes.DomainPool;
import org.itson.domaincomponent.domain.Player;
import org.itson.domaincomponent.domain.Tile;
import org.itson.domaincomponent.exceptions.PlayerException;
import org.itson.domaincomponent.exceptions.PoolException;
import org.itson.enums.TileEvents;
import org.itson.game.MatchGame;
import org.itson.interfaces.Observer;

public class TileController extends MouseAdapter {
    private TileModel tileModel;
    private TileView tileView;
    private List<Observer> observers = new ArrayList<>();

    public TileController(TileModel tileModel, TileView tileView) {
        this.tileModel = tileModel;
        this.tileView = tileView;
        this.suscribeToClick();
    }
    
    public void suscribe(MatchGame match) {
        this.addObserver(match);
    }
    
   public void refresh(){
       this.tileView.refresh();
   }
    
    public Tile getTile(){
        return this.tileModel.getTile();
    }
    
     private void suscribeToClick() {
        this.tileView.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
              if(SwingUtilities.isLeftMouseButton(evt)){
                  notifyObservers(TileEvents.LEFT_CLICK_ON_TILE_EVENT);
              }
            }
        });
    }
        
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(TileEvents message) {
        for (Observer observer : observers) {
            observer.eventOnTileUpdate(message);
        }
    }

    private void playerTakesTileFromPool(Player player, DomainPool pool) throws PoolException, PlayerException {
        Tile tile = pool.getPool().getRandomTile();
        player.addTile(tile);
    }

    private void changeTilePossessionToMatch(Player player, DomainMatch match) {
        //obtengo la ficha que quiera poner o cambiar de posesion el jugador.
        //luego se la elimino y se la envio al match
    }
}

