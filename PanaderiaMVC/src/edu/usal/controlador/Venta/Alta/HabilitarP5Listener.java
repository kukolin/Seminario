package edu.usal.controlador.Venta.Alta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.usal.vista.Venta.AltaVentaVista;

public class HabilitarP5Listener implements ActionListener{

	AltaVentaVista altaVentaVista;
	
	public HabilitarP5Listener() {

		altaVentaVista = BtnAltaVentaListener.altaVentaVista;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if(altaVentaVista.chckbxNewCheckBox_3.isSelected()) {
			
			altaVentaVista.comboBoxP5.setEnabled(true);
			altaVentaVista.spinner_4.setEnabled(true);
			
			
			
		}else {
			altaVentaVista.comboBoxP5.setEnabled(false);
			altaVentaVista.spinner_4.setEnabled(false);

		}
		
	}

}