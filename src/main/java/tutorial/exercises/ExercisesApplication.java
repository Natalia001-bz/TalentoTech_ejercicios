package tutorial.exercises;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExercisesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExercisesApplication.class, args);
		String text = "Hola Mundo";
		int tamaño = text.length();
	    String texto = text.replace("Mundo", "Palabra nueva");

		System.out.println(text + tamaño + texto);

		System.out.println(texto.endsWith("nueva"));
		System.out.println(texto.startsWith("Hola"));
		System.out.println(texto.contains("ola"));
		System.out.println(texto.indexOf("Hol"));
		System.out.println(texto.toUpperCase());

		String incorrecto = "           Método eliminar     espacio";
		System.out.println(incorrecto);
		System.out.println(incorrecto.trim());

		// Caracteres de escape \ para comillas dobles y para \
		// nueva línea \n
		// tabulacion \t 

		// Array 
		 // tamaño fijo, para agregar elementos se debe trabajar con colecciones 
		 // cuando esta vacio  la consola muestra el valor  en consola  ejm: [I@2639fe5b 

		int [] numeros = new int[5]; 
		int [] otroArray = {1,2,3,4};	// cuando asignamos los valores al inicio → 
		
		numeros[0] = 5;
		numeros[3] = 7;  // Le da valores a la posición[x] ejm: [5, 0, 0, 7, 0]
	
		System.out.println(Arrays.toString(numeros)); // permite ver el array inicializado con los valores de 0  : [0, 0, 0, 0, 0]
		System.out.println(numeros.length);
		Arrays.sort(numeros); // no es necesario guardarlo en una nueva variable como en los string
		System.out.println(numeros); // devuelve el espacio en memoria [I@3c2ed902 
		// se debe convertir usar toString
		System.out.println(Arrays.toString(numeros));
		System.out.println(otroArray);

		// _____Array de Arrays____________Arrays de múltiples dimensiones_( pueden se mas de dos)________________________
		//  int[] numeros2 = {0,1};  array simple 
		int [][] numeros2 = {{0,1}, {2,3}};
		// para agregar, se utiliza la misma sintaxis agrgando {}
		// System.out.println(Arrays.toString(numeros2)); con este vuelve a mostrar el espacio en memoria 
		System.out.println(Arrays.deepToString(numeros2));

		int [][] numero3 = new int[3][2]; // indica tamaño en filas y columnas 
		numero3[0][0] = 5; // asigna posicion y valos  para la primera fila y la primera columna
		System.out.println(Arrays.deepToString(numero3));

		//______________Constantes_________________
		        // Crear una constante 
				final String empresa = "Company";
				System.out.println("final no permite que se cambie el valor de la variable" + empresa);
	}

}
