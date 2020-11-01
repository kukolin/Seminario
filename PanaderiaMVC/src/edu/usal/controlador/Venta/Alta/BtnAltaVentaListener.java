package edu.usal.controlador.Venta.Alta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;


import edu.usal.controlador.BtnVolver;
import edu.usal.controlador.Controlador;
import edu.usal.vista.Venta.AltaVentaVista;
import edu.usal.vista.Frame;

public class BtnAltaVentaListener implements ActionListener{
	
	
	Frame frame;
	public static AltaVentaVista altaVentaVista;
	
	public BtnAltaVentaListener() throws IOException, SQLException {
		frame = Controlador.frame;
		altaVentaVista = Controlador.altaVentaVista;

	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		frame.getContentPane().removeAll();
		frame.getContentPane().invalidate();
		frame.getContentPane().hide();
		frame.getContentPane().add(altaVentaVista);			
		frame.getContentPane().validate();
		frame.getContentPane().setVisible(true);
		
//		altaVentaVista.addListener(new BtnEnviarAltaVentaListener());
		altaVentaVista.addListenerVolver(new BtnVolver());
		altaVentaVista.addListenerHabilitarP2(new HabilitarP2Listener());
		altaVentaVista.addListenerHabilitarP3(new HabilitarP3Listener());
		altaVentaVista.addListenerHabilitarP4(new HabilitarP4Listener());
		altaVentaVista.addListenerHabilitarP5(new HabilitarP5Listener());
		
	
		
		
	}

}
