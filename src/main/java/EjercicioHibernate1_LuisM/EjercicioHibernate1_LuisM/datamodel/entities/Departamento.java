package EjercicioHibernate1_LuisM.EjercicioHibernate1_LuisM.datamodel.entities;

import java.io.Serializable;

public class Departamento implements Serializable{
	
	private int codigoDepartamento;
	private String nombreDepartamento;
	private int codResponsable;
	
	public Departamento() {
		
	}
	
	public Departamento(int codigoDepartamento, String nombreDepartamento, int codResponsable) {
		this.codigoDepartamento = codigoDepartamento;
		this.nombreDepartamento = nombreDepartamento;
		this.codResponsable = codResponsable;
	}

	public int getCodigoDepartamento() {
		return codigoDepartamento;
	}

	public void setCodigoDepartamento(int codigoDepartamento) {
		this.codigoDepartamento = codigoDepartamento;
	}

	public String getNombreDepartamento() {
		return nombreDepartamento;
	}

	public void setNombreDepartamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}

	public int getCodResponsable() {
		return codResponsable;
	}

	public void setCodResponsable(int codResponsable) {
		this.codResponsable = codResponsable;
	}
	
	@Override
	public String toString() {
		return "Departamento [codigoDepartamento=" + codigoDepartamento + ", nombreDepartamento=" + nombreDepartamento
				+ ", codResponsable=" + codResponsable + "]";
	}
}