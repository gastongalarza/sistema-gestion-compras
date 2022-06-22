package ar.edu.utn.frba.redlink.sistemaGestionCompras.repositories;

import java.util.Collection;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ar.edu.utn.frba.redlink.sistemaGestionCompras.dtos.ProductoDTO;
import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.Producto;

@RepositoryRestResource(excerptProjection = ProductoDTO.class)
public interface RepoProducto extends PagingAndSortingRepository<Producto, Integer> {

	Collection<Producto> findAll();

	void delete(Producto producto);

	Producto findById(int idProducto);

}
