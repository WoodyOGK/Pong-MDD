import java.awt.*;

public class Paddle
{
	public int WIDTH = 15;
	public int HEIGHT = 80;
	public static final int MAX_SPEED = 30;

	private int x, y;

	public Paddle(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	public void moveTo(int y)
	{
		if(Math.abs(this.y-y) > MAX_SPEED)
		{
			if(this.y > y)
				this.y -= MAX_SPEED;
			else
				this.y += MAX_SPEED;
		}
		else
			this.y = y;
	}

	public void move(int dy)
	{
		this.y+=dy;
		if(y < 0)
			y = 0+40;
		if(y > PongEnvironment.HEIGHT)
			y = PongEnvironment.HEIGHT-40;
	}

	public void moveUp()
	{
		move(-Paddle.MAX_SPEED);
	}

	public void moveDown()
	{
		move(Paddle.MAX_SPEED);
	}

	public boolean contains(Ball b)
	{
		Rectangle paddle = new Rectangle(x-WIDTH/2, y-HEIGHT/2, WIDTH, HEIGHT);
		Rectangle ball = new Rectangle((int)(b.getLocation().getX() - Ball.RADIUS),(int)(b.getLocation().getY() - Ball.RADIUS), Ball.RADIUS*2, Ball.RADIUS*2);

		return paddle.intersects(ball);
	}

	public void draw(Graphics g)
	{
		g.setColor(Color.BLACK);
		g.fillRect(x-WIDTH/2, y-HEIGHT, WIDTH, HEIGHT*2);
	}
}