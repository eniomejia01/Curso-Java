import java.util.*;
public class AdivinaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// esta l�nea convierte el decimal obtenido del metodo Math.random en ENTERO
		int aleatorio = (int)(Math.random() * 100);
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		
		int intentos = 0;
		
		do {
			intentos++;
			
			System.out.println("�ntroduce un numero por favor");
			
			numero = entrada.nextInt();
			
			if ( aleatorio < numero ) {
				
				System.out.println("M�s bajo");
			}
			
			else if( aleatorio > numero ) {
				
				System.out.println("M�s alto");
			}
		}while( numero != aleatorio);
		
		System.out.println("Correcto, lo has conseguido en " + intentos + " intentos");
	}

}
