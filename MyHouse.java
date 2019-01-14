
/**
 * This creates the image of a house.
 *
 * @Jeewoo Lee 
 * @version January 11, 2019
 */
public class MyHouse
{
    // instance variables - replace the example below with your own
    private Square base;
    private Triangle roof;
    private Circle window;
    private Square door1;
    private Square door2;
    private Circle handle;

    /**
     * Constructor for objects of class myHouse
     */
    public MyHouse()
    {
        // initialise instance variables
        base = new Square();
        roof = new Triangle();
        window = new Circle();
        door1 = new Square();
        door2 = new Square();
        handle = new Circle();
    }

    /**
     * Draws the house
     *
     */
    public void drawHouse()
    {
        // Arrange each object
        base.makeVisible();
        base.changeSize(200);
        base.changeColor("Black");
        base.moveLeft();
        base.moveVertical(45);
        base.moveHorizontal(10);
        
        door1.makeVisible();
        door1.changeSize(50);
        door1.moveHorizontal(55);
        door1.moveVertical(200);
        door1.moveUp();
        
        door2.makeVisible();
        door2.changeSize(50);
        door2.moveHorizontal(55);
        door2.moveVertical(150);
        
        roof.makeVisible();
        roof.moveHorizontal(100);
        
        window.makeVisible();
        window.changeSize(50);
        window.moveHorizontal(100);
        window.moveVertical(60);
        
        handle.makeVisible();
        handle.moveHorizontal(90);
        handle.moveVertical(170);
        handle.changeColor("yellow");
        
        
    
    
        
        
        
       
        
        
        
        
        
        
        
    }
}
