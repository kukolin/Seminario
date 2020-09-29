package edu.usal.dao.factory;

import java.io.IOException;

import edu.usal.dao.interfaces.DetalleVentaInterfaz;
import edu.usal.implementacion.DetalleVentaImpl;

public class DetalleVentaFactory {
	
	public static DetalleVentaInterfaz GetImplementation(String source) throws IOException {
		
		if (source.equals("MSSQL")) {
			return new DetalleVentaImpl();
		}
		else if(source.equals("MySQL")) {
			
			//return new SQLDAOMysql();
		}
		return null;
	}
	
}
