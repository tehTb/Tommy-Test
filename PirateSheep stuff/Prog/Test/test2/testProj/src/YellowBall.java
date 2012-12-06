import java.awt.*;
import javax.swing.*;

public class YellowBall extends Ball{

	public YellowBall(double speed, int startYPos){
		super(speed, startYPos);
		
		icon = new ImageIcon("Bilder/yellowBall.gif");
		score = 2;
		id = 2;
	}
	
	public YellowBall(double speed, int x, int startYPos){
		super(speed, x, startYPos);
		
		icon = new ImageIcon("Bilder/yellowBall.gif");
		score = 2;
		id = 2;
	}
	
	public double getBallX(){
		return x;
	}
	
	public int getBallY(){
		return startYPos;
	}
	
	public ImageIcon getBallImage(){
		return icon;
	}
	
	public double getSpeed(){
		return speed;
	}
	
	public void setSpeed(double newSpeed){
		speed = newSpeed;
	}
	
	public int getBallId(){
		return id;
	}
	
	public void move(){
		x = x - speed;
	}
	
	public int getScore(){
		return score;
	}
}