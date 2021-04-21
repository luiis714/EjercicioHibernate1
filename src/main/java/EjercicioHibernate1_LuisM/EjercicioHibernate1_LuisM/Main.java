package EjercicioHibernate1_LuisM.EjercicioHibernate1_LuisM;

import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import EjercicioHibernate1_LuisM.EjercicioHibernate1_LuisM.datamodel.dao.EmpleadoDAO;
import EjercicioHibernate1_LuisM.EjercicioHibernate1_LuisM.datamodel.entities.Empleado;
import EjercicioHibernate1_LuisM.EjercicioHibernate1_LuisM.datamodel.util.HibernateUtil;

public class Main 
{
	private static final int LINEAS = 30;
	private static final int ERROR = -1;
	private static final int INSERT_EMPLEADO = 1;
	private static final int GET_EMPLEADO = 2;
	private static final int GET_EMPLEADO_ID = 3;
	private static final int INSERT_DEPARTAMENTO = 4;
	private static final int GET_DEPARTAMENTO = 5;
	private static final int GET_DEPARTAMENTO_ID = 6;
	private static final int SALIR = 7;
	
	private static Logger logger = LogManager.getLogger(Main.class);
	private static Scanner teclado = new Scanner(System.in);
	
	static SessionFactory sessionFactory;
	
    public static void main( String[] args )
    {
    	Session session = HibernateUtil.getSessionFactory().openSession();
    	System.out.println("Sesión iniciada");
    	logger.info("Sesion iniciada");
    	Transaction tx = null;
    	
    	try {
  		  // Las opereaciones save/update/delete
  			tx = session.beginTransaction();
  			
  			int opc = ERROR;
  			do {
  				limpia();
  				opc = mostrarMenu();
  				
  				switch(opc) {
  					case INSERT_EMPLEADO:
  						insertarEmpleado(session);
  						
  						break;
  					case GET_EMPLEADO:
  						
  						break;
  					case GET_EMPLEADO_ID:
  						
  						break;
  					case INSERT_DEPARTAMENTO:
  						
  						break;
  					case GET_DEPARTAMENTO:
  						
  						break;
  					case GET_DEPARTAMENTO_ID:
  						
  						break;
  					case SALIR:
  						System.out.println("Hasta pronto...");
  						break;
  					default:
  						System.out.println("No se reconoce la opción seleccionada.");
  				}
  				tx.commit();//Commit a la BD
  			}while(opc != SALIR);
  			
  		} catch (Exception e) {
  		  if (tx != null) {
  		    tx.rollback();
  		  }
  		  logger.error(String.format("%1$s: error when inserting registries.", Main.class.getSimpleName() + ".main()"), e);
  		}
  		finally {
  			if (session != null) {
  				session.close();
  				logger.info("Sesion cerrada");
  				System.out.println("Sesión cerrada");
  			}
  		}
    	
		//logger.info(String.format("%1$s: ---> %2$s.", methodName, modifiedProvider.toString()));
		session.close();
		logger.info("Sesion cerrada");
		System.out.println("Sesión cerrada");
		
		//logger.info(String.format("%1$s: >>>>>> Main execution finished.", methodName));
    }

	private static void insertarEmpleado(Session s) {
		limpia();
		Empleado empleado = new Empleado();
		
		System.out.println("Nombre: ");
		empleado.setNombreEmpleado(teclado.nextLine());
		System.out.println("Primer apellido: ");
		empleado.setApellido1(teclado.nextLine());
		System.out.println("Segundo apellido: ");
		empleado.setApellido2(teclado.nextLine());
		System.out.println("Lugar nacimiento: ");
		empleado.setLugarNacimiento(teclado.nextLine());
		System.out.println("Fecha nacimiento(YYYYMMDD): ");
		empleado.setFechaNacimiento(teclado.nextLine());
		System.out.println("Dirección: ");
		empleado.setDireccion(teclado.nextLine());
		System.out.println("Telefono: ");
		empleado.setTelefono(teclado.nextLine());
		System.out.println("Puesto: ");
		empleado.setPuesto(teclado.nextLine());
		System.out.println("Codigo departamento: ");
		empleado.setCodDepartamento(teclado.nextInt());
		
		logger.info("Empleado creado. " + empleado.toString());
		
		EmpleadoDAO.insertarEmpleado(s, empleado);
		
	}

	private static int mostrarMenu() {
		System.out.println(INSERT_EMPLEADO + ". Insertar un empleado");
		System.out.println(GET_EMPLEADO + ". Muestra todos los empleados");
		System.out.println(GET_EMPLEADO_ID + ". Muestra empleado por ID");
		System.out.println(INSERT_DEPARTAMENTO + ". Insertar un departamento");
		System.out.println(GET_DEPARTAMENTO + ". Muestra todos los departamentos");
		System.out.println(GET_DEPARTAMENTO_ID + ". Muestra departamento por ID");
		System.out.println(SALIR + ". Salir");
		
		System.out.print("Seleccione una opción:\t");
		int opc = teclado.nextInt();
		
		return opc;
	}
	
	/**Método que simula un borrado de pantalla en la consola*/
	private static void limpia() {
		System.out.println("Pulsa ENTER para continuar...");
		teclado.nextLine();
		
		for(short i = 0; i < LINEAS; i++)
			System.out.println("");
		
	}
}
