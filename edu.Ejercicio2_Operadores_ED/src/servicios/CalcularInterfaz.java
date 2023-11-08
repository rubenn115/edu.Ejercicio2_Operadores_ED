/***
 * Ruben Bernal Ramos, CSI1
 */

package servicios;
/***
 * Interfaz para las operaciones de la calculadora
 * rbr - 081123
 */
public interface CalcularInterfaz {
/***
 * Enunciado de los métodos que tendrá la implementación
 * rbr - 081123
 */
	public int suma(int numero1, int numero2);
	public int resta(int numero1, int numero2);
	public int multiplicacion(int numero1, int numero2);
	public int division(int numero1, int numero2);
	public int modulo(int numero1, int numero2);
}
