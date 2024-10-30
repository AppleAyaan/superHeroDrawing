package Unit1;

import java.awt.*;

public class Building {
	private int x, y;
	private Graphics g;

	public Building(int x, int y, int num, Graphics g) {
		this.x = x;
		this.y = y;
		this.g = g;
		this.building(num);
	}

	public void building(int num) {
		g.setColor(new Color(0, 0, 139));
		g.fillRect(this.x, this.y, 100, 500);
		g.setColor(Color.BLACK);
		int windowY = 0;
		for (int i = 0; i < num; i++) {
			g.fillRect(this.x+10, this.y+10+windowY, 30, 60);
			g.fillRect(this.x+50, this.y+10+windowY, 30, 60);
			windowY += 70;
		}
	}

	public void windowOn1() {
		g.setColor(Color.ORANGE);
		g.fillRect(this.x+10, this.y+10, 30, 60);
	}	

	public void windowOn2() {
		g.setColor(Color.PINK);
		g.fillRect(this.x+50, this.y+10, 30, 60);
	}	

	public void windowOn3() {
		g.setColor(Color.green);
		g.fillRect(this.x+10, this.y+80, 30, 60);
	}

	public void windowOn4() {
		g.setColor(Color.WHITE);
		g.fillRect(this.x+50, this.y+80, 30, 60);
	}
	
	public void windowOn7() {
		g.setColor(new Color(173, 216, 230));
		g.fillRect(this.x+50, this.y+220, 30, 60);
	}
}