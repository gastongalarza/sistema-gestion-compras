package ar.edu.utn.frba.redlink.sistemaGestionCompras.dtos;

import java.util.List;
import org.springframework.data.rest.core.config.Projection;
import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.OrdenCompra;

@Projection(name = "orden",types = {OrdenCompra.class})
public interface OrdenDTO {

	public List<OrdenCompra> findAll();

	public OrdenCompra findById(int idOrden);

}
