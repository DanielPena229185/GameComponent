/**
* TileController.java
* Oct 10, 2023 11:06:10 AM
*/ 

package org.itson.domain.tile;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 * @author Daniel Armando Peña Garcia ID:229185
 * @author Santiago Bojórquez Leyva ID:228475
 * @author Paul Alejandro Vazquez Cervantes ID:241400
 * @author Jose Eduardo Hinojosa Romero ID: 2356666
 */
public class TileController {
    
    private TileModel tileModel;
    private TileView tileView;

    /**
     *
     */
    public TileController(TileModel tileModel, TileView tileView){
        this.tileModel = tileModel;
        this.tileView = tileView;
    }
    
    class RotateTile implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            tileModel.doRotation();
        }
        
    }
}
