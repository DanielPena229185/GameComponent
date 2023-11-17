/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.mvc.Match;

/**
 *
 * @author PC
 */
public class MatchController {
    
    
     private MatchModel matchModel;
    private MatchView matchView;

    public MatchController(MatchModel matchModel, MatchView matchView) {
        this.matchModel = matchModel;
        this.matchView = matchView;
    }
    
    
    public void buildGame(){
        this.matchModel.buildGame();
    
        this.matchView.refresh();   
        
        
    }
  
    
    
    
}
