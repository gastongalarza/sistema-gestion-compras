package ar.edu.utn.frba.redlink.sistemaGestionCompras.service;

import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.Item;

public interface CarritoService {
	
	public void agregarACarrito(Item item);
	
	public void quitarDeCarrito(Item item);
	
	public void comprar();

}
