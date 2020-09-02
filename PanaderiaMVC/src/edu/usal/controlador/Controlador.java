package edu.usal.controlador;

import java.io.IOException;
import java.sql.SQLException;

import edu.usal.controlador.Login.LoginControlador;
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
		
		this.frame.addActionListeners(new LoginControlador(), new MenuListener());
	
		mensaje = new Mensajes();
		
		

	}

	
}
	




