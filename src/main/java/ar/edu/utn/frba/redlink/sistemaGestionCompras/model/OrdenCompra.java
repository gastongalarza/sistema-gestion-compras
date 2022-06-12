package ar.edu.utn.frba.redlink.sistemaGestionCompras.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "orden")
public class OrdenCompra {

	@Id
	@Column(name="id")
	private Integer idOrden;

	@Column(name="fecha")
	private Date fechaOrden;

	@Column(name="carrito")
	private Carrito carrito;
	
	@Column(name="items")
	private List<Item> items;

	@Column(name="usuario")
	private Usuario usuario;
	
	
	public OrdenCompra(Integer idOrden, Date fechaOrden, Carrito carrito,List<Item> items, Usuario usuario) {
		super();
		this.idOrden = idOrden;
		this.fechaOrden = fechaOrden;
		this.carrito = carrito;
		this.items = items;
		this.usuario = usuario;
	}
	
	public OrdenCompra() {
	}

}
