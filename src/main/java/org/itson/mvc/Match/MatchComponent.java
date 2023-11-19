package org.itson.mvc.Match;

import java.util.LinkedList;
import org.itson.domaincomponent.domain.Board;
import org.itson.domaincomponent.domain.Match;
import org.itson.domaincomponent.domain.Player;
import org.itson.domaincomponent.domain.Pool;
import org.itson.domaincomponent.domain.Tile;
import org.itson.mvc.Pool.PoolComponent;
import org.itson.mvc.Pool.PoolView;
import org.itson.mvc.board.BoardComponent;
import org.itson.mvc.board.BoardView;
import org.itson.mvc.player.PlayerComponent;
import org.itson.game.MatchGame;
public class MatchComponent {

    private MatchModel matchModel;
    private MatchView matchView;
    private MatchController matchController;
    private PoolComponent poolComponent;
    private PlayerComponent playerComponent;
    private BoardComponent boardComponent;

    public MatchComponent() {
        this.matchModel = new MatchModel(new Match(new Player[4], Board.getInstance(), Pool.getInstance(), 2), Board.getInstance(), Pool.getInstance(), new Player[4]);
        this.matchView = new MatchView(matchModel);
        this.matchController = new MatchController(matchModel, matchView);
        this.poolComponent = new PoolComponent();
        this.playerComponent = new PlayerComponent();
        this.boardComponent = new BoardComponent();
    }
    
    
    public void suscribeToPoolView(MatchGame match){
        this.poolComponent.suscribeToView(match);
    }
    
    public Tile getTileFromPool() {
        return this.poolComponent.getController().getTileFromPool();
    }

    public void addTileToPlayer(Tile tile) {
        this.playerComponent.addTileToPlayerList(tile);
    }

    public void createDominoTiles() {
        this.poolComponent.createDominoTiles();
    }

    public Boolean getTurn() {
        return this.playerComponent.getPlayerController().getTurn();
    }

    public Tile getTileSelected(Tile tile) {
        return this.playerComponent.getPlayerController().getTileFromList(tile);
    }

    public PoolComponent getPoolComponent() {
        return poolComponent;
    }

    public PlayerComponent getPlayerComponent() {
        return playerComponent;
    }

    public BoardComponent getBoardComponent() {
        return boardComponent;
    }


    
    public void paintBoard(){
        this.boardComponent.refreshBoard();
    }


    public void paintPool(){
        this.poolComponent.refresh();
    }
    
    public void buildGame() {
        this.matchController.buildGame();
    }

    public MatchView getMatchView() {
        return matchView;
    }

}
