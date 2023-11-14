/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.mvc.player;

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
 * @author santi
 */
public class PlayerView extends JPanel{
    
    private PlayerModel playerModel;
    private BufferedImage playerImage;
    private BufferedImage player;
    
    public PlayerView(PlayerModel playerModel) {
        this.playerModel = playerModel;
        loadAvatarImage();
    }
    
     private void loadAvatarImage() {
        try {
            playerImage = ImageIO.read(new File(playerModel.getAvatarPath()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
     public void drawPlayer() {
    // Verifica que las imágenes estén cargadas antes de dibujar
    if (playerImage != null ) {
        player = new BufferedImage(playerModel.getWidth(), playerModel.getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = player.createGraphics();

   
       
        g2d.drawImage(playerImage, 0, 0, null);
     

        g2d.dispose();
        repaint();
    }
}
     
      @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (player != null) {
            g.drawImage(player, playerModel.getCordX(), playerModel.getCordY(), null);
        }
    }
    
}
