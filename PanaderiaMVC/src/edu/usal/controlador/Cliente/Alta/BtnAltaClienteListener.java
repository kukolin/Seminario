package edu.usal.controlador.Cliente.Alta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import edu.usal.controlador.BtnVolver;
import edu.usal.controlador.Controlador;
import edu.usal.vista.Cliente.AltaClienteVista;
import edu.usal.vista.Frame;

public class BtnAltaClienteListener implements ActionListener{
	
	
	Frame frame;
	public static AltaClienteVista altaClienteVista;
	
	public BtnAltaClienteListener() throws IOException, SQLException {
		frame = Controlador.frame;
		altaClienteVista = Controlador.altaClienteVista;

	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		frame.getContentPane().removeAll();
		frame.getContentPane().invalidate();
		frame.getContentPane().hide();
		frame.getContentPane().add(altaClienteVista);			
		frame.getContentPane().validate();
		frame.getContentPane().setVisible(true);
		
//			altaClienteVista.addListener(new BtnEnviarAltaClienteListener());
			altaClienteVista.addListenerVolver(new BtnVolver());

		
		
	}

}
