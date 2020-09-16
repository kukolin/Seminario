package edu.usal.vista;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import edu.usal.controlador.Cliente.Alta.BtnAltaClienteListener;
import edu.usal.controlador.Cliente.Baja.BtnBorrarClienteListener;
import edu.usal.controlador.Cliente.Listar.BtnListarClienteListener;
import edu.usal.controlador.Cliente.Modificar.BtnModificarClienteListener;
import edu.usal.controlador.Producto.Alta.BtnAltaProductoListener;
import edu.usal.controlador.Producto.Baja.BtnBorrarProductoListener;
import edu.usal.controlador.Producto.Listar.BtnListarProductoListener;
import edu.usal.controlador.Producto.Modificar.BtnModificarProductoListener;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

public class PrincipalVista extends JPanel {
	public JButton btnAltaCliente;
	public JButton btnListarClientes;
	public JButton btnBorrarClientes;
	private JButton btnModificarClientes;
	private JButton btnAltaProducto;
	private JButton btnListarProducto;
	private JButton btnBorrarProducto;
	private JButton btnModificarProducto;

	public PrincipalVista() {
		setBackground(SystemColor.activeCaption);

		
		btnAltaCliente = new JButton("Alta Cliente");
		
		btnListarClientes = new JButton("Listar Clientes");
		
		btnBorrarClientes = new JButton("Eliminar Clientes");
		
		btnModificarClientes = new JButton("Modificar Clientes");
		
		btnAltaProducto = new JButton("Alta Producto");
		
		btnListarProducto = new JButton("Listar Productos");
		
		btnBorrarProducto = new JButton("Eliminar Producto");
		
		btnModificarProducto = new JButton("Modificar Producto");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(165)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnModificarClientes, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnModificarProducto, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnBorrarClientes, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnBorrarProducto, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btnAltaCliente, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnListarClientes, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnListarProducto, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnAltaProducto, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(257, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(111)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAltaCliente)
						.addComponent(btnAltaProducto))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnListarClientes)
						.addComponent(btnListarProducto))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnBorrarClientes)
						.addComponent(btnBorrarProducto))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnModificarClientes)
						.addComponent(btnModificarProducto))
					.addContainerGap(154, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
	
	public void addActionListeners(BtnAltaClienteListener btnAltaClienteListener) {
		btnAltaCliente.addActionListener(btnAltaClienteListener);		
	}
	public void addActionListeners2(BtnListarClienteListener btnListarClienteListener) {
		btnListarClientes.addActionListener(btnListarClienteListener);
	}
	public void addActionListeners3(BtnBorrarClienteListener btnBorrarClienteListener) {
		btnBorrarClientes.addActionListener(btnBorrarClienteListener);
	}
	public void addActionListeners4(BtnModificarClienteListener btnModificarClienteListener) {
		btnModificarClientes.addActionListener(btnModificarClienteListener);
	}
	public void addActionListeners5(BtnAltaProductoListener btnAltaProductoListener ) {
		btnAltaProducto.addActionListener(btnAltaProductoListener);
	}
	public void addActionListeners6(BtnListarProductoListener btnListarProductoListener ) {
		btnListarProducto.addActionListener(btnListarProductoListener);
	}
	public void addActionListeners7(BtnBorrarProductoListener btnBorrarProductoListener ) {
		btnBorrarProducto.addActionListener(btnBorrarProductoListener);
	}
	public void addActionListeners8(BtnModificarProductoListener btnModificarProductoListener ) {
		btnModificarProducto.addActionListener(btnModificarProductoListener);
	}
	
	
	
}
