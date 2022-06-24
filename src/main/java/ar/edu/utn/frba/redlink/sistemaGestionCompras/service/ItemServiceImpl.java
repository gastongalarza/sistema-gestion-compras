package ar.edu.utn.frba.redlink.sistemaGestionCompras.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.Item;
import ar.edu.utn.frba.redlink.sistemaGestionCompras.repositories.ItemRepo;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemRepo repo;
	
	@Override
	public Item crear(Item item) {
		return repo.save(item);
	}

	@Override
	public Collection<Item> listar() {
		return repo.findAll();
	}

	@Override
	public Item eliminar(int id) {
	    Item item = repo.findById(id);	
		 if(item != null) {
				repo.delete(item);
	     }
		 return item;

	}

	@Override
	public Item buscarItem(Item item) {
		return repo.findById(item.getId());
	}


}
