package randomCircles.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MovinSquare extends JFrame implements ActionListener {
	
	private int x;
	private int y;
	private int velX;
	private int velY;
	private int width;
	private int height;
	private Color color;
	
	
	public MovinSquare(Color color, int x, int y){
		this.width = 50;
		this.height = 50;
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	
	public void moveSquare(Graphics g, int velx, int vely){
		this.velX = velx;
		this.velY = vely;
		setX(this.x + velx);
		setY(this.y + vely);
		g.setColor(color);
		g.fillRect(this.x, this.y, width, height);
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public void setY(int y){
		this.y = y;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
