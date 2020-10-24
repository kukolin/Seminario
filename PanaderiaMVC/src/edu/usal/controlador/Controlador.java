package edu.usal.controlador;

import java.io.IOException;
import java.sql.SQLException;

import edu.usal.controlador.Cliente.Alta.BtnAltaClienteListener;
import edu.usal.controlador.Cliente.Baja.BtnBorrarClienteListener;
import edu.usal.controlador.Cliente.Listar.BtnListarClienteListener;
import edu.usal.controlador.Cliente.Modificar.BtnModificarClienteListener;
import edu.usal.controlador.Empleado.Alta.BtnAltaEmpleadoListener;
import edu.usal.controlador.Empleado.Baja.BtnBorrarEmpleadoListener;
import edu.usal.controlador.Empleado.Listar.BtnListarEmpleadoListener;
import edu.usal.controlador.Empleado.Modificar.BtnModificarEmpleadoListener;
import edu.usal.controlador.Login.LoginControlador;
import edu.usal.controlador.Producto.Alta.BtnAltaProductoListener;
import edu.usal.controlador.Producto.Baja.BtnBorrarProductoListener;
import edu.usal.controlador.Producto.Listar.BtnListarProductoListener;
import edu.usal.controlador.Producto.Modificar.BtnModificarProductoListener;
import edu.usal.controlador.Venta.Alta.BtnAltaVentaListener;
import edu.usal.dao.factory.UsuarioFactory;
import edu.usal.dao.interfaces.UsuarioInterfaz;

import edu.usal.vista.*;

import javax.swing.JFrame;


public class Controlador extends JFrame {

	
	UsuarioInterfaz usuarioInterfaz;
	Mensajes mensaje;
	
	
	public static Frame frame;
	
	public Controlador(Frame frame) throws IOException, SQLException {
		
		usuarioInterfaz = UsuarioFactory.GetImplementation("MSSQL");
		
		this.frame = frame;
		
		this.frame.addActionListener(new LoginControlador(), new MenuListener());
		
		this.frame.addActionListeners(new BtnAltaClienteListener());
		this.frame.addActionListeners2(new BtnListarClienteListener());
		this.frame.addActionListeners3(new BtnBorrarClienteListener());
		this.frame.addActionListeners4(new BtnModificarClienteListener());
		
		this.frame.addActionListeners5(new BtnAltaProductoListener());
		this.frame.addActionListeners6(new BtnListarProductoListener());
		this.frame.addActionListeners7(new BtnBorrarProductoListener());
		this.frame.addActionListeners8(new BtnModificarProductoListener());
		
		this.frame.addActionListeners9(new BtnAltaVentaListener());
	//	principalVista.addActionListeners10(asd);
		
		this.frame.addActionListeners11(new BtnAltaEmpleadoListener());
		this.frame.addActionListeners12(new BtnListarEmpleadoListener());
		this.frame.addActionListeners13(new BtnBorrarEmpleadoListener());
		this.frame.addActionListeners14(new BtnModificarEmpleadoListener());
		
		
		
		
		
		
		mensaje = new Mensajes();
		
		

	}

	
}
	




