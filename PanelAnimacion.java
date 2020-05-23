package videojuego;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class PanelAnimacion extends JPanel implements Runnable{
	private Image mario;
	private int x=100,y=200;
	private Rectangle e=GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
	public PanelAnimacion() {
	try {
		setSize((int)e.getWidth(),(int)e.getHeight());
		mario=ImageIO.read(new File("mario bros.png"));
		
	   } catch (IOException e) {
		
		e.printStackTrace();
	   }
	
	}
	public void paint(Graphics g) {
		//super.paint(g);
		g.setColor(Color.white);
		g.fillRect(0,0,(int)e.getWidth(),(int)e.getHeight());
		g.drawImage(mario,x,y,100,100,null);
	    repaint();
	}
	public void setX(int dx) {
		x=x+dx;	
		repaint();
	}
	public void setY(int dy) {
		y=y+dy;
		repaint();
	}
	
	
	public void run () {
		      setY(-100);
		      repaint();
		      try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		      setY(100);
		      repaint();
	}
}
