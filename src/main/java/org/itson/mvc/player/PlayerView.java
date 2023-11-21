/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.mvc.player;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import org.itson.enums.ImagesSourcers;
import org.itson.interfaces.Observer;


/**
 *
 * @author santi
 */
public class PlayerView extends JPanel{
    
    private PlayerModel playerModel;
    private Image playerImage;
    private Image player;
    private int playerWidth;
    private int playerHeight;
    private List<Observer> observers = new ArrayList<>();
    
    public PlayerView(PlayerModel playerModel) {
        this.playerModel = playerModel;
        loadAvatarImage();
        setPreferredSize(new Dimension(1010, 180));
    }
    
     private void loadAvatarImage() {
        try {
            playerImage = ImageIO.read(new File(ImagesSourcers.getSOURCE_IMAGE_AVATAR_El_Gallo()));
            playerWidth = 100;
            playerHeight = 100;
            
            this.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    notifyObservers("click_player");
                }
            });
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
     
     public void refresh() {
        loadAvatarImage();
        repaint();
    }
    
    /* public void drawPlayer() {
    // Verifica que las imágenes estén cargadas antes de dibujar
    if (playerImage != null ) {
        player = new BufferedImage(playerModel.getWidth(), playerModel.getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = player.createGraphics();

   
       
        g2d.drawImage(playerImage, 0, 0, null);
     

        g2d.dispose();
        repaint();
    }
}*/
     
      @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (playerImage != null) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.drawImage(playerImage, 0, 0, this);
            g2d.dispose();
        }
    
        /*if (player != null) {
            g.drawImage(player, playerModel.getCordX(), playerModel.getCordY(), null);
        }*/
    }
    
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
    
}
