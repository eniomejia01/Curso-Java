package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona [] lasPersona = new Persona[2]; // ARRAY
		
		lasPersona[0] = new Empleado2("Luis Conde", 50000, 2009, 02, 25);
		lasPersona[1] = new Alumno("Ana López", "Biólogicas");
		
		for (Persona p: lasPersona) {
			
			System.out.println(p.dameNombre() + ", " + p.dameDescripcion());
			
		}
		
	}

}


abstract class Persona {
	
	public Persona(String nom) { // método constructor
		
		nombre = nom;
	}
	
	public String dameNombre() {
		
		return nombre;
		
	}
	
	public abstract String dameDescripcion(); // así es como se declara un método abstracto en Java
	
	private String nombre;
}


class Empleado2 extends Persona{
	
	//constructor
	public Empleado2(String nom, double sue, int agno, int mes, int dia ) { // Un constructor debe llevar el mismo nombre que la CLASE al que pertenece
		
		super( nom );
		
		sueldo = sue;
		
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		
		altaContrato = calendario.getTime();
		
		++idSiguiente;
		
		Id = idSiguiente;
		
		
		
	}
	
	public String dameDescripcion() {
		
		return "Este empleado tiene un Id -> " + Id + " con un sueldo = " + sueldo;
	}
	
	
	
	public double dameSueldo() { //getter
		
		return sueldo;
	}
	
	public Date dameFechaContrato() { //getter
		
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje) { // setter
		
		double aumento = sueldo * porcentaje/100;
		
		sueldo += aumento;
	}
	
	
	private double sueldo;
	private Date altaContrato;
	private static int idSiguiente;
	private int Id;
	
}

class Alumno extends Persona {
	
	public Alumno( String nom, String car ) {
		super( nom );
		
		carrera = car;
		
	}
	
	public String dameDescripcion() {
		
		
		return "Este alumno está estudiando la carrera de " + carrera;
		
	}
	private String carrera;
	
}

