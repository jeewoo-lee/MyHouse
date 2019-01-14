
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
    private Square ground;
    private Square chimney1;
    

    /**
     * Constructor for objects of class myHouse
     */
    public MyHouse()
    {
        // initialise instance variables
        ground = new Square();
        base = new Square();
        roof = new Triangle();
        window = new Circle();
        door1 = new Square();
        door2 = new Square();
        handle = new Circle();
        chimney1 = new Square();
        
    }

    /**
     * Draws the house
     *
     */
    public void drawHouse()
    {
        // Arrange each object
        ground.makeVisible();
        ground.changeColor("green");
        ground.changeSize(1000);
        ground.moveHorizontal(-100);
        ground.moveVertical(220);
        
        base.makeVisible();
        base.changeSize(200);
        base.changeColor("Black");
        base.moveLeft();
        base.moveVertical(45);
        base.moveHorizontal(10);
        
        door1.makeVisible();
        door1.changeSize(50);
        door1.moveHorizontal(60);
        door1.moveVertical(210);
        door1.moveUp();
        
        door2.makeVisible();
        door2.changeSize(50);
        door2.moveHorizontal(60);
        door2.moveVertical(150);
        
        roof.makeVisible();
        roof.changeColor("red");
        roof.changeSize(50,250);
        roof.moveHorizontal(100);
        roof.moveVertical(30);
        
        chimney1.makeVisible();
        chimney1.changeColor("red");
        chimney1.moveHorizontal(20);
        
        window.makeVisible();
        window.changeSize(50);
        window.moveHorizontal(100);
        window.moveVertical(60);
        
        handle.makeVisible();
        handle.changeSize(15);
        handle.moveHorizontal(100);
        handle.moveVertical(180);
        handle.changeColor("yellow");
        
        
    
    
        
        
        
       
        
        
        
        
        
        
        
    }
}
