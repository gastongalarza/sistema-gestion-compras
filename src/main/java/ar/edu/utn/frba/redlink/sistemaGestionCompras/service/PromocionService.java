package ar.edu.utn.frba.redlink.sistemaGestionCompras.service;

import java.util.List;

import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.Promocion;

public interface PromocionService {
	
	public Promocion crear(Promocion promocion);
	
	public List<Promocion> listar();
	
	public void eliminar(Promocion promocion);
	
	public Promocion encontrarPromocion(Promocion promocion);

}
