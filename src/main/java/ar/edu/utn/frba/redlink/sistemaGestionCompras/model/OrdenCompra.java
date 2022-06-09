package ar.edu.utn.frba.redlink.sistemaGestionCompras.model;

import java.util.Date;

public class OrdenCompra {

	private int idOrden;

	private Date fechaOrden;

	private Carrito carrito;

	private Usuario usuario;
	
	
	public OrdenCompra(int idOrden, Date fechaOrden, Carrito carrito, Usuario usuario) {
		super();
		this.idOrden = idOrden;
		this.fechaOrden = fechaOrden;
		this.carrito = carrito;
		this.usuario = usuario;
	}
	
	public OrdenCompra() {
	}

	public int getIdOrden() {
		return idOrden;
	}

	public void setIdOrden(int idOrden) {
		this.idOrden = idOrden;
	}

	public Date getFechaOrden() {
		return fechaOrden;
	}

	public void setFechaOrden(Date fechaOrden) {
		this.fechaOrden = fechaOrden;
	}

	public Carrito getCarrito() {
		return carrito;
	}

	public void setCarrito(Carrito carrito) {
		this.carrito = carrito;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	

}
