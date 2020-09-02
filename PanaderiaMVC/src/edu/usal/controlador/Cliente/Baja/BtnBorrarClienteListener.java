package edu.usal.controlador.Cliente.Baja;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

import edu.usal.controlador.BtnVolver;
import edu.usal.controlador.Controlador;
import edu.usal.vista.AltaClienteVista;
import edu.usal.vista.BajaClienteVista;
import edu.usal.vista.Frame;

public class BtnBorrarClienteListener implements ActionListener{

	Frame frame;
	BajaClienteVista bajaClienteVista; 
	
	
	public BtnBorrarClienteListener() throws IOException, SQLException {
		frame = Controlador.frame;
		bajaClienteVista = new BajaClienteVista();
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().invalidate();
		frame.getContentPane().hide();
		frame.getContentPane().add(bajaClienteVista);			
		frame.getContentPane().validate();
		frame.getContentPane().setVisible(true);
		
		try {
			bajaClienteVista.addListener(new BtnEnviarBorrarClienteListener());
			bajaClienteVista.addListenerVolver(new BtnVolver());
		} catch (IOException | SQLException e1) {
			e1.printStackTrace();
		}
		
		
	}

}
