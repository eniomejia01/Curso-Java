
public class Manipula_adenas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase = "Hoy es un estupendo dia para aprender a programar en JAVA";
		
		String frase_resumen = frase.substring(0, 29)  + " irnos a la playa y ovidarnos de todo..." + " Y " +
		frase.substring(29,57);
		
		System.out.println(frase_resumen);
		
	}

}
