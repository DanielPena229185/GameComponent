/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.game;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
import org.itson.mvc.Pool.PoolView;
import org.itson.mvc.board.BoardView;
import org.itson.mvc.board.BoardComponent;
import org.itson.mvc.player.PlayerComponent;
import org.itson.mvc.Pool.PoolComponent;
import org.itson.mvc.tile.TileComponent;
import org.itson.mvc.player.PlayerView;
import org.itson.mvc.tile.TileController;
import org.itson.mvc.tile.TileModel;
import org.itson.mvc.tile.TileView;

public class Match {

    DomainBoard domainBoard;

    private BoardComponent boardComponent = new BoardComponent();

    Board board;

    private DomainMatch match;
    Pool pool;
    Player player;
    private PlayerComponent playerComponent = new PlayerComponent();
    private DomainPool domainPool;
    private PoolComponent poolComponent = new PoolComponent();
    private TileComponent tileComponent;
    private TileModel tileModel;
    private TileView tileView;
    private TileController tileController;

    Tile playerTileSelected;

    public Match() {
        boardComponent.createBoardComponent();
        poolComponent.createPoolComponent();
        playerComponent.createPlayerComponent();

        domainBoard = new DomainBoard();
        
        poolComponent.getView().addMouseListener(poolPanelClickEvent);
    }

    public BoardView drawBoard(JPanel mainPanel) {
        boardComponent = new BoardComponent();
        boardComponent.getBoardModel();
        boardComponent.getBoardView().setPreferredSize(new Dimension(730, 600));
        boardComponent.getBoardController();

        boardComponent.getBoardView().setPreferredSize(new Dimension(730, 600));
        mainPanel.add(boardComponent.getBoardView(), new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 0, -1, -1));
        mainPanel.setComponentZOrder(boardComponent.getBoardView(), 0);
        board = Board.getInstance();
        boardComponent.getBoardView().repaint();

        return boardComponent.getBoardView();
    }

    public PoolView drawPool(JPanel mainPanel) throws PoolException {

        poolComponent.getModel();
        poolComponent.getView().setPreferredSize(new Dimension(730, 600));
        poolComponent.getController();
        mainPanel.add(poolComponent.getView(), new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 226, -1, -1));
        pool = Pool.getInstance();
        pool.createDominoTiles();
        poolComponent.getView().repaint();
        return poolComponent.getView();
    }

    public PlayerView drawPlayer(JPanel mainPanel) {

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
    //se debe cambiar
    public MouseListener boardPanelClickEvent = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            // Display a message box
            JOptionPane.showMessageDialog(null, "Haz dado click en el panel board");

            // Print a message to the console
            System.out.println("Haz dado click en el panel board");
        }
    };

    //se debe cambiar
    public MouseListener poolPanelClickEvent = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            try {
                // Display a message box
                JOptionPane.showMessageDialog(null, "Haz dado click en el panel pool");
                
                pickTileFromPool(playerComponent.getPlayerModel().getPlayer());
                System.out.println(playerComponent.getPlayerModel().getTiles().getFirst().getFirstFace().getValue());
                System.out.println(playerComponent.getPlayerModel().getTiles().getFirst().getSecondFace().getValue());
                // Print a message to the console
                System.out.println("Haz dado click en el panel pool");
            } catch (PlayerException ex) {
                Logger.getLogger(Match.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    };

    public Tile pickTileFromPool(Player player) throws PlayerException {
        try {   
            playerComponent.getPlayerModel().addTile(poolComponent.getModel().pickTileFromTilesList());
            
            playerComponent.getPlayerController(); 

            player.addTile(pool.getRandomTile());

            return null;
        } catch (PoolException ex) {
            Logger.getLogger(Match.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void addListenerToBoardView(BoardView boardView) {
        boardComponent.getBoardView().addMouseListener(boardPanelClickEvent);
    }

    public void addListenerToPoolView(PoolView poolView) {
        poolComponent.getView().addMouseListener(poolPanelClickEvent);
    }

}
