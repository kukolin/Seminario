package edu.usal.controlador.Registrarse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import edu.usal.controlador.Controlador;
import edu.usal.dao.factory.UsuarioFactory;
import edu.usal.dao.interfaces.UsuarioInterfaz;
import edu.usal.negocio.dominio.Cliente;
import edu.usal.negocio.dominio.Usuario;
import edu.usal.vista.Mensajes;
import edu.usal.vista.RegistroVista;

public class BtnEnviarAltaUsuarioListener implements ActionListener{
	
	RegistroVista registroVista;
	UsuarioInterfaz UsuarioInterfaz;
	
	public BtnEnviarAltaUsuarioListener() throws IOException {
		registroVista = Controlador.registroVista;
		UsuarioInterfaz = UsuarioFactory.GetImplementation("MSSQL");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
			
			
			String nombre = registroVista.tNombre.getText();
			String password = registroVista.tPassword.getText();
			String password2 = registroVista.tPassword2.getText();
			
			if(password.equals(password2)) {
				
				if(!(password.equals("") || password2.equals("") || nombre.equals(""))) {	
					if(nombre.length() <11 || password.length() < 11) {
					
					JOptionPane.showMessageDialog(null, "Enviado.");
			
					Usuario usuario = new Usuario(nombre, password);	
					UsuarioInterfaz.AltaUsuario(usuario);
			
					}
					else {
						JOptionPane.showMessageDialog(null, "Máximo 10 caracteres.", "Warning", JOptionPane.WARNING_MESSAGE);
					}
				}else {
					JOptionPane.showMessageDialog(null, "Por favor, no deje campos vacíos.", "Warning", JOptionPane.WARNING_MESSAGE);
				}
			
			}
			else {
				JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden.", "Warning", JOptionPane.WARNING_MESSAGE);
			}
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}		
	}

}
