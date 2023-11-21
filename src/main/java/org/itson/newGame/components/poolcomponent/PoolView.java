/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.newGame.components.poolcomponent;

import javax.swing.JLabel;

/**
 *
 * @author TheMM
 */
public class PoolView extends JLabel{
    private PoolModel poolModel;

    public PoolView(PoolModel poolModel) {
        this.poolModel = poolModel;
    }
    
    public void refresh(){
        this.setSize(this.poolModel.getWidth(),this.poolModel.getHeight());
        this.setText(poolModel.getTilesSize() + "");
        }
}
