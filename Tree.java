/**
 * Creates an instance of a Tree.
 *
 * @author H. Lee
 * @version January 17, 2019
 */
public class Tree
{
    // instance variables - replace the example below with your own
    private Square lowerBase;
    private Square upperBase;
    private Triangle leaf1;
    private Triangle leaf2;
    private Triangle leaf3;

    /**
     * Constructor for objects of class Tree
     * 
     * @param x     the horizontal position of the tree
     * @param y     the vertical position of the tree
     */
    public Tree(int x, int y)
    {
        // initialise instance variables
        lowerBase = new Square();
        upperBase = new Square();
        leaf1 = new Triangle();
        leaf2 = new Triangle();
        leaf3 = new Triangle();
        
        // actually draw the tree
        drawTree(x, y);
    }

    /**
     * Draws the tree
     *
     * @param x     the horizontal position of the tree
     * @param y     the vertical position of the tree
     */
    public void drawTree(int x, int y)
    {
        // put your code here
        lowerBase.makeVisible();
        lowerBase.changeColor("black");
        lowerBase.changeSize(40);
        lowerBase.moveVertical(y);
        lowerBase.moveHorizontal(x);
        
        upperBase.makeVisible();
        upperBase.changeColor("black");
        upperBase.changeSize(40);
        upperBase.moveVertical(y-40);
        upperBase.moveHorizontal(x);
        
        leaf1.makeVisible();
        leaf1.changeColor("green");
        leaf1.changeSize(50,120);
        leaf1.moveHorizontal(x + 30);
        leaf1.moveVertical(y-40);
        
        leaf2.makeVisible();
        leaf2.changeColor("green");
        leaf2.changeSize(50,100);
        leaf2.moveHorizontal(x + 30);
        leaf2.moveVertical(y-60);
        
        leaf3.makeVisible();
        leaf3.changeColor("green");
        leaf3.changeSize(50,80);
        leaf3.moveHorizontal(x + 30);
        leaf3.moveVertical(y-80);
        // translate the tree to the specified location
        
        
    }
    
}