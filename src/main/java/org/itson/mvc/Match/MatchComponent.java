package org.itson.mvc.Match;

import org.itson.domaincomponent.domain.Board;
import org.itson.domaincomponent.domain.Match;
import org.itson.domaincomponent.domain.Player;
import org.itson.domaincomponent.domain.Pool;
import org.itson.domaincomponent.domain.Tile;
import org.itson.mvc.Pool.PoolComponent;
import org.itson.mvc.player.PlayerComponent;

public class MatchComponent {
    
    private MatchModel matchModel;
    private MatchView matchView;
    private MatchController matchController;
    private PoolComponent poolComponent;
    private PlayerComponent playerComponent;
    
    public MatchComponent() {
        this.matchModel = new MatchModel(new Match(new Player[4], Board.getInstance(), Pool.getInstance(), 2), Board.getInstance(), Pool.getInstance(), new Player[4]);
        this.matchView = new MatchView(matchModel);
        this.matchController = new MatchController(matchModel, matchView);
        this.poolComponent = new PoolComponent();
        this.playerComponent = new PlayerComponent();
    }
    
    public Tile getTileFromPool() {
        return this.poolComponent.getController().getTileFromPool();
    }
    
    public void addTileToPlayer(Tile tile) {
        this.playerComponent.addTileToPlayerList(tile);
    }
    
    public void createDominoTiles(){
        this.poolComponent.createDominoTiles();
    }
    
    
    public void buildGame() {
        this.matchController.buildGame();
    }
    
    public MatchView getMatchView() {
        return matchView;
    }
    
}
