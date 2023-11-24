/**
 * TileView.java
 * Oct 10, 2023 11:05:56 AM
 */
package org.itson.mvc.tile;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class TileView extends JPanel {

    private TileModel tileModel;
    private BufferedImage tile;
    private BufferedImage firstFaceImage; // Imagen de la primera cara
    private BufferedImage secondFaceImage; // Imagen de la segunda cara

    public TileView(TileModel tileModel) {
        this.tileModel = tileModel;
        // Carga las imágenes de las caras de la ficha en el constructor
        loadFaceImages();
        this.setBackground(Color.BLUE);
    }

    // Método para cargar las imágenes de las caras de la ficha
    private void loadFaceImages() {
        try {
            firstFaceImage = ImageIO.read(new File(tileModel.getFirstFacePath()));
            secondFaceImage = ImageIO.read(new File(tileModel.getSecondFacePath()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void refresh() {
        // Verifica que las imágenes estén cargadas antes de dibujar
        if (firstFaceImage != null && secondFaceImage != null) {
            
            
            
            tile = new BufferedImage(tileModel.getWidth(), tileModel.getHeight(), BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2d = tile.createGraphics();
            
            g2d.drawImage(firstFaceImage, 0, 0, this);
g2d.drawImage(secondFaceImage, 0, tileModel.getHeight() / 3, this);

            
            Image scaledFirstFaceImage = firstFaceImage.getScaledInstance(
                    tileModel.getWidth(), tileModel.getHeight() / 3, Image.SCALE_SMOOTH
            );

            Image scaledSecondFaceImage = secondFaceImage.getScaledInstance(
                    tileModel.getWidth(), tileModel.getHeight() / 3, Image.SCALE_SMOOTH
            );

            g2d.drawImage(scaledFirstFaceImage, 0, 0, this);
            g2d.drawImage(scaledSecondFaceImage, 0, tileModel.getHeight() / 3, this);

            g2d.dispose();

            System.out.println("First Face Image Path: " + tileModel.getFirstFacePath());
            System.out.println("Second Face Image Path: " + tileModel.getSecondFacePath());

            repaint();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
     super.paintComponent(g);

    if (firstFaceImage != null && secondFaceImage != null) {
        Graphics2D g2d = (Graphics2D) g.create();

        g2d.drawImage(firstFaceImage, 0, 0, this);
        g2d.drawImage(secondFaceImage, 0, tileModel.getHeight() / 3, this);

        g2d.dispose();
    }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(1280, 720);
    }
}
