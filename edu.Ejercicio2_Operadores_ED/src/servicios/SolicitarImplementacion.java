/***
 * Ruben Bernal Ramos, CSI1
 */

package servicios;

import java.util.Scanner;

/***
 * Implementación de la interfaz solicitar
 * rbr - 081123
 */
public class SolicitarImplementacion implements SolicitarInterfaz {
/***
 * Métodos que solicitarán por consola los números enteros necesarios
 * para realizar la opción seleccionada
 * rbr - 081123
 */
	public int solicitudNumero1() {
		int numero1;
		System.out.println("Introduce el primer número entero: ");
		Scanner sc = new Scanner(System.in);
		numero1 = sc.nextInt();
		return numero1;
	}
	public int solicitudNumero2() {
		int numero2;
		System.out.println("Introduce el primer número entero: ");
		Scanner sc = new Scanner(System.in);
		numero2 = sc.nextInt();
		return numero2;
	}
	
}
