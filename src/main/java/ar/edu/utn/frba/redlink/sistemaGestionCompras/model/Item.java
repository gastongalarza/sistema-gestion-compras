package ar.edu.utn.frba.redlink.sistemaGestionCompras.model;

public class Item {

	private int id;

	private Producto producto;

	private String nombre;

	private String descripcion;

	private int cantidad;

	private double subTotal;

	public Item() {
	}
	
	public Item(int id, Producto producto, String nombre, String descripcion, int cantidad, double subTotal) {
		super();
		this.id = id;
		this.producto = producto;
		this.nombre = nombre;
		this.descripcion = descripcion;
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
	

}
