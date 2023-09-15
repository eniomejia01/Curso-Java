
public class Uso_Arrays {

	public static void main(String[] args) {
		
		
		//int mi_matriz2 [] = new int[5]; // Otra forma de declarar una matriz\array
		
//		int [] mi_matriz = new int[5];
//		
//		mi_matriz[0] = 5;
//		mi_matriz[1] = 38;
//		mi_matriz[2] = 15;
//		mi_matriz[3] = 92;
//		mi_matriz[4] = 71;
//		
//		System.out.println(mi_matriz[0]);
		
		
		int [] mi_matriz = {5, 8, 93, 71, -15, 56, 45, 23, 14, 26, 78, 45, 89, 65}; // declaracion alterna de una matriz\array
		
		for(int i = 0; i < mi_matriz.length; i++) { // uso del length para saber detener el bucle según cuántos elementos contenga el array
			
			System.out.println("Valor del indice " + i + " = " + mi_matriz[i]);
		}
		

	}

}
