package TareaComp;

import java.util.ArrayList;

public class Inventario {
	// Creamos el atributo
	private ArrayList<Mascotas> listaMascotas;

	// Creamos el constructor de la clase Inventario
	public Inventario() {
		this.listaMascotas = new ArrayList<>();
	}

	// Creamos los métodos
	public void insertarMascota(Mascotas mascota) {
		listaMascotas.add(mascota);
	}

	public void eliminarMascota(int indice) {
		// Ahora verificamos si el índice es válido antes de eliminar
		if (indice >= 0 && indice < listaMascotas.size()) {
			listaMascotas.remove(indice);
		}
	}

	public void vaciarInventario() {
		listaMascotas.clear();
	}

	public void mostrarListaMascotas() {
		for (Mascotas m : listaMascotas) {
			System.out.println("Tipo: " + m.getClass().getSimpleName() + " | Nombre: " + m.getNombreI());
		}
	}

	public void mostrarTodo() {
		for (Mascotas m : listaMascotas) {
			m.muestra();
			System.out.println("-----------------------");
		}
	}

	public void mostrarMascota(int indice) {
		if (indice >= 0 && indice < listaMascotas.size()) {
			listaMascotas.get(indice).muestra();
		}
	}
}