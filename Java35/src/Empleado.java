
public class Empleado extends Persona {
	private String tipoContrato;
	private double sueldo;
	
	public Empleado(String nombres, String apellidos, String documento, String tipo, String tipoContrato) {
		super(nombres, apellidos, documento, tipo);
		this.tipoContrato = tipoContrato;
	}
	public Empleado() {
		super();
	}
	public String getTipoContrato() {
		return tipoContrato;
	}
	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}
	public double getSueldo() {
		return sueldo;
	}

	public void calcularSueldo() {
		sueldo = 1000; // Valor de ejemplo
	}
}
