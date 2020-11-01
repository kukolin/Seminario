package edu.usal.controlador.Registrarse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;


import edu.usal.controlador.BtnVolver2;
import edu.usal.controlador.Controlador;
import edu.usal.vista.RegistroVista;
import edu.usal.vista.Frame;

public class BtnAltaUsuarioListener implements ActionListener{
	
	
	Frame frame;
	public static RegistroVista registroVista;
	
	public BtnAltaUsuarioListener() throws IOException, SQLException {
		frame = Controlador.frame;
		registroVista = Controlador.registroVista;

	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		frame.getContentPane().removeAll();
		frame.getContentPane().invalidate();
		frame.getContentPane().hide();
		frame.getContentPane().add(registroVista);			
		frame.getContentPane().validate();
		frame.getContentPane().setVisible(true);
		

//			registroVista.addListener(new BtnEnviarAltaUsuarioListener());
			registroVista.addListenerVolver(new BtnVolver2());

		
		
	}

}
