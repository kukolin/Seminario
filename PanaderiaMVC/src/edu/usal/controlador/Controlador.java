package edu.usal.controlador;

import java.io.IOException;
import java.sql.SQLException;

import edu.usal.controlador.Cliente.ItemsClienteListener;
import edu.usal.controlador.Cliente.Alta.BtnAltaClienteListener;
import edu.usal.controlador.Cliente.Alta.BtnEnviarAltaClienteListener;
import edu.usal.controlador.Cliente.Baja.BtnBorrarClienteListener;
import edu.usal.controlador.Cliente.Baja.BtnEnviarBorrarClienteListener;
import edu.usal.controlador.Cliente.Listar.BtnEnviarListarClienteListener;
import edu.usal.controlador.Cliente.Listar.BtnListarClienteListener;
import edu.usal.controlador.Cliente.Modificar.BtnEnviarModificarClienteListener;
import edu.usal.controlador.Cliente.Modificar.BtnModificarClienteListener;
import edu.usal.controlador.Cliente.Modificar.CompletarCamposClientes;
import edu.usal.controlador.Cliente.Modificar.ModificarClienteComboListener;
import edu.usal.controlador.Empleado.ItemsEmpleadoListener;
import edu.usal.controlador.Empleado.Alta.BtnAltaEmpleadoListener;
import edu.usal.controlador.Empleado.Alta.BtnEnviarAltaEmpleadoListener;
import edu.usal.controlador.Empleado.Baja.BtnBorrarEmpleadoListener;
import edu.usal.controlador.Empleado.Baja.BtnEnviarBorrarEmpleadoListener;
import edu.usal.controlador.Empleado.Listar.BtnEnviarListarEmpleadoListener;
import edu.usal.controlador.Empleado.Listar.BtnListarEmpleadoListener;
import edu.usal.controlador.Empleado.Modificar.BtnEnviarModificarEmpleadoListener;
import edu.usal.controlador.Empleado.Modificar.BtnModificarEmpleadoListener;
import edu.usal.controlador.Login.LoginControlador;
import edu.usal.controlador.Producto.Alta.BtnAltaProductoListener;
import edu.usal.controlador.Producto.Alta.BtnEnviarAltaProductoListener;
import edu.usal.controlador.Producto.Baja.BtnBorrarProductoListener;
import edu.usal.controlador.Producto.Baja.BtnEnviarBorrarProductoListener;
import edu.usal.controlador.Producto.Listar.BtnEnviarListarProductoListener;
import edu.usal.controlador.Producto.Listar.BtnListarProductoListener;
import edu.usal.controlador.Producto.Modificar.BtnEnviarModificarProductoListener;
import edu.usal.controlador.Producto.Modificar.BtnModificarProductoListener;
import edu.usal.controlador.Registrarse.BtnAltaUsuarioListener;
import edu.usal.controlador.Registrarse.BtnEnviarAltaUsuarioListener;
import edu.usal.controlador.Venta.Alta.BtnAltaVentaListener;
import edu.usal.controlador.Venta.Alta.BtnEnviarAltaVentaListener;
import edu.usal.dao.factory.UsuarioFactory;
import edu.usal.dao.interfaces.UsuarioInterfaz;

import edu.usal.vista.*;
import edu.usal.vista.Cliente.AltaClienteVista;
import edu.usal.vista.Cliente.BajaClienteVista;
import edu.usal.vista.Cliente.ListarClienteVista;
import edu.usal.vista.Cliente.ModificarClienteVista;
import edu.usal.vista.Empleado.AltaEmpleadoVista;
import edu.usal.vista.Empleado.BajaEmpleadoVista;
import edu.usal.vista.Empleado.ListarEmpleadoVista;
import edu.usal.vista.Empleado.ModificarEmpleadoVista;
import edu.usal.vista.Producto.AltaProductoVista;
import edu.usal.vista.Producto.BajaProductoVista;
import edu.usal.vista.Producto.ListarProductoVista;
import edu.usal.vista.Producto.ModificarProductoVista;
import edu.usal.vista.Venta.AltaVentaVista;

import javax.swing.JFrame;


public class Controlador extends JFrame {

	
	UsuarioInterfaz usuarioInterfaz;
	Mensajes mensaje;
	public static CompletarCamposClientes camposClientes;

	
	public static Frame frame;

	public static AltaClienteVista altaClienteVista;
	public static AltaEmpleadoVista altaEmpleadoVista;
	public static AltaProductoVista altaProductoVista;
	
	public static BajaProductoVista bajaProductoVista;
	public static BajaClienteVista bajaClienteVista;
	public static BajaEmpleadoVista bajaEmpleadoVista;
	
	public static ListarClienteVista listarClienteVista;
	public static ListarEmpleadoVista listarEmpleadoVista;
	public static ListarProductoVista listarProductoVista;
	
	public static ModificarClienteVista modificarClienteVista;
	public static ModificarEmpleadoVista modificarEmpleadoVista;
	public static ModificarProductoVista modificarProductoVista;
	
	public static AltaVentaVista altaVentaVista;
	
	public static RegistroVista registroVista;
	
	public Controlador(Frame frame) throws IOException, SQLException {
		
		usuarioInterfaz = UsuarioFactory.GetImplementation("MSSQL");
		
		
		altaClienteVista = new AltaClienteVista();
		altaClienteVista.addListener(new BtnEnviarAltaClienteListener());
		
		bajaClienteVista = new BajaClienteVista();
		bajaClienteVista.addListener(new BtnEnviarBorrarClienteListener());
		
		bajaEmpleadoVista = new BajaEmpleadoVista();
		bajaEmpleadoVista.addListener(new BtnEnviarBorrarEmpleadoListener());
		
		altaEmpleadoVista = new AltaEmpleadoVista();
		altaEmpleadoVista.addListener(new BtnEnviarAltaEmpleadoListener());
		
		altaProductoVista = new AltaProductoVista();
		altaProductoVista.addListener(new BtnEnviarAltaProductoListener());
		
		bajaProductoVista = new BajaProductoVista();
		bajaProductoVista.addListener(new BtnEnviarBorrarProductoListener());
		
		altaVentaVista = new AltaVentaVista();
		altaVentaVista.addListener(new BtnEnviarAltaVentaListener());
		
		registroVista = new RegistroVista();
		registroVista.addListener(new BtnEnviarAltaUsuarioListener());
		
		listarClienteVista = new ListarClienteVista();
		listarClienteVista.addListener(new BtnEnviarListarClienteListener());
		
		listarEmpleadoVista = new ListarEmpleadoVista();
		listarEmpleadoVista.addListener(new BtnEnviarListarEmpleadoListener());
		
		listarProductoVista = new ListarProductoVista();
		listarProductoVista.addListener(new BtnEnviarListarProductoListener());
		
		modificarClienteVista = new ModificarClienteVista();
		modificarClienteVista.addListenerComboBox(new ModificarClienteComboListener());
		modificarClienteVista.addListener(new BtnEnviarModificarClienteListener());
		
		modificarEmpleadoVista = new ModificarEmpleadoVista();
		modificarEmpleadoVista.addListener(new BtnEnviarModificarEmpleadoListener());
		
		modificarProductoVista = new ModificarProductoVista();
		modificarProductoVista.addListener(new BtnEnviarModificarProductoListener());
		
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
		
		this.frame.addActionListeners15(new BtnAltaUsuarioListener());
		
		
		
		
		
		
		mensaje = new Mensajes();
		
		

	}

	
}
	




