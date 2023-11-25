/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.mvc.board;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;
import org.itson.domaincomponent.domain.Tile;
import org.itson.game.MatchGame;
import org.itson.mvc.tile.TileComponent;

/**
 *
 * @author PC
 */
public class BoardController extends MouseAdapter{
    private BoardView boardView;
    private BoardModel boardModel;
    
    public BoardController(BoardView boardView, BoardModel boardModel){
        this.boardModel = boardModel;
        this.boardView = boardView;
        
    }
    
    public void suscribeToView(MatchGame match){
        this.boardView.addObserver(match);
    }
    
    public void addTileToBoard(TileComponent tile){
        this.boardModel.addTile(tile);
    }
    
    public TileComponent getTileFromList(TileComponent tile){
        return this.boardModel.removeTile(tile);
    }
    
    /*public void setTile(Tile tile){
        boardModel.setTile(tile);
    }*/

    public void refreshBoard() {
         this.boardView.refresh();
    }
}
