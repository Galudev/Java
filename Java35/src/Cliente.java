
public class Cliente extends Persona {
	private String categor�a;
	private int codigo;
	
	public Cliente(String nombres, String apellidos, String documento, String tipo, String categor�a) {
		super(nombres, apellidos, documento, tipo);
		this.categor�a = categor�a;
	}
	public Cliente() {
		super();
	}

	public String getCategor�a() {
		return categor�a;
	}
	public void setCategor�a(String categor�a) {
		this.categor�a = categor�a;
	}
	public int getCodigo() {
		return codigo;
	}
	
	public void generarCodigo() {
		codigo = 0; // N�mero de ejemplo
	}
	
}
