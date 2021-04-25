package EjercicioHibernate1_LuisM.EjercicioHibernate1_LuisM.datamodel.entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="empleado")
public class Empleado implements Serializable{
	
	@Id
	@Column(name = "codigo")
	private int codigoEmpleado;
	
	@Column(name="nombre", nullable=false)
	private String nombreEmpleado;
	
	@Column(name="apellido1", nullable=false)
	private String apellido1;
	
	@Column(name="apellido2", nullable=false)
	private String apellido2;
	
	@Column(name="lugar_nacimiento", nullable=false)
	private String lugarNacimiento;
	
	@Column(name="fecha_nacimiento", nullable=false)
	private String fechaNacimiento;
	
	@Column(name="direccion", nullable=false)
	private String direccion;
	
	@Column(name="telefono", nullable=false)
	private String telefono;
	
	@Column(name="puesto", nullable=false)
	private String puesto;
	
	@Column(name="cod_departamento", nullable=false)
	private int codDepartamento;
	
	/**Constructor sin parametros*/
	public Empleado() {
		
	}
	
	/**Constructor con todos sus parametros*/
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
