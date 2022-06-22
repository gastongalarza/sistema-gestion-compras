package ar.edu.utn.frba.redlink.sistemaGestionCompras.service;

import java.util.Collection;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.Producto;

@Service
public interface ProductoService {
	
	public Producto crear(Producto producto);
	
	public Collection<Producto> listar();
	
	public void eliminar(Producto producto);
	
	public Producto buscarProducto(Producto producto);

}
