package ar.edu.utn.frba.redlink.sistemaGestionCompras.model;

import java.util.Date;

public class Membresia extends Promocion {
	
	//ver bien membresia


	public Membresia(Date fechaInicio, Date fechaFinal, Producto productoAplicado) {
		super(fechaInicio, fechaFinal, productoAplicado);
	}

	@Override
	public void aplicarPromocion(Producto producto) {
		if(!this.aplicable()) {
			//excepcion promocion vencida por la fecha.
		}else {
			//aplicar.
		}
	}

}
