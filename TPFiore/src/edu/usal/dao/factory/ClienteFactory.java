package edu.usal.dao.factory;

import java.io.IOException;

import edu.usal.dao.interfaces.ClienteInterfaz;
import edu.usal.implementacion.ClienteImpl;

public class ClienteFactory {
	public static ClienteInterfaz GetImplementation(String source) throws IOException {
		
		if (source.equals("MSSQL")) {
			return new ClienteImpl();
		}
		else if(source.equals("MySQL")) {
			
			//return new SQLDAOMysql();
		}
		return null;
	}
	
	
}
