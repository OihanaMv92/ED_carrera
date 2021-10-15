package es.studium.coche;

public class testcarrera
{

	public static void main(String[] args)
	{

		coche c1 = new coche("Ferrari", "Testarossa", 1996, true);
		coche c2 = new coche("Seat", "Ibiza", 2018, false);

		Piloto p1 = new Piloto("Fernando Alonso", "española");
		Piloto p2 = new Piloto("Michael Schumacher", "alemana");

		System.out.println("Hola, me llamo " + p1.getNombre());
		System.out.println("Hola, me llamo " + p2.getNombre());



	}
}