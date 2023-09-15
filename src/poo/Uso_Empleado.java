package poo;

import java.util.*; // se importan todos los métodos pertenecientes al java.util



public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Empleado empleado1 = new Empleado("Paco Gómew", 85000, 1990, 12, 17);
//		
//		Empleado empleado2 = new Empleado("Ana López", 95000, 1995, 06, 02);
//		
//		Empleado empleado3 = new Empleado("María Martín", 105000, 2002, 03, 15);
//		
//		empleado1.subeSueldo(5);
//		empleado2.subeSueldo(5);
//		empleado3.subeSueldo(5);
//		
//		System.out.println("Nombre: " + empleado1.dameNombre() + " Sueldo: " + empleado1.dameSueldo()  + " Fecha de Alta: " + empleado1.dameFechaContrato());
//		System.out.println("Nombre: " + empleado2.dameNombre() + " Sueldo: " + empleado2.dameSueldo()  + " Fecha de Alta: " + empleado2.dameFechaContrato());
//		System.out.println("Nombre: " + empleado3.dameNombre() + " Sueldo: " + empleado3.dameSueldo()  + " Fecha de Alta: " + empleado3.dameFechaContrato());
		
		Jefatura jefe_RRHH = new Jefatura("Enio ", 55000, 2006, 9, 25);
		
		jefe_RRHH.estableceIncentivo(2570);
		
		
		
		Empleado [] misEmpleado = new Empleado[7]; // se define cuantos elementos contendrá el array
		
		misEmpleado[0] = new Empleado("Paco ", 85000, 1990, 12, 17);
		misEmpleado[1] = new Empleado("Ana ", 95000, 1995, 06, 02);
		misEmpleado[2] = new Empleado("María ", 105000, 2002, 03, 15);
		misEmpleado[3] = new Empleado("Chino ");
		misEmpleado[4] = new Empleado("Kendra ");
		misEmpleado[5] = jefe_RRHH; // polimorfismo en accion. Principio de sustitucion
		misEmpleado[6] = new Jefatura("Maria ", 95000, 1999, 5, 26);
		
		Jefatura jefa_Finanzas = (Jefatura) misEmpleado[6]; 

		/*
		 * 
		El "casting de objetos" en Java se refiere a la conversión de un objeto de un tipo a otro 		relacionado mediante la jerarquía de clases. Permite tratar un objeto como si fuera de un tipo 		diferente, siempre que exista una relación de herencia o implementación entre los tipos 		involucrados.
		 */
		
		jefa_Finanzas.estableceIncentivo(55000);
		
//		Empleado director_comercial = new Jefatura("Sandra", 85000, 2012, 05, 05);
//		
//		Comparable ejemplo = new Empleado("Elisabeth", 95000, 2011, 01, 07);
//		
//		if(director_comercial instanceof Empleado) {
//			System.out.println("Es de tipo jefatura");
//		}
//		
//		if(ejemplo instanceof Comparable) {
//			System.out.println("Implementa la interfaz comparable");
//		}
		
		System.out.println(jefa_Finanzas.tomar_decisiones("Dar más días de vaciones a los empleados"));
		
		System.out.println("El Jefe: " + jefa_Finanzas.dameNombre() + " tiene un bonus de: " 
		
				+ jefa_Finanzas.establece_bonus(500) );
		
		System.out.println(misEmpleado[3].dameNombre() + " tiene un bonus de: " 
		
				+ misEmpleado[3].establece_bonus(200));
		
		for(Empleado e: misEmpleado) { // Bucle for mejorado
			
			e.subeSueldo(5);
		}
		
		
				Arrays.sort(misEmpleado); //Interfaz Predefinida
				
		
		for(Empleado e: misEmpleado) { // Bucle for mejorado
			
			System.out.println("Nombre: " + e.dameNombre() 
				+ " Sueldo: " + e.dameSueldo() 
				+ " Fecha de Alta: " + e.dameFechaContrato());
		}
		
		
	}

}


class Empleado implements Comparable, Trabajadores { //Interfaz Predefinida | no se puede "instanciar" un interfaz
	
	//constructor
	public Empleado(String nom, double sue, int agno, int mes, int dia ) { // Un constructor debe llevar el mismo nombre que la CLASE al que pertenece
		
		nombre = nom;
		
		sueldo = sue;
		
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
		
		altaContrato = calendario.getTime();
		
		++idSiguiente;
		
		Id = idSiguiente;
		
	}
	
	public double establece_bonus( double gratificacion ) {
		
		return Trabajadores.bouns_base + gratificacion;
	}
	
	public Empleado(String nom) { // segundo constructor
		
		this(nom, 30000, 2000, 01, 01);
	}
	
	
	
	public String dameNombre() { // getter
		
		return nombre + " Id: " + Id;
		

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
	
	public int compareTo( Object miObjeto) {  //Interfaz Predefinida
		
		Empleado otroEmpleado = (Empleado) miObjeto;
		
		if(this.Id < otroEmpleado.Id) {
			
			return -1;
		}
		
		if(this.Id > otroEmpleado.Id) {
			
			return 1;
		}
		
		return 0;
	}
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private static int idSiguiente;
	private int Id;
	
}

class Jefatura extends Empleado implements Jefes{
	
	public Jefatura( String nom, double sue, int agno, int mes, int dia) {
		
		super(nom, sue, agno, mes, dia);
		
		
	}
	
	public String tomar_decisiones(String decision) {
		return "Un miembro de la dierccion ha tomado la decision de: " + decision;
	}
	
	public double establece_bonus( double gratificacion ) {
		
		double prima = 2000;
		
		return Trabajadores.bouns_base + gratificacion + prima;
	}
	
	public void estableceIncentivo(double b) { // SETTER
		
		incentivo = b;
	}
	
	public double dameSueldo() { // sobreescribe el metodo en la clase Padre
		
		double sueldoJefe = super.dameSueldo(); // llama el metodo de la clase Padre
		
		return sueldoJefe + incentivo;
	}
	private double incentivo;
	
}

































