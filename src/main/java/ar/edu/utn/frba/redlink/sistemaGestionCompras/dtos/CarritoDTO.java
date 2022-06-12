package ar.edu.utn.frba.redlink.sistemaGestionCompras.dtos;

import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.Item;

public interface CarritoDTO {

	void agregar(Item item);

	void quitar(Item item);

}
