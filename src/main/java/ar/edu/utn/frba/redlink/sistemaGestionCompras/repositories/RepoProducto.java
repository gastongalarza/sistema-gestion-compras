package ar.edu.utn.frba.redlink.sistemaGestionCompras.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;
import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.Producto;


public interface RepoProducto extends PagingAndSortingRepository<Producto, Integer> {

	List<Producto> findAll();

	void delete(Producto producto);

	Producto findById(int idProducto);

}
