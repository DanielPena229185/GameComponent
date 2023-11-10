/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.mvc.Pool;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author PC
 */
public class PoolView extends JPanel{
    private PoolModel poolModel;

    private BufferedImage poolImage; // Imagen de la primera cara
    public PoolView(PoolModel poolModel) {
        this.poolModel = poolModel;
        loadFaceImages(); 
    }


 
    // Método para cargar las imágenes de las caras de la ficha
    private void loadFaceImages() {
        try {
            
            poolImage = ImageIO.read(new File(poolModel.getPoolImagePath()));
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void drawPool() {
      
    // Verifica que las imágenes estén cargadas antes de dibujar
    if (poolImage != null) {
        poolImage = new BufferedImage(poolModel.getWidth(), poolModel.getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = poolImage.createGraphics();

  
        g2d.drawImage(poolImage, 0, 0, null);

        g2d.dispose();
        
        repaint();
        System.out.println(poolImage);
    }
}
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        System.out.println("sss");
        if (poolImage != null) {
            g.drawImage(poolImage, poolModel.getCoordX(), poolModel.getCoordY(), null);
           
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(120, 130);
    }
    
}
