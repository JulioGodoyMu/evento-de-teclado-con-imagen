package videojuego;

import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame implements KeyListener{
	private Rectangle e=GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
	private PanelAnimacion panel;
     
	VentanaPrincipal(){
    	setBounds(0,0,(int)e.getWidth(),(int)e.getHeight());
    	setLayout(null);
    	panel=new PanelAnimacion();
    	add(panel);
    	addKeyListener(this);
    	setVisible(true);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==37) {
			panel.setX(-3);
		  }else if(e.getKeyCode()==38) {
			       panel.setY(-3);
		        }else if(e.getKeyCode()==39) {
		        	      panel.setX(3);
		                }else if(e.getKeyCode()==40) {
		                	      panel.setY(3);
		                        }else if(e.getKeyCode()==32) {
		                        	Thread hilo=new Thread(panel);
		                        	hilo.start();
		                        	
		                        }
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}
	
}
