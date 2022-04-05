/**
 * Clase con la ficha del paciente
 * @author liter
 *
 */
public abstract class Paciente implements Comparable{
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
	
	public int compareTo(String codigo1, String codigo2) {
		int compare = codigo1.compareTo(codigo2);
		if (compare < 0) {
			return -1;
		}
		else if (compare >0) {
			return 1;
		}
		else {
			return 0;
		}
	}



}
