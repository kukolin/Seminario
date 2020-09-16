package edu.usal.vista.Producto;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
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
import cambodia.raven.DateChooser;
import java.awt.event.ActionEvent;

public class AltaProductoVista extends JPanel {
	public JButton btnEnviar;
	public JTextField tNombre;
	public JTextField tCantidad;
	public JTextField tDescripcion;
	private JLabel lblApellido;
	public ButtonGroup grupo;

	/**
	 * @wbp.nonvisual location=180,694
	 */
	private final DateChooser dcFechaNac = new DateChooser();
	public JTextField tPrecio;
	public JButton btnVolver;

	public AltaProductoVista() throws IOException, SQLException {
		setBackground(SystemColor.activeCaption);

		
		grupo = new ButtonGroup();
		btnEnviar = new JButton("Enviar");
		btnEnviar.setBackground(Color.BLACK);
		btnEnviar.setForeground(new Color(0, 51, 153));
		btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblNombre = new JLabel("Nombre: ");
		lblNombre.setForeground(new Color(0, 51, 153));
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblDni = new JLabel("Cantidad:");
		lblDni.setForeground(new Color(0, 51, 153));
		lblDni.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblNombre_1 = new JLabel("Descripcion:");
		lblNombre_1.setForeground(new Color(0, 51, 153));
		lblNombre_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		tNombre = new JTextField();
		tNombre.setColumns(10);
		
		tCantidad = new JTextField();
		tCantidad.setColumns(10);
		
		tDescripcion = new JTextField();
		tDescripcion.setColumns(10);
		
		lblApellido = new JLabel("Precio:");
		lblApellido.setForeground(new Color(0, 51, 153));
		lblApellido.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		tPrecio = new JTextField();
		tPrecio.setColumns(10);
		
		btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnVolver)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblDni, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
							.addGap(39)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(tNombre, GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addComponent(tCantidad, GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(122)
									.addComponent(btnEnviar, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 7, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblApellido, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNombre_1, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE))
									.addGap(69)))))
					.addGap(0)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(tPrecio, GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
						.addComponent(tDescripcion, GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
					.addGap(171))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnVolver)
					.addGap(59)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNombre, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(tNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(tPrecio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblApellido, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
					.addGap(17)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDni, GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
						.addComponent(tCantidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(tDescripcion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNombre_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(113)
					.addComponent(btnEnviar)
					.addGap(201))
		);
		setLayout(groupLayout);
		
		
	}
	public void addListener(ActionListener al) {
		
		btnEnviar.addActionListener(al);
		
	}
	
	public void addListenerVolver(ActionListener al) {
		btnVolver.addActionListener(al);
	}
	
	
}
