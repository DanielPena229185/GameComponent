
package org.itson.mvc.components;

import org.itson.mvc.player.PlayerController;
import org.itson.mvc.player.PlayerModel;
import org.itson.mvc.player.PlayerView;

/**
 *
 * @author paulvazquez
 */
public class PlayerComponent {
    private static PlayerComponent playerComponent;
    PlayerModel playerModel;
    PlayerView playerView;
    PlayerController playerController;
    
    public PlayerComponent(){
    }
    
    public PlayerComponent(PlayerModel playerModel, PlayerView playerView, PlayerController playerController){
       this.playerModel = playerModel;
       this.playerView = playerView;
        this.playerController = playerController;
    }

    public PlayerModel getPlayerModel() {
        return playerModel;
    }

    public void setPlayerModel(PlayerModel playerModel) {
        this.playerModel = playerModel;
    }

    public PlayerView getPlayerView() {
        return playerView;
    }

    public void setPlayerView(PlayerView playerView) {
        this.playerView = playerView;
    }

    public PlayerController getPlayerController() {
        return playerController;
    }

    public void setPlayerController(PlayerController playerController) {
        this.playerController = playerController;
    }
    
    
}
