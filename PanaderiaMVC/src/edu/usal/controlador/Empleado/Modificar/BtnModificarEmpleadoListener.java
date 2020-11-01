package edu.usal.controlador.Empleado.Modificar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import edu.usal.controlador.BtnVolver;
import edu.usal.controlador.Controlador;
import edu.usal.negocio.dominio.Empleado;
import edu.usal.vista.Frame;
import edu.usal.vista.Empleado.ModificarEmpleadoVista;

public class BtnModificarEmpleadoListener implements ActionListener{

	Frame frame;
	static ModificarEmpleadoVista modificarEmpleadoVista;
	CompletarCamposEmpleados completarCamposEmpleados;
	
	public BtnModificarEmpleadoListener() throws IOException, SQLException {
		frame = Controlador.frame;
		modificarEmpleadoVista = Controlador.modificarEmpleadoVista;
		completarCamposEmpleados = new CompletarCamposEmpleados();

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		frame.getContentPane().removeAll();
		frame.getContentPane().invalidate();
		frame.getContentPane().hide();
		frame.getContentPane().add(modificarEmpleadoVista);
		frame.getContentPane().validate();
		frame.getContentPane().setVisible(true);
		
		completarCamposEmpleados.completar(0);

		
			try {
				
				modificarEmpleadoVista.addListenerComboBox(new ModificarEmpleadoComboListener());
//				modificarEmpleadoVista.addListener(new BtnEnviarModificarEmpleadoListener());
				modificarEmpleadoVista.addListenerVolver(new BtnVolver());

			} catch (IOException e1) {
				
				e1.printStackTrace();
			}

		  
	}

}
