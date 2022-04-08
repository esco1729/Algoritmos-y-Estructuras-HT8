/**
 * Clase con la ficha del paciente
 * @author liter
 *
 */
public class Paciente implements Comparable<Paciente>{
	private String nombre;
	private String sintoma;
	private String codigo;//codigo de emergencia del paciente
	
	/**
	 * Constructor
	 * @param nombre
	 * @param sintoma
	 * @param codigo
	 */
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
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	/**
	 * 
	 * @param paciente1
	 * @param paciente2
	 * @return
	 */
	public int compareTo(Paciente paciente1, Paciente paciente2) {
		int compare = paciente1.compareTo(paciente2);
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
	/**
	 * 
	 */
	public String toString() {
		return "Nombre: " + nombre + 
				"\nSíntomas: " + sintoma + 
				"\nCódigo: " + codigo;
	}

	@Override
	public int compareTo(Paciente o) {
		// TODO Auto-generated method stub
		return 0;
	}


}
