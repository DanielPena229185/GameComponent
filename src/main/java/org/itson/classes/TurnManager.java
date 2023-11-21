package org.itson.classes;

import java.util.HashMap;
import org.itson.domaincomponent.domain.Player;

public class TurnManager {

    private static TurnManager turnManager;

    private Integer actualTurn;

    HashMap<Player, Integer> playersTurnsList = new HashMap<>();

    public boolean verifyActualPlayerTurn(Player player) {
        Integer playerTurn = playersTurnsList.get(player);
        return playerTurn != null && playerTurn.equals(actualTurn);
    }

    public void passTurn(){
        if((actualTurn + 1) > playersTurnsList.size()){    
            actualTurn = (playersTurnsList.size() - (playersTurnsList.size() - 1));
        }else{
            actualTurn++;
        }
    }
    
    public void eliminatePlayerFromTurnList(Player player){
           playersTurnsList.remove(player);
           actualTurn--;
    }
    
    public static TurnManager getInstance() {
        if (turnManager == null) {
            turnManager = new TurnManager();
        }
        return turnManager;
    }
}
