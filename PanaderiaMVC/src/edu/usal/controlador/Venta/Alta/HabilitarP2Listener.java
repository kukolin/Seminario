package edu.usal.controlador.Venta.Alta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.usal.vista.Venta.AltaVentaVista;

public class HabilitarP2Listener implements ActionListener{

	AltaVentaVista altaVentaVista;
	
	public HabilitarP2Listener() {

		altaVentaVista = BtnAltaVentaListener.altaVentaVista;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if(altaVentaVista.chckbxNewCheckBox.isSelected()) {
			
			altaVentaVista.comboBoxP2.setEnabled(true);
			altaVentaVista.spinner_1.setEnabled(true);
			
			
			
		}else {
			altaVentaVista.comboBoxP2.setEnabled(false);
			altaVentaVista.spinner_1.setEnabled(false);

		}
		
	}

}
