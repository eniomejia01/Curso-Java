import javax.swing.*;
public class AccesoAplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave = "Enio";
		
		String pass = "";
		
		// equals es un metodo que compara dos cadenas de texto
		while (clave.equals(pass) == false) {
			
			pass = JOptionPane.showInputDialog("Introduce la contraseña, por favor");
			
			if(clave.equals(pass) == false) {
				
				System.out.println("Contaseña incorrecta");
			}
			
		}
		System.out.println("Contraseña correcta. Acceso permitido");
	}

}
