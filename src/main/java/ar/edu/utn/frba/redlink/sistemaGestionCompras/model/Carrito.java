package ar.edu.utn.frba.redlink.sistemaGestionCompras.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "carrito")
public class Carrito {
    
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@OneToMany(mappedBy="carrito")
	private List<Item> items;

	@Column(name = "nombre")
    private String nombre;

	@Column(name = "descripcion")
    private String descripcion;

	@Column(name = "precio_compra")
    private double precioCompra;
	
	@OneToOne(mappedBy="carrito")
	private OrdenCompra orden;

	public Carrito(int id, List<Item> items, String nombre, String descripcion, double precioCompra) {
		super();
		this.id = id;
		this.items = items;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precioCompra = precioCompra;
	}
	
	public Carrito() {
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

	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}
	

}
