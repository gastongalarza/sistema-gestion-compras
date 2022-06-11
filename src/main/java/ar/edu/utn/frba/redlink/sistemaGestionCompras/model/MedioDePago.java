package ar.edu.utn.frba.redlink.sistemaGestionCompras.model;

import java.util.Date;

public class MedioDePago extends Promocion {
	
	private String nombre;
	
	private double descuento;
	
	//agregar tipo de medio: tarjeta, debito, etc.
	

	public MedioDePago(Date fechaInicio, Date fechaFinal, Producto productoAplicado) {
		super(fechaInicio, fechaFinal, productoAplicado);
	}
	
	@Override
	public void aplicarPromocion(Producto producto) {
		if(!this.aplicable()) {
			//excepcion por vencimiento de fecha del cupon
		}else {
			//aplicar
		}

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

}
