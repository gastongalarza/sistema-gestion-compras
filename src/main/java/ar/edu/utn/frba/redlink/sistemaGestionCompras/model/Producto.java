package ar.edu.utn.frba.redlink.sistemaGestionCompras.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "producto")
public class Producto {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name = "nombre")
	private String nombre;

	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "precio")
	private double precio;

	@Column(name = "stock")
	private Integer stock;
	
	@NotEmpty
	private String urlImagen;
	
	public Producto(int id, String nombre, String descripcion, double precio, Integer stock, String url) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
		this.urlImagen = url;
	}
	
	public Producto() {
	}

	public int getIdProducto() {
		return id;
	}

	public void setIdProducto(int idProducto) {
		this.id = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public String getUrlImagen() {
		return urlImagen;
	}

	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}
	
}
