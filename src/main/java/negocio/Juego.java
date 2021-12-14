package negocio;

import java.util.ArrayList;
import domain.*;
import domain.AbstractFactoryCartas;

public class Juego {
	private AbstractFactoryCartas fabrica;

	public Juego() {
		this.fabrica = null;
	}

	public void setFabrica(AbstractFactoryCartas fabrica) {
		this.fabrica = fabrica;
	}
	public ArrayList<Carta> obtenerMazo(){
		return fabrica.obtenerMazo();
	}

}
