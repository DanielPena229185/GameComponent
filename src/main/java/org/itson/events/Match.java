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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.itson.classes.DomainBoard;
import org.itson.classes.DomainMatch;
import org.itson.domaincomponent.domain.Board;
import org.itson.domaincomponent.domain.Player;
import org.itson.domaincomponent.domain.Pool;
import org.itson.domaincomponent.domain.Tile;
import org.itson.domaincomponent.exceptions.PoolException;
import org.itson.mvc.Pool.PoolController;
import org.itson.mvc.Pool.PoolModel;
import org.itson.mvc.Pool.PoolView;
import org.itson.mvc.board.BoardController;
import org.itson.mvc.board.BoardModel;
import org.itson.mvc.board.BoardView;
import org.itson.mvc.components.BoardComponent;
import org.itson.mvc.components.PoolComponent;
import org.itson.mvc.components.TileComponent;
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
    private BoardModel boardModel;
    private BoardView boardView;
    private BoardController boardController;
    Board board;

    private PoolModel poolModel;
    private PoolView poolView;
    private PoolController poolController;
    private DomainMatch match;
    Pool pool;
    PoolComponent poolComponent;

    private PlayerModel playerModel;
    private PlayerView playerView;
    private PlayerController playerController;
    Player player;
    //PlayerComponent playerComponent;

    private TileComponent tileComponent;
    private TileModel tileModel;
    private TileView tileView;
    private TileController tileController;
    //Here is gonna be to catch the events
    Tile playerTileSelected;

    public Match() {
        domainBoard = new DomainBoard();
    }

    public void drawBoard(JPanel mainPanel) {
        boardComponent = new BoardComponent();
        boardModel = new BoardModel();
        boardView = new BoardView(boardModel);
        boardController = new BoardController(boardView, boardModel);
        boardView.setPreferredSize(new Dimension(1010, 580));
        mainPanel.setComponentZOrder(boardView, 0);
        board = Board.getInstance();
        //board.addTileBeginning(playerTileSelected);

    }

    public PoolView drawPool(JPanel mainPanel) throws PoolException {
        poolComponent = new PoolComponent();
        poolModel = new PoolModel();
        poolView = new PoolView(poolModel);
        poolController = new PoolController(poolView, poolModel);
        
        
        poolView.setPreferredSize(new Dimension(120, 130));
          mainPanel.add(poolView, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 226, -1, -1));
        mainPanel.setComponentZOrder(poolView, 0);
        pool = Pool.getInstance();
        pool.createDominoTiles();
        poolView.repaint();
        return poolView;
    }

    public void drawPlayer(JPanel mainPanel) {
        playerModel = new PlayerModel();
        playerView = new PlayerView(playerModel);
        playerController = new PlayerController(playerModel, playerView);
        playerView.setPreferredSize(new Dimension(740, 90));
        mainPanel.setComponentZOrder(playerView, 0);
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

    public void addListenerToBoardView(BoardView boardView) {
        boardView.addMouseListener(boardPanelClickEvent);
    }

    public void addListenerToPoolView(PoolView poolView) {
        poolView.addMouseListener(poolPanelClickEvent);
    }

}
