
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
//import java.awt.geom.Line2D;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;

public class graphics extends Canvas {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new graphics();
        canvas.setSize(400, 400);
      	System.out.println("here");    	
      	
        frame.add(canvas);
        
        frame.pack();
        
        frame.setVisible(true);

        
      	System.out.println("done");
    }
    
    public void paint(Graphics g) {
    	Rectangle r = new Rectangle();
    	r.setBounds(50, 50, 50, 50);
    	mickey(g,r);
    }
    public void mickey(Graphics g, Rectangle bb) {
      boxOval(g, bb);
      System.out.print("NOWW");

      int dx = bb.width / 2;
      int dy = bb.height / 2;
      Rectangle half = new Rectangle(bb.x, bb.y, dx, dy);

      half.translate(-dx / 2, -dy / 2);
      boxOval(g, half);

      half.translate(dx * 2, 0);
      boxOval(g, half);
  }

   /* public void paint(Graphics g) {
    	System.out.print("Pre print");

    		g.setColor(Color.red);
        g.fillOval(100, 100, 200, 200);
        System.out.print("\nNow done");
    }*/
    public void boxOval(Graphics g, Rectangle bb) {
    g.fillOval(bb.x, bb.y, bb.width, bb.height);
    }
    
  



}