/**
 * TileView.java
 * Oct 10, 2023 11:05:56 AM
 */
package org.itson.mvc.tile;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
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
    public void paintTileOnPanel(JPanel panel) {
        if (tile != null) {
            Graphics g = panel.getGraphics();
            g.drawImage(tile, 0, 0, null);
            g.dispose();
        }
    }


    public void drawTile() {
    // Verifica que las imágenes estén cargadas antes de dibujar
    if (firstFaceImage != null && secondFaceImage != null) {
        tile = new BufferedImage(tileModel.getWidth(), tileModel.getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = tile.createGraphics();

   
        Image scaledFirstFaceImage = firstFaceImage.getScaledInstance(
            tileModel.getWidth(), tileModel.getHeight() / 4, Image.SCALE_SMOOTH
        );

        Image scaledSecondFaceImage = secondFaceImage.getScaledInstance(
            tileModel.getWidth(), tileModel.getHeight() / 4, Image.SCALE_SMOOTH
        );

        g2d.drawImage(scaledFirstFaceImage, 0, 0, null);
        g2d.drawImage(scaledSecondFaceImage, 0, tileModel.getHeight() / 4, null);

        g2d.dispose();
        repaint();
    }
}

    
//    public void drawTile() {
//        // Verifica que las imágenes estén cargadas antes de dibujar
//        if (firstFaceImage != null && secondFaceImage != null) {
//            tile = new BufferedImage(tileModel.getWidth(), tileModel.getHeight(), BufferedImage.TYPE_INT_ARGB);
//            Graphics2D g2d = tile.createGraphics();
//            g2d.drawImage(firstFaceImage, 0, 0, null);
//            g2d.drawImage(secondFaceImage, 0, firstFaceImage.getHeight(), null);
//            g2d.dispose();
//            repaint();
//            System.out.println("trishula");
//        }
//    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (tile != null) {
            g.drawImage(tile, tileModel.getCordX(), tileModel.getCordY(), null);
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(1280, 720);
    }
}
