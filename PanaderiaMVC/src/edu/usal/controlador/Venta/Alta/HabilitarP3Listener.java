package edu.usal.controlador.Venta.Alta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.usal.vista.Venta.AltaVentaVista;

public class HabilitarP3Listener implements ActionListener{

	AltaVentaVista altaVentaVista;
	
	public HabilitarP3Listener() {

		altaVentaVista = BtnAltaVentaListener.altaVentaVista;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if(altaVentaVista.chckbxNewCheckBox_1.isSelected()) {
			
			altaVentaVista.comboBoxP3.setEnabled(true);
			altaVentaVista.spinner_2.setEnabled(true);
			
			
			
		}else {
			altaVentaVista.comboBoxP3.setEnabled(false);
			altaVentaVista.spinner_2.setEnabled(false);

		}
		
	}

}