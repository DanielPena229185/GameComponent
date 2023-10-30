/**
* TileView.java
* Oct 10, 2023 11:05:56 AM
*/ 

package org.itson.mvc.tile;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * This enumerate class represents a tile's side
 * 
 * @author Daniel Armando Peña Garcia ID:229185
 * @author Santiago Bojórquez Leyva ID:228475
 * @author Paul Alejandro Vazquez Cervantes ID:241400
 * @author Jose Eduardo Hinojosa Romero ID: 2356666
 */
public class TileView extends JPanel{

    private TileModel tileModel;
     private BufferedImage tile;
    
    /**
     *
     */
    public TileView(TileModel tileModel){
        this.tileModel = tileModel;
    }
    
   public void drawTile() throws IOException {
        BufferedImage firstFace = ImageIO.read(new File(tileModel.firstFacePath));
        BufferedImage secondFace = ImageIO.read(new File(tileModel.secondFacePath));
        
            
            this.tile = new BufferedImage(tileModel.getWidth(), tileModel.getHeight(), BufferedImage.TYPE_INT_ARGB);


            
            Graphics2D g2d = this.tile.createGraphics();
            g2d.drawImage(firstFace, 0, 0, null);
            g2d.drawImage(secondFace, 0, firstFace.getHeight(), null);
            g2d.dispose();
            repaint();
                    }
   
@Override    
protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    
    
    g.drawImage(this.tile, tileModel.getCordX(), tileModel.getCordY(), null); 
    System.out.println(this.tile);
    
    }
}

    

