package ar.edu.utn.frba.redlink.sistemaGestionCompras.repositories;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ar.edu.utn.frba.redlink.sistemaGestionCompras.dtos.ClienteDTO;
import ar.edu.utn.frba.redlink.sistemaGestionCompras.dtos.ProductoDTO;
import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.Cliente;

@RepositoryRestResource(excerptProjection = ClienteDTO.class)
public interface RepoCliente extends PagingAndSortingRepository<Cliente, Integer> {

	List<Cliente> findAll();

	void delete(Cliente clie);

	Cliente findById(int id);
	
	Cliente save(Cliente cliente);
	
	Cliente findByUsername(String user);

}
