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
import org.itson.mvc.tile.TileComponent;
public class MatchComponent {

    private MatchModel matchModel;
    private MatchView matchView;
    private MatchController matchController;
    private PoolComponent poolComponent;
    private PlayerComponent playerComponent;
    private BoardComponent boardComponent;
    private TileComponent tileComponent;

    public MatchComponent() {
        this.matchModel = new MatchModel(new Match(new Player[4], Board.getInstance(), Pool.getInstance(), 7), Board.getInstance(), Pool.getInstance(), new Player[4]);
        this.matchView = new MatchView(matchModel);
        this.matchController = new MatchController(matchModel, matchView);
        this.poolComponent = new PoolComponent();
        this.playerComponent = new PlayerComponent();
        this.boardComponent = new BoardComponent();
    }
    
    
    public void suscribeToPoolView(MatchGame match){
        this.poolComponent.suscribeToView(match);
    }
    
    public void suscribeToBoardView(MatchGame match){
        this.boardComponent.suscribeToView(match);
    }

    public Player[] getPlayersOnGame(){
       return matchController.getPlayersOnGame();
    }
    public void suscribeToPlayerView(MatchGame match){//suscribirse nomas componente
        this.playerComponent.suscribeToView(match);

    }
    
    public Tile getTileFromPool() {
        return this.poolComponent.getController().getTileFromPool();
    }

    public void addTileToPlayer(TileComponent tile) {
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

    public TileComponent getTileComponent(){
        return tileComponent;
    }
    
    public void paintBoard(){
        this.boardComponent.refreshBoard();
    }


    public void paintPool(){
        this.poolComponent.refresh();
    }
    
    public void paintPlayer(){
        this.playerComponent.refreshPlayer();
    }
    
    public void buildGame() {
        this.matchController.buildGame();
        
    }

    public MatchView getMatchView() {
        return matchView;
    }
    
    public int getTilesSize(){
        return this.matchModel.getPool().getTiles().size();
    }

}
