package edu.usal.negocio.dominio;

import java.math.BigDecimal;

public class Venta {

	int ID_Venta, ID_Cliente, ID_Empleado;
	BigDecimal Total;
	
	public Venta(int iD_Venta, int iD_Cliente, int iD_Empleado, BigDecimal total) {
		super();
		ID_Venta = iD_Venta;
		ID_Cliente = iD_Cliente;
		ID_Empleado = iD_Empleado;
		Total = total;
		
	}

	public int getID_Venta() {
		return ID_Venta;
	}

	public void setID_Venta(int iD_Venta) {
		ID_Venta = iD_Venta;
	}

	public int getID_Cliente() {
		return ID_Cliente;
	}

	public void setID_Cliente(int iD_Cliente) {
		ID_Cliente = iD_Cliente;
	}

	public int getID_Empleado() {
		return ID_Empleado;
	}

	public void setID_Empleado(int iD_Empleado) {
		ID_Empleado = iD_Empleado;
	}

	public BigDecimal getTotal() {
		return Total;
	}

	public void setTotal(BigDecimal total) {
		Total = total;
	}
	
	
	
	
	
	
}
