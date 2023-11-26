/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.interfaces;

import org.itson.enums.BoardEvents;
import org.itson.enums.PoolEvents;
import org.itson.enums.TileEvents;

/**
 *
 * @author PC
 */
public interface Observer {

    void eventOnPoolUpdate(PoolEvents evt);
    void eventOnBoardUpdate(BoardEvents evt);
    void eventOnTileUpdate(TileEvents evt);
 
}
