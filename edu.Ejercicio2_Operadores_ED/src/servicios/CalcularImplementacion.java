/***
 * Ruben Bernal Ramos, CSI1
 */

package servicios;
/***
 * Implementación de la interfaz calcular
 * rbr - 081123
 */
public class CalcularImplementacion implements CalcularInterfaz{
/***
 * Método que sumará los dos número enteros
 * rbr - 081123
 */
	public int suma(int numero1, int numero2) {
		System.out.println("Has seleccionado la opción: Suma");
		int total;
		total = numero1 + numero2;
		System.out.println("La suma de los numeros es: " + total);
		return total;
	}

/***
 * Método que sumará los dos número enteros
 * rbr - 081123
 */
	public int resta(int numero1, int numero2) {
		System.out.println("Has seleccionado la opción: Resta");
		int total;
		total = numero1 - numero2;
		System.out.println("La resta de los numeros es: " + total);
		return total;
	}

/***
 * Método que sumará los dos número enteros
 * rbr - 081123
 */
	public int multiplicacion(int numero1, int numero2) {
		System.out.println("Has seleccionado la opción: Multiplicación");
		int total;
		total = numero1 * numero2;
		System.out.println("La multiplicación de los numeros es: " + total);
		return total;
	}

/***
 * Método que sumará los dos número enteros
 * rbr - 081123
 */
	public int division(int numero1, int numero2) {
		System.out.println("Has seleccionado la opción: Division");
		int total;
		total = numero1 / numero2;
		System.out.println("La división de los numeros es: " + total);
		return total;
	}

/***
 * Método que sumará los dos número enteros
 * rbr - 081123
 */
	public int modulo(int numero1, int numero2) {
		System.out.println("Has seleccionado la opción: Modulo");
		int total;
		total = numero1 % numero2;
		System.out.println("El módulo de los numeros es: " + total);
		return total;
	}

}
