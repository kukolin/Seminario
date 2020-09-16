package edu.usal.controlador.Login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import edu.usal.controlador.Controlador;
import edu.usal.controlador.Cliente.Alta.BtnAltaClienteListener;
import edu.usal.controlador.Cliente.Baja.BtnBorrarClienteListener;
import edu.usal.controlador.Cliente.Listar.BtnListarClienteListener;
import edu.usal.controlador.Cliente.Modificar.BtnModificarClienteListener;
import edu.usal.controlador.Producto.Alta.BtnAltaProductoListener;
import edu.usal.controlador.Producto.Baja.BtnBorrarProductoListener;
import edu.usal.controlador.Producto.Listar.BtnListarProductoListener;
import edu.usal.controlador.Producto.Modificar.BtnModificarProductoListener;
import edu.usal.dao.factory.UsuarioFactory;
import edu.usal.dao.interfaces.UsuarioInterfaz;
import edu.usal.negocio.dominio.Usuario;
import edu.usal.vista.Frame;
import edu.usal.vista.PrincipalVista;

public class LoginControlador implements ActionListener{

	static UsuarioInterfaz usuarioInter;
	Frame frame;
	public static PrincipalVista principalVista;
	
	public LoginControlador() throws IOException{
		
		usuarioInter = UsuarioFactory.GetImplementation("MSSQL");
		principalVista = new PrincipalVista();
		frame = Controlador.frame;
		
		
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		try {
			
			String usu = frame.textPane.getText();
			String pass = frame.passwordField.getText();
			
			Usuario usuario = new Usuario(usu, pass);
			
			
			if(usuarioInter.verificarUsuario(usuario)) {
				
				frame.getContentPane().removeAll();
				frame.getContentPane().invalidate();
				frame.getContentPane().hide();
				frame.getContentPane().add(principalVista);			
				frame.getContentPane().validate();
				frame.getContentPane().setVisible(true);
				JOptionPane.showMessageDialog(null, "Login correcto.", "Warning", JOptionPane.WARNING_MESSAGE);
				
				principalVista.addActionListeners(new BtnAltaClienteListener());
				principalVista.addActionListeners2(new BtnListarClienteListener());
				principalVista.addActionListeners3(new BtnBorrarClienteListener());
				principalVista.addActionListeners4(new BtnModificarClienteListener());
				principalVista.addActionListeners5(new BtnAltaProductoListener());
				principalVista.addActionListeners6(new BtnListarProductoListener());
				principalVista.addActionListeners7(new BtnBorrarProductoListener());
				principalVista.addActionListeners8(new BtnModificarProductoListener());

				
			}
			
			else JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.", "Warning", JOptionPane.WARNING_MESSAGE);	
			
			
		} catch (NumberFormatException | SQLException | IOException e1) {
			e1.printStackTrace();
		}
	
}
	
	
	 	
}
