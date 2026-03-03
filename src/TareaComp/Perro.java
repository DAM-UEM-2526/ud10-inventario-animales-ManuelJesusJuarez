package TareaComp;

public class Perro extends Mascotas {
	//Creamos los atributos 
	private String raza;
	//Creamos el Constructor
	public Perro(String nombreI, int edad, String estado, String fechaNacimiento, String raza) {
		//Llamamos a la clase padre
		super(nombreI, edad, estado, fechaNacimiento);
		this.raza = raza;
	}
	//Creamos los métodos
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	//Mostramos la informacion
	public void muestra() {
		System.out.println("Nombre: " + getNombreI());
		System.out.println("Edad: " + getEdad());
		System.out.println("Estado: " + getEstado());
		System.out.println("Fecha Nacimiento: " + getFechaNacimiento());
		System.out.println("Raza: " + raza);
	}
}