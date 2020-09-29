package edu.usal.dao.factory;

import java.io.IOException;

import edu.usal.dao.interfaces.EmpleadoInterfaz;
import edu.usal.implementacion.EmpleadoImpl;

public class EmpleadoFactory {
	public static EmpleadoInterfaz GetImplementation(String source) throws IOException {
		
		if (source.equals("MSSQL")) {
			return new EmpleadoImpl();
		}
		else if(source.equals("MySQL")) {
			
			//return new SQLDAOMysql();
		}
		return null;
	}
}
