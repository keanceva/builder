/**
 * 
 */
package emsamablajecomputadoras;

import emsamablajecomputadoras.creacional.*;

/**
 * @author djurado
 *
 */
public class PrincipalComputadoras {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Necesito ensamblar 2 computadoras
		// AsusROGE
		Computador roge = new Computador(/*todos los atributos*/);
		
		// AsusZenbook
		Computador zenbook = new Computador(/*todos los atributos*/);
		
		//Mostrar las caracteristicas de ambas computadoras 
		roge.toString();
		zenbook.toString();

	}

}
