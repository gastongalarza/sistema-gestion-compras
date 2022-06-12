package ar.edu.utn.frba.redlink.sistemaGestionCompras.dtos;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.Item;

@Repository
@Transactional
public class CarritoDTOImpl implements CarritoDTO {

	public CarritoDTOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void agregar(Item item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void quitar(Item item) {
		// TODO Auto-generated method stub
		
	}

}
