package edu.usal.vista.Producto;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JTextField;

import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.LayoutStyle.ComponentPlacement;

import com.jidesoft.swing.AutoCompletionComboBox;

import cambodia.raven.DateChooser;

import java.awt.event.ActionEvent;

public class ModificarProductoVista extends JPanel {
	public JButton btnEnviar;
	public ButtonGroup grupo;

	/**
	 * @wbp.nonvisual location=180,694
	 */
	private final DateChooser dcFechaNac = new DateChooser();
	public JButton btnVolver;
	public AutoCompletionComboBox comboBox;
	public JLabel lblNombre;
	public JTextField tNombre;
	public JLabel lblApellido;
	public JTextField tPrecio;
	public JTextField tDescripcion;
	public JLabel lblNombre_1;
	public JTextField tCantidad;
	public JLabel lblDni;

	public ModificarProductoVista() throws IOException, SQLException {
		setBackground(SystemColor.activeCaption);

		grupo = new ButtonGroup();
		btnEnviar = new JButton("Enviar");
		btnEnviar.setBackground(Color.BLACK);
		btnEnviar.setForeground(new Color(0, 51, 153));
		btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JLabel lblProducto = new JLabel("Producto:");
		lblProducto.setForeground(new Color(0, 51, 153));
		lblProducto.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		comboBox = new AutoCompletionComboBox();
		
		lblNombre = new JLabel("Nombre: ");
		lblNombre.setForeground(new Color(0, 51, 153));
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		tNombre = new JTextField();
		tNombre.setColumns(10);
		
		lblApellido = new JLabel("Precio:");
		lblApellido.setForeground(new Color(0, 51, 153));
		lblApellido.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		tPrecio = new JTextField();
		tPrecio.setColumns(10);
		
		tDescripcion = new JTextField();
		tDescripcion.setColumns(10);
		
		lblNombre_1 = new JLabel("Descripcion:");
		lblNombre_1.setForeground(new Color(0, 51, 153));
		lblNombre_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		tCantidad = new JTextField();
		tCantidad.setColumns(10);
		
		lblDni = new JLabel("Cantidad:");
		lblDni.setForeground(new Color(0, 51, 153));
		lblDni.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
									.addGap(39)
									.addComponent(tNombre, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
									.addGap(76)
									.addComponent(lblApellido, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
									.addGap(69)
									.addComponent(tPrecio, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblDni, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
									.addGap(39)
									.addComponent(tCantidad, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
									.addGap(76)
									.addComponent(lblNombre_1, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
									.addGap(69)
									.addComponent(tDescripcion, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap(59, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(btnEnviar, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblProducto, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(comboBox, 0, 252, Short.MAX_VALUE)
									.addGap(18)
									.addComponent(btnVolver)))
							.addGap(213))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnVolver)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblProducto, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(26)
					.addGap(52)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(5)
							.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(tNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(5)
							.addComponent(lblApellido, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(tPrecio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(17)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(4)
							.addComponent(lblDni, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
						.addComponent(tCantidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(5)
							.addComponent(lblNombre_1, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(tDescripcion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(50)
					.addComponent(btnEnviar)
					.addGap(303))
		);
		setLayout(groupLayout);
		
		
	}
	public void addListener(ActionListener al) {
		
		btnEnviar.addActionListener(al);
		
	}
	
	public void addListenerVolver(ActionListener al) {
		btnVolver.addActionListener(al);
	}
	public void addListenerComboBox(ItemListener al) {
		
		comboBox.addItemListener(al);
		
	}
}
