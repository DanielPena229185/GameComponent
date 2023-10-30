/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.itson.screens;

import org.itson.domaincomponent.domain.FaceTile;
import org.itson.domaincomponent.domain.Tile;
import org.itson.mvc.tile.TileController;
import org.itson.mvc.tile.TileModel;
import org.itson.mvc.tile.TileView;

/**
 *
 * @author santi
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       NewJFrame formulario= new NewJFrame();
       formulario.setVisible(true);
       FaceTile ft = new FaceTile();
       ft.setValue(3);
       Tile tile = new Tile();
       tile.setFirstFace(ft);
       tile.setSecondFace(ft);
       TileModel model= new TileModel(0,ft,ft);
       TileView view= new TileView(model);
       TileController controller= new TileController(model,view);
      formulario.addMouseListener(controller);
       
    }
    
}
