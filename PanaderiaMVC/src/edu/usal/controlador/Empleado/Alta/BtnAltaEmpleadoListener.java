package edu.usal.controlador.Empleado.Alta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import edu.usal.controlador.BtnVolver;
import edu.usal.controlador.Controlador;
import edu.usal.vista.Empleado.AltaEmpleadoVista;
import edu.usal.vista.Frame;

public class BtnAltaEmpleadoListener implements ActionListener{
	
	
	Frame frame;
	public static AltaEmpleadoVista altaEmpleadoVista;
	
	public BtnAltaEmpleadoListener() throws IOException, SQLException {
		frame = Controlador.frame;
		altaEmpleadoVista = Controlador.altaEmpleadoVista;

	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		frame.getContentPane().removeAll();
		frame.getContentPane().invalidate();
		frame.getContentPane().hide();
		frame.getContentPane().add(altaEmpleadoVista);			
		frame.getContentPane().validate();
		frame.getContentPane().setVisible(true);
		
//			altaEmpleadoVista.addListener(new BtnEnviarAltaEmpleadoListener());
			altaEmpleadoVista.addListenerVolver(new BtnVolver());

		
		
	}

}
