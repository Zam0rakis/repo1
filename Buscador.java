package EntornsDeDesenvolupament;

/**
 * Aplicació per fer l'exemple de documentació 
 * @author Albert Zamora
 * @version 1.0
 *
 */
public class Buscador {
	/**
	 * Mètode que busca un enter a una taula estàtica
	 * @param num - numero enter
	 * @param array - taula estàtica
	 * @return - retorna cert si troba l'enter a dins la taula, altrament fals
	 */
	public static boolean buscar(int num, int[] array) {
		/**
		 * Inicialitzem variables
		 */
		int i = 0;
		boolean trobat = false;
		/**
		 * Bucle que busca l'enter dins de la taula estàtica
		 */
		while (!trobat && i < array.length) {
			trobat = array[i] == num;
			i++;
		}
		return trobat;
	}
}