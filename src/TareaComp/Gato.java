package TareaComp;

public class Gato extends Mascotas {
	//Creamos los atributos
	private String color;
	//Creamos el constructor
	public Gato(String nombreI, int edad, String estado, String fechaNacimiento, String color) {
		//llamamos al padre
		super(nombreI, edad, estado, fechaNacimiento);
		this.color = color;
	}
	//Creamos metodos
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void muestra() {
		System.out.println("Nombre: " + getNombreI());
		System.out.println("Edad: " + getEdad());
		System.out.println("Estado: " + getEstado());
		System.out.println("Fecha Nacimiento: " + getFechaNacimiento());
		System.out.println("Color: " + color);

	}

}