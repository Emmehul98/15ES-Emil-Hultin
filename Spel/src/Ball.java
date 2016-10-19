import java.awt.*;

public class Ball {
	
	private int d = 50; //diameter
	private int x = 0;
	private int y = 0;
	private int moveX = 2;
	private int moveY = 2;
	Color ballColor = new Color(0xE73AC0);
	private Game game;
	
	public Ball(Game game){
		this.game = game;
		
	}

	private void moveBall(){
		if(x + moveX < 0)
			moveX = 2;
		if(x + moveX > game.getWidth() - d)
			moveX = -2;
		if(y + moveY < 0)
			moveY = 2;
		if(y + moveY > game.getHeight() - d)
			moveY = -2;		
		
		x += moveX;
		y += moveY;	
	}
	
	public void move(){
		moveBall();
	}
	
	public void paint(Graphics2D g){
		g.setColor(ballColor);
		g.fillOval(x, y, d, d);
	}
	
}
