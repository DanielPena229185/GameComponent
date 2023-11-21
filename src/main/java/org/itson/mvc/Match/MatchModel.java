/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.mvc.Match;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.itson.domaincomponent.domain.Board;
import org.itson.domaincomponent.domain.Match;
import org.itson.domaincomponent.domain.Player;
import org.itson.domaincomponent.domain.Pool;
import org.itson.domaincomponent.exceptions.MatchException;
import org.itson.domaincomponent.exceptions.PoolException;

/**
 *
 * @author PC
 */
public class MatchModel {

    private Match match;

    private Board board;

    private Pool pool;

    private Player[] players;

    public MatchModel() {
    }

    public MatchModel(Match match, Board board, Pool pool, Player[] players) {
        this.match = match;
        this.board = board;
        this.pool = pool;
        this.players = players;
        
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player("Player N." + i);
        }
    }

    public Match getMatch() {
        return match;
    }

    public Board getBoard() {
        return board;
    }

    public Pool getPool() {
        return pool;
    }

    public Player[] getPlayers() {
        return players;
    }

    
    
    
    
    public void buildGame() {

        try {
            for (int i = 0; i < 4; i++) {
                if (this.players[i] == null) {
                    this.players[i] = new Player("Pepito " + i);
                    
                }
            }
            this.board = Board.getInstance();
            this.pool = Pool.getInstance();
            this.match = new Match(players, board, pool, 2);
            
            
            this.pool.createDominoTiles();
            this.match.distributeTiles();
        } catch (PoolException ex) {
            Logger.getLogger(MatchModel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MatchException ex) {
            Logger.getLogger(MatchModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
