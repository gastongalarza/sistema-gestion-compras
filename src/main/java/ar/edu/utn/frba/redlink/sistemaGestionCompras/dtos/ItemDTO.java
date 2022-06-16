package ar.edu.utn.frba.redlink.sistemaGestionCompras.dtos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.Item;


@Projection(name = "item",types = {Item.class})
public interface ItemDTO {
	
	@Value("#{target.cantidad} * #{target.subTotal}")
	public double calcularTotalItem();

}
