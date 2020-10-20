package edu.usal.controlador.Empleado.Listar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import edu.usal.controlador.BtnVolver;
import edu.usal.controlador.Controlador;
import edu.usal.vista.Frame;
import edu.usal.vista.Empleado.ListarEmpleadoVista;

public class BtnListarEmpleadoListener implements ActionListener {

	Frame frame;
	static ListarEmpleadoVista listarEmpleadoVista;

	public BtnListarEmpleadoListener() throws IOException {
		frame = Controlador.frame;
		listarEmpleadoVista = new ListarEmpleadoVista();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		frame.getContentPane().removeAll();
		frame.getContentPane().invalidate();
		frame.getContentPane().hide();
		frame.getContentPane().add(listarEmpleadoVista);
		frame.getContentPane().validate();
		frame.getContentPane().setVisible(true);

		
		  try {
			listarEmpleadoVista.addListener(new BtnEnviarListarEmpleadoListener());
			listarEmpleadoVista.addListenerVolver(new BtnVolver());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		  
		 
	}

}
