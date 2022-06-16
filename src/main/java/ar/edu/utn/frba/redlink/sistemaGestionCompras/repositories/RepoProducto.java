package ar.edu.utn.frba.redlink.sistemaGestionCompras.repositories;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ar.edu.utn.frba.redlink.sistemaGestionCompras.dtos.ProductoDTO;
import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.Producto;

@RepositoryRestResource(excerptProjection = ProductoDTO.class)
public interface RepoProducto extends PagingAndSortingRepository<Producto, Integer> {

	List<Producto> findAll();

	void delete(Producto producto);

	Producto findById(int idProducto);

}
