package edu.usal.negocio.dominio;

import java.sql.Date;

public class Cliente {

	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	
	public Cliente(int idCliente, String nombre, String apellido, String direccion, String mail, String sexo, int dni, int telefono,
			Date fechaNac) {
		super();
		IdCliente = idCliente;
		Nombre = nombre;
		Apellido = apellido;
		Direccion = direccion;
		Mail = mail;
		Sexo = sexo;
		Dni = dni;
		Telefono = telefono;
		this.fechaNac = fechaNac;
	}
	
	public String getMail() {
		return Mail;
	}
	public void setMail(String mail) {
		Mail = mail;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	public int getDni() {
		return Dni;
	}
	public void setDni(int dni) {
		Dni = dni;
	}
	public int getTelefono() {
		return Telefono;
	}
	public void setTelefono(int telefono) {
		Telefono = telefono;
	}
	public Date getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	String Nombre, Apellido, Direccion, Mail, Sexo;
	int Dni, Telefono, IdCliente;
	Date fechaNac;
	
	public int getIdCliente() {
		return IdCliente;
	}
	public void setIdCliente(int idCliente) {
		this.IdCliente = idCliente;
	}
	
	
	
	
	
	
	
	
}
