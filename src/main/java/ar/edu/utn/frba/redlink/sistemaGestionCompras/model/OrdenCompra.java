package ar.edu.utn.frba.redlink.sistemaGestionCompras.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orden")
public class OrdenCompra {

	@Id
	@Column(name="id")
	private int idOrden;

	@Column(name="fecha")
	private Date fechaOrden;

	@Column(name="carrito")
	private Carrito carrito;
	
	@Column(name="items")
	private List<Item> items;

	@Column(name="usuario")
	private Usuario usuario;
	
	
	public OrdenCompra(int idOrden, Date fechaOrden, Carrito carrito,List<Item> items, Usuario usuario) {
		super();
		this.idOrden = idOrden;
		this.fechaOrden = fechaOrden;
		this.carrito = carrito;
		this.items = items;
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

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	

}
