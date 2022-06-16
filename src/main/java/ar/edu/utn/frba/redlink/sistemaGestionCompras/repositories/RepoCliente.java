package ar.edu.utn.frba.redlink.sistemaGestionCompras.repositories;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.Cliente;


public interface RepoCliente extends PagingAndSortingRepository<Cliente, Integer> {

	List<Cliente> findAll();

	void delete(Cliente client);

	Cliente findById(int id);

}
