package ar.edu.utn.frba.redlink.sistemaGestionCompras.dao;

import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.Item;

public interface CarritoDAO {

	void agregar(Item item);

	void quitar(Item item);

}
