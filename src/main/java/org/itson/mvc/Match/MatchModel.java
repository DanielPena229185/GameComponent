/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.mvc.Match;

import org.itson.domaincomponent.domain.Board;
import org.itson.domaincomponent.domain.Match;
import org.itson.domaincomponent.domain.Player;
import org.itson.domaincomponent.domain.Pool;

/**
 *
 * @author PC
 */
public class MatchModel {
    
    private Match match;
    
    private Board board;
    
    private Pool  pool;
    
    private Player player;

    public MatchModel() {
    }

    public MatchModel(Match match, Board board, Pool pool, Player player) {
        this.match = match;
        this.board = board;
        this.pool = pool;
        this.player = player;
    }
    
    
    
}
