package org.itson.mvc.board;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.*;
import org.itson.enums.CustomEvents;
import org.itson.interfaces.Observer;

public class BoardView extends JPanel {

    private BoardModel boardModel;
    private Image boardImage; // Imagen de la primera cara
    private int boardWidth;
    private int boardHeight;
    private List<Observer> observers = new ArrayList<>();

    public BoardView(BoardModel boardModel) {
        this.boardModel = boardModel;
        loadBoardImage();
        setPreferredSize(new Dimension(630, 500));
    }

    private void loadBoardImage() {
        try {
            boardImage = ImageIO.read(new File(boardModel.getBoardImagePath()));
            boardWidth = 630;
            boardHeight = 500;

            this.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    notifyObservers(CustomEvents.RIGHT_CLICK_EVENT);
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void refresh() {
        loadBoardImage();
        repaint();
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
