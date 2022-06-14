package ar.edu.utn.frba.redlink.sistemaGestionCompras.dtos;

import java.util.List;

import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.OrdenCompra;

public interface OrdenDTO {

	public List<OrdenCompra> findAll();

	public OrdenCompra findById(int idOrden);

}
