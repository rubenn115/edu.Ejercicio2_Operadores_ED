/***
 * Ruben Bernal Ramos, CSI1
 */

package servicios;
/***
 * Implementación de la interfaz menu
 * rbr - 081123
 */
public class MenuImplementacion implements MenuInterfaz{
/***
 * Método que mostrará el menú por consola
 * rbr - 081123
 */
	public void mostrarMenu() {
		System.out.println("########################");
		System.out.println("##########MENU##########");
		System.out.println("########################");
		System.out.println("1. Suma                 ");
		System.out.println("2. Resta                ");
		System.out.println("3. Multiplicación       ");
		System.out.println("4. División             ");
		System.out.println("5. Módulo               ");
		System.out.println("0. Cerrar               ");
		System.out.println("########################");
	}

}
