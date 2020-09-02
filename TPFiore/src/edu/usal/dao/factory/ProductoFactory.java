package edu.usal.dao.factory;

import java.io.IOException;

import edu.usal.dao.interfaces.ProductoInterfaz;
import edu.usal.implementacion.ProductoImpl;


public class ProductoFactory {
	
public static ProductoInterfaz GetImplementation(String source) throws IOException {
		
		if (source.equals("MSSQL")) {
			return new ProductoImpl();
		}
		else if(source.equals("MySQL")) {
			
			//return new SQLDAOMysql();
		}
		return null;
	}

}
