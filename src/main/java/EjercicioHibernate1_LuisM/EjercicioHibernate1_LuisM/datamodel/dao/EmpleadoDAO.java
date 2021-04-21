package EjercicioHibernate1_LuisM.EjercicioHibernate1_LuisM.datamodel.dao;

import java.util.List;

import org.hibernate.Session;

import EjercicioHibernate1_LuisM.EjercicioHibernate1_LuisM.datamodel.entities.Departamento;
import EjercicioHibernate1_LuisM.EjercicioHibernate1_LuisM.datamodel.entities.Empleado;

public class EmpleadoDAO {
	
	public static void insertarEmpleado(Session s, Empleado empleado) {
		s.save(empleado);
	}
	
	public static List<Empleado> getAllEmpleados(Session s){
		String hQuery = "from empleado";
		List<Empleado> listaEmpleados = s.createQuery(hQuery, Empleado.class)
				   	   			           	.list();
		return listaEmpleados;
	}
	
	public static Empleado getEmpleado(Session s, int codEmpleado) {
		String hQuery = " from Empleado e " +
                " where e.codigo = :codEmpleado";
		
		Empleado empleado= s.createQuery(hQuery, Empleado.class)
									.setParameter("codEmpleado", codEmpleado)
									.setMaxResults(1)
									.uniqueResult();
		return empleado;
	}
}
