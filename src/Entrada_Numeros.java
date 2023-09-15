import javax.swing.*;
public class Entrada_Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*double x=10000.0;
		
		System.out.printf("%1.4f", x/3);*/
		
		String num1 = JOptionPane.showInputDialog("Introduce un numero");
		 
		 double num2 = Double.parseDouble(num1);
		 
		 System.out.print("La raiz de " + num2 + " es ");//esta funcion de print imprime todo en una sola linea. la otra funcion de println imprime lo que en el parentesis y el resultado lo imprime otra linea
				
		System.out.printf("%1.4f", Math.sqrt(num2));
		
		
	}

}
/*Flujo de ejecucion.
 * Public static void main(String args[]){
 * 	linea codigo 1
 * 	linea codigo 2
 * 	linea codigo 3
 * 	linea codigo 4
 * 	linea codigo 5
 * }
 * */
 /*Condicionales java.
  * Condicional if
  * 	if(condicion){
  * 		codigo a ejecutar si la condicion es verdad(true);
  * }
  * Condicional switch
  * 	Switch(valor a evaluar){
  * 		case valor1:
  * 			codigo a ejecutar;
  * 			Break;
  * 		case valor2:
  * 			codigo a ejcutar;
  * 			Break;
  * }
  * 
  * 
  * */
  