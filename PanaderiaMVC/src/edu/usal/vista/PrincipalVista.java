package edu.usal.vista;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import edu.usal.controlador.Cliente.Alta.BtnAltaClienteListener;
import edu.usal.controlador.Cliente.Baja.BtnBorrarClienteListener;
import edu.usal.controlador.Cliente.Listar.BtnListarClienteListener;
import edu.usal.controlador.Cliente.Modificar.BtnModificarClienteListener;
import edu.usal.controlador.Empleado.Alta.BtnAltaEmpleadoListener;
import edu.usal.controlador.Empleado.Baja.BtnBorrarEmpleadoListener;
import edu.usal.controlador.Empleado.Listar.BtnListarEmpleadoListener;
import edu.usal.controlador.Empleado.Modificar.BtnModificarEmpleadoListener;
import edu.usal.controlador.Producto.Alta.BtnAltaProductoListener;
import edu.usal.controlador.Producto.Baja.BtnBorrarProductoListener;
import edu.usal.controlador.Producto.Listar.BtnListarProductoListener;
import edu.usal.controlador.Producto.Modificar.BtnModificarProductoListener;
import edu.usal.controlador.Venta.Alta.BtnAltaVentaListener;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.SwingConstants;

public class PrincipalVista extends JPanel {

	public PrincipalVista() {
		setBackground(SystemColor.activeCaption);
		
		JLabel lblSeleccioneUnaOpcin = new JLabel("Seleccione una opci\u00F3n del men\u00FA de arriba para continuar...");
		lblSeleccioneUnaOpcin.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeleccioneUnaOpcin.setForeground(new Color(0, 51, 153));
		lblSeleccioneUnaOpcin.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblBienvenido = new JLabel("   Bienvenido! ");
		lblBienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenido.setForeground(new Color(0, 51, 153));
		
		lblBienvenido.setFont(new Font("Harlow Solid Italic", Font.ITALIC, 26));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(57)
					.addComponent(lblSeleccioneUnaOpcin, GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
					.addGap(48))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(240)
					.addComponent(lblBienvenido, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
					.addGap(247))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(85)
					.addComponent(lblBienvenido, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
					.addGap(68)
					.addComponent(lblSeleccioneUnaOpcin, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
					.addGap(201))
		);
		setLayout(groupLayout);

	}
	

}
