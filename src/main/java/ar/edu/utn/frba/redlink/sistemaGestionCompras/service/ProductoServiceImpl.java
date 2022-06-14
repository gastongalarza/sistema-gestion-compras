package ar.edu.utn.frba.redlink.sistemaGestionCompras.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.Producto;
import ar.edu.utn.frba.redlink.sistemaGestionCompras.repositories.RepoProducto;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {
	
	@Autowired
	private RepoProducto repo;

	public ProductoServiceImpl() {

	}
	
	@Override
	@Transactional
	public Producto crear(Producto producto) {
		return repo.save(producto);
	}
	
	@Override
	public List<Producto> listar(){
		return repo.findAll();
	}
	
	@Override
	public void eliminar(Producto producto) {
		repo.delete(producto);
	}
	
	@Override
	@Transactional(readOnly = true)
	public Producto buscarProducto(Producto producto) {
		return repo.findById(producto.getIdProducto());
	}

}
