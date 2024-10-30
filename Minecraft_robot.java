package Unit1;

import java.awt.*;
import javax.swing.JFrame;

public class Minecraft_robot {
	
	private int x; // x-coordinate of the robot
    private int y; // y-coordinate of the robot

    /**
     * Constructor to initialize the position of the robot.
     * 
     * @param x the x-coordinate of the robot
     * @param y the y-coordinate of the robot
     */
    public Minecraft_robot(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
	public void draw(Graphics g) {
        drawMinecraft_robot(g, this.x, this.y);
    }
	
	private void drawMinecraft_robot(Graphics g, int x, int y) {
		g.setColor(new Color(153, 102, 51)); // Skin color (light brown)
        g.fillRect(x + 7, y, 20, 20); // Steve's head (square)

        // Draw Steve's Eyes (1/3 size)
        g.setColor(Color.WHITE);
        g.fillRect(x + 12, y + 5, 3, 3); // Left eye white
        g.fillRect(x + 18, y + 5, 3, 3); // Right eye white
        g.setColor(Color.BLUE);
        g.fillRect(x + 13, y + 6, 2, 2); // Left eye pupil
        g.fillRect(x + 19, y + 6, 2, 2); // Right eye pupil

        // Draw Steve's Mouth (1/3 size)
        g.setColor(new Color(102, 51, 0)); // Dark brown for mouth
        g.fillRect(x + 14, y + 13, 7, 2); // Steve's mouth

        // Draw Steve's Body (1/3 size, Blue Shirt)
        g.setColor(new Color(0, 102, 204)); // Blue color for the shirt
        g.fillRect(x + 5, y + 20, 23, 30); // Steve's body (rectangle)

        // Draw Steve's Arms (1/3 size)
        g.setColor(new Color(153, 102, 51)); // Same skin color for the arms
        g.fillRect(x - 5, y + 20, 10, 27); // Left arm
        g.fillRect(x + 28, y + 20, 10, 27); // Right arm

        // Draw Steve's Legs (1/3 size)
        g.setColor(new Color(0, 51, 102)); // Dark blue jeans color
        g.fillRect(x + 7, y + 50, 10, 27); // Left leg
        g.fillRect(x + 20, y + 50, 10, 27); // Right leg
		
	}
}
