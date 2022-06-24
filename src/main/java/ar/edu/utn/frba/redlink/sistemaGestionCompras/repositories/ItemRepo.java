package ar.edu.utn.frba.redlink.sistemaGestionCompras.repositories;

import java.util.Collection;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.Item;

@RepositoryRestResource
public interface ItemRepo extends PagingAndSortingRepository<Item, Integer> {
	
	Collection<Item> findAll();

	void delete(Item item);

	Item findById(int id);

}
