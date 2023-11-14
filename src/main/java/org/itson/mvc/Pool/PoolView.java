package org.itson.mvc.Pool;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class PoolView extends JPanel {

    private PoolModel poolModel;
    private Image poolImage;
    private int poolWidth;
    private int poolHeight;

    public PoolView(PoolModel poolModel) {
        this.poolModel = poolModel;
        loadPoolImage();
        setPreferredSize(new Dimension(120, 360));
    }

    private void loadPoolImage() {
        try {
            poolImage = ImageIO.read(new File(poolModel.getPoolImagePath()));
            poolWidth = 120;
            poolHeight = 360;
        } catch (IOException e) {
            e.printStackTrace();
            // Manejar la excepción de manera adecuada
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (poolImage != null) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.drawImage(poolImage, 0, 0, this);
            g2d.dispose();
        }
    }
}
