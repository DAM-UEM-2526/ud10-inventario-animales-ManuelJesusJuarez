package TareaComp;

public abstract class Mascotas {
	// Creamos los atributos de la clase Mascotas
	private String nombreI;
	private int edad;
	private String estado;
	private String fechaNacimiento;

	// Creamos el constructor de la clase Mascotas
	public Mascotas(String nombreI, int edad, String estado, String fechaNacimiento) {
		this.nombreI = nombreI;
		this.edad = edad;
		this.estado = estado;
		this.fechaNacimiento = fechaNacimiento;
	}

	// Creamos los métodos de la clase
	public String getNombreI() {
		return nombreI;
	}

	public void setNombreI(String nombreI) {
		this.nombreI = nombreI;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public abstract void muestra();

	public void cumpleaños() {
		this.edad++;
	}

	public void morir() {
		this.estado = "muerto";
	}
}
