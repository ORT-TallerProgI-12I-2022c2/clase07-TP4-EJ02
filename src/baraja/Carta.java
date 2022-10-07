package baraja;

public class Carta {
	private int numero;
	private Palo palo;
	
	public Carta(int numero, Palo palo) {
		super();
		this.numero = numero;
		this.palo = palo;
	}

	@Override
	public String toString() {
		return numero + " de " + palo;
	}

	public boolean sos(int nroCarta, int nroPalo) {
		return this.numero == nroCarta && this.palo.ordinal() == nroPalo;
	}
	
	
}
