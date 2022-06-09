package ar.edu.utn.frba.redlink.sistemaGestionCompras.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.Item;

@Repository
@Transactional
public class CarritoDAOImpl implements CarritoDAO {

	public CarritoDAOImpl() {
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
