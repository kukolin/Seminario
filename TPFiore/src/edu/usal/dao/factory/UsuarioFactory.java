package edu.usal.dao.factory;

import java.io.IOException;

import edu.usal.dao.interfaces.UsuarioInterfaz;
import edu.usal.implementacion.UsuarioImpl;

public class UsuarioFactory {

	public static UsuarioInterfaz GetImplementation(String source) throws IOException {
		
		if (source.equals("MSSQL")) {
			return new UsuarioImpl();
		}
		else if(source.equals("MySQL")) {
			
			//return new SQLDAOMysql();
		}
		return null;
	}
	
	
	
}
