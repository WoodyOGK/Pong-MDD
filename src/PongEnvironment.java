import java.awt.*;
import java.util.ArrayList;

public class PongEnvironment
{
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;

	private Ball ball;
	private Paddle left, right;//, left2, right2;
	private int leftScore = 0, rightScore = 0;
	private boolean leftComputer, rightComputer;

	public PongEnvironment()
	{
		ball = new Ball(Color.BLACK, WIDTH/2, HEIGHT/2);
		left = new Paddle(10, HEIGHT/2);
		right = new Paddle(WIDTH-10, HEIGHT/2);
	}
        
        /*public PongEnvironment(Paddle left2, Paddle right2){
                ball = new Ball(Color.RED, WIDTH/2, HEIGHT/2);
		left = new Paddle(10, HEIGHT/4);
		left.HEIGHT = 30;
                right = new Paddle(WIDTH-10, HEIGHT/4);
                right.HEIGHT = 30;
                this.left2 = left2;
                left2.HEIGHT = 30;
                this.right2 = right2;
                right2.HEIGHT = 30;
        }*/

	public void setComputer(boolean l, boolean r)
	{
		leftComputer = l;
		rightComputer = r;
	}

	public Paddle getLeft()
	{
		return left;
	}

	public Paddle getRight()
	{
		return right;
	}
        
        public void score(Color color){
            ball = new Ball(color, WIDTH/2, HEIGHT/2);
            left = new Paddle(10, HEIGHT/2);
            right = new Paddle(WIDTH-10, HEIGHT/2);
        }

	private void leftScore()
	{
		leftScore++;

		try
		{
			Thread.sleep(1000);
		}
		catch(Exception ex)
		{
		}
                this.score(Color.RED);
	}

	private void rightScore()
	{
		rightScore++;

		try
		{
			Thread.sleep(1000);
		}
		catch(Exception ex)
		{
		}
                this.score(Color.BLUE);
        }

	public void update()
	{
		ball.move();
                    if(ball.getLocation().getY() - Ball.RADIUS <= 0)
			ball.bounceTop();
		else if(ball.getLocation().getY() + Ball.RADIUS >= HEIGHT)
			ball.bounceTop();
		else if(left.contains(ball))
			ball.bounceSide();
		else if(right.contains(ball))
			ball.bounceSide();
		else if(ball.getLocation().getX() < 0)
			rightScore();
		else if(ball.getLocation().getX() > WIDTH)
			leftScore();
//Aquí se define el funcionamiento de la máquina en el juego.
		if(leftComputer)
			left.moveTo((int)ball.getLocation().getY());
		if(rightComputer)
			right.moveTo((int)ball.getLocation().getY());

	}

	public void draw(Graphics g)
	{
		ball.draw(g);
		left.draw(g);
		right.draw(g);
                /*left2.draw(g);
                right2.draw(g);*/

		g.drawString("Score: "+ leftScore, 25, 12);
		g.drawString("Score: "+ rightScore, WIDTH-125, 12);
	}
}