package org.itson.mvc.player;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import org.itson.enums.CustomEvents;
import org.itson.interfaces.Observer;
import org.itson.mvc.tile.TileComponent;

/**
 * PlayerView.java
 */
public class PlayerView extends JPanel {

    private PlayerModel playerModel;
    private List<Observer> observers = new ArrayList<>();

    public PlayerView(PlayerModel playerModel) {
        this.playerModel = playerModel;
        setPreferredSize(new Dimension(1010, 110));
        setLayout(new FlowLayout());

    }

    public void paintTiles() {
        if (playerHaveTiles()) {
            
            addTilesComponentsToPlayerView();
            
            revalidate();
            repaint();
        }
    }
    
    public void addTilesComponentsToPlayerView(){
            for (TileComponent tile : this.playerModel.getTiles()) {
                if (tile != null && tile.getTile() != null) {
                    this.add(tile.getTileView());
                    tile.refresh();
                }
            }
    }
    
    public boolean playerHaveTiles(){
        return (this.playerModel.getTiles() != null && !this.playerModel.getTiles().isEmpty());
    }
    
    public void refresh() {
        removeAll();
        paintTiles();
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
