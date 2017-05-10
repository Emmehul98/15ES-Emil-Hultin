import java.awt.*;

import javax.swing.JComponent;

public class Ball {
	
	private static final int D = 50; //diameter
	private int x = 0;
	private int y = 0;
	private int moveX = 4;
	private int moveY = 4;
	private int score = 0;
	Color ballColor = new Color(0xE73AC0);
	private Game game;
	
	public Ball(Game game){
		this.game = game;
		
	}

	private void moveBall(){
		if(x + moveX < 0)
			moveX = 4;
		if(x + moveX > game.getWidth() - D)
			moveX = -4;
		if(y + moveY < 0)
			moveY = 4;
		if(y + moveY > game.getHeight() - D)
			game.gameOver();
		if(collision()){
			moveY = - 4;
			y = game.racket.getY() - D;
			setScore(1);
		}
		
		x += moveX;
		y += moveY;	
	}
	
	public void move(){
		moveBall();
	}
	
	public void paint(Graphics2D g){
		g.setColor(ballColor);
		g.fillOval(x, y, D, D);
	}
	
	private Rectangle getBounds(){
		return new Rectangle(x, y, D, D);
	}
	
	private boolean collision(){
		return game.racket.getBounds().intersects(getBounds());
	}
	
	private void setScore(int score){
		this.score += score;
	}
	
	public int getScore(){
		return score;
	}
	
}