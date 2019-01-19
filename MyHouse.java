
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
    private Square sky;
    private Circle sun;
    private Circle moon;
    private Bush shrub;
    private Tree pineTree;
    

    /**
     * Constructor for objects of class myHouse
     */
    public MyHouse(int x, int y)
    {
        // initialise instance variables
        sky = new Square();
        ground = new Square();
        base = new Square();
        roof = new Triangle();
        window = new Circle();
        door1 = new Square();
        door2 = new Square();
        handle = new Circle();
        chimney1 = new Square();
        sun = new Circle();
        moon = new Circle();
        
        // Draw the house
        drawHouse(x,y);
        
        // Create the bush
        shrub = new Bush(450,400);
        
        // Create the pine tree
        pineTree = new Tree(270,400);
        pineTree = new Tree(360,430);
    }

    /**
     * Draws the house
     *
     */
    public void drawHouse(int x, int y)
    {
        // Arrange each object
        sky.makeVisible();
        sky.changeColor("blue");
        sky.changeSize(1000);
        sky.moveHorizontal(-300);
        sky.moveVertical(-100);
        
        ground.makeVisible();
        ground.changeColor("green");
        ground.changeSize(1000);
        ground.moveHorizontal(-100);
        ground.moveVertical(420);
        
        base.makeVisible();
        base.changeSize(200);
        base.changeColor("Black");
        base.moveLeft();
        base.moveVertical(y);
        base.moveHorizontal(x);
        
        door1.makeVisible();
        door1.changeSize(50);
        door1.moveHorizontal(x+50);
        door1.moveVertical(y+165);
        door1.moveUp();
        
        door2.makeVisible();
        door2.changeSize(50);
        door2.moveHorizontal(x+50);
        door2.moveVertical(y+105);
        
        roof.makeVisible();
        roof.changeColor("red");
        roof.changeSize(50,250);
        roof.moveHorizontal(x+90);
        roof.moveVertical(y-15);
        
        chimney1.makeVisible();
        chimney1.changeColor("red");
        chimney1.moveHorizontal(x+10);
        chimney1.moveVertical(y-45);
        
        window.makeVisible();
        window.changeColor("yellow");
        window.changeSize(50);
        window.moveHorizontal(x+90);
        window.moveVertical(y+15);
        
        handle.makeVisible();
        handle.changeSize(15);
        handle.moveHorizontal(x+90);
        handle.moveVertical(y+135);
        handle.changeColor("yellow");
        
        sun.makeVisible();
        sun.changeSize(80);
        sun.moveHorizontal(420);
        sun.moveVertical(-20);
        sun.changeColor("red");
        
        moon.makeVisible();
        moon.changeSize(80);
        moon.moveHorizontal(40);
        moon.moveVertical(-20);
        moon.changeColor("white");
        
    
    
        
        
        
       
        
        
        
        
        
        
        
    }
}
