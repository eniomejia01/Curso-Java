package graficos;

import java.awt.*;
import java.awt.Toolkit;
import javax.swing.*;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCentrado mimarco = new MarcoCentrado();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);
		

	}

}

class MarcoCentrado extends JFrame{
	
	public MarcoCentrado(){
		
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
	
		Dimension tamanioPantalla = mipantalla.getScreenSize();
		
		int alturaPantalla = tamanioPantalla.height;
		
		int anchoPantalla = tamanioPantalla.width;
		
		
		setSize(anchoPantalla/2, alturaPantalla/2);
		
		setLocation(anchoPantalla/4, alturaPantalla/4);
		
		setTitle("Marco Centrado");
		
		Image miIcono = mipantalla.getImage("src/graficos/DAMA.jpg");
		
		setIconImage(miIcono);
		
	}
	
	
	
	
	
	
}