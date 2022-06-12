package ar.edu.utn.frba.redlink.sistemaGestionCompras.dtos;

import java.util.List;
import org.springframework.data.rest.core.config.Projection;
import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.Producto;


@Projection(name = "producto",types = {Producto.class})
public interface ProductoDTO {

	Producto save(Producto producto);

	List<Producto> findAll();

	void delete(Producto producto);

	Producto findById(Integer idProducto);

}
