package org.itson.mvc.board;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class BoardView extends JPanel {

    private BoardModel boardModel;
    private Image boardImage; // Imagen de la primera cara
    private int boardWidth;
    private int boardHeight;

    public BoardView(BoardModel boardModel) {
        this.boardModel = boardModel;
        loadBoardImage();
        setPreferredSize(new Dimension(1010, 580));
    }
    
    private void loadBoardImage() {
        try {
            boardImage = ImageIO.read(new File(boardModel.getBoardImagePath()));
            boardWidth = 730;
            boardHeight = 600;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (boardImage != null) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.drawImage(boardImage, 0, 0, this);
            g2d.dispose();
        }
    }
}
