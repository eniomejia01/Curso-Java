import javax.swing.*;
public class Entrada_Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		
		String edad = JOptionPane.showInputDialog("Introduce tu edad, por favor");
		
		int edad_usuario = Integer.parseInt(edad);//método para pasar un dato string a uno entero
		
		edad_usuario++;//los "++" incrementan en uno a un valor o variable
		
		System.out.println("Hola " + nombre_usuario + ". El anio que viene tendras " + edad_usuario + " anios");
		
		
	}

}
