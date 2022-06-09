package ar.edu.utn.frba.redlink.sistemaGestionCompras.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.Producto;

@Repository
@Transactional
public class ProductoDAOImpl implements ProductoDAO {

	public ProductoDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Producto save(Producto producto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Producto producto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Producto findById(int idProducto) {
		// TODO Auto-generated method stub
		return null;
	}

}
