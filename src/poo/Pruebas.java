package poo;

public class Pruebas {

	public static void main(String[] args) { // El public indica que se puede acceder a esta clase fuera de esta clase
		// TODO Auto-generated method stub
		
		Empleados trabajador1 = new Empleados("Paco"); // instancia
		
		Empleados trabajador2 = new Empleados("Ana");
		
		Empleados trabajador3 = new Empleados("Antonio");
		
		trabajador1.cambiaSeccion("RRHH");
		
		System.out.println(trabajador1.devuelveDatos() + "\n" + trabajador2.devuelveDatos() + "\n"
		+ trabajador3.devuelveDatos());

		System.out.println(Empleados.dameIdSiguiente());

	}

}

/* 
 * No actúan sobre objetos
 * No acceden a campos de ejemplar(variables/constantes declaradas en la clase), a menos que estas seas también static
 * Para llamarse se utiliza el nombre_clase.nombre_metodo
 * */


class Empleados{
	
	public Empleados(String nom) { // método constructor
		
		nombre = nom;
		
		seccion = "Administración";
		
		id = idSiguiente;
		
		idSiguiente++;
		
	}
	
	public void cambiaSeccion(String seccion) { //setter
		
		this.seccion = seccion;
		
		
	}
	

	
	public String devuelveDatos() {// getter
		
		
		return "El nombre es: " + nombre + " la seccion es " + seccion + " y su Id. " + id;
	}
	
	public static String dameIdSiguiente() {
		
		return "El IdSiguiente es: " + idSiguiente;
	}
	
	
	private final String nombre; // constante
	private String seccion;
	private  int id;
	private static int idSiguiente = 1; // pertenece a la clase, no a ningun objeto
	
}