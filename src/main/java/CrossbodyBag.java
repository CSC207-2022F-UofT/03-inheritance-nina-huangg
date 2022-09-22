/*
 * This file is currently empty, but with a variety of TODOs to implement.
 * You may want to refer to HandBag.java to see how to structure your code.
 *
 * You may find the readings in chapter 3. Relationships between Classes
 * helpful while working through this exercise.
 */
public class CrossbodyBag extends Bag{

    private final int straps;

    /**
    * Creates a new CrossbodyBag with the given color and
    * capacity.
    *
    * @param color - color of the Handbag
    * @param capacity - the Handbag's capacity
    * @param straps - the number of Straps a CrossbodyBag has
    */

    public CrossbodyBag(String color, int capacity, int straps) {
        super(color, capacity);
        this.straps = straps;
    }

    /**
     * Return the number of straps.
     *
     * @return an int containing the number of straps.
     */
    public int getNumberOfStraps() {
        return this.straps;
    }

    /**
     * Increase the capacity by 2.
     */
    public void enhance(){
        super.increaseCapacity(2);

    }

    /**
     * Return the details of the bag.
     *
     * @return a String containing the details of the bag.
     */
    @Override
    public String toString() {
        return this.getColor()+ " Crossbody Bag with " + this.getNumberOfStraps() + " straps (" + + this.getNumberOfContents() + " / " +
                this.getCapacity() + ")";
    }
}



