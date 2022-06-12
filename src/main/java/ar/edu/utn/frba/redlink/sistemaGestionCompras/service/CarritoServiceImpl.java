package ar.edu.utn.frba.redlink.sistemaGestionCompras.service;

import ar.edu.utn.frba.redlink.sistemaGestionCompras.dtos.CarritoDTO;
import ar.edu.utn.frba.redlink.sistemaGestionCompras.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarritoServiceImpl implements CarritoService {
	
	@Autowired
	private CarritoDTO carritoDAO;
	
	public CarritoServiceImpl() {

	}
	
	@Override
	public void agregarACarrito(Item item) {
		carritoDAO.agregar(item);
		
	}
	
	@Override
	public void quitarDeCarrito(Item item){
		carritoDAO.quitar(item);
	}

	@Override
	public void comprar() {

		
	}


}


