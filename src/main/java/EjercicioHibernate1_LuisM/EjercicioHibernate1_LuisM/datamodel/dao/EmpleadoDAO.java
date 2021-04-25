package EjercicioHibernate1_LuisM.EjercicioHibernate1_LuisM.datamodel.dao;

import java.util.Calendar;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import EjercicioHibernate1_LuisM.EjercicioHibernate1_LuisM.Main;
import EjercicioHibernate1_LuisM.EjercicioHibernate1_LuisM.datamodel.entities.Departamento;
import EjercicioHibernate1_LuisM.EjercicioHibernate1_LuisM.datamodel.entities.Empleado;

public class EmpleadoDAO {
	private static Logger logger = LogManager.getLogger(Main.class);
	
	/**Método que inserta un empleado en la BD*/
	public static void insertEmpleado(Session s, Empleado empleado) {
		
		s.save(empleado);
		logger.info("Empleado insertado. " + empleado.toString());
		
	}
	
	/**Método que devuelve una lista con todos los empleados*/
	public static List<Empleado> getAllEmpleados(Session s){
		String hQuery = "from Empleado";
		List<Empleado> listaEmpleados = s.createQuery(hQuery, Empleado.class)
				   	   			           	.list();
		return listaEmpleados;
	}
	
	/**Método que devuelve un empleado a través de su codigo*/
	public static Empleado getEmpleado(Session s, int codEmpleado) {
		String hQuery = " from Empleado e " +
                " where e.codigoEmpleado = :codEmpleado";
		
		Empleado empleado= s.createQuery(hQuery, Empleado.class)
									.setParameter("codEmpleado", codEmpleado)
									.setMaxResults(1)
									.uniqueResult();
		return empleado;
	}

	/**Método que devuelve una lista de empleados a través del codigo del departamento
	 * */
	public static List<Empleado> getEmpleados_Departamento(Session session, int codDepartamento) {
		String hQuery = " from Empleado e " +
                " where e.codDepartamento = :codDepartamento";
		
		List<Empleado> listaEmpleados = session.createQuery(hQuery, Empleado.class)
												.setParameter("codDepartamento", codDepartamento)
												.list();
		
		return listaEmpleados;
	}

	/**Devuelve una lista de todos los empleados mayores a una edad pasada por parametro*/
	public static List<Empleado> getAllEmpleadosEdad(Session session, int edad) {
		Criteria criteria = session.createCriteria(Empleado.class);
		
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);//Año actual
		logger.info("La edad de referencia: " + edad);
		
		String yearDiff = Integer.toString(year - edad);//Año en el que nacio
		
		logger.info("El de nacimiento es " + yearDiff);
		
		//Coge los dos últimos digitos y los añade a un String que pone el primer dia del primer mes
		String dateDiff = "01-01-" + yearDiff.substring(2);
		
		logger.info("Fecha de nacimiento es " + dateDiff);
		
		criteria.add(Restrictions.ge("fechaNacimiento", dateDiff));
		List<Empleado> empleados = criteria.list();
		
		return empleados;
	}
}
