package ar.edu.utn.frba.redlink.sistemaGestionCompras.model;

import java.util.List;

public class Carrito {
    
	private Integer id;

	private List<Item> items;

    private String descripcion;

    private double precioCompra;
	

	public Carrito(int id, List<Item> items, String descripcion, double precioCompra) {
		super();
		this.id = id;
		this.items = items;
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
