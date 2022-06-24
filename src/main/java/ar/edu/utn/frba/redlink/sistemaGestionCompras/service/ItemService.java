package ar.edu.utn.frba.redlink.sistemaGestionCompras.service;

import java.util.Collection;
import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.Item;


public interface ItemService {
	
	public Item crear(Item item);
	
	public Collection<Item> listar();
	
	public Item eliminar(int id);
	
	public Item buscarItem(Item item);

}
