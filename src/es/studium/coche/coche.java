package es.studium.coche;

/**
 * @author Oihana
 *
 */
public class coche
{

	/* atributos  */
	private String fabricante;
	private String modelo;
	private int anio;
	private boolean gasolina;

	/* constructores */

	//constructores por defecto
	public coche() {
		fabricante = "";
		modelo = "";
		anio = 0;
		gasolina = false;
	}
	
	//constructor con parametros
	
	public coche (String f, String m, int a, boolean g) {
		fabricante =f;
		modelo = m;
		anio = a;
		gasolina = g;
		
		}

	/**
	 * @return the fabricante
	 */
	public String getFabricante()
	{
		return fabricante;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo()
	{
		return modelo;
	}

	/**
	 * @return the anio
	 */
	public int getAnio()
	{
		return anio;
	}

	/**
	 * @return the gasolina
	 */
	public boolean GetGasolina()
	{
		return gasolina;
	}

	/**
	 * @param fabricante the fabricante to set
	 */
	public void setFabricante(String fabricante)
	{
		this.fabricante = fabricante;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo)
	{
		this.modelo = modelo;
	}

	/**
	 * @param anio the anio to set
	 */
	public void setAnio(int anio)
	{
		this.anio = anio;
	}

	/**
	 * @param gasolina the gasolina to set
	 */
	public void setGasolina(boolean gasolina)
	{
		this.gasolina = gasolina;
	}
	

}
