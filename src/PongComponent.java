import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PongComponent extends JComponent implements KeyListener, Runnable
{
	private PongEnvironment environment;
	private boolean pressingUp1 = false;
	private boolean pressingDown1 = false;
        private boolean pressingUp2 = false;
	private boolean pressingDown2 = false;
        boolean left, right;
        
	public PongComponent(boolean left, boolean right)
	{
		super();
		environment = new PongEnvironment();
		environment.setComputer(left, right);
                this.left = left;
                this.right = right;
 		setPreferredSize(new Dimension(environment.WIDTH, environment.HEIGHT));

 		addKeyListener(this);
 		Thread run = new Thread(this);
 		run.start();
	}
        
        /*public PongComponent()
	{
		super();
		environment = new PongEnvironment(new Paddle(10, HEIGHT), new Paddle(10, HEIGHT));
		environment.setComputer(false, true);
                this.right = true;
 		setPreferredSize(new Dimension(environment.WIDTH, environment.HEIGHT));

 		addKeyListener(this);
 		Thread run = new Thread(this);
 		run.start();
	}*/

	public void run()
	{
		while(true)
		{
			try
			{
				Thread.sleep(20);
			}
			catch(Exception ex)
			{
			}
			requestFocus();
			update();
			repaint();
		}
	}

	public void paint(Graphics g)
	{
		synchronized(g)
		{
			environment.draw(g);
		}
	}

	public void update()
	{
		environment.update();
		if(pressingUp1)
			environment.getLeft().moveUp();
		else if(pressingDown1)
			environment.getLeft().moveDown();
                if(pressingUp2)
                        environment.getRight().moveUp();
                else if(pressingDown2)
			environment.getRight().moveDown();
	}

	public void keyPressed(KeyEvent ke)
	{
            if(left == false){
		if(ke.getKeyCode() == KeyEvent.VK_W)
			pressingUp1 = true;
		else if(ke.getKeyCode() == KeyEvent.VK_S)
			pressingDown1 = true;
            }
            if(right == false){
                if(ke.getKeyCode() == KeyEvent.VK_UP)
			pressingUp2 = true;
		else if(ke.getKeyCode() == KeyEvent.VK_DOWN)
			pressingDown2 = true;
            }
         }

	public void keyReleased(KeyEvent ke)
	{
            if(left == false){
		if(ke.getKeyCode() == KeyEvent.VK_W)
			pressingUp1 = false;
		else if(ke.getKeyCode() == KeyEvent.VK_S)
			pressingDown1 = false;
            }
            if(right == false){
                if(ke.getKeyCode() == KeyEvent.VK_UP)
			pressingUp2 = false;
		else if(ke.getKeyCode() == KeyEvent.VK_DOWN)
			pressingDown2 = false;
            }
        }

	public void keyTyped(KeyEvent ke)
	{
	}
}