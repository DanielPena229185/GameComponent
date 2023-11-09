/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.mvc.board;

import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.*;
import org.itson.domaincomponent.domain.Tile;

/**
 *
 * @author PC
 */
public class BoardView extends JPanel {

    private BoardModel boardModel;
    private JPanel mainPanel;

    public BoardView(BoardModel boardModel) {
        this.boardModel = boardModel;
    }

    public BoardView() {
        setSize(1010, 580);
        mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

        add(mainPanel);
        setVisible(true);
    }
    Tile tile = new Tile();

    public void addTile(Tile tile) {
        refreshView();
    }

    public void refreshView() {
        revalidate();
        repaint();
    }
}
