package test;

import java.util.ArrayList;
import domain.Carta;
import domain.FactoryChinchon52;
import domain.FactoryTruco;
import negocio.Juego;

public class Main {

	public static void main(String[] args) {
		Juego juego = new Juego();
		juego.setFabrica(new FactoryTruco());
		ArrayList<Carta> lista = juego.obtenerMazo();
		listar(lista);
		System.out.println("*** *** *** *** ***");
		juego.setFabrica(new FactoryChinchon52());
		ArrayList<Carta> lista2 = juego.obtenerMazo();
		listar(lista2);
	}

	private static void listar(ArrayList<Carta> lista) {
		for (Carta carta : lista) {
			System.out.println(carta.toString());
		}
		
	}

}
