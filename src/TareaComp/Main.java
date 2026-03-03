package TareaComp;

public class Main {
	public static void main(String[] args) {
		Inventario miInventario = new Inventario();

		Perro perro1 = new Perro("Rex", 5, "vivo", "2019-05-10", "Pastor Alemán");
		Gato gato1 = new Gato("Luna", 3, "vivo", "2021-02-20", "Blanco");

		miInventario.insertarMascota(perro1);
		miInventario.insertarMascota(gato1);

		System.out.println("--- Lista de Mascotas ---");
		miInventario.mostrarListaMascotas();

		System.out.println("\n--- Detalles de todas las mascotas ---");
		miInventario.mostrarTodo();


		System.out.println("\n--- Actualizando estado de Rex ---");
		perro1.cumpleaños();
		perro1.morir();
		miInventario.mostrarMascota(0);
	}

}
