package ar.edu.utn.frba.redlink.sistemaGestionCompras.dao;

import java.util.List;

import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.Producto;

//Esta parte habria que implementarlo con hibernate, deberia conectarse con mysql para
// obtener todas las query que se requieran.

public interface ProductoDAO {
//esto en realidad no va asi, sino que hay que persistir los datos de la BD
	Producto save(Producto producto);

	List<Producto> findAll();

	void delete(Producto producto);

	Producto findById(int idProducto);

}
