
package org.itson.mvc.Match;

import org.itson.domaincomponent.domain.Board;
import org.itson.domaincomponent.domain.Match;
import org.itson.domaincomponent.domain.Player;
import org.itson.domaincomponent.domain.Pool;

public class MatchComponent {
    
    
    private MatchModel matchModel;
    private MatchView matchView;
    private MatchController matchController;

    public MatchComponent() {
        this.matchModel = new MatchModel(new Match(new Player[4], Board.getInstance(), Pool.getInstance(), 2), Board.getInstance(), Pool.getInstance(), new Player[4]);
        this.matchView = new MatchView(matchModel);
        this.matchController = new MatchController(matchModel, matchView);
    }
    
    
    
    public void buildGame(){
        this.matchController.buildGame();
    }



    public MatchView getMatchView() {
        return matchView;
    }

    
    
    
    
    
    
}
