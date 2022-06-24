package ar.edu.utn.frba.redlink.sistemaGestionCompras.model;

import java.util.ArrayList;
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
import javax.persistence.OneToMany;
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

	@OneToMany
	@JoinColumn(name= "item_id")
	private List<Item> items;

	@ManyToOne
	@JoinColumn(name="cliente_id")
	private Cliente cliente;
	

	public OrdenCompra(int idOrden, Date fechaOrden, Cliente client) {
		super();
		this.id = idOrden;
		this.fechaOrden = fechaOrden;
		items = new ArrayList<>();
		this.cliente = client;
	}
	
	public OrdenCompra() {
	}


	public Date getFechaOrden() {
		return fechaOrden;
	}

	public void setFechaOrden(Date fechaOrden) {
		this.fechaOrden = fechaOrden;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cliente getUsuario() {
		return cliente;
	}

	public void setUsuario(Cliente client) {
		this.cliente = client;
	}

}
