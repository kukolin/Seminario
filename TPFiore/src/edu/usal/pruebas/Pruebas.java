package edu.usal.pruebas;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

import org.omg.CORBA.PUBLIC_MEMBER;

import edu.usal.dao.factory.ClienteFactory;
import edu.usal.dao.factory.DetalleVentaFactory;
import edu.usal.dao.factory.EmpleadoFactory;
import edu.usal.dao.factory.ProductoFactory;
import edu.usal.dao.factory.VentaFactory;
import edu.usal.dao.interfaces.ClienteInterfaz;
import edu.usal.dao.interfaces.DetalleVentaInterfaz;
import edu.usal.dao.interfaces.EmpleadoInterfaz;
import edu.usal.dao.interfaces.ProductoInterfaz;
import edu.usal.dao.interfaces.VentaInterfaz;
import edu.usal.negocio.dominio.Cliente;
import edu.usal.negocio.dominio.DetalleVenta;
import edu.usal.negocio.dominio.Empleado;
import edu.usal.negocio.dominio.Producto;
import edu.usal.negocio.dominio.Venta;
	
	
public class Pruebas {
	
	static ClienteInterfaz clienteInterfaz;
	
	static ProductoInterfaz productoInterfaz;
	
	static VentaInterfaz ventaInterfaz;
	
	static DetalleVentaInterfaz detalleVentaInterfaz;
	
	static EmpleadoInterfaz empleadoInterfaz;
	
	public static void main (String args[]) throws SQLException, IOException {
	
	detalleVentaInterfaz = DetalleVentaFactory.GetImplementation("MSSQL");
	clienteInterfaz = ClienteFactory.GetImplementation("MSSQL");
	productoInterfaz = ProductoFactory.GetImplementation("MSSQL");
	ventaInterfaz = VentaFactory.GetImplementation("MSSQL");
	empleadoInterfaz = EmpleadoFactory.GetImplementation("MSSQL");
	
	
	System.out.print(ventaInterfaz.getUltimaVenta());

	
	
//	ArrayList<Empleado> al = new ArrayList<Empleado>();
//	al = empleadoInterfaz.listarEmpleados();
//	
//	for(int i=0; i< al.size() ; i++) {
//		
//		System.out.print(al.get(i).getNombre());
//		
//	}
	
	
	
	
//	DetalleVenta detalleVenta = new DetalleVenta(1,3,3,3);
//	
//	detalleVentaInterfaz.AltaDetalleVenta(detalleVenta);
	
	
	
//	Venta venta = new Venta(0, 2, 1);
	
//	ventaInterfaz.AltaVenta(venta);
	
//	BigDecimal bigDecimal = new BigDecimal(1);
//	
//	Producto producto = new Producto("dsasda", "asddsa", 3, 5, bigDecimal);
//	
//	productoInterfaz.AltaProducto(producto);
//	
//	
//	ArrayList<Producto> al = new ArrayList<Producto>();
//	al = productoInterfaz.ListarProducto();
//	
//	for(int i=0; i< al.size() ; i++) {
//		
//		System.out.print(al.get(i).getNombre());
//		
//	}
	
	
	
//	Date date = new Date(1123121321L);
//	
//	Cliente cliente = new Cliente(0, "Lucas", "Ane2", "a", "a", "a", 0, 0, date);
//	
//	clienteInterfaz.ModificarCliente(2002, cliente);
	
	
	
	
}}
