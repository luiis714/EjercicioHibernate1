package EjercicioHibernate1_LuisM.EjercicioHibernate1_LuisM.datamodel.dao;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.Session;

import EjercicioHibernate1_LuisM.EjercicioHibernate1_LuisM.Main;
import EjercicioHibernate1_LuisM.EjercicioHibernate1_LuisM.datamodel.entities.Departamento;
import EjercicioHibernate1_LuisM.EjercicioHibernate1_LuisM.datamodel.entities.Empleado;

public class EmpleadoDAO {
	private static Logger logger = LogManager.getLogger(Main.class);
	
	public static void insertarEmpleado(Session s, Empleado empleado) {
		s.save(empleado);
		logger.info("Empleado insertado. " + empleado.toString());
		
	}
	
	public static List<Empleado> getAllEmpleados(Session s){
		String hQuery = "from Empleado";
		List<Empleado> listaEmpleados = s.createQuery(hQuery, Empleado.class)
				   	   			           	.list();
		return listaEmpleados;
	}
	
	public static Empleado getEmpleado(Session s, int codEmpleado) {
		String hQuery = " from Empleado e " +
                " where e.codigoEmpleado = :codEmpleado";
		
		Empleado empleado= s.createQuery(hQuery, Empleado.class)
									.setParameter("codEmpleado", codEmpleado)
									.setMaxResults(1)
									.uniqueResult();
		return empleado;
	}
}
