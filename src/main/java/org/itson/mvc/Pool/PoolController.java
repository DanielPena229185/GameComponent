/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.mvc.Pool;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.SwingUtilities;
import org.itson.domaincomponent.domain.Tile;
import org.itson.game.MatchGame;
import org.itson.interfaces.Observer;


/**
 *
 * @author PC
 */
public class PoolController  extends MouseAdapter {
    private PoolView poolView;
    private PoolModel poolModel;
    private List<Observer> observers = new ArrayList<>();

    public PoolController(PoolView poolView, PoolModel poolModel) {
        this.poolView = poolView;
        this.poolModel = poolModel;
        this.suscribeToClick();
    }
    
    public void suscribe(MatchGame match){
        this.addObserver(match);
    }
    
    public void createDominoTiles(){
        this.poolModel.createDominoTiles();
    }
    
    public Tile getTileFromPool(){
       return this.poolModel.pickTileFromTilesList();
    }
    
    public void refresh(){
        this.poolView.refresh();
    }
    
    private void suscribeToClick(){
        this.poolView.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    notifyObservers("click_event");
                }
            });
    }

    
    
     public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
