package edu.usal.negocio.dominio;

public class DetalleVenta {

	int ID_Detalle, ID_Venta, ID_Producto, cantidad;

	public DetalleVenta(int iD_Detalle, int iD_Venta, int iD_Producto, int cantidad) {
		super();
		ID_Detalle = iD_Detalle;
		ID_Venta = iD_Venta;
		ID_Producto = iD_Producto;
		this.cantidad = cantidad;
	}

	public int getID_Detalle() {
		return ID_Detalle;
	}

	public void setID_Detalle(int iD_Detalle) {
		ID_Detalle = iD_Detalle;
	}

	public int getID_Venta() {
		return ID_Venta;
	}

	public void setID_Venta(int iD_Venta) {
		ID_Venta = iD_Venta;
	}

	public int getID_Producto() {
		return ID_Producto;
	}

	public void setID_Producto(int iD_Producto) {
		ID_Producto = iD_Producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
