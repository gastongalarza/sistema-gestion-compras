package ar.edu.utn.frba.redlink.sistemaGestionCompras.repositories;

import java.util.Collection;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ar.edu.utn.frba.redlink.sistemaGestionCompras.dtos.OrdenDTO;

import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.OrdenCompra;

@RepositoryRestResource(excerptProjection = OrdenDTO.class)
public interface RepoOrden extends PagingAndSortingRepository<OrdenCompra, Integer>{
	
	Collection<OrdenCompra> findAll();

	void delete(OrdenCompra orden);

	OrdenCompra findById(int id);
	
	OrdenCompra save(OrdenCompra orden);

}
