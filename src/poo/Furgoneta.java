package poo;

public class Furgoneta extends Coche{
	
	
	private int capacidad_carga;
	private int plazas_extra;
	
	public Furgoneta( int plazas_extra, int capacidad_carga) { //CONSTRUCTOR
		
		super(); // llamar al constructor de la clase padre
		
		this.capacidad_carga = capacidad_carga; // estado inicial
		this.plazas_extra = plazas_extra;
		
	}
	
	public String dimeDatos_furgoneta() {
		
		return " La capacidad de carga es: " + capacidad_carga + " Y las plazas son: " + plazas_extra;
	}
	
	
}
