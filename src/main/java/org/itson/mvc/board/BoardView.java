package org.itson.mvc.board;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import org.itson.enums.CustomEvents;
import org.itson.interfaces.Observer;
import org.itson.mvc.tile.TileComponent;

public class BoardView extends JPanel {

    private BoardModel boardModel;
    private Image boardImage; // Imagen de la primera cara

    private List<Observer> observers = new ArrayList<>();

    public BoardView(BoardModel boardModel) {
        this.boardModel = boardModel;
        loadBoardImage();

        setPreferredSize(new Dimension(630, 500));
        setLayout(new FlowLayout());
    }
    
    public void paintTiles(){
        if (boardHasTiles()){
            addTilesComponentsToBoardView();
            
            revalidate();
            repaint();
        }
    }
    
    public void addTilesComponentsToBoardView() {
        for (TileComponent tile : this.boardModel.getTiles()) {
            if (tile != null && tile.getTile() != null) {
                this.add(tile.getTileView());
                tile.refresh();
            }
        }
    }
    
    public boolean boardHasTiles(){
        return (this.boardModel.getTiles() != null && !this.boardModel.getTiles().isEmpty());
    }

    private void loadBoardImage() {
   
        try {
            boardImage = ImageIO.read(new File(boardModel.getBoardImagePath()));
   
        } catch (IOException ex) {
            Logger.getLogger(BoardView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void refresh() {
        loadBoardImage();
        repaint();
        removeAll();
        paintTiles();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (boardImage != null) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.drawImage(boardImage, boardModel.getCoordX(), boardModel.getCoordY(), this);
            g2d.dispose();
        }
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
