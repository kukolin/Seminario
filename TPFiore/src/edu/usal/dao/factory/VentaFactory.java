package edu.usal.dao.factory;

import java.io.IOException;

import edu.usal.dao.interfaces.VentaInterfaz;
import edu.usal.implementacion.VentaImpl;

public class VentaFactory {
	public static VentaInterfaz GetImplementation(String source) throws IOException {
		
		if (source.equals("MSSQL")) {
			return new VentaImpl();
		}
		else if(source.equals("MySQL")) {
			
			//return new SQLDAOMysql();
		}
		return null;
	}
	
}
