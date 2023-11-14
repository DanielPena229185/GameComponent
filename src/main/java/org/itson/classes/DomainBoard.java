package org.itson.classes;

import org.itson.domaincomponent.domain.Board;

public class DomainBoard {

    private Board board;

    public DomainBoard() {
        this.board = Board.getInstance();
    }
    
    
    public void addTileBeginning() {

    }

    public void addTileBeginningForMule() {

    }

    public void addTileBeginningNonMule() {

    }

    public void addTileEnd() {

    }

    public void addTileEndForMule() {

    }
    
     public void addTileEndForNonMule(){
        
    }
     
     
     
    /*
    private Board(): Constructor privado que inicializa la lista de baldosas (tiles) como una nueva LinkedList.
public void addTileBeginning(Tile newTile) throws BoardException: Agrega una baldosa al principio de la lista de baldosas, considerando el tipo de la primera baldosa y su compatibilidad con la nueva baldosa.
private void addTileBeginningForMule(Tile newTile, Tile firstTile) throws BoardException: Método privado que agrega una baldosa al principio de la lista cuando la primera baldosa es una mula.
private void addTileBeginningForNonMule(Tile newTile, Tile firstTile) throws BoardException: Método privado que agrega una baldosa al principio de la lista cuando la primera baldosa no es una mula.
public void addTileEnd(Tile newTile) throws BoardException: Agrega una baldosa al final de la lista de baldosas, considerando el tipo de la última baldosa y su compatibilidad con la nueva baldosa.
private void addTileEndForMule(Tile newTile, Tile lastTile) throws BoardException: Método privado que agrega una baldosa al final de la lista cuando la última baldosa es una mula.
private void addTileEndForNonMule(Tile newTile, Tile lastTile) throws BoardException: Método privado que agrega una baldosa al final de la lista cuando la última baldosa no es una mula.
     */
}
