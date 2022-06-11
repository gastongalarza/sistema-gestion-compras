package ar.edu.utn.frba.redlink.sistemaGestionCompras.model;

import java.util.Date;

public class CuponDeProveedor extends Promocion {
	
	private Long id;
	
	private String nombre;
	
	private double descuento;
	
	private boolean estaUsado; 

	public CuponDeProveedor(Date fechaInicio,Date fechaFinal, Producto productoAplicado, Long id, String nombre) {
		super(fechaInicio, fechaFinal, productoAplicado);
		this.id = id;
		this.nombre = nombre;
	}

	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	public double getDescuento() {
		return descuento;
	}


	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}


	public boolean isEstaUsado() {
		return estaUsado;
	}


	public void setEstaUsado(boolean estaUsado) {
		this.estaUsado = estaUsado;
	}


	@Override                    //se le aplica a un producto ??
	public void aplicarPromocion(Producto producto) {
		
	if(!this.aplicable()) {
		//lanzar error fecha del cupon vencida o no valida
	}else {
		//aplicar la promocion al proveedor.
	      }
	}

}
