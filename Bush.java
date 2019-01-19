
/**
 * Write a description of class Bush here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bush
{
    // instance variables - replace the example below with your own
    private Circle leaf1;
    private Circle leaf2;
    private Circle leaf3;
    private Circle leaf4;
    private Circle leaf5;
    private Circle leaf6;

    private Square tree1;
    private Square tree2;
    private Square tree3;
    
    /**
     * Constructor for objects of class Bush
     */
    public Bush(int x, int y)
    {
        // initialise instance variables
        leaf1 = new Circle();
        leaf2 = new Circle();
        leaf3 = new Circle();
        leaf4 = new Circle();
        leaf5 = new Circle();
        leaf6 = new Circle();
        tree1 = new Square();
        tree2 = new Square();
        tree3 = new Square();
        // Draw the actual bush
        drawBush(x, y);
        
    }

    /**
     * Draw the bush
     */
    public void drawBush(int x, int y)
    {
        // put your code here
        tree1.makeVisible();
        tree1.changeColor("brown");
        tree1.changeSize(40);
        tree1.moveHorizontal(x);
        tree1.moveVertical(y);
        
        tree2.makeVisible();
        tree2.changeColor("brown");
        tree2.changeSize(40);
        tree2.moveHorizontal(x);
        tree2.moveVertical(y-40);
        
        tree3.makeVisible();
        tree3.changeColor("brown");
        tree3.changeSize(40);
        tree3.moveHorizontal(x);
        tree3.moveVertical(y-70);
        
        leaf1.makeVisible();
        leaf1.changeColor("green");
        leaf1.changeSize(50);
        leaf1.moveHorizontal(x + 10);
        leaf1.moveVertical(y-80);
        
        
      
        leaf2.makeVisible();
        leaf2.changeColor("green");
        leaf2.changeSize(50);
        leaf2.moveHorizontal(x + 30);
        leaf2.moveVertical(y-80);
        
        leaf3.makeVisible();
        leaf3.changeColor("green");
        leaf3.changeSize(50);
        leaf3.moveHorizontal(x + 60);
        leaf3.moveVertical(y-80);
        
        leaf4.makeVisible();
        leaf4.changeColor("green");
        leaf4.changeSize(50);
        leaf4.moveHorizontal(x + 20);
        leaf4.moveVertical(y-100);
        
        leaf5.makeVisible();
        leaf5.changeColor("green");
        leaf5.changeSize(50);
        leaf5.moveHorizontal(x + 50);
        leaf5.moveVertical(y-100);
        
        leaf6.makeVisible();
        leaf6.changeColor("green");
        leaf6.changeSize(50);
        leaf6.moveHorizontal(x + 35);
        leaf6.moveVertical(y-120);
        
    }
}
