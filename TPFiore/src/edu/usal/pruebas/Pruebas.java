package edu.usal.pruebas;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

import org.omg.CORBA.PUBLIC_MEMBER;

import edu.usal.dao.factory.ClienteFactory;
import edu.usal.dao.factory.ProductoFactory;
import edu.usal.dao.interfaces.ClienteInterfaz;
import edu.usal.dao.interfaces.ProductoInterfaz;
import edu.usal.negocio.dominio.Cliente;
import edu.usal.negocio.dominio.Producto;


public class Pruebas {

	static ClienteInterfaz clienteInterfaz;
	
	static ProductoInterfaz productoInterfaz;
	
	
	public static void main (String args[]) throws SQLException, IOException {
		
		
	clienteInterfaz = ClienteFactory.GetImplementation("MSSQL");
	productoInterfaz = ProductoFactory.GetImplementation("MSSQL");
	
	BigDecimal bigDecimal = new BigDecimal(1);
	
	Producto producto = new Producto("dsa", "dsa", 3, 5, bigDecimal);
	
//	productoInterfaz.ModificarProducto(1, producto);
	
	
	ArrayList<Producto> al = new ArrayList<Producto>();
	al = productoInterfaz.ListarProducto();
	
	for(int i=0; i< al.size() ; i++) {
		
		System.out.print(al.get(i).getNombre());
		
	}
	
	
	
//	Date date = new Date(1123121321L);
//	
//	Cliente cliente = new Cliente(0, "Lucas", "Ane2", "a", "a", "a", 0, 0, date);
//	
//	clienteInterfaz.ModificarCliente(2002, cliente);
	
	
	
	
}}
