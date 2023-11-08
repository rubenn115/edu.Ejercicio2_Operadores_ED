/***
 * Ruben Bernal Ramos, CSI1
 */
package controladores;

import servicios.MenuImplementacion;
import servicios.MenuInterfaz;
import servicios.SolicitarInterfaz;
import servicios.SolicitarImplementacion;
import servicios.CalcularInterfaz;

import java.util.Scanner;

import servicios.CalcularImplementacion;

/***
 * Clase principal de la aplicación
 * rbr - 081123
 */
public class principal {
/***
 * Método principal de la aplicación
 * rbr - 081123
 * @param args
 */
	public static void main(String[] args) {
		
		//Declaro las variables
		int numero1, numero2, opcion;
		
		//Declaro la variable Scanner
		Scanner sc = new Scanner(System.in);
		
		//Instancio las interfaces con sus implementaciones
		MenuInterfaz mi = new MenuImplementacion();
		SolicitarInterfaz si = new SolicitarImplementacion();
		CalcularInterfaz ci = new CalcularImplementacion();
		
		//Muestro por consola el menú
		mi.mostrarMenu();
		//Realizo la operación seleccionada
		System.out.println("Selecciona una opción:  ");
		opcion = sc.nextInt();
		switch (opcion) {
		case 0:
			break;
		case 1:
			numero1 = si.solicitudNumero1();
			numero2 = si.solicitudNumero2();
			ci.suma(numero1, numero2);
			break;
		case 2:
			numero1 = si.solicitudNumero1();
			numero2 = si.solicitudNumero2();
			ci.resta(numero1, numero2);
			break;
		case 3:
			numero1 = si.solicitudNumero1();
			numero2 = si.solicitudNumero2();
			ci.multiplicacion(numero1, numero2);
			break;
		case 4:
			numero1 = si.solicitudNumero1();
			numero2 = si.solicitudNumero2();
			ci.division(numero1, numero2);
			break;
		case 5:
			numero1 = si.solicitudNumero1();
			numero2 = si.solicitudNumero2();
			ci.modulo(numero1, numero2);
			break;
		default:
			System.err.println("***La opción seleccionada no es correcta***");
			break;
		}
	}

}
