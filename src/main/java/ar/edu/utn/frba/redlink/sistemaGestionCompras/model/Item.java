package ar.edu.utn.frba.redlink.sistemaGestionCompras.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "item")
public class Item {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "producto_id")
	private Producto producto;

	@Column(name = "cantidad")
	private Integer cantidad;

	@Column(name = "subtotal")
	private double subTotal;
	

	public Item() {
	}
	
	public Item(int id, Producto producto, int cantidad, double subTotal) {
		super();
		this.id = id;
		this.producto = producto;
		this.cantidad = cantidad;
		this.subTotal = subTotal;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}


	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

}
