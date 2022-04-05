/**
 * Clase con la ficha del paciente
 * @author liter
 *
 */
public class Paciente {
	private String nombre;
	private String sintoma;
	private String codigo;
	
	
	public Paciente(String nombre, String sintoma, String codigo) {
		this.nombre = nombre;
		this.sintoma = sintoma;
		this.codigo = codigo;
	}
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the sintoma
	 */
	public String getSintoma() {
		return sintoma;
	}
	/**
	 * @param sintoma the sintoma to set
	 */
	public void setSintoma(String sintoma) {
		this.sintoma = sintoma;
	}
	/**
	 * @return the paciente
	 */
	public String getCodigo() {
		return codigo;
	}
	/**
	 * @param paciente the paciente to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

}
