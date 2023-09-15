
public class ClaseMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//double raiz=Math.sqrt(9);//tiene que ser un double
		
		//double num1=5.85;
		
		double base=5;
		
		
		double exponente=3;
		
		int resultado=(int)Math.pow(base, exponente);//el metodo pow obliga a que sean en datos double
		
		//int resultado=(int)Math.round(num1);//redondeo
		
		System.out.println("El resultado de " + base + " elevado a " + exponente + " es " + resultado);
		
	}

}


//Math.sqrt(n): raiz cuadrada de un numero
//Math.pow(base,exponente):potencia de un numero. Base y exponente son doubles
//Math.sin(angulo). Math.tan(angulo). Math.atan(angulo)
//Math.round(decimal): redondeo de un numero.
//Math.PI: constante de clase con el numero PI

/* Refundiciones: int raiz=(int)Math.round(num1;)*/

/* Clase String
 * String no es un tipo primitivo
 * como almacenar una cadena de caracteres?
 * String mi_nombre="Juan"; donde mi_nombre es un objeto(instancia, ejemplar) de la clase String
 * Metodos (mas usados) de la clase String para manipulacion de cadenas de texto:
 * length(): devuelve la longitud de una cadena de caracteres
 * charAt(n): devuelve la posicion de un caracter dentro de una cadena. (Las posiciones empiezan a contar de 0)
 * substring(x,y): devuelve uan subcadena dentro de la cadena, siendo x el caracter a partir del cual se extrae e y el n de caracteres que se quieren extraer
 * equals(cadena): devuelve true si dos cadenas que se comparan son iguales y false si no lo son. distingue mayusculas y minusculas
 * equalsCase(cadena): igual que el anterior pero sin tener en cuenta mayusculas y minusculas.
 */

