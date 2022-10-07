package baraja;

import java.util.Random;

public class Baraja {
	private static final int CANT_CARTAS = 48;
	private static final int MIN_NRO_CARTA = 1;
	private static final int MAX_NRO_CARTA = 12;
	private Carta[] cartas;
	private Random random;
	
	public Baraja() {
		cartas = new Carta[CANT_CARTAS];
		this.random = new Random();
		generarCartas();
	}
	
	private void generarCartas() {
		Palo[] palos = Palo.values();
		for (int p = 0; p < palos.length; p++) {
			generarCartas(palos[p]);
		}
	}
	
	private void generarCartas(Palo palo) {
		int posPartidaCartaDePalo = palo.ordinal() * MAX_NRO_CARTA;
		for (int n = MIN_NRO_CARTA; n <= MAX_NRO_CARTA; n++) {
			cartas[posPartidaCartaDePalo + n - 1] = new Carta(n,palo);
		}
	}
	
	public void desordenar() {
		int rnd1;
		int rnd2;
		for (int i = 0; i < 100; i++) {
			rnd1 = random.nextInt(this.cartas.length);
			rnd2 = random.nextInt(this.cartas.length);
			swap(rnd1,rnd2);
		}
	}
	
	private void swap (int a, int b) {
		Carta aux = this.cartas[a];
		this.cartas[a] = this.cartas[b];
		this.cartas[b] = aux;		
	}
	
	public void mostrarCartas() {
		for (int i = 0; i < cartas.length; i++) {
			System.out.println(cartas[i]);			
		}
	}
	
	public boolean estaOrdenado() {
		boolean ordenada = true;
		int i = 0;
		while(i < this.cartas.length && ordenada) {
			int nroPalo = i / MAX_NRO_CARTA;
			int nroCarta = (i % MAX_NRO_CARTA) + 1;
			Carta c = cartas[i];
			ordenada = c.sos(nroCarta, nroPalo);
			i++;
		}
		return ordenada;
	}
}
