
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
    public Bush()
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
        drawBush();
    }

    /**
     * Draw the bush
     */
    public void drawBush()
    {
        // put your code here
        tree1.makeVisible();
        tree1.changeColor("brown");
        tree1.changeSize(40);
        tree1.moveHorizontal(300);
        tree1.moveVertical(400);
        
        tree2.makeVisible();
        tree2.changeColor("brown");
        tree2.changeSize(40);
        tree2.moveHorizontal(300);
        tree2.moveVertical(360);
        
        tree3.makeVisible();
        tree3.changeColor("brown");
        tree3.changeSize(40);
        tree3.moveHorizontal(300);
        tree3.moveVertical(330);
        
        leaf1.makeVisible();
        leaf1.changeColor("green");
        leaf1.changeSize(50);
        leaf1.moveHorizontal(310);
        leaf1.moveVertical(320);
        
        
      
        leaf2.makeVisible();
        leaf2.changeColor("green");
        leaf2.changeSize(50);
        leaf2.moveHorizontal(330);
        leaf2.moveVertical(320);
        
        leaf3.makeVisible();
        leaf3.changeColor("green");
        leaf3.changeSize(50);
        leaf3.moveHorizontal(360);
        leaf3.moveVertical(320);
        
        leaf4.makeVisible();
        leaf4.changeColor("green");
        leaf4.changeSize(50);
        leaf4.moveHorizontal(320);
        leaf4.moveVertical(300);
        
        leaf5.makeVisible();
        leaf5.changeColor("green");
        leaf5.changeSize(50);
        leaf5.moveHorizontal(350);
        leaf5.moveVertical(300);
        
        leaf6.makeVisible();
        leaf6.changeColor("green");
        leaf6.changeSize(50);
        leaf6.moveHorizontal(335);
        leaf6.moveVertical(280);
        
    }
}
