/**
 * FaceTile.java
 * Oct 10, 2023 11:05:24 AM
 */
package org.itson.domain.tile;

import java.awt.image.BufferedImage;
import static org.itson.domain.tile.Side.BOTTOM;
import static org.itson.domain.tile.Side.LEFT;
import static org.itson.domain.tile.Side.RIGHT;
import static org.itson.domain.tile.Side.TOP;

/**
 * This class represents a one face of the tile.
 *
 * @author Daniel Armando Peña Garcia ID:229185
 * @author Santiago Bojórquez Leyva ID:228475
 * @author Paul Alejandro Vazquez Cervantes ID:241400
 * @author Jose Eduardo Hinojosa Romero ID: 2356666
 */
public class FaceTile {

    /**
     * Side of the face, (TOP, BOTTOM, RIGHT or LEFT)
     */
    private Side side;

    /**
     * Position of the face in "x", to be painted
     */
    private Integer positionX;

    /**
     * Position of the face in "y", to be painted
     */
    private Integer positionY;

    /**
     * Value of the face
     */
    private int value;

    /**
     * Image of the face
     */
    private BufferedImage img;

    /**
     * Width of the face tile's image
     */
    private int width;

    /**
     * Height of the face tile's image
     */
    private int height;

    /**
     * Default constructor
     */
    public FaceTile() {

    }

    /**
     * Constructor for build a face of tile, value, and image.
     *
     * @param value Value of the face, should be more and equals cero or lower
     * than seven
     * @param img Buffered Image of the face
     */
    public FaceTile(int value, BufferedImage img) {
        this.value = value;
        this.img = img;
    }

    /**
     * Set the side of the face tile on TOP
     */
    public void setOnTopSide() {
        this.side = Side.TOP;
    }

    /**
     * Set the side of the face tile on BOTTOM
     */
    public void setOnBottomSide() {
        this.side = Side.BOTTOM;
    }

    /**
     * Set the side of the face tile on LEFT
     */
    public void setOnLeftSide() {
        this.side = Side.LEFT;
    }

    /**
     * Set the side of the face tile on RIGHT
     */
    public void setOnRightSide() {
        this.side = Side.RIGHT;
    }

    /**
     * Rotates the current side to the right in a circular sequence. If the
     * current side is at the end of the sequence, it wraps around to the
     * beginning.
     */
    public void turnSide() {
        if (null != this.side) {
            switch (this.side) {
                case TOP ->
                    this.setOnLeftSide();
                case LEFT ->
                    this.setOnBottomSide();
                case BOTTOM ->
                    this.setOnRightSide();
                case RIGHT ->
                    this.setOnTopSide();
            }
        }
    }

    /**
     * Get the side of the face.
     *
     * @return side of the face (TOP, BOTTOM, RIGHT or LEFT)
     */
    public Side getSide() {
        return side;
    }

    /**
     * Set the side of the face.
     *
     * @param side side of the face.
     */
    public void setSide(Side side) {
        this.side = side;
    }

    /**
     * Coordinate position in "X"
     *
     * @return position in "x"
     */
    public Integer getPositionX() {
        return positionX;
    }

    /**
     * Set coordinate position in "X"
     *
     * @param positionX Coordinate position in "X"
     */
    public void setPositionX(Integer positionX) {
        this.positionX = positionX;
    }

    /**
     * Coordinate position in "Y"
     *
     * @return position in "Y"
     */
    public Integer getPositionY() {
        return positionY;
    }

    /**
     * Set coordinate position in "Y"
     *
     * @param positionY Coordinate position in "Y"
     */
    public void setPositionY(Integer positionY) {
        this.positionY = positionY;
    }

    /**
     * Get the value of the face
     *
     * @return value of the face
     */
    public int getValue() {
        return value;
    }

    /**
     * Set the value of the face
     *
     * @param value value of the face
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Buffered Image of the face
     *
     * @return Buffered image of the face
     */
    public BufferedImage getImg() {
        return img;
    }

    /**
     * Set the Buffered Image of the face
     *
     * @param img Buffered Image of the face
     */
    public void setImg(BufferedImage img) {
        this.img = img;
    }

    /**
     * Set the width of the face tile's image
     *
     * @param width new width of the face tile's image
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Set the height of the face tile's image
     *
     * @param height new height of the face tile's image
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Get the width of the face tile's image
     *
     * @return width of the face tile's image
     */
    public int getWidth() {
        return width;
    }

    /**
     * Get the height of the face tile's image
     *
     * @return height of the face tile's image
     */
    public int getHeight() {
        return height;
    }

    /**
     * Refreshes the image by resizing it to the specified dimensions.
     *
     * @param width The new width for the image.
     * @param height The new height for the image.
     */
    public void refreshImage(int width, int height) {
        BufferedImage resizedImage = new BufferedImage(width, height,
                this.img.getType());
        this.img = resizedImage;
    }

    @Override
    public String toString() {
        return "FaceTile{" + "side=" + side + ", positionX=" + positionX + ", positionY=" + positionY + ", value=" + value + ", img=" + img + '}';
    }

}
