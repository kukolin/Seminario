package edu.usal.controlador.Producto;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import edu.usal.dao.factory.ProductoFactory;
import edu.usal.dao.interfaces.ProductoInterfaz;
import edu.usal.negocio.dominio.Producto;

public class ItemsProductoListener {

	static ProductoInterfaz ProductoImple;
	
	
	public static String[] valores() throws IOException, SQLException {
		
		ProductoImple = ProductoFactory.GetImplementation("MSSQL");
		ArrayList<Producto> al = new ArrayList<Producto>();
		al = ProductoImple.ListarProducto();
		ArrayList<String> al2 = new ArrayList<String>();
		for(int i=0;i<al.size();i++)
			al2.add(al.get(i).getNombre() + ", Cantidad: " + al.get(i).getCantidad());
		
		
		String[] al3 = al2.toArray(new String[al2.size()]);
		return al3;
			
	}
	
	
}
