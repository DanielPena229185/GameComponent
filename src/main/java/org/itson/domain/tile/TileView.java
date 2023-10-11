/**
* TileView.java
* Oct 10, 2023 11:05:56 AM
*/ 

package org.itson.domain.tile;

import java.awt.Graphics;
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
    
    /**
     *
     */
    public TileView(TileModel tileModel){
        this.tileModel = tileModel;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }
    
    
}
