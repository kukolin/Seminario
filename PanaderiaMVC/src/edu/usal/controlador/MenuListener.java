package edu.usal.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

import edu.usal.vista.AltaClienteVista;
import edu.usal.vista.Frame;
import edu.usal.vista.Mensajes;

public class MenuListener implements ActionListener{

	Frame frame;
	Mensajes mensaje;

	public MenuListener() throws IOException, SQLException {
		frame = Controlador.frame;
		mensaje = new Mensajes();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {


		if(arg0.getSource() == this.frame.mntmSalir) {
			System.exit(0);
		}
		
		if(arg0.getSource() == this.frame.mntmAcercaDe) {
		mensaje.AcercaDe();
		}
		
		if(arg0.getSource() == this.frame.mntmDesloguearse) {
			
			frame.getContentPane().removeAll();
			frame.getContentPane().invalidate();
			frame.getContentPane().hide();
			frame.getContentPane().add(frame.panel);			
			frame.getContentPane().validate();
			frame.getContentPane().setVisible(true);
			
			
			}
		
	}
	
	
	
}
