package EjercicioHibernate1_LuisM.EjercicioHibernate1_LuisM.datamodel.entities;

import java.io.Serializable;

public class Empleado implements Serializable{
	
	private int codigoEmpleado;
	private String nombreEmpleado;
	private String apellido1;
	private String apellido2;
	private String lugarNacimiento;
	private String fechaNacimiento;
	private String direccion;
	private String telefono;
	private String puesto;
	private int codDepartamento;
	
	public Empleado() {
		
	}
	
	public Empleado(int codigoEmpleado, String nombreEmpleado, String apellido1, String apellido2, String lugarNacimiento, String fechaNacimiento, String direccion, String telefono, String puesto, int codDepartamento) {
		this.codigoEmpleado = codigoEmpleado;
		this.nombreEmpleado = nombreEmpleado;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.lugarNacimiento = lugarNacimiento;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.telefono = telefono;
		this.puesto = puesto;
		this.codDepartamento = codDepartamento;
	}

	public int getCodigoEmpleado() {
		return codigoEmpleado;
	}

	public void setCodigoEmpleado(int codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getLugarNacimiento() {
		return lugarNacimiento;
	}

	public void setLugarNacimiento(String lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public int getCodDepartamento() {
		return codDepartamento;
	}

	public void setCodDepartamento(int codDepartamento) {
		this.codDepartamento = codDepartamento;
	}

	@Override
	public String toString() {
		return "Empleado [codigoEmpleado=" + codigoEmpleado + ", nombreEmpleado=" + nombreEmpleado + ", apellido1="
				+ apellido1 + ", apellido2=" + apellido2 + ", lugarNacimiento=" + lugarNacimiento + ", fechaNacimiento="
				+ fechaNacimiento + ", direccion=" + direccion + ", telefono=" + telefono + ", puesto=" + puesto
				+ ", codDepartamento=" + codDepartamento + "]";
	}
}
