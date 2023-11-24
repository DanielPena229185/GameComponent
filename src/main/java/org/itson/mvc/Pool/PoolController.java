/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.mvc.Pool;

import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import org.itson.domaincomponent.domain.Tile;
import org.itson.domaincomponent.exceptions.PoolException;
import org.itson.enums.CustomEvents;
import org.itson.game.MatchGame;
import org.itson.interfaces.Observer;
import org.itson.mvc.tile.TileComponent;

/**
 *
 * @author PC
 */
public class PoolController extends MouseAdapter {

    private PoolView poolView;
    private PoolModel poolModel;
    private List<Observer> observers = new ArrayList<>();

    public PoolController(PoolView poolView, PoolModel poolModel) {
        this.poolView = poolView;
        this.poolModel = poolModel;
        this.suscribeToClick();
    }

    public void suscribe(MatchGame match) {
        this.addObserver(match);
    }

    public void createDominoTiles() throws PoolException {

        for (Tile tile :  this.poolModel.getPool().createDominoTiles()) {
            this.poolModel.getTiles().add(new TileComponent(tile));
        }

    }

    public TileComponent getTileFromPool() throws PoolException {

        Tile tile = this.poolModel.getPool().getRandomTile();

        for (TileComponent tiles : this.poolModel.getTiles()) {

            if (tile == tiles.getTile()) {
                this.poolModel.getTiles().remove(tiles);
                JOptionPane.showMessageDialog(null, tiles.getTile().getId());
                return tiles;
            }
        }
        
        return null; 

    }

    public void refresh() {
        this.poolView.refresh();
    }

    private void suscribeToClick() {
        this.poolView.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
              if(SwingUtilities.isRightMouseButton(evt)){
                  notifyObservers(CustomEvents.RIGHT_CLICK_EVENT);
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

    public void notifyObservers(CustomEvents message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
