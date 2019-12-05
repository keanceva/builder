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
		
		
		ComputadorBuilder builder=new ComputadorBuilder();
		
		Computador c=builder.DefinirRam(32)
				.DefinirTipoRam("DDR4")
				.DefinirSistemaOperativo(new SistemaOperativo("Windows 10", 64, "Pro"))
				.DefinirAlmacenamiento(1000)
				.DefinirTipoAlmacenamiento("HDD")
				.DefinirPlaca(new Mainboard("Strix","x99"))
				.DefinirMarca("ASUS")
				.DefinirModelo("ROG")
				.builder();
		System.out.println(c);
		
	}

}
