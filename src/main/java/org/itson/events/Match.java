/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.events;

import java.awt.Dimension;
import java.awt.List;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.EventListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.itson.classes.DomainBoard;
import org.itson.classes.DomainMatch;
import org.itson.classes.DomainPool;
import org.itson.domaincomponent.domain.Board;
import org.itson.domaincomponent.domain.Player;
import org.itson.domaincomponent.domain.Pool;
import org.itson.domaincomponent.domain.Tile;
import org.itson.domaincomponent.exceptions.PlayerException;
import org.itson.domaincomponent.exceptions.PoolException;
import org.itson.mvc.Pool.PoolController;
import org.itson.mvc.Pool.PoolModel;
import org.itson.mvc.Pool.PoolView;
import org.itson.mvc.board.BoardController;
import org.itson.mvc.board.BoardModel;
import org.itson.mvc.board.BoardView;
import org.itson.mvc.board.BoardComponent;
import org.itson.mvc.player.PlayerComponent;
import org.itson.mvc.Pool.PoolComponent;
import org.itson.mvc.tile.TileComponent;
import org.itson.mvc.player.PlayerController;
import org.itson.mvc.player.PlayerModel;
import org.itson.mvc.player.PlayerView;
import org.itson.mvc.tile.TileController;
import org.itson.mvc.tile.TileModel;
import org.itson.mvc.tile.TileView;

/**
 *
 * @author TheMM
 */
public class Match {

    DomainBoard domainBoard;

    BoardComponent boardComponent;
    
    Board board;

    
    private DomainMatch match;
    Pool pool;
    PoolComponent poolComponent;

    
    Player player;
    PlayerComponent playerComponent;
    DomainPool domainPool;

    private TileComponent tileComponent;
    private TileModel tileModel;
    private TileView tileView;
    private TileController tileController;
    //Here is gonna be to catch the events
    Tile playerTileSelected;

    public Match() {
        boardComponent.createBoardComponent();
        poolComponent.createPoolComponent();
        playerComponent.createPlayerComponent();
        
        domainBoard = new DomainBoard();
    }

    public BoardView drawBoard(JPanel mainPanel) {
        boardComponent = new BoardComponent();
        boardComponent.getBoardModel();
        boardComponent.getBoardView().setPreferredSize(new Dimension(730, 600));
        boardComponent.getBoardController();
        
        boardComponent.getBoardView().setPreferredSize(new Dimension(730, 600));
        mainPanel.add(boardComponent.getBoardView(), new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 0, -1, -1));
        mainPanel.setComponentZOrder(boardComponent.getBoardView(), 0);
//        boardView.setPreferredSize(new Dimension(730, 600));
//        mainPanel.add(boardView, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 0, -1, -1));
//        mainPanel.setComponentZOrder(boardView, 0);
        board = Board.getInstance();
        boardComponent.getBoardView().repaint();
        return boardComponent.getBoardView();
        //board.addTileBeginning(playerTileSelected);

    }

    public PoolView drawPool(JPanel mainPanel) throws PoolException {
        poolComponent = new PoolComponent();
        poolComponent.getModel();
        poolComponent.getView().setPreferredSize(new Dimension(730, 600));
        poolComponent.getController();
        
        
//        poolView.setPreferredSize(new Dimension(120, 130));
//          mainPanel.add(poolView, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 226, -1, -1));
//        mainPanel.setComponentZOrder(poolView, 0);
        pool = Pool.getInstance();
        pool.createDominoTiles();
        poolComponent.getView().repaint();
        return poolComponent.getView();
    }

    public PlayerView drawPlayer(JPanel mainPanel) {
        playerComponent = new PlayerComponent();
        playerComponent.getPlayerModel();
        playerComponent.getPlayerView();
        playerComponent.getPlayerController();
        
        playerComponent.getPlayerView().setPreferredSize(new Dimension(740, 90));
        mainPanel.add(playerComponent.getPlayerView(), new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 620, -1, -1));
        mainPanel.setComponentZOrder(playerComponent.getPlayerView(), 0);
        //me quedé aqui
        playerComponent.getPlayerView().repaint();
        return playerComponent.getPlayerView();
    }
    

    public MouseListener boardPanelClickEvent = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            // Display a message box
            JOptionPane.showMessageDialog(null, "Haz dado click en el panel board");

            // Print a message to the console
            System.out.println("Haz dado click en el panel board");
        }
    };

    public MouseListener poolPanelClickEvent = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            // Display a message box
            JOptionPane.showMessageDialog(null, "Haz dado click en el panel pool");

            // Print a message to the console
            System.out.println("Haz dado click en el panel pool");
        }
    };
    
    public Tile pickTileFromPool(Player player) throws PlayerException{
        try {
            playerComponent = new PlayerComponent();
            playerComponent.getPlayerModel().addTile(domainPool.getRandomTile());
            playerComponent.getPlayerView();
            playerComponent.getPlayerController();

                player.addTile(pool.getRandomTile());
            
            return null;
        } catch (PoolException ex) {
            Logger.getLogger(Match.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void addListenerToBoardView(BoardView boardView) {
        boardView.addMouseListener(boardPanelClickEvent);
    }

    public void addListenerToPoolView(PoolView poolView) {
        poolView.addMouseListener(poolPanelClickEvent);
    }

}
