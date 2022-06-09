package ar.edu.utn.frba.redlink.sistemaGestionCompras.dao;

import java.util.List;

import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.OrdenCompra;

public interface OrdenDAO {

	public List<OrdenCompra> findAll();

	public OrdenCompra findById(int idOrden);

}
