import javax.swing.*;
public class Uso_Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		String [] paises = new String[8];
//		
//		paises[0] = "Espa�a";
//		paises[1] = "M�xico";
//		paises[2] = "Colombia";
//		paises[3] = "Per�";
//		paises[4] = "Chile";
//		paises[5] = "Argentina";
//		paises[6] = "Ecuador";
//		paises[7] = "Venezuela";
		
		//String [] paises = {"Espa�a", "M�xico", "Colombia", "Per�", "Chile", "Argentina", "Ecuador", "Venezuela"};
		
//		for(int i = 0; i < paises.length; i++) {
//			
//			System.out.println("Pa�s " + (i+1) + " = " + paises[i]);
//			
//		}
		
//		for (int i = 0; i < 8; i++) {
//			paises[i] = JOptionPane.showInputDialog("Introduce pa�s: " + (i+1));
//		}
//		
//		for( String elemento:paises) { // Bucle forEach
//			
//			System.out.println("Pa�s: " + elemento);
//			
//		}
		
		
		int [] matriz_aleatorios = new int [150];
		
		for(int i = 0; i < matriz_aleatorios.length; i++) {
			
			matriz_aleatorios[i] = (int)Math.round(Math.random()*100);
		}
		
		for(int numeros: matriz_aleatorios) {
			
			System.out.print(numeros + " ");
		}
		
	}

}
