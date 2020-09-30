package cavedweller;

/**
 *
 * @author Musaab
 */
public class Food {
    //Fields
    private String name;
    private int x, y, nourishment;
    private boolean eaten;
    
    //Constructor
    public Food(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.eaten = false;
    }
    //Methods
    public String toString () {
        return "x: "+x+", y: "+y;
    }
    
    public void moveUp() {
        y-= 1;
    }
    
    //Accessors
    public String getName() {
        return name;
    }
    
    public boolean isEaten() {
        return eaten;
    }
    
    
}
