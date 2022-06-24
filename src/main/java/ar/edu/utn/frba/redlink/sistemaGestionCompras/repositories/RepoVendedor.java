package ar.edu.utn.frba.redlink.sistemaGestionCompras.repositories;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ar.edu.utn.frba.redlink.sistemaGestionCompras.dtos.ItemDTO;
import ar.edu.utn.frba.redlink.sistemaGestionCompras.dtos.OrdenDTO;
import ar.edu.utn.frba.redlink.sistemaGestionCompras.dtos.ProductoDTO;
import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.Vendedor;

@RepositoryRestResource
public interface RepoVendedor extends PagingAndSortingRepository<Vendedor, Integer>{

	List<Vendedor> findAll();
	
	void delete(Vendedor clie);

	Vendedor findById(int id);
	
	Vendedor save(Vendedor vend);
	
	Vendedor findByUsername(String user);
}
