package randomCircles.main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;


public class RandomCircles extends JPanel implements ActionListener{

	public void drawFrame(Graphics g, int width, int height){
		int centerX; // center x coord of the disk
		int centerY; // center y coord of the disk
		int colorChoice; //used to select random color
		int count; //loop control variable for counting disks
		
		for(count = 0; count < 15; count++){
			colorChoice = (int) (3 * Math.random());
			switch(colorChoice){
			case 0:
				g.setColor(Color.RED);
				break;
			case 1:
				g.setColor(Color.GREEN);
				break;
			case 2:
				g.setColor(Color.BLUE);
				break;
			}
			
			centerX = (int) (width * Math.random());
			centerY = (int) (height * Math.random());
			
			g.fillOval(centerX - 50, centerY - 50, 100, 100);
			g.setColor(Color.BLACK);
			g.drawOval(centerX - 50, centerY - 50, 100, 100);
		}
		
		
	}
	
	//--------main implementation---------
	
	public static void main(String args[]){
		Graphics g = null;
		JFrame window = new JFrame("random disks");
		
		RandomCircles drawingArea = new RandomCircles();
		
		
		drawingArea.setBackground(Color.WHITE);
		window.setContentPane(drawingArea);
		
		/* NOTE:  In the next line, the numbers 500 and 500 give the
         * initial width and height of the drawing array.  You can change
         * these numbers to get a different size.
         */
		drawingArea.setPreferredSize(new Dimension(500, 500));
		
		window.pack();
		window.setLocation(100, 50);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*
         * Note:  In the following line, you can change false to
         * true.  This will prevent the user from resizing the window,
         * so you can be sure that the size of the drawing area will
         * not change.  It can be easier to draw the frames if you know
         * the size.
         */
        window.setResizable(false);
        
        /* NOTE:  In the next line, the number 3000 gives the time between
         * calls to drawFrame().  The time is given in milliseconds, where
         * one second equals 1000 milliseconds.  You can change the number
         * to control the animation speed.
         */
        Timer frameTimer = new Timer(1, drawingArea);
        window.setVisible(true);
        frameTimer.start();       
	}
	
	private int frameNum;

	MovinSquare square = new MovinSquare(Color.BLUE, 100, 500/2);
	
	@Override
	public void actionPerformed(ActionEvent e) {
		frameNum++;
		System.out.println(frameNum);
		repaint();
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		//drawFrame(g, getWidth(), getHeight());
		square.moveSquare(g, 2, 1);
	}
	
}