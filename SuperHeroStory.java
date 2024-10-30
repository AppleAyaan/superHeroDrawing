package Unit1;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

/**
 * Main file for drawing superhero and buildings story
 * Author: Ayaan, Zeki, Bakhtawar
 */
public class SuperHeroStory extends Canvas {

    public static void main(String[] args) {
        JFrame frame = new JFrame("MARS");
        Canvas canvas = new SuperHeroStory(); 
        canvas.setSize(800, 600); 
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ensures the program exits on close
    }
    
    public void paint(Graphics g) {
        this.setBackground(new Color(139, 90, 90)); // Set the background color of the canvas
        
        // Draw clouds
        drawCloud(g, 100, 50); // Draw the first cloud
        drawCloud(g, 300, 70); // Draw the second cloud
        drawCloud(g, 500, 40); // Draw the third cloud

        Hero mainHero = new Hero(150, 50); // Init main hero
        Minecraft_robot minecraftRobot = new Minecraft_robot(650, 375);
        
        mainHero.draw(g); // Draw main hero
        
        // Buildings
        Building zero = new Building(50, 300, 2, g);
        Building one = new Building(100, 350, 3, g);
        Building two = new Building(200, 250, 3, g);
        Building three = new Building(300, 300, 3, g);
        Building four = new Building(550, 500, 3, g);
        Building five = new Building(630, 450, 3, g);
        
        // Moon 
        g.setColor(Color.YELLOW);
        g.fillOval(600, 60, 120, 120);
        
        // Draw Minecraft robot    
        minecraftRobot.draw(g);	
    }

    // Method to draw a cloud at the given position
    private void drawCloud(Graphics g, int x, int y) {
        g.setColor(Color.WHITE);
        g.fillOval(x, y, 60, 40);
        g.fillOval(x + 10, y - 10, 70, 50);
        g.fillOval(x + 20, y, 60, 40);
    }
}
