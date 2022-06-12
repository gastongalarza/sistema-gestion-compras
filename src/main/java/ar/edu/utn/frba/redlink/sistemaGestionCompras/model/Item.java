package ar.edu.utn.frba.redlink.sistemaGestionCompras.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name="item")
public class Item {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Integer id;

	@Column(name="producto")
	private Producto producto;

	@Column(name="nombre")
	private String nombre;

	@Column(name="descripcion")
	private String descripcion;

	@Column(name="cantidad")
	private int cantidad;

	@Column(name="subtotal")
	private double subTotal;

	public Item() {
	}
	
	public Item(Integer id, Producto producto, String nombre, String descripcion, int cantidad, double subTotal) {
		super();
		this.id = id;
		this.producto = producto;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.subTotal = subTotal;
	}

}
