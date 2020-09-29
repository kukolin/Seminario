package edu.usal.vista.Venta;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;


import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.LayoutStyle.ComponentPlacement;
import edu.usal.controlador.Cliente.ItemsClienteListener;
import edu.usal.controlador.Producto.ItemsProductoListener;
import edu.usal.controlador.Venta.Alta.HabilitarP2Listener;
import edu.usal.controlador.Empleado.ItemsEmpleadoListener;

import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;

public class AltaVentaVista extends JPanel {
	public JButton btnEnviar;
	public ButtonGroup grupo;
	public JButton btnVolver;
	public JLabel lblCliente;
	public JComboBox comboBoxEmpleado;
	public JComboBox comboBoxCliente;
	public JComboBox comboBoxP1;
	public JComboBox comboBoxP2;
	public JComboBox comboBoxP3;
	public JComboBox comboBoxP4;
	public JComboBox comboBoxP5;
	public JSpinner spinner;
	public JSpinner spinner_1;
	public JSpinner spinner_2;
	public JSpinner spinner_3;
	public JSpinner spinner_4;
	public JCheckBox chckbxNewCheckBox;
	public JCheckBox chckbxNewCheckBox_1;
	public JCheckBox chckbxNewCheckBox_2;
	public JCheckBox chckbxNewCheckBox_3;
	ItemsClienteListener itemsClienteListener;
	ItemsProductoListener itemsProductoListener;
	ItemsEmpleadoListener itemsEmpleadoListener;

	public AltaVentaVista() throws IOException, SQLException {
		setBackground(SystemColor.activeCaption);
		itemsClienteListener = new ItemsClienteListener();
		itemsEmpleadoListener = new ItemsEmpleadoListener();
		itemsProductoListener = new ItemsProductoListener();
		
		grupo = new ButtonGroup();
		btnEnviar = new JButton("Enviar");
		btnEnviar.setBackground(Color.BLACK);
		btnEnviar.setForeground(new Color(0, 51, 153));
		btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblEmpleado = new JLabel("Empleado:");
		lblEmpleado.setForeground(new Color(0, 51, 153));
		lblEmpleado.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		lblCliente = new JLabel("Cliente:");
		lblCliente.setForeground(new Color(0, 51, 153));
		lblCliente.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		comboBoxEmpleado = new JComboBox(itemsEmpleadoListener.valores());
		
		comboBoxCliente = new JComboBox(itemsClienteListener.valores());
		
		JLabel lblProducto = new JLabel("Producto 1:");
		lblProducto.setForeground(new Color(0, 51, 153));
		lblProducto.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		comboBoxP1 = new JComboBox(itemsProductoListener.valores());
		
		JLabel lblCantidad = new JLabel("Cantidad: ");
		lblCantidad.setForeground(new Color(0, 51, 153));
		lblCantidad.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		spinner = new JSpinner();
		
		JLabel lblProducto_1 = new JLabel("Producto 2:");
		lblProducto_1.setForeground(new Color(0, 51, 153));
		lblProducto_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		comboBoxP2 = new JComboBox(itemsProductoListener.valores());
		comboBoxP2.setEnabled(false);
		
		JLabel lblCantidad_1 = new JLabel("Cantidad: ");
		lblCantidad_1.setForeground(new Color(0, 51, 153));
		lblCantidad_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		spinner_1 = new JSpinner();
		spinner_1.setEnabled(false);
		
		JLabel lblProducto_2 = new JLabel("Producto 3:");
		lblProducto_2.setForeground(new Color(0, 51, 153));
		lblProducto_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		comboBoxP3 = new JComboBox(itemsProductoListener.valores());
		comboBoxP3.setEnabled(false);
		
		JLabel lblCantidad_2 = new JLabel("Cantidad: ");
		lblCantidad_2.setForeground(new Color(0, 51, 153));
		lblCantidad_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		spinner_2 = new JSpinner();
		spinner_2.setEnabled(false);
		
		JLabel lblProducto_3 = new JLabel("Producto 4:");
		lblProducto_3.setForeground(new Color(0, 51, 153));
		lblProducto_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		comboBoxP4 = new JComboBox(itemsProductoListener.valores());
		comboBoxP4.setEnabled(false);
		
		JLabel lblCantidad_3 = new JLabel("Cantidad: ");
		lblCantidad_3.setForeground(new Color(0, 51, 153));
		lblCantidad_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		spinner_3 = new JSpinner();
		spinner_3.setEnabled(false);
		
		JLabel lblProducto_4 = new JLabel("Producto 5:");
		lblProducto_4.setForeground(new Color(0, 51, 153));
		lblProducto_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		comboBoxP5 = new JComboBox(itemsProductoListener.valores());
		comboBoxP5.setEnabled(false);
		
		JLabel lblCantidad_4 = new JLabel("Cantidad: ");
		lblCantidad_4.setForeground(new Color(0, 51, 153));
		lblCantidad_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		spinner_4 = new JSpinner();
		spinner_4.setEnabled(false);
		
		chckbxNewCheckBox = new JCheckBox("Habilitar");
		chckbxNewCheckBox.setBackground(SystemColor.activeCaption);
		
		chckbxNewCheckBox_1 = new JCheckBox("Habilitar");
		chckbxNewCheckBox_1.setBackground(SystemColor.activeCaption);
		
		chckbxNewCheckBox_2 = new JCheckBox("Habilitar");
		chckbxNewCheckBox_2.setBackground(SystemColor.activeCaption);
		
		chckbxNewCheckBox_3 = new JCheckBox("Habilitar");
		chckbxNewCheckBox_3.setBackground(SystemColor.activeCaption);
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(541, Short.MAX_VALUE)
					.addComponent(btnVolver)
					.addGap(68))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(564, Short.MAX_VALUE)
					.addComponent(btnEnviar, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(20)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblProducto_4, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addGap(12)
							.addComponent(comboBoxP5, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
							.addGap(61)
							.addComponent(lblCantidad_4, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(spinner_4, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
							.addGap(12)
							.addComponent(chckbxNewCheckBox_3, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblProducto_1, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
									.addGap(12)
									.addComponent(comboBoxP2, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
									.addGap(59)
									.addComponent(lblCantidad_1, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(spinner_1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblProducto, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(comboBoxP1, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
									.addGap(59)
									.addComponent(lblCantidad, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(spinner, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblProducto_2, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
									.addGap(12)
									.addComponent(comboBoxP3, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
									.addGap(59)
									.addComponent(lblCantidad_2, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(spinner_2, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblProducto_3, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
									.addGap(12)
									.addComponent(comboBoxP4, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
									.addGap(59)
									.addComponent(lblCantidad_3, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(spinner_3, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(chckbxNewCheckBox_2, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
								.addComponent(chckbxNewCheckBox_1, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
								.addComponent(chckbxNewCheckBox)))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblCliente, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(comboBoxCliente, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblEmpleado, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(comboBoxEmpleado, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)))
					.addGap(29))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnVolver)
					.addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEmpleado, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(comboBoxEmpleado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCliente, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxCliente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(34)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblProducto, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(comboBoxP1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCantidad, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
						.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(5)
							.addComponent(lblProducto_1, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBoxP2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(5)
							.addComponent(lblCantidad_1, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(spinner_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(chckbxNewCheckBox)))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(5)
							.addComponent(lblProducto_2, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBoxP3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(5)
							.addComponent(lblCantidad_2, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(spinner_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(chckbxNewCheckBox_1)))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(5)
							.addComponent(lblProducto_3, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBoxP4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(5)
							.addComponent(lblCantidad_3, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(spinner_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(chckbxNewCheckBox_2)))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(chckbxNewCheckBox_3)
							.addComponent(spinner_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblCantidad_4, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(5)
							.addComponent(lblProducto_4, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBoxP5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(88)
					.addComponent(btnEnviar)
					.addContainerGap())
		);
		setLayout(groupLayout);
		
		
	}
	public void addListener(ActionListener al) {
		
		btnEnviar.addActionListener(al);
		
	}
	
	public void addListenerVolver(ActionListener al) {
		btnVolver.addActionListener(al);
	}
	public void addListenerHabilitarP2(ActionListener al) {
		chckbxNewCheckBox.addActionListener(al);
	}
	public void addListenerHabilitarP3(ActionListener al) {
		chckbxNewCheckBox_1.addActionListener(al);
	}
	public void addListenerHabilitarP4(ActionListener al) {
		chckbxNewCheckBox_2.addActionListener(al);
	}
	public void addListenerHabilitarP5(ActionListener al) {
		chckbxNewCheckBox_3.addActionListener(al);
	}
}
