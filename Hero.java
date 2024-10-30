package Unit1;

import java.awt.Color;
import java.awt.Graphics;

public class Hero {
	private int x; // x-coordinate of the robot
    private int y; // y-coordinate of the robot

    /**
     * Constructor to initialize the position of the robot.
     * 
     * @param x the x-coordinate of the robot
     * @param y the y-coordinate of the robot
     */
    public Hero(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     * draw the hero
     * @param g draws the hero using graphics g
     */
    public void draw(Graphics g) {
        drawHero(g, 150,50);
    }
    
    /**
     * draw the robots maing body with arms
     * @param g graphics
     * @param x x-coordinate of robot
     * @param y y-coordinate of robot
     */
    private void drawHero(Graphics g, int x, int y) {
        g.setColor(Color.lightGray); // set color to gray
        g.fillOval(x-15, y-20, 175, 175); // robot head
        g.fillOval(x-75, y+100, 300, 450); // robot body
        g.fillOval(x-160, y+200, 150, 50); //robot left arm
        g.fillOval(x+160, y+200, 150, 50); //robot right arm
        
        g.setColor(Color.WHITE);
        g.fillOval(x + 25, y + 30, 40, 40);  // Left eye
        g.fillOval(x + 95, y + 30, 40, 40);  // Right eye
        
        g.setColor(Color.BLACK);
        g.fillOval(x + 40, y + 45, 15, 15);  // Left pupil
        g.fillOval(x + 110, y + 45, 15, 15); // Right pupil

        // Mouth
        g.setColor(Color.RED);
        g.fillArc(x + 45, y + 90, 60, 40, 0, -180);
        
        // Antenna base
        g.setColor(Color.DARK_GRAY);
        g.fillRect(x + 75, y - 40, 10, 30); // Antenna stick (rectangle)

        // Antenna tip
        g.setColor(Color.RED);
        g.fillOval(x + 72, y - 60, 15, 15); // Antenna tip (circle)
        
        // Antenna base
        g.setColor(Color.DARK_GRAY);
        g.fillRect(x + 45, y - 40, 10, 30); // Antenna stick (rectangle)
        // Antenna tip
        g.setColor(Color.RED);
        g.fillOval(x + 42, y - 60, 15, 15); // Antenna tip (circle)
        
        g.setColor(Color.WHITE);
        g.fillOval(x, y + 150, 165, 250); // stomach on the robot body
    }
}
