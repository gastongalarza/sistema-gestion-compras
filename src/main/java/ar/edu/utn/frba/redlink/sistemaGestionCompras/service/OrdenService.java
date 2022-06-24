package ar.edu.utn.frba.redlink.sistemaGestionCompras.service;

import java.util.Collection;

import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.OrdenCompra;

public interface OrdenService {
	
	public OrdenCompra crear(OrdenCompra orden);
	
	public Collection<OrdenCompra> listar();
	
	public OrdenCompra eliminar(int id);
	
	public OrdenCompra buscarOrden(OrdenCompra orden);

}
