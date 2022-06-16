package ar.edu.utn.frba.redlink.sistemaGestionCompras.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orden")
public class OrdenCompra {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@Column(name = "fecha")
	private Date fechaOrden;

	@OneToOne
	@JoinColumn(name= "carrito_id")
	private Carrito carrito;

	@ManyToOne
	@JoinColumn(name="cliente_id")
	private Cliente cliente;

	
	public OrdenCompra(int idOrden, Date fechaOrden, Carrito carrito, Cliente client) {
		super();
		this.id = idOrden;
		this.fechaOrden = fechaOrden;
		this.carrito = carrito;
		this.cliente = client;
	}
	
	public OrdenCompra() {
	}

	public int getIdOrden() {
		return id;
	}

	public void setIdOrden(int idOrden) {
		this.id = idOrden;
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

	public Cliente getUsuario() {
		return cliente;
	}

	public void setUsuario(Cliente client) {
		this.cliente = client;
	}

}
