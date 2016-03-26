package Juego1_0.View;
//importar controller
import Juego1_0.Controller.*;
import java.awt.*;
import javax.swing.*;

public class MainPage extends JFrame{
	private Container mainpanel,p_play,p_create,p_load;
	private JButton b_play,b_create,b_load,b_exit;
	public MainController controller=new MainController(this);


	public MainPage(){
		this.setTitle("Juego1_0");
		this.setSize(400,450);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.mainpanel=getContentPane();
		this.mainpanel.setLayout(null);
		
		

		b_play=new JButton();
		try{
			Image img=ImageIO.read(getClass().getResources("button(3).png"));
			b_play.setIcon(new ImageIcon(img));
		}	catch(IOException ex){}
		
		b_create=new JButton();/*
		try{
			Image img=ImageIO.read(getClass().getResources("button(1).png"));
			b_play.setIcon(new ImageIcon(img));
		}	catch(IOException ex){}*/
		
		b_load=new JButton();/*
		try{
			Image img=ImageIO.read(getClass().getResources("button(4).png"));
			b_play.setIcon(new ImageIcon(img));
		}	catch(IOException ex){}*/

		b_exit=new JButton();/*
		try{
			Image img=ImageIO.read(getClass().getResources("button(8).png"));
			b_play.setIcon(new ImageIcon(img));
		}	catch(IOException ex){}*/

		this.b_play.setBounds(160,50,190,61);
		this.b_create.setBounds(160,120,246,61);
		this.b_load.setBounds(160,240,262,61);
		this.b_exit.setBounds(160,320,180,61);
		this.mainpanel.add(b_play);
		this.mainpanel.add(b_create);
		this.mainpanel.add(b_load);
		this.mainpanel.add(b_exit);

		
	}
}
//En la otra clase declaron a MainPage como un objeto, 
//para escuchar implementando ActionListener