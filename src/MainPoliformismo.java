import java.util.ArrayList;

public class MainPoliformismo {

	// ArrayList de objetos SeleccionFutbol. Idenpendientemente de la clase hija a la que pertenezca el objeto
	public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

	public static void main(String[] args) {
		
		
		//SeleccionFutbol s = new SeleccionFutbol();
		SeleccionFutbol sampaoli = new Entrenador(1, "Jorge", "Sampaoli", 55, 28489);
		SeleccionFutbol reyArturo = new Futbolista(2, "Arturo", "Vidal", 28, 6, "Interior Derecho");
		SeleccionFutbol juanito = new Masajista(3, "Juanito", "Perez", 41, "Licenciado en Fisioterapia", 18);

		integrantes.add(sampaoli);
		integrantes.add(reyArturo);
		integrantes.add(juanito);

		// CONCENTRACION
		System.out.println("");
		System.out.println("CONCENTRACION");
		System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo m�todo)");
		
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.concentrarse();
		}

		// VIAJE
		System.out.println("");
		System.out.println("VIAJE");
		System.out.println("Todos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo m�todo)");
		
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.viajar();
		}
		
		// ENTRENAMIENTO
		System.out.println("");
		System.out.println("ENTRENAMIENTO Metodo Abstracto");
		System.out.println("Entrenamiento: Todos los integrantes tienen su funci�n en un entrenamiento (Especializaci�n)");
		
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.entrenamiento();
		}

		// PARTIDO DE FUTBOL
		System.out.println("");
		System.out.println("PARTIDO DE FUTBOL");
		System.out.println("Partido de F�tbol: Todos los integrantes tienen su funci�n en un partido (Especializaci�n)");
		
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.partidoFutbol();
		}
		
		// PLANIFICAR ENTRENAMIENTO
		System.out.println("");
		System.out.println("PLANIFICAR ENTRENAMIENTO");
		System.out.println("Planificar Entrenamiento: Solo el entrenador tiene el m�todo para planificar un entrenamiento:");
		System.out.print(sampaoli.getNombre() + " " + sampaoli.getApellidos() + " -> ");
		((Entrenador) sampaoli).planificarEntrenamiento();

		// ENTREVISTA
		System.out.println("");
		System.out.println("ENTREVISTA");
		System.out.println("Entrevista: Solo el futbolista tiene el m�todo para dar una entrevista:");
		System.out.print(reyArturo.getNombre() + " " + reyArturo.getApellidos() + " -> ");
		((Futbolista) reyArturo).entrevista();

		// MASAJE
		System.out.println("");
		System.out.println("MASAJE");
		System.out.println("Masaje: Solo el masajista tiene el m�todo para dar un masaje:");
		System.out.print(juanito.getNombre() + " " + juanito.getApellidos() + " -> ");
		((Masajista) juanito).darMasaje();

     
}
}
