import javax.swing.*;
import java.awt.*;

public class PlayPong extends JFrame
{
	public PlayPong(boolean left, boolean right)
	{
		getContentPane().setLayout(new FlowLayout());
		add(new PongComponent(left,right));
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
        /*
        public PlayPong()
	{
		getContentPane().setLayout(new FlowLayout());
		add(new PongComponent());
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}*/
        

	public static void main(String[] args)
	{
            //new PlayPong();
            boolean estado = true;
            
            MenuF menu = new MenuF();
            menu.setVisible(estado);
            /*
            while(estado){
                
                System.out.println("Ingrese 1 para jugar contra la máquina");
                System.out.println("Ingrese 2 para el modo 2 jugadores");
                System.out.println("Ingrese 3 para modo doble paddle");
                System.out.println("Ingrese 0 para salir");
                int caso = teclado.nextInt();
            
                switch(caso){
                    case 1 :
                        System.out.println("Modo 1");   
                        new PlayPong();
                        break ;
                    case 2 :
                        System.out.println("Modo 2");
                        break ;
                    case 3 :
                        System.out.println("Modo 3");
                        break ;
                    case 0 :
                        estado = false;
                        ;
                }
            }*/
	}
}