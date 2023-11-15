/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.mvc.player;

import java.util.LinkedList;
import org.itson.domaincomponent.domain.Player;
import org.itson.domaincomponent.domain.Tile;
import org.itson.enums.ImagesSourcers;

/**
 *
 * @author santi
 */
public class PlayerModel {
    
    private Player player;
   
 
    private String avatarPath;
    
    private String name;
    
    public LinkedList<Tile> tiles;
    
    public int turn;
    
    private int width= 100;
    
    private int height= 100;
    
    private int CordX= 0;
    
    private int CordY= 0;

    public PlayerModel() {
    }

    public PlayerModel(Player player, String avatarSelected) {
        this.player = player;
        this.name = "El_Gallo";
        this.avatarPath =getAvatarImage(this.name);
//        this.width = 100;
//        this.height = 100;
        
    }
    
    public static String getAvatarImage(String name) {
        return switch (name) {
            case "El_Gallo" -> ImagesSourcers.getSOURCE_IMAGE_AVATAR_El_Gallo();
            case "La_dama" -> ImagesSourcers.getSOURCE_IMAGE_AVATAR_La_dama();
            case "La_chalupa" -> ImagesSourcers.getSOURCE_IMAGE_AVATAR_La_chalupa();
            case "El_diablito" -> ImagesSourcers.getSOURCE_IMAGE_AVATAR_El_diablito();
            case "El_sol" -> ImagesSourcers.getSOURCE_IMAGE_AVATAR_El_sol();
            case "El_borracho" -> ImagesSourcers.getSOURCE_IMAGE_AVATAR_El_borracho();
            case "El_apache" -> ImagesSourcers.getSOURCE_IMAGE_AVATAR_El_apache();
            case "El_Valiente" -> ImagesSourcers.getSOURCE_IMAGE_AVATAR_El_Valiente();
            default -> null;
        };
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getCordX() {
        return CordX;
    }

    public int getCordY() {
        return CordY;
    }
    
    public String getAvatarPath() {
        return avatarPath;
    }
    
    
    
    
}
