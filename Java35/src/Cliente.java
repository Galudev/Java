
public class Cliente extends Persona {
	private String categoría;
	private int codigo;
	
	public Cliente(String nombres, String apellidos, String documento, String tipo, String categoría) {
		super(nombres, apellidos, documento, tipo);
		this.categoría = categoría;
	}
	public Cliente() {
		super();
	}

	public String getCategoría() {
		return categoría;
	}
	public void setCategoría(String categoría) {
		this.categoría = categoría;
	}
	public int getCodigo() {
		return codigo;
	}
	
	public void generarCodigo() {
		codigo = 0; // Número de ejemplo
	}
	
}
