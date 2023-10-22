/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.configuration;

/**
 *
 * @author PC
 */
public class MatchConfiguration {
    
    private int dealTileAmount;
    
    
    public boolean verifyConfiguration(){
        return !(dealTileAmount <= 2 || dealTileAmount >= 7);
    }
}
