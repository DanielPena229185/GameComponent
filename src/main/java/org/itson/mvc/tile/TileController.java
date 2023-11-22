package org.itson.mvc.tile;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import org.itson.classes.DomainMatch;
import org.itson.classes.DomainPool;
import org.itson.domaincomponent.domain.Player;
import org.itson.domaincomponent.domain.Tile;
import org.itson.domaincomponent.exceptions.PlayerException;
import org.itson.domaincomponent.exceptions.PoolException;

public class TileController extends MouseAdapter {
    private TileModel tileModel;
    private TileView tileView;

    public TileController(TileModel tileModel, TileView tileView) {
        this.tileModel = tileModel;
        this.tileView = tileView;
    }
    
   public void refresh(){
       this.tileView.refresh();
   }
    
    public Tile getTile(){
        return this.tileModel.getTile();
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

