package EjercicioHibernate1_LuisM.EjercicioHibernate1_LuisM;

import java.util.Scanner;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import EjercicioHibernate1_LuisM.EjercicioHibernate1_LuisM.datamodel.dao.EmpleadoDAO;
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
    	Transaction tx = null;
    	
    	try {
  		  // Las opereaciones save/update/delete
  			tx = session.beginTransaction();
  			
  			int opc = ERROR;
  			do {
  				opc = mostrarMenu();
  				
  				switch(opc) {
  					case INSERT_EMPLEADO:
  						insertarEmpleado();
  						
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
  					default:
  						System.out.println("No se reconoce la opción seleccionada.");
  				}
  				
  				limpia();
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
  			}
  		}
    	
		//logger.info(String.format("%1$s: ---> %2$s.", methodName, modifiedProvider.toString()));
		session.close();
		
		//logger.info(String.format("%1$s: >>>>>> Main execution finished.", methodName));
    }

	private static void insertarEmpleado() {
		
	}

	private static int mostrarMenu() {
		System.out.println(INSERT_EMPLEADO + ". Insertar un empleado");
		System.out.println(GET_EMPLEADO + ". Insertar un empleado");
		System.out.println(GET_EMPLEADO_ID + ". Insertar un empleado");
		System.out.println(INSERT_DEPARTAMENTO + ". Insertar un empleado");
		System.out.println(GET_DEPARTAMENTO + ". Insertar un empleado");
		System.out.println(GET_DEPARTAMENTO_ID + ". Insertar un empleado");
		System.out.println(SALIR + ". Insertar un empleado");
		
		System.out.print("Seleccione una opción:\t");
		int opc = teclado.nextInt();
		
		return opc;
	}
	
	/**Método que simula un borrado de pantalla en la consola*/
	private static void limpia() {
		for(short i = 0; i < LINEAS; i++)
			System.out.println("");
		
		System.out.println("Pulsa ENTER para continuar...");
		teclado.next();
	}
}
