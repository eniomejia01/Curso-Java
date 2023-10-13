package graficos;

import java.awt.Frame;

import javax.swing.*;

public class CreandoMarcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		miMarco marco1 = new miMarco();
		
		marco1.setVisible(true);
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}

}


class miMarco extends JFrame{
	
	public miMarco() { //Constructor
		
//		setSize(1000,500);
		
//		setLocation(200,100);
		
		setBounds(200, 100, 1000, 500); //Forma corta de hacer el -setSize- y el -setLocation-
		
//		setResizable(false); //impedir que se pueda redimensionar
		
//		setExtendedState(Frame.MAXIMIZED_BOTH); //Maximizar en toda la pantalla del sistema operativo
		
		setTitle("Mi ventana");
		
	}
	
	
}
