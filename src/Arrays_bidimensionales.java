
public class Arrays_bidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int [][] matrix = new int[4][5];
		
		int [][] matrix = { // declaracion y relleno de una matriz de dos dimensiones
				{10,15,23,65,45},
				{89,16,37,41,23},
				{7,19,32,14,90},
				{85,2,40,27,8}
		};

		
//		for (int i = 0; i < 4; i++) {
//			
//			System.out.println();
//			
//			for(int j = 0; j < 5; j++) {
//				
//				System.out.print(matrix[i][j] + " ");
//			}
//		}
		
		for(int[] fila:matrix) {
			
			System.out.println();
			
			for(int z: fila) {
				System.out.print(z + " ");
			}
		}

	}

}
