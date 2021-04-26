
package drawshapes;
import java.awt.*;
import java.applet.*;


public class DrawShapes extends Applet{
Font font;
Color redColor;
Color blueColor;
Color backgroundColor;


public void init(){
    //the font is arial size, 18 and is italicized
    font = new Font("Arial",Font.ITALIC,18);
    
    //some colors are predefined in the color class
    redColor = Color.red;
    backgroundColor = Color.orange;
    
    //colors can be created using red, green, blue values
    blueColor =new Color(0,0,122);
    
    //set the background color of the applet
    setBackground(backgroundColor);
}

public void stop(){
}
/*this method paints the shapes to the screen
*/

public void paint(Graphics graph){
    //set font
    graph.setFont(font);
    
    //create a little
    graph.drawString("Draw Shapes",90,20);
    
    //set the color for the first shape
    graph.setColor(blueColor);
    
    //draw a rectangel using drawRect(int x, int y, int width,int height)
    graph.drawRect(120,120,120,120);
    
    //this will fill a rectangel
    graph.fillRect(115,115,90,90);
    
    //set the color the next shape
    graph.setColor(redColor);
    
    //draw a circle using drawArc (int x, int y, int wdth, int height, int startAngel, int arcAngel)
    graph.fillArc(110,110,50,50,0,360);
    
    //set color for next shape
    graph.setColor(Color.CYAN);
    
    //draw another rectangel
    graph.drawRect(50, 50, 50, 50);
    
    //this will fill a rectangel
    graph.fillRect(50, 50, 60, 60);
    
    }
    
}
