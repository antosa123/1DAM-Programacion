import gamedb.gui.VentanaPrincipal;
import gamedb.model.ConexionBD;

import java.awt.Dimension;
import java.awt.Toolkit;


public class Main {

	public static void main(String[] args) {
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();// Obtener el tama�o de la pantalla
		ConexionBD bd = new ConexionBD();
		//Iniciar aplicacion
		VentanaPrincipal vp = new VentanaPrincipal(d, bd);
	}

}
