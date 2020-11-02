package edu.usal.controlador.Venta.Alta;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

import edu.usal.controlador.Controlador;
import edu.usal.dao.factory.ClienteFactory;
import edu.usal.dao.factory.DetalleVentaFactory;
import edu.usal.dao.factory.EmpleadoFactory;
import edu.usal.dao.factory.ProductoFactory;
import edu.usal.dao.factory.VentaFactory;
import edu.usal.dao.interfaces.ClienteInterfaz;
import edu.usal.dao.interfaces.DetalleVentaInterfaz;
import edu.usal.dao.interfaces.EmpleadoInterfaz;
import edu.usal.dao.interfaces.ProductoInterfaz;
import edu.usal.dao.interfaces.VentaInterfaz;
import edu.usal.negocio.dominio.Cliente;
import edu.usal.negocio.dominio.DetalleVenta;
import edu.usal.negocio.dominio.Empleado;
import edu.usal.negocio.dominio.Producto;
import edu.usal.negocio.dominio.Venta;
import edu.usal.vista.Venta.AltaVentaVista;
import edu.usal.vista.Mensajes;

public class BtnEnviarAltaVentaListener implements ActionListener{
	
	AltaVentaVista altaVentaVista;
	EmpleadoInterfaz empleadoInterfaz;
	VentaInterfaz ventaInterfaz;
	ClienteInterfaz clienteInterfaz;
	ProductoInterfaz productoInterfaz;
	DetalleVentaInterfaz detalleVentaInterfaz;
	
	public BtnEnviarAltaVentaListener() throws IOException {
		altaVentaVista = Controlador.altaVentaVista;
		ventaInterfaz = VentaFactory.GetImplementation("MSSQL");
		empleadoInterfaz = EmpleadoFactory.GetImplementation("MSSQL");
		clienteInterfaz = ClienteFactory.GetImplementation("MSSQL");
		productoInterfaz = ProductoFactory.GetImplementation("MSSQL");
		detalleVentaInterfaz = DetalleVentaFactory.GetImplementation("MSSQL");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	
		try {
			
			//PARA EMPLEADOS
			
			ArrayList<Empleado> alEmpleado= new ArrayList<Empleado>();
			
			try {
				alEmpleado = empleadoInterfaz.listarEmpleados();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
			int idSelecEmpleado = alEmpleado.get(altaVentaVista.comboBoxEmpleado.getSelectedIndex()).getId();

			
			//PARA CLIENTES
			
			ArrayList<Cliente> alCliente= new ArrayList<Cliente>();
			
			try {
				alCliente = clienteInterfaz.ListarClientes();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
			int idSelecCliente = alCliente.get(altaVentaVista.comboBoxCliente.getSelectedIndex()).getIdCliente();

// -------------------------------------------------------	

			//PARA PRODUCTOS 1 
			
			ArrayList<Producto> alProducto1= new ArrayList<Producto>();
			
			try {
				alProducto1 = productoInterfaz.ListarProducto();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
			int idSelecProducto1 = alProducto1.get(altaVentaVista.comboBoxP1.getSelectedIndex()).getIdProducto();	
			int cantidadP1 = (int) altaVentaVista.spinner.getValue();
			BigDecimal precioP1 = alProducto1.get(altaVentaVista.comboBoxP1.getSelectedIndex()).getPrecio();

// -------------------------------------------------------	


			//PARA PRODUCTOS 2
			
			ArrayList<Producto> alProducto2= new ArrayList<Producto>();
			
			try {
				alProducto2 = productoInterfaz.ListarProducto();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
			int idSelecProducto2 = alProducto2.get(altaVentaVista.comboBoxP2.getSelectedIndex()).getIdProducto();
			int cantidadP2 = (int) altaVentaVista.spinner_1.getValue();
			BigDecimal precioP2 = alProducto2.get(altaVentaVista.comboBoxP2.getSelectedIndex()).getPrecio();

			
// -------------------------------------------------------	
			
			//PARA PRODUCTOS 3
			
			ArrayList<Producto> alProducto3= new ArrayList<Producto>();
			
			try {
				alProducto3 = productoInterfaz.ListarProducto();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
			int idSelecProducto3 = alProducto3.get(altaVentaVista.comboBoxP3.getSelectedIndex()).getIdProducto();
			int cantidadP3 = (int) altaVentaVista.spinner_2.getValue();
			BigDecimal precioP3 = alProducto3.get(altaVentaVista.comboBoxP3.getSelectedIndex()).getPrecio();

		
			
// -------------------------------------------------------	
			
			//PARA PRODUCTOS 4
			
			ArrayList<Producto> alProducto4= new ArrayList<Producto>();
			
			try {
				alProducto4 = productoInterfaz.ListarProducto();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
			int idSelecProducto4 = alProducto4.get(altaVentaVista.comboBoxP4.getSelectedIndex()).getIdProducto();
			int cantidadP4 = (int) altaVentaVista.spinner_3.getValue();
			BigDecimal precioP4 = alProducto4.get(altaVentaVista.comboBoxP4.getSelectedIndex()).getPrecio();

		
			
// -------------------------------------------------------	
			
			//PARA PRODUCTOS 5
			
			ArrayList<Producto> alProducto5= new ArrayList<Producto>();
			
			try {
				alProducto5 = productoInterfaz.ListarProducto();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
			int idSelecProducto5 = alProducto5.get(altaVentaVista.comboBoxP5.getSelectedIndex()).getIdProducto();
			int cantidadP5 = (int) altaVentaVista.spinner_4.getValue();
			BigDecimal precioP5 = alProducto5.get(altaVentaVista.comboBoxP5.getSelectedIndex()).getPrecio();

		
			
// -------------------------------------------------------	
			
			//Aca se suma el total de la compra, se va sumando solo si esta seleccionado, multiplicado la cantidad.
			BigDecimal total = precioP1.multiply(BigDecimal.valueOf(cantidadP1));
			
			if(altaVentaVista.chckbxNewCheckBox.isSelected()) total = total.add(precioP2.multiply(BigDecimal.valueOf(cantidadP2)));		
			if(altaVentaVista.chckbxNewCheckBox_1.isSelected()) total = total.add(precioP3.multiply(BigDecimal.valueOf(cantidadP3)));
			if(altaVentaVista.chckbxNewCheckBox_2.isSelected()) total = total.add(precioP4.multiply(BigDecimal.valueOf(cantidadP4)));
			if(altaVentaVista.chckbxNewCheckBox_3.isSelected()) total = total.add(precioP2.multiply(BigDecimal.valueOf(cantidadP5)));
				
			
			//Se verifica que no haya 2 productos iguales seleccionados
			if(verificarProductosRepetidos()) {
			
			//Se verifica que la cantidad pedida no supere el stock
			if(cantidadP1 > alProducto1.get(altaVentaVista.comboBoxP1.getSelectedIndex()).getCantidad()
			||	cantidadP2 > alProducto2.get(altaVentaVista.comboBoxP2.getSelectedIndex()).getCantidad()	
			||	cantidadP3 > alProducto3.get(altaVentaVista.comboBoxP3.getSelectedIndex()).getCantidad()	
			||	cantidadP4 > alProducto4.get(altaVentaVista.comboBoxP4.getSelectedIndex()).getCantidad()
			|| 	cantidadP5 > alProducto5.get(altaVentaVista.comboBoxP5.getSelectedIndex()).getCantidad()
			){
				
			JOptionPane.showMessageDialog(null, "La cantidad solicitada no puede superar el stock!");
			
			}
			else
			{
				Venta venta = new Venta(0, idSelecCliente, idSelecEmpleado, total);
				
				ventaInterfaz.AltaVenta(venta);
				
				int ultimaVenta = ventaInterfaz.getUltimaVenta();
				
				DetalleVenta detalleVenta1 = new DetalleVenta(0, ultimaVenta, idSelecProducto1, cantidadP1);
				DetalleVenta detalleVenta2 = new DetalleVenta(0, ultimaVenta, idSelecProducto2, cantidadP2);
				DetalleVenta detalleVenta3 = new DetalleVenta(0, ultimaVenta, idSelecProducto3, cantidadP3);
				DetalleVenta detalleVenta4 = new DetalleVenta(0, ultimaVenta, idSelecProducto4, cantidadP4);
				DetalleVenta detalleVenta5 = new DetalleVenta(0, ultimaVenta, idSelecProducto5, cantidadP5);
				
			//El primero lo envia siempre, el resto verifica que esten tildados y la cantidad mayor a 0
				
			if(checkearCantidadCero(cantidadP1)) {
			detalleVentaInterfaz.AltaDetalleVenta(detalleVenta1);
			productoInterfaz.RestarStock(idSelecProducto1, cantidadP1);}

			if(altaVentaVista.chckbxNewCheckBox.isSelected() && checkearCantidadCero(cantidadP2)) {
			detalleVentaInterfaz.AltaDetalleVenta(detalleVenta2);
			productoInterfaz.RestarStock(idSelecProducto2, cantidadP2);}
			
			if(altaVentaVista.chckbxNewCheckBox_1.isSelected() && checkearCantidadCero(cantidadP3)) {
			detalleVentaInterfaz.AltaDetalleVenta(detalleVenta3);
			productoInterfaz.RestarStock(idSelecProducto3, cantidadP3);}
			
			if(altaVentaVista.chckbxNewCheckBox_2.isSelected() && checkearCantidadCero(cantidadP4)) {
			detalleVentaInterfaz.AltaDetalleVenta(detalleVenta4);
			productoInterfaz.RestarStock(idSelecProducto4, cantidadP4);}
			
			if(altaVentaVista.chckbxNewCheckBox_3.isSelected() && checkearCantidadCero(cantidadP5)) {
			detalleVentaInterfaz.AltaDetalleVenta(detalleVenta5);
			productoInterfaz.RestarStock(idSelecProducto5, cantidadP5);}
			
			String totalString = total.toString();
			
			if (total.compareTo(BigDecimal.ZERO) > 0)
			JOptionPane.showMessageDialog(null, "Enviado. El total es de $" + totalString.substring(0, totalString.length() - 2) + " pesos.");
			
			}
			}
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		
	}
	public boolean checkearCantidadCero(int cantidad) {
		if (cantidad > 0) {return true;}
		else {
			JOptionPane.showMessageDialog(null, "La cantidad solicitada no puede ser menor o igual a 0!");
			return false;
		}
		
	}
	public boolean verificarProductosRepetidos() {
		
		boolean s2 = altaVentaVista.chckbxNewCheckBox.isSelected();
		boolean s3 = altaVentaVista.chckbxNewCheckBox_1.isSelected();
		boolean s4 = altaVentaVista.chckbxNewCheckBox_2.isSelected();
		boolean s5 = altaVentaVista.chckbxNewCheckBox_3.isSelected();

		if(s2 && altaVentaVista.comboBoxP1.getSelectedIndex() == altaVentaVista.comboBoxP2.getSelectedIndex()) {
			JOptionPane.showMessageDialog(null, "Producto 1 y 2 son iguales!");
			return false;
		}
		if(s3 && altaVentaVista.comboBoxP1.getSelectedIndex() == altaVentaVista.comboBoxP3.getSelectedIndex()) {
			JOptionPane.showMessageDialog(null, "Producto 1 y 3 son iguales!");
			return false;
		}
		if(s4 && altaVentaVista.comboBoxP1.getSelectedIndex() == altaVentaVista.comboBoxP4.getSelectedIndex()) {
			JOptionPane.showMessageDialog(null, "Producto 1 y 4son iguales!");
			return false;
		}
		if(s5 && altaVentaVista.comboBoxP1.getSelectedIndex() == altaVentaVista.comboBoxP5.getSelectedIndex()) {
			JOptionPane.showMessageDialog(null, "Producto 1 y 5 son iguales!");
			return false;
		}
		if(s2 && s3 && altaVentaVista.comboBoxP2.getSelectedIndex() == altaVentaVista.comboBoxP3.getSelectedIndex()) {
			JOptionPane.showMessageDialog(null, "Producto 2 y 3 son iguales!");
			return false;
		}
		if(s2 && s4 && altaVentaVista.comboBoxP2.getSelectedIndex() == altaVentaVista.comboBoxP4.getSelectedIndex()) {
			JOptionPane.showMessageDialog(null, "Producto 2 y 4 son iguales!");
			return false;
		}		
		if(s2 && s5 && altaVentaVista.comboBoxP2.getSelectedIndex() == altaVentaVista.comboBoxP5.getSelectedIndex()) {
			JOptionPane.showMessageDialog(null, "Producto 2 y 5 son iguales!");
			return false;
		}
		if(s3 && s4 && altaVentaVista.comboBoxP3.getSelectedIndex() == altaVentaVista.comboBoxP4.getSelectedIndex()) {
			JOptionPane.showMessageDialog(null, "Producto 3 y 4 son iguales!");
			return false;
		}
		if(s3 && s5 && altaVentaVista.comboBoxP3.getSelectedIndex() == altaVentaVista.comboBoxP5.getSelectedIndex()) {
			JOptionPane.showMessageDialog(null, "Producto 3 y 5 son iguales!");
			return false;
		}
		if(s4 && s5 && altaVentaVista.comboBoxP4.getSelectedIndex() == altaVentaVista.comboBoxP5.getSelectedIndex()) {
			JOptionPane.showMessageDialog(null, "Producto 4 y 5 son iguales!");
			return false;
		}
		
		else
		return true;
		
	}

}
