package ar.edu.utn.frba.redlink.sistemaGestionCompras.model;

import java.util.Date;

public abstract class Promocion {
	
	protected Date fechaInicio;
	
	protected Date fechaFinal;
	
	protected Producto productoAplicado;
	
	protected boolean estaUsado = false;
	

	public Promocion(Date fechaInicio, Date fechaFinal, Producto productoAplicado)
	{
		this.fechaFinal = fechaFinal;
		this.fechaInicio = fechaInicio;
		this.productoAplicado =  productoAplicado;
	}
	
	public boolean aplicable(){
		Date hoy = new Date();
		
		boolean aplicable = hoy.after(fechaInicio) && hoy.before(fechaFinal);
		
		return aplicable;
		
	}
	
	abstract public void aplicarPromocion(Producto producto);

}
