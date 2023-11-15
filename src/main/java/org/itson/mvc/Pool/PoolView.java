/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.mvc.Pool;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.Image;
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
    private BufferedImage poolImage; 
    private BufferedImage pool;
    
    
    public PoolView(PoolModel poolModel) {
        this.poolModel = poolModel;
        loadPoolImage();
        
        
    }


 
   
    private void loadPoolImage() {
        try {
            
            poolImage = ImageIO.read(new File(poolModel.getPoolImagePath()));
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void drawPool() {
    if (poolImage != null) {
        // Crea un nuevo BufferedImage con las dimensiones de la imagen cargada
        pool = new BufferedImage(poolImage.getWidth(), poolImage.getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = pool.createGraphics();

        // Dibuja la imagen cargada en el nuevo BufferedImage
        g2d.drawImage(poolImage, 0, 0, null);

        g2d.dispose();
        
        repaint();
     
    }
}
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
       
        if (pool != null) {
            g.drawImage(pool, 0, 0, null);
             
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(120, 130);
    }
    
}
