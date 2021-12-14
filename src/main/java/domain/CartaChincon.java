package domain;

public class CartaChincon extends CartaEspaniola {
	private int valorChinchon;
	protected CartaChincon(PaloEspaniol palo, int numero) {
		super(palo, numero);
		this.valorChinchon = calcularValorChinchon(numero);
	}
	private int calcularValorChinchon(int numero) {
		return numero < 10 ? numero : 10;
	}
	@Override
	public String toString() {
		return String.format("Palo: %-10S; Numero: %10S; Valor Cinchon: %2S",this.getPalo(),this.getNumero(),this.valorChinchon);
	}

}
