package es.studium.coche;

public class Piloto
{
	
	/* atributos  */
	private String nombre;
	private String nacionalidad;
	/* constructores */

	//constructores por defecto
	
	public Piloto() {
		nombre = "";
		nacionalidad = "";

	}
	
	//constructor con parametros
	
	public Piloto (String n, String na) {
		nombre =n;
		nacionalidad = na;

		
		}

	/**
	 * @return the nombre
	 */
	public String getNombre()
	{
		return nombre;
	}

	/**
	 * @return the nacionalidad
	 */
	public String getNacionalidad()
	{
		return nacionalidad;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	/**
	 * @param nacionalidad the nacionalidad to set
	 */
	public void setNacionalidad(String nacionalidad)
	{
		this.nacionalidad = nacionalidad;
	}
	
}
