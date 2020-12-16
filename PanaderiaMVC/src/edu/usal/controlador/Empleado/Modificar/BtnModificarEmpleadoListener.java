package edu.usal.controlador.Empleado.Modificar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import edu.usal.controlador.BtnVolver;
import edu.usal.controlador.Controlador;
import edu.usal.controlador.Empleado.ItemsEmpleadoListener;
import edu.usal.negocio.dominio.Empleado;
import edu.usal.vista.Frame;
import edu.usal.vista.Empleado.ModificarEmpleadoVista;

public class BtnModificarEmpleadoListener implements ActionListener{

	Frame frame;
	static ModificarEmpleadoVista modificarEmpleadoVista;
	CompletarCamposEmpleados completarCamposEmpleados;
	ItemsEmpleadoListener itemsEmpleadoListener;
	
	public BtnModificarEmpleadoListener() throws IOException, SQLException {
		frame = Controlador.frame;
		modificarEmpleadoVista = Controlador.modificarEmpleadoVista;
		completarCamposEmpleados = new CompletarCamposEmpleados();
		itemsEmpleadoListener = new ItemsEmpleadoListener();
		

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
			try {
				String[] hola = itemsEmpleadoListener.valores();
				
				modificarEmpleadoVista.comboBox.removeAllItems();
				
				for(int i=0;i<hola.length;i++) {
					modificarEmpleadoVista.comboBox.addItem(hola[i]);
				}
			} catch (IOException | SQLException e1) {
			}
		  
	}

}
