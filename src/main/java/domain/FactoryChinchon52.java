package domain;

import java.util.ArrayList;

public class FactoryChinchon52 extends AbstractFactoryCartas {

	@Override
	public ArrayList<Carta> obtenerMazo() {
		ArrayList<Carta> retorno = new ArrayList<>();
		for (int idxNum = 1; idxNum < 13; idxNum++) {
			for (int idxEnumPalo = 0; idxEnumPalo < PaloEspaniol.values().length; idxEnumPalo++ ) {
				retorno.add(new CartaChincon(PaloEspaniol.values()[idxEnumPalo], idxNum));
			}
		}
		retorno.add(new Comodin());
		retorno.add(new Comodin());
		return retorno;
	}

}
