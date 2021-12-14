package domain;

public class CartaTruco extends CartaEspaniola {
	private int valorTruco;
	private int valorEnvido;
	public CartaTruco(PaloEspaniol palo, int numero) {
		super(palo, numero);
		this.valorTruco = calcularValorTruco(palo,numero);
		this.valorEnvido = calcularValorEnvido(numero);
	}
	private int calcularValorTruco(PaloEspaniol palo, int numero) {
		int retorno = 0;
		switch(numero) {
		case(1):
			if(palo == PaloEspaniol.ESPADAS) {
				retorno = 14;
			}else if(palo == PaloEspaniol.BASTOS) {
				retorno = 13;
			}else {
				retorno = 8;
			}
			break;
		case(2):
			retorno = 9;
			break;
		case(3):
			retorno = 10;
			break;
		case(4):
			retorno = 1;
			break;
		case(5):
			retorno = 2;
			break;
		case(6):
			retorno = 3;
			break;
		case(7):
			if(palo == PaloEspaniol.ESPADAS) {
				retorno = 12;
			}else if(palo == PaloEspaniol.OROS) {
				retorno = 11;
			}else {
				retorno = 4;
			}
			break;
		case(10):
			retorno = 5;
			break;
		case(11):
			retorno = 6;
			break;
		case(12):
			retorno = 7;
			break;
		}
		return retorno;
	}
	private int calcularValorEnvido(int numero) {
		return numero < 10 ? numero : 0;
	}

	@Override
	public String toString() {
		return String.format("Palo: %-10S; Numero: %10S; Valor Truco: %2S; Valor Envido: %2S",this.getPalo(),this.getNumero(),this.valorTruco,this.valorEnvido);
	}
	
	
}
