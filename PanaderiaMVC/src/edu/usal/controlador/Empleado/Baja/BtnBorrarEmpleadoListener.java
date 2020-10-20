package edu.usal.controlador.Empleado.Baja;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

import edu.usal.controlador.BtnVolver;
import edu.usal.controlador.Controlador;
import edu.usal.vista.Empleado.BajaEmpleadoVista;
import edu.usal.vista.Frame;

public class BtnBorrarEmpleadoListener implements ActionListener{

	Frame frame;
	BajaEmpleadoVista bajaEmpleadoVista; 
	
	
	public BtnBorrarEmpleadoListener() throws IOException, SQLException {
		frame = Controlador.frame;
		bajaEmpleadoVista = new BajaEmpleadoVista();
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().invalidate();
		frame.getContentPane().hide();
		frame.getContentPane().add(bajaEmpleadoVista);			
		frame.getContentPane().validate();
		frame.getContentPane().setVisible(true);
		
		try {
			bajaEmpleadoVista.addListener(new BtnEnviarBorrarEmpleadoListener());
			bajaEmpleadoVista.addListenerVolver(new BtnVolver());
		} catch (IOException | SQLException e1) {
			e1.printStackTrace();
		}
		
		
	}

}
