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
        setLayout(new FlowLayout());  // Establece un FlowLayout para el panel
        loadAvatarImage();
        this.setBackground(Color.RED);setOpaque(false); // Configura el panel como no opaco

    }

    private void loadAvatarImage() {
        // Implementa el código para cargar la imagen del jugador
    }

public void paintTiles() {
    if (this.playerModel.getTiles() != null && !this.playerModel.getTiles().isEmpty()) {
        for (TileComponent tile : this.playerModel.getTiles()) {
            if (tile != null && tile.getTile() != null) {
                // Establecer el tamaño deseado
                Dimension tileSize = new Dimension(50, playerModel.getHeight());
                tile.getTileView().setPreferredSize(tileSize);
                // Añadir TileView al panel
                this.add(tile.getTileView());
                tile.refresh();
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
