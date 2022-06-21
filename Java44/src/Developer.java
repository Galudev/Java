
public class Developer {
	private String nombre;
	private String apellidos;
	private int edad;
	private String DNI;
	private Profesiones rolTecnologico;
	
	public Developer(String nombre, String apellidos, int edad, String dNI, Profesiones rolTecnologico) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		DNI = dNI;
		this.rolTecnologico = rolTecnologico;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public Profesiones getRolTecnologico() {
		return rolTecnologico;
	}
	public void setRolTecnologico(Profesiones rolTecnologico) {
		this.rolTecnologico = rolTecnologico;
	}
	
}
