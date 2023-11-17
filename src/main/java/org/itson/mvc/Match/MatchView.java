/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.mvc.Match;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author PC
 */
public class MatchView extends JFrame {
    
    private MatchModel matchModel;
    
    public MatchView(MatchModel matchModel) {
        this.matchModel = matchModel;
        
    }
    
    public void refresh() {
        this.setTitle(this.matchModel.getPlayers().length + "");
        JLabel j = new JLabel();
       
        
       j.setText(this.matchModel.getPlayers()[0].getName() + this.matchModel.getPlayers()[1].getName() + this.matchModel.getPlayers()[2].getName() + this.matchModel.getPlayers()[3].getName());
     
        this.add(j);


        this.setSize(500, 500);
        this.setVisible(true);
    }
    
}
