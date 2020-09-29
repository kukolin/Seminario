package edu.usal.controlador.Venta.Alta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.usal.vista.Venta.AltaVentaVista;

public class HabilitarP4Listener implements ActionListener{

	AltaVentaVista altaVentaVista;
	
	public HabilitarP4Listener() {

		altaVentaVista = BtnAltaVentaListener.altaVentaVista;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if(altaVentaVista.chckbxNewCheckBox_2.isSelected()) {
			
			altaVentaVista.comboBoxP4.setEnabled(true);
			altaVentaVista.spinner_3.setEnabled(true);
			
			
			
		}else {
			altaVentaVista.comboBoxP4.setEnabled(false);
			altaVentaVista.spinner_3.setEnabled(false);

		}
		
	}

}
