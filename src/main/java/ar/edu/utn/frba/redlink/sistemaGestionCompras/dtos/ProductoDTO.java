package ar.edu.utn.frba.redlink.sistemaGestionCompras.dtos;

import org.springframework.data.rest.core.config.Projection;
import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.Producto;


@Projection(name = "producto", types = {Producto.class})
public interface ProductoDTO {
}
