package ar.edu.utn.frba.redlink.sistemaGestionCompras.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.utn.frba.redlink.sistemaGestionCompras.dtos.ProductoDTO;
import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.Producto;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {
	
	@Autowired
	private ProductoDTO productoDAO;

	public ProductoServiceImpl() {

	}
	
	@Override
	@Transactional
	public Producto crear(Producto producto) {
		return productoDAO.save(producto);
	}
	
	@Override
	public List<Producto> listar(){
		return productoDAO.findAll();
	}
	
	@Override
	public void eliminar(Producto producto) {
		productoDAO.delete(producto);
	}
	
	@Override
	@Transactional(readOnly = true)
	public Producto buscarProducto(Producto producto) {
		return productoDAO.findById(producto.getId());
	}

}
