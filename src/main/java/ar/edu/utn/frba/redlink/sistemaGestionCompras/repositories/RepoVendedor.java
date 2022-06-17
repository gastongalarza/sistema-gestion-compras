package ar.edu.utn.frba.redlink.sistemaGestionCompras.repositories;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.Vendedor;

public interface RepoVendedor extends PagingAndSortingRepository<Vendedor, Integer>{

	List<Vendedor> findAll();

	void delete(Vendedor client);

	Vendedor findById(int id);
}
