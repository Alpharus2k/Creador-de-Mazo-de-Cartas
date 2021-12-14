package domain;

public abstract class CartaEspaniola extends Carta {
	private PaloEspaniol palo;
	private int numero;
	protected CartaEspaniola(PaloEspaniol palo, int numero) {
		super();
		this.palo = palo;
		this.numero = numero;
	}
	protected String getPalo() {
		return palo.toString();
	}
	protected int getNumero() {
		return numero;
	}
	
	
}
