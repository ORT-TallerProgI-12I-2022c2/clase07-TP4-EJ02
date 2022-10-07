package baraja;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Baraja mazo = new Baraja();
		
		//mazo.mostrarCartas();
		//System.out.println(mazo.estaOrdenado());
		mazo.desordenar();
		mazo.mostrarCartas();
		System.out.println(mazo.estaOrdenado());
	}

}
