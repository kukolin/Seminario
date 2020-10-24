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

public class PrincipalVistaBackUp extends JPanel {
	public JButton btnAltaCliente;
	public JButton btnListarClientes;
	public JButton btnBorrarClientes;
	public JButton btnModificarClientes;
	public JButton btnAltaProducto;
	public JButton btnListarProducto;
	public JButton btnBorrarProducto;
	public JButton btnModificarProducto;
	public JButton btnAltaVenta;
	public JButton btnListarVentas;
	public JButton btnAltaEmpleado;
	public JButton btnListarEmpleado;
	public JButton btnBorrarEmpleado;
	public JButton btnModificarEmpleado;

	public PrincipalVistaBackUp() {
		setBackground(SystemColor.activeCaption);
		
		btnAltaCliente = new JButton("Alta Cliente");
		
		btnListarClientes = new JButton("Listar Clientes");
		
		btnBorrarClientes = new JButton("Eliminar Clientes");
		
		btnModificarClientes = new JButton("Modificar Clientes");
		
		btnAltaProducto = new JButton("Alta Producto");
		
		btnListarProducto = new JButton("Listar Productos");
		
		btnBorrarProducto = new JButton("Eliminar Producto");
		
		btnModificarProducto = new JButton("Modificar Producto");
		
		btnAltaVenta = new JButton("Alta Venta");
		
		btnListarVentas = new JButton("Listar Ventas");
		
		btnModificarEmpleado = new JButton("Modificar Empleado");
		
		btnBorrarEmpleado = new JButton("Eliminar Empleado");
		
		btnListarEmpleado = new JButton("Listar Empleado");
		
		btnAltaEmpleado = new JButton("Alta Empleado");
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
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnListarProducto, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(btnListarVentas, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnAltaProducto, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(btnAltaVenta, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)))))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnAltaEmpleado, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnListarEmpleado, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBorrarEmpleado, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnModificarEmpleado, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(115, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(111)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnAltaEmpleado)
							.addGap(18)
							.addComponent(btnListarEmpleado)
							.addGap(18)
							.addComponent(btnBorrarEmpleado)
							.addGap(13)
							.addComponent(btnModificarEmpleado))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnAltaCliente)
								.addComponent(btnAltaProducto)
								.addComponent(btnAltaVenta))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnListarClientes)
								.addComponent(btnListarProducto)
								.addComponent(btnListarVentas))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnBorrarClientes)
								.addComponent(btnBorrarProducto))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnModificarClientes)
								.addComponent(btnModificarProducto)))))
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
	public void addActionListeners9(BtnAltaVentaListener btnAltaVentaListener ) {
		btnAltaVenta.addActionListener(btnAltaVentaListener);
	}
//	public void addActionListeners10(BtnListarVentaListener asd) {
//		btnAltaVenta.addActionListener(asd);
//	}
	public void addActionListeners11(BtnAltaEmpleadoListener btnAltaEmpleadoListener ) {
		btnAltaEmpleado.addActionListener(btnAltaEmpleadoListener);
	}

	public void addActionListeners12(BtnListarEmpleadoListener btnListarEmpleadoListener) {
		btnListarEmpleado.addActionListener(btnListarEmpleadoListener);
	}

	public void addActionListeners13(BtnBorrarEmpleadoListener btnBorrarEmpleadoListener) {
		btnBorrarEmpleado.addActionListener(btnBorrarEmpleadoListener);
	}

	public void addActionListeners14(BtnModificarEmpleadoListener btnModificarEmpleadoListener) {
		btnModificarEmpleado.addActionListener(btnModificarEmpleadoListener);		
	}
}
