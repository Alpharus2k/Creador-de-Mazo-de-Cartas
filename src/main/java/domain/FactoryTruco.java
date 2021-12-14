package domain;

import java.util.ArrayList;
import domain.PaloEspaniol;

public class FactoryTruco extends AbstractFactoryCartas {
	
	@Override
	public ArrayList<Carta> obtenerMazo() {
		ArrayList<Carta> retorno = new ArrayList<>();
		for (int idxNum = 1; idxNum < 13; idxNum++) {
			for (int idxEnumPalo = 0; idxEnumPalo < PaloEspaniol.values().length; idxEnumPalo++ ) {
				if(idxNum != 8 && idxNum != 9) {
					retorno.add(new CartaTruco(PaloEspaniol.values()[idxEnumPalo], idxNum));
				}
			}
			
		}
		
		return retorno;
	}

	
}
