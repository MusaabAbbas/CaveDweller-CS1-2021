package cavedweller;

/**
 *
 * @author Musaab Abbas
 */
public class Cave {
    int size;
    Caveman caveman;
    Food food1;
    Food food2;
    
    public Cave () {
        this.size = (int) (Math.random()*9) + 8;
        //instantiate
        this.caveman = new Caveman("Unga",(int) (Math.random()*size), (int) (Math.random()*size));
        this.food1 = new Food("Food",(int) (Math.random()*size), (int) (Math.random()*size));
    }
    public String toString () {
        return "size: "+size;
    }
    
    public void handleInput(String input) {
        if (input.trim().equalsIgnoreCase("up")) {
            caveman.moveUp();
        }
        else if (input.trim().equalsIgnoreCase("down")) {
            caveman.moveDown();
            
        }
        else if (input.trim().equalsIgnoreCase("left")) {
            caveman.moveLeft();
        }
        else if (input.trim().equalsIgnoreCase("right")) {
            caveman.moveRight();
        }
        else if (input.trim().equalsIgnoreCase("close")) {
            System.exit(0);
        }
        System.out.println("(invalid command)");
    }
    System.out.println(caveman.toString());
}
