/**
 * TileModel.java
 * Oct 10, 2023 11:05:40 AM
 */
package org.itson.mvc.tile;


import org.itson.domaincomponent.domain.FaceTile;
import org.itson.domaincomponent.enums.Orientation;
import org.itson.domaincomponent.enums.Side;

/**
 * This class represents the model of the tile, using the MVC model.
 *
 * @author Daniel Armando Peña Garcia ID:229185
 * @author Santiago Bojórquez Leyva ID:228475
 * @author Paul Alejandro Vazquez Cervantes ID:241400
 * @author Jose Eduardo Hinojosa Romero ID: 2356666
 */
public class TileModel {

    /**
     * Id of the tile
     */
    private int id;

    /**
     * The first face of the tile
     */
    private FaceTile firstFace;

    /**
     * The second face of the tile
     */
    private FaceTile secondFace;

    /**
     * Orientation of the tile (Horizontal, Vertical)
     */
    private Orientation orientation = Orientation.VERTICAL;
    
    
    public String firstFacePath="src/main/resources/tiles/Face-Tile-Vaue-5.png"; 
    
    public String secondFacePath="src/main/resources/tiles/Face-Tile-Vaue-4.png"; 
    
    private int height=176;
    
    private int width=88;
    
    private int cordX;

    private int cordY;
    /**
     * Default constructor
     */
    public TileModel() {

    }

    /**
     * Constructor for a tile, with first face and second face without
     * orientation, because the orientation default is Vertical
     *
     * @param id id of the tile
     * @param firsFace Firs face of the tile (TOP side as default)
     * @param secondFace Second face of the tile (BOTTOM side as default)
     */
    public TileModel(int id, FaceTile firstFace, FaceTile secondFace) {

        firstFace.setSide(Side.TOP);
        firstFace.setSide(Side.BOTTOM);
        this.id = id;
        this.firstFace = firstFace;
        this.secondFace = secondFace;
        this.firstFacePath="src/main/resources/tiles/Face-Tile-Vaue-3.png";    
        this.secondFacePath="src/main/resources/tiles/Face-Tile-Vaue-3.png";
    }

    /**
     * Constructor for a tile, with first face and second face, with orientation
     *
     * @param id id of the tile
     * @param firsFace First face of the tile. If the orientation is Vertical,
     * the side of the face is TOP, but if is Horizontal, the side is LEFT
     * @param secondFace Second face of the tile. If the orientation is
     * Vertical, the side of the face is BOTTOM, but if is Horizontal, the side
     * is RIGHT
     * @param orientation Orientation of the tile.
     */
    public TileModel(int id, FaceTile firsFace, FaceTile secondFace, Orientation orientation) {
        this.id = id;
        this.firstFace = firsFace;
        this.secondFace = secondFace;
        this.doRotationByOrientationDefault(orientation);
        this.orientation = orientation;
    }

    /**
     * Rotates the faces of a tile based on the given orientation. This method
     * adjusts the sides of the faces to match the specified orientation, either
     * Horizontal or Vertical.
     *
     * @param orientation The desired orientation for the tile (Horizontal or
     * Vertical).
     */
    private void doRotationByOrientationDefault(Orientation orientation) {

        if (orientation == Orientation.VERTICAL) {
            firstFace.setSide(Side.TOP);
            firstFace.setSide(Side.BOTTOM);
        }

        if (orientation == Orientation.HORIZONTAL) {
            firstFace.setSide(Side.LEFT);
            firstFace.setSide(Side.RIGHT);
        }

    }

    public int getCordX() {
        return cordX;
    }

    public void setCordX(int cordX) {
        this.cordX = cordX;
    }

    public int getCordY() {
        return cordY;
    }

    public void setCordY(int cordY) {
        this.cordY = cordY;
    }

    /**
     *
     */
    public void doRotation() {
        this.firstFace.turnSide();
        this.secondFace.turnSide();
    }

    /**
     * Get id of the tile
     *
     * @return Id of the tile
     */
    public int getId() {
        return id;
    }

    /**
     * Set the id of the tile
     *
     * @param id Id of the tile
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get the first face of the face
     *
     * @return First face of the tile
     */
    public FaceTile getFirsFace() {
        return firstFace;
    }

    /**
     * Set the first face of the tile
     *
     * @param firsFace First face of the tile
     */
    public void setFirsFace(FaceTile firsFace) {
        this.firstFace = firsFace;
    }

    /**
     * Get the second face of the tile
     *
     * @return Second face of the tile
     */
    public FaceTile getSecondFace() {
        return secondFace;
    }

    /**
     * Set the second face of the tile
     *
     * @param secondFace Second face of the tile
     */
    public void setSecondFace(FaceTile secondFace) {
        this.secondFace = secondFace;
    }

    /**
     * Get Orientation of the tile (Horizontal, Vertical)
     *
     * @return Orientation of the tile (Horizontal, Vertical)
     */
    public Orientation getOrientation() {
        return orientation;
    }

    /**
     * Set orientation of the tile, Horizontal or Vertical
     *
     * @param orientation Orientation, Horizontal or Vertical
     */
    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    /**
     * Verified whether the tile is a mule.
     *
     * @return If it's a mule, then true; otherwise, false.
     */
    public boolean isMule() {

        int firstFaceValue = this.firstFace.getValue();
        int secondFaceValue = this.secondFace.getValue();

        return firstFaceValue == secondFaceValue;
    }

    /**
     * Resize tile to the specified dimensions.
     *
     * @param width The new width for the tile.
     * @param height The new height for the tile.
     */
    public void resizeTile(int width, int height) {

        int newHeight = height / 2;

//        this.firstFace.refreshImage(width, newHeight);
//        this.secondFace.refreshImage(width, newHeight);
    }

    /**
     * Retrieves the width of a composite image formed by combining the widths
     * of the two faces of a tile. The width is calculated as the average of the
     * widths of the first and second faces.
     *
     * @return The width of the composite image.
     */
    public int getWidth() {

    return this.width;

    }

    /**
     * Retrieves the height of a composite image formed by combining the heights
     * of the two faces of a tile. The height is calculated as the sum of the
     * heights of the first and second faces.
     *
     * @return The height of the composite image.
     */
    public int getHeight() {

    return this.height;
    }

    

    @Override
    public String toString() {
        return "TileModel{" + "id=" + id + ", firsFace=" + firstFace + ", secondFace=" + secondFace + ", orientation=" + orientation + '}';
    }
}
