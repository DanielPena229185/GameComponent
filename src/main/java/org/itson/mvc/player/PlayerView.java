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
    private static final int PANEL_WIDTH = 1010;
    private static final int PANEL_HEIGHT = 110;
    private static final Dimension TILE_SIZE = new Dimension(75, 80);

    private PlayerModel playerModel;
    private List<Observer> observers = new ArrayList<>();

    public PlayerView(PlayerModel playerModel) {
        this.playerModel = playerModel;
        setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        setLayout(new FlowLayout());  // Establece un FlowLayout para el panel
        loadAvatarImage();
       // this.setBackground(Color.RED);

    }

    private void loadAvatarImage() {
        // Implementa el código para cargar la imagen del jugador
    }

    private void paintTile(TileComponent tile) {
        tile.getTileView().setPreferredSize(TILE_SIZE);
        this.add(tile.getTileView());
        tile.refresh();
    }

    public void paintTiles() {
        if (this.playerModel.getTiles() != null && !this.playerModel.getTiles().isEmpty()) {
            for (TileComponent tile : this.playerModel.getTiles()) {
                if (tile != null && tile.getTile() != null) {
                    paintTile(tile);
                }
            }

            // Forzar la actualización y el repintado
            revalidate();
            repaint();
        }
    }

    public void refresh() {
        removeAll();  // Elimina todas las fichas antes de repintar
        loadAvatarImage();
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
