package baraja;

public enum Palo {
	ORO, BASTO, ESPADA, COPA;
	
	// BASTO --> Basto
	public String toString() {
		String nom = name().toLowerCase();
		return nom.substring(0,1).toUpperCase() + nom.substring(1);
	}
}
