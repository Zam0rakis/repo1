package EntornsDeDesenvolupament;

/**
 * Aplicaci� per fer l'exemple de documentaci� 
 * @author Albert Zamora
 * @version 1.0
 *
 */
public class Buscador {
	/**
	 * M�tode que busca un enter a una taula est�tica
	 * @param num - numero enter
	 * @param array - taula est�tica
	 * @return - retorna cert si troba l'enter a dins la taula, altrament fals
	 */
	public static boolean buscar(int num, int[] array) {
		/**
		 * Inicialitzem variables
		 */
		int i = 0;
		boolean trobat = false;
		/**
		 * Bucle que busca l'enter dins de la taula est�tica
		 */
		while (!trobat && i < array.length) {
			trobat = array[i] == num;
			i++;
		}
		return trobat;
	}
}